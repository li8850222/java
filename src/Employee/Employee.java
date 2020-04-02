package Employee;

import java.time.LocalDate;

public class Employee extends Person implements Cloneable,Comparable<Employee>{
//    private String name;
    private static double salary;
    private LocalDate hireDay;

    @Override
    public String getDescription() {
        return "Employee "+ getName() +" with salary: "+salary;
    }


//    public int compareTo(){
//
//    }
//
//    public static String ceshi(Manager q){
//        return "ceshi 2";
//    }

    public Employee clone() throws CloneNotSupportedException
    {
        Employee cloned = (Employee) super.clone();
        return cloned;
    }

    public Employee(String name, double salary, int year, int month, int day) {
//        this.name = name;
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }
    public Employee(){
    }

    public static Double MAX(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for(double v : values)if(v>=largest) largest = v;
        return largest;
    }

    public String toString(){
        return "Employee [name = "+getName()+", salary = "+salary+", hireday = "+hireDay+"]";
    }

//    public String getName(){
//        return name;
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double num){
        this.salary = salary + num;
    }

    public void changeSalary(double newsalary){
        this.salary = newsalary;
    }

    @Override
    public int compareTo(Employee e) {
        return Double.compare(salary,e.salary);

    }
}
