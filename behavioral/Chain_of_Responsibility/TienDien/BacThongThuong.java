package behavioral.Chain_of_Responsibility.TienDien;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang bacKeTiep;

    @Override
    TienDienBacThang keTiep(TienDienBacThang k) {
        bacKeTiep = k;
        return k;
    }

    @Override
    int tinhTienDien(int soKW) {
        if (soKW <= max)
            return (soKW - min) * gia;
        else
            return (max - min) * gia + bacKeTiep.tinhTienDien(soKW);
    }
}
