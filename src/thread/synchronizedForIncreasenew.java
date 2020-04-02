package thread;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/23 9:27 上午
 */
public class synchronizedForIncreasenew {
    static int cnt = 0;
    public static void main(String[] args) {
        synchronizedForIncreasenew data = new synchronizedForIncreasenew();
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public synchronized void run() {//同步方法（synchronized加锁）
                    int n = 10000;
                    while (n > 0) {
                        data.addcount();
                        n--;
                    }
                }
            }).start();
        }

        try {
            //等待足够长的时间 确保上述线程均执行完毕
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(cnt);
    }

    public static void addcount(){
        cnt++;
    }
}
