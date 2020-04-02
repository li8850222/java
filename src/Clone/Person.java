package Clone;

import java.io.Serializable;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/28 1:35 下午
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -3936148364278781089L;

    private String name;
    private String sex;
    private Phone phone;

    public Person(String name, String sex, Phone phone) {
        super();
        this.name = name;
        this.sex = sex;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", sex=" + sex + ", phone=" + phone
                + "]";
    }
}
