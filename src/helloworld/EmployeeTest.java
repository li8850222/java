package helloworld;

import Employee.Employee;
import Employee.Manager;
import Employee.Person;
import Employee.Student;
import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class EmployeeTest {
    public static int a = 100;
    private double b =100.1;

    public class test{

    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, CloneNotSupportedException {




//        Manager a = new Manager("ziyi",300,2019,1,1);
//        Employee b = new Employee("zhenyu",100,2020,1,3);

//        System.out.println( a.ceshi());
//        System.out.println(b.ceshi());

//        System.out.println(Employee.MAX(1,2,3,4,5,6,7,8,9,0));

        Employee[] staff_list = new Employee[7];

        staff_list[0] = new Employee("zhenyu",100,2020,1,3);
        staff_list[1] = new Employee("bingxun",200,2019,9,10);
        staff_list[2] = new Employee("chenxu",150,2017,11,20);
        staff_list[3] = new Employee("zhipeng",350,2019,11,20);
        staff_list[4] = new Employee("ziyi",550,2019,11,20);
        staff_list[5] = new Employee("houxiao",50,2019,11,20);
        staff_list[6] = new Employee("haoke",150,2018,11,20);

//        Arrays.sort(staff_list);
//        for(Employee e:staff_list){
//            System.out.println(e.getName()+e.getSalary());
//        }

        Arrays.sort(staff_list, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getHireDay));

        Arrays.sort(staff_list,(first, second) -> (int) (first.getSalary() - second.getSalary()));

        for(Employee e:staff_list){
            System.out.println(e.getName()+e.getSalary());
        }


        Employee bingxun =  new Employee("ziyi",300,2019,1,1);

        Employee copy = bingxun.clone();
//
//        Manager ziyi =  new Manager("ziyi",300,2019,1,1);
//        ziyi.setBonus(10000);
//
//        staff_list[3] = ziyi;
//
//        for(Employee e:staff_list){
//            e.raiseSalary(100);
//        }
//        for(Employee e:staff_list){
//            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
//                    + e.getHireDay());
//        }
//
//        try {
//            Manager boss = (Manager) staff_list[2];
//        }catch (ClassCastException c){
//            System.out.println("捕捉到了" + c);
//        };
//
//
//        ArrayList<Integer> a = new ArrayList();
//        for(Employee e:staff_list){
//            System.out.println(e.getDescription());
//            System.out.println(e);
//        }
//        Person xiaoming = new Student("xiaoming","computer science");
//        System.out.println(xiaoming.getDescription());
//
//        System.out.println(bingxun.getClass().getName()+" "+bingxun.getName());
//        Class i = Class.forName("Employee.Employee");
//        try {
//            Object obj = i.getConstructor().newInstance();
//        }catch (NoSuchMethodException e){
//            System.out.println("a");
//        }

//        Manager boss = (Manager) staff_list[3];

//        Employee boss = staff_list[3];

//        if(staff_list[2] instanceof Manager){
//            Manager boss = (Manager)staff_list[2];
//        }
//        Manager add = (Manager)boss;
//        System.out.println(boss.getSalary());
//        boss.getSalary();

    }
}

class GoodEmployee{

}
