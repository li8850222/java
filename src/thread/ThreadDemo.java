package thread;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/20 2:42 下午
 */
public class ThreadDemo {
    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest();
        thread.setThing(" adad");
        thread.start();
        RunnableTest runnabletest = new RunnableTest();
        runnabletest.setThing(1);
        Thread runnable = new Thread(runnabletest);
        runnable.start();
    }

}
