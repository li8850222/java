package Interface;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/20 10:29 上午
 */
public class FlashDisk implements IMobileStorage{

    @Override
    public void Read() {
        System.out.println("Reading from FlashDisk……");
        System.out.println("Read finished!");
    }

    @Override
    public void Write() {
        System.out.println("Writing to FlashDisk……");
        System.out.println("Write finished!");
    }

}
