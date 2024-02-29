package ThucHanh.Phan1.Bai4;

public class MainChuyenXe {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.themChuyenXe(new ChuyenXeNoiThanh("001", "Tuan Tu 1", "79A", 100000, 1, 20));
        qlcx.themChuyenXe(new ChuyenXeNoiThanh("002", "Tuan Tu 2", "79B", 120000, 2, 20));
        qlcx.themChuyenXe(new ChuyenXeNoiThanh("003", "Tuan Tu 3", "79C", 130000, 3, 20));
        qlcx.themChuyenXe(new ChuyenXeNoiThanh("004", "Tuan Tu 4", "79D", 140000, 4, 20));

        qlcx.themChuyenXe(new ChuyenXeNgoaiThanh("100", "Tuan Tu 5", "79E", 15000, "Ha Noi",2));
        qlcx.themChuyenXe(new ChuyenXeNgoaiThanh("010", "Tuan Tu 6", "79F", 16000, "Thanh Hoa",1));
        qlcx.themChuyenXe(new ChuyenXeNgoaiThanh("110", "Tuan Tu 7", "79G", 17000, "My Tho",3));
        qlcx.themChuyenXe(new ChuyenXeNgoaiThanh("111", "Tuan Tu 8", "79H", 18000, "Sao Hoa",4));

        qlcx.inDS();
        System.out.println("Doanh thu xe ngoại thành: " + qlcx.doanhThuXeNgoaiThanh());
        System.out.println("Doanh thu xe nội thành: " + qlcx.doanhThuXeNoiThanh());
    }
}
