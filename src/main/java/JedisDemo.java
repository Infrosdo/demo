import redis.clients.jedis.Jedis;

public class JedisDemo {
    @org.junit.jupiter.api.Test
    public void testJedis() {
        //创建一个Jedis的连接
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        //执行redis命令
        jedis.set("key2", "hello world");
        //从redis中取值
        String result2 = jedis.get("key2");
        //打印结果
        System.out.println(result2);

        String result1 = jedis.get("key1");
        System.out.println(result1);
        //关闭连接
        jedis.close();

    }
}
