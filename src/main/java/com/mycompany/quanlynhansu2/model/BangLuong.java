/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quanlynhansu2.model;

import java.sql.Array;

/**
 *
 * @author HP
 */
public class BangLuong {
    private int ma;
    private String MaNhanVien;
    private int LuongCoBan,SoNgayCong;
    public BangLuong() {
    }

    public BangLuong(int ma, String MaNhanVien, int LuongCoBan, int SoNgayCong) {
        this.ma = ma;
        this.MaNhanVien = MaNhanVien;
        this.LuongCoBan = LuongCoBan;
        this.SoNgayCong = SoNgayCong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(int LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    public int getSoNgayCong() {
        return SoNgayCong;
    }

    public void setSoNgayCong(int SoNgayCong) {
        this.SoNgayCong = SoNgayCong;
    }

    public void setHoTen(Array array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHoTen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setHoVaTen(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHoVaTen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
