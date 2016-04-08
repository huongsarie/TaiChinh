package com.sarie.taichinh.common;

/**
 * Created by huongsarie on 06/04/2016.
 */
public class Item_Expense {
    private String ID, IDDanhMuc, IDTaiKhoan, ghiChu;
    private double soTien;
    private long ngayThang;

    public Item_Expense(){}

    public Item_Expense( String ID, String IDDanhMuc, String IDTaiKhoan,long ngayThang, double soTien, String ghiChu) {
        this.ngayThang = ngayThang;
        this.ID = ID;
        this.IDDanhMuc = IDDanhMuc;
        this.IDTaiKhoan = IDTaiKhoan;
        this.ghiChu = ghiChu;
        this.soTien = soTien;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDDanhMuc() {
        return IDDanhMuc;
    }

    public void setIDDanhMuc(String IDDanhMuc) {
        this.IDDanhMuc = IDDanhMuc;
    }

    public String getIDTaiKhoan() {
        return IDTaiKhoan;
    }

    public void setIDTaiKhoan(String IDTaiKhoan) {
        this.IDTaiKhoan = IDTaiKhoan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public long getNgayThang() {
        return ngayThang;
    }

    public void setNgayThang(long ngayThang) {
        this.ngayThang = ngayThang;
    }
}
