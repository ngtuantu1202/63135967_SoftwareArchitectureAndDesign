package behavioral.Chain_of_Responsibility.TienDien;

public abstract class TienDienBacThang {
    String tenBac;
    int min, max, gia;

    abstract TienDienBacThang keTiep(TienDienBacThang k);

    abstract int tinhTienDien(int soKW);
}
