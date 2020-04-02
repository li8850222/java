package Proxy;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/23 4:43 下午
 */
public class JavaDeveloper implements Developer{
    private String name;

    JavaDeveloper(String name){
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(this.name + " is coding java");
    }

    @Override
    public void debug() {
        System.out.println(this.name + " is debugging java");
    }
}
