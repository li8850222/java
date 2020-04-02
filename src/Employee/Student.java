package Employee;

public class Student extends Person {
    private String major;

    public Student(String name,String major){
        super(name);
        this.major = major;

    }
    public Student(){ }

    @Override
    public String getDescription() {
        return "Student "+getName()+" with major: "+getMajor();
    }

    public String getMajor(){
        return major;
    }



}
