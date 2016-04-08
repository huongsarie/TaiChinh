package com.sarie.taichinh.common;

/**
 * Created by huongsarie on 06/04/2016.
 */
public class Item_Account {

    private  String ID, IDIcon,tenTaiKhoan,GhiChu;
    private boolean isTaiKhoanChinh;

    public Item_Account(String ID, String IDIcon, String tenTaiKhoan, String ghiChu, boolean isTaiKhoanChinh) {
        this.ID = ID;
        this.IDIcon = IDIcon;
        this.tenTaiKhoan = tenTaiKhoan;
        GhiChu = ghiChu;
        this.isTaiKhoanChinh = isTaiKhoanChinh;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDIcon() {
        return IDIcon;
    }

    public void setIDIcon(String IDIcon) {
        this.IDIcon = IDIcon;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    public boolean isTaiKhoanChinh() {
        return isTaiKhoanChinh;
    }

    public void setIsTaiKhoanChinh(boolean isTaiKhoanChinh) {
        this.isTaiKhoanChinh = isTaiKhoanChinh;
    }
}
