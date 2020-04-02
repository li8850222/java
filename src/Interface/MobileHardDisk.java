package Interface;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/20 10:31 上午
 */
public class MobileHardDisk implements IMobileStorage{
    @Override
    public void Read() {
        System.out.println("Reading from MobileHardDisk……");
        System.out.println("Read finished!");
    }

    @Override
    public void Write() {
        System.out.println("Writing to MobileHardDisk……");
        System.out.println("Write finished!");
    }
}
