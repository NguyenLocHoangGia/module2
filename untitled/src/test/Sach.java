package test;

public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private tacgia tacGia;

    public Sach(String tenSach, double giaBan, int namXuatBan, tacgia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public tacgia getTacGia() {
        return tacGia;
    }

    public void setTacGia(tacgia tacGia) {
        this.tacGia = tacGia;
    }
    public void inTenSach(){
        System.out.println(this.tenSach);
    }
}
