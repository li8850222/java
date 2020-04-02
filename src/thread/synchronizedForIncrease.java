package thread;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/23 9:27 上午
 */
public class synchronizedForIncrease {
    static int cnt = 0;
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public synchronized void run() {//同步方法（synchronized加锁）
                int n = 10000;
                while(n>0){
                    cnt++;
                    n--;
                }
            }
        };
        Thread t1  = new Thread(r);
        Thread t2  = new Thread(r);
        Thread t3  = new Thread(r);
        Thread t4  = new Thread(r);
        Thread t5  = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            //等待足够长的时间 确保上述线程均执行完毕
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(cnt);
    }
}
