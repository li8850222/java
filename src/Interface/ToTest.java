package Interface;

import org.junit.Test;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/20 10:33 上午
 */
public class ToTest {
    @Test
    public void program1() {
        Computer computer = new Computer();
        MP3Player mp3Player = new MP3Player();
        FlashDisk flashDisk = new FlashDisk();
        MobileHardDisk moblieHardDisk = new MobileHardDisk();
        SuperStorageAdapter superStorage = new SuperStorageAdapter();
        superStorage.set_superstorage(new SuperStorage());

        System.out.println("I inserted my MP3 Player into my computer and copy some music to it:");
        computer.set_usbDrive(mp3Player);
        computer.WriteData();
        System.out.println("====================");

        System.out.println("Well,I also want to copy a great movie to my computer from a mobile hard disk:");
        computer.set_usbDrive(moblieHardDisk);
        computer.ReadData();
        System.out.println("====================");

        System.out.println("OK!I have to read some files from my flash disk and copy another file to it:");
        computer.set_usbDrive(flashDisk);
        computer.ReadData();
        computer.WriteData();
        System.out.println();

        System.out.println("OK!I have to read some files from my super storage and copy another file to it:");
        computer.set_usbDrive(superStorage);
        computer.ReadData();
        computer.WriteData();
        System.out.println();
    }
}