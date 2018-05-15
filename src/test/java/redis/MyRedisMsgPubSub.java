package redis;

/**
 * @author 李斌
 */
public class MyRedisMsgPubSub extends RedisMsgPubSubListener{

    @Override
    public void onMessage(String channel, String message) {
        System.out.println("channel:" + channel + "receives message :" + message);
//        super.onMessage(channel, message);
    }
}
