package Clone;



public class HelloWorld {
    public static void main (String[] args) throws Exception {
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


        Person p=new Person("雷小涛", "man", new Phone("123456", "四川成都"));
//		Person p2=(Person) p.clone();
        Person p2=CloneUtil.clone(p);
        System.out.println("p:"+p.toString());
        System.out.println("p2:"+p2.toString());
        p2.setName("leixiaotao");
        p2.getPhone().setArea("四川乐山");
        System.out.println("-------其中一个对象修改值过后-------");
        System.out.println("p:"+p.toString());
        System.out.println("p2:"+p2.toString());


    }
}
