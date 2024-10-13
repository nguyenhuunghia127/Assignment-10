package assignment.pkg12;

import java.text.DateFormat;
import java.util.Date;

public abstract class Phong implements IPhong {

    private String maPhong;
    private String hangPhong;
    private Date ngayThue;
    private Date ngayTra;
    private double dongia;

    public Phong(String maPhong, String hangPhong, Date ngayThue, Date ngayTra, double dongia) {
        this.maPhong = maPhong;
        this.hangPhong = hangPhong;
        this.ngayThue = ngayThue;
        this.ngayTra = ngayTra;
        this.dongia = dongia;
    }

    public Phong() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getHangPhong() {
        return hangPhong;
    }

    public void setHangPhong(String hangPhong) {
        this.hangPhong = hangPhong;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    @Override
    public double tinhtienthue() {
        double dongia = 0;
        switch (hangPhong) {
            case "A":
                dongia = 1200000;
                break;
            case "B":
                dongia = 1000000;
                break;
            case "C":
                dongia = 750000;
                break;
            default:

        }

        int songaythue = songaythue();
        return dongia * songaythue;
    }

    public int songaythue() {
        if (ngayThue.equals(ngayTra)) {
            return 1;
        }

        long diffInMillies = ngayTra.getTime() - ngayThue.getTime();
        long diffInDays = diffInMillies / (24 * 60 * 60 * 1000);

        return (int) diffInDays + 1;
    }
}
