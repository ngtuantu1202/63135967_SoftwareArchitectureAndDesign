package behavioral.observer.Game;

import java.util.ArrayList;
import java.util.List;

public class PlayerData {
    int thoiGian, soLuotChoi, diem;
    PlayerDataListener listener;

    public PlayerData(int thoiGian, int soLuotChoi, int diem) {
        this.thoiGian = thoiGian;
        this.soLuotChoi = soLuotChoi;
        this.diem = diem;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }

    public void setSoLuotChoi(int soLuotChoi) {
        this.soLuotChoi = soLuotChoi;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public void setListeners(PlayerDataListener listeners) {
        this.listener = listener;
    }

    public void addListener(PlayerDataListener listener) {
        listeners.add(listener);
    }
}

