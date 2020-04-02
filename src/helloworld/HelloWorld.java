package helloworld;

import java.util.Arrays;


public class HelloWorld {
    public int a = 10;
    public static void main (String[] args) throws CloneNotSupportedException{


        for (int i =0; i<=100;i++){
            new Thread(()->{
                System.out.println("a");
            }).start();
        }
        Apple tinglei = new Apple(90,"red","hainan");
        Apple zhenyu = tinglei.clone();
        Apple xiaozi = tinglei;
        System.out.println(tinglei.getColor());
        System.out.println(tinglei.getWeight());
        System.out.println(tinglei.getProaddress());
        System.out.println("--------------");
        tinglei.setColor("green");
        tinglei.setProaddress("hebei");
        tinglei.setWeight(200);
        System.out.println(tinglei.getColor());
        System.out.println(tinglei.getWeight());
        System.out.println(tinglei.getProaddress());
        System.out.println("--------------");
        System.out.println(zhenyu.getColor());
        System.out.println(zhenyu.getWeight());
        System.out.println(zhenyu.getProaddress());
        System.out.println("--------------");
        System.out.println(xiaozi.getColor());
        System.out.println(xiaozi.getWeight());
        System.out.println(xiaozi.getProaddress());

    }
}
