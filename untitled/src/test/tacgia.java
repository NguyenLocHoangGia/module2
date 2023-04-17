package test;

public class tacgia {
    private String tentacGia;
    private Ngay ngaySing;

    public tacgia(String tentacGia, Ngay ngaySing) {
        this.tentacGia = tentacGia;
        this.ngaySing = ngaySing;
    }

    public String getTentacGia() {
        return tentacGia;
    }

    public void setTentacGia(String tentacGia) {
        this.tentacGia = tentacGia;
    }

    public Ngay getNgaySing() {
        return ngaySing;
    }

    public void setNgaySing(Ngay ngaySing) {
        this.ngaySing = ngaySing;
    }
}
