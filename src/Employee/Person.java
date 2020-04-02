package Employee;

public abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }
    public Person(){};

    public abstract String getDescription();

    public String getName(){
        return name;
    }

}
