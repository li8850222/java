package thread;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/20 2:33 下午
 */
public class RunnableTest implements Runnable{
    private Object thing;

    public void setThing(Object thing) {
        this.thing = thing;
    }

    public Object getThing() {
        return thing;
    }

    public void run() {
        System.out.println("Thread start! --Runnable"+this.thing);
    }


}
