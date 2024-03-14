package creational.builder.book;

import creational.builder.computer.Computer63;

import java.util.ArrayList;
import java.util.List;

public class Book63 {
    String ten, tacGia;
    int soTrang;
    List<Book63> dsChuong = new ArrayList<>();

    private Book63(Builder b){
        ten = b.ten;
        tacGia = b.tacGia;
        soTrang = b.soTrang;
        dsChuong = b.dsChuong;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tựa đề: ").append(ten)
                .append("Tác giả: ").append(tacGia)
                .append("Số trang: ").append(soTrang)
                .append("Danh sách Chương: ").append(dsChuong);
        return "aa";
    }
    public static class Builder{
        private  String ten, tacGia;
        private int soTrang;
        private List<Book63> dsChuong = new ArrayList<>();
    }



}
