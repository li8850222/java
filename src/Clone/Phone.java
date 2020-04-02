package Clone;

import java.io.Serializable;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/28 1:36 下午
 */
public class Phone implements Serializable {

    private static final long serialVersionUID = -4482468804013490322L;

    private String number;
    private String area;

    public Phone(String number, String area) {
        super();
        this.number = number;
        this.area = area;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    @Override
    public String toString() {
        return "[number=" + number + ", area=" + area + "]";
    }
}
