package com.sarie.taichinh.common;

/**
 * Created by huongsarie on 06/04/2016.
 */
public class Item_Catalogue {

    private String ID,IDIcon,tenDanhMuc,ghiChu;

    public Item_Catalogue(String ID, String IDIcon, String tenDanhMuc, String ghiChu) {
        this.ID = ID;
        this.IDIcon = IDIcon;
        this.tenDanhMuc = tenDanhMuc;
        this.ghiChu = ghiChu;
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

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
