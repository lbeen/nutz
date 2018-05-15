package redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author 李斌
 */
public class Main {
    @Test
    public void client1(){
        Jedis jedis = new Jedis("192.168.1.111");
        jedis.auth("123");
        RedisMsgPubSubListener listener = new MyRedisMsgPubSub();
        jedis.subscribe(listener, "redisChatTest");
        System.out.println("listening");
    }

    @Test
    public void client2() throws InterruptedException{
        Jedis jedis = new Jedis("192.168.1.111");
        jedis.auth("123");
        jedis.publish("redisChatTest", "我是天才");
        Thread.sleep(5000);
        jedis.publish("redisChatTest", "我牛逼");
        Thread.sleep(5000);
        jedis.publish("redisChatTest", "哈哈");
    }


}
