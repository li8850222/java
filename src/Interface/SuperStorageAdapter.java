package Interface;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/20 12:00 下午
 */
public class SuperStorageAdapter implements IMobileStorage {

    private SuperStorage _superstorage;

    public SuperStorage get_superstorage() {
        return _superstorage;
    }

    public void set_superstorage(SuperStorage _superstorage) {
        this._superstorage = _superstorage;
    }

    @Override
    public void Read() {
       this._superstorage.rd();
    }

    @Override
    public void Write() {
        this._superstorage.wt();
    }
}
