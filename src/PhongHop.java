package assignment.pkg12;

import java.util.Date;

public class PhongHop extends Phong {

    private int soGhe;

    public PhongHop(int soGhe, String maPhong, String hangPhong, Date ngayThue, Date ngayTra, double dongia) {
        super(maPhong, hangPhong, ngayThue, ngayTra, dongia);
        this.soGhe = soGhe;
    }

    public PhongHop() {
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    @Override
    public double tinhtienthue() {
        return 0;
    }
}
