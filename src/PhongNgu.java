
package assignment.pkg12;

import java.util.Date;

public class PhongNgu extends Phong{
    private int soGiuong;

    public PhongNgu(int soGiuong, String maPhong, String hangPhong, Date ngayThue, Date ngayTra, double dongia) {
        super(maPhong, hangPhong, ngayThue, ngayTra, dongia);
        this.soGiuong = soGiuong;
    }

    public PhongNgu() {
    }

    public int getSoGiuong() {
        return soGiuong;
    }

    public void setSoGiuong(int soGiuong) {
        this.soGiuong = soGiuong;
    }

    @Override
    public double tinhtienthue() {
        
        return 0;
        
    }
    
}
