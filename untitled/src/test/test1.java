package test;

public class test1 {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,5,2021);
        tacgia tacGia1 = new tacgia("Gia",ngay1);
        Sach sach1 = new Sach("Đánh ny ko đau",50000,2023,tacGia1);

        sach1.inTenSach();
    }
}
