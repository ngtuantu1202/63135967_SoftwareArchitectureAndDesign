package behavioral.Chain_of_Responsibility.TienDien;

public class BacCaoNhat extends TienDienBacThang{
    @Override
    TienDienBacThang keTiep(TienDienBacThang k) {
        return null;
    }

    @Override
    int tinhTienDien(int soKW) {
        return (soKW - min)*gia;
    }
}
