package com.sarie.taichinh.common;

/**
 * Created by huongsarie on 06/04/2016.
 */
public class Item_Collection {

    private String ID,IDTaiKhoan,GhiChu;
    private long ngayThang;
    private double soTien;

    public Item_Collection(String ID, String IDTaiKhoan, long ngayThang, double soTien, String ghiChu) {
        this.ID = ID;
        this.IDTaiKhoan = IDTaiKhoan;
        GhiChu = ghiChu;
        this.ngayThang = ngayThang;
        this.soTien = soTien;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDTaiKhoan() {
        return IDTaiKhoan;
    }

    public void setIDTaiKhoan(String IDTaiKhoan) {
        this.IDTaiKhoan = IDTaiKhoan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    public long getNgayThang() {
        return ngayThang;
    }

    public void setNgayThang(long ngayThang) {
        this.ngayThang = ngayThang;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
}
