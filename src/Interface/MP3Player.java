package Interface;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/20 10:30 上午
 */
public class MP3Player implements IMobileStorage {
    @Override
    public void Read() {
        System.out.println("Reading from MP3Player……");
        System.out.println("Read finished!");
    }

    @Override
    public void Write() {
        System.out.println("Writing to MP3Player……");
        System.out.println("Write finished!");
    }

    public void PlayMusic(){
        System.out.println("Music is playing……");
    }
}
