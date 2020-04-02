package Employee;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public Manager() {
    }
        public static String ceshi(){
        return "ceshi 2";
    }

    @Override
    public String getDescription() {
        return "Manager "+ getName() + " with salary "+ (int)getSalary()+" and it is include "+(int)getBonus()+ " bonus";
    }

    public String toString(){
        return "Manager [name = "+getName()+", all salary(include bounds) = "+getSalary()+" bounds = "+bonus+", hireday = "+getHireDay()+"]";
    }

    public double getBonus(){
        return bonus;
    }

    public double getSalary(){
        return super.getSalary()+bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
