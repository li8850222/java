package Proxy;

import java.lang.reflect.Proxy;
import java.util.concurrent.BlockingDeque;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/23 4:44 下午
 */
public class JavaDynamicProxy {
    public static void main(String[] args) {

        JavaDeveloper Blaise = new JavaDeveloper("Blaise");

        Developer BlaiseProxy = (Developer) Proxy.newProxyInstance(Blaise.getClass().getClassLoader(), Blaise.getClass().getInterfaces(), (proxy, method, argss) -> {
            if (method.getName().equals("code")){
                System.out.println("Blaise is wearing loli clothes for the code!");
                return method.invoke(Blaise, argss);
            }
            if (method.getName().equals("debug")){
                System.out.println("Blaise's have no bug! No need to debug!");
                return null;
            }
            return null;
        });

        BlaiseProxy.code();
        BlaiseProxy.debug();
    }
}
