package thread;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/20 2:32 下午
 */
public class ThreadTest extends Thread {
    private Object thing;

    public void setThing(Object thing) {
        this.thing = thing;
    }

    public Object getThing() {
        return thing;
    }

    public void run(){
        super.run();
        System.out.println("Thread start! --Thread"+this.thing);
    }
}
