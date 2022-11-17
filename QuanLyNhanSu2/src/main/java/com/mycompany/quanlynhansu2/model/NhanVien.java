/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quanlynhansu2.model;

/**
 *
 * @author HP
 */
import java.io.IOException;
import java.sql.Date;
import java.text.*;
public class NhanVien {
    private String MaNhanVien,HoTen,NgaySinh,DiaChi,Chucvu,Email;
    private int GioiTinh;

    public NhanVien() {
    }

    public NhanVien(String MaNhanVien, String HoTen, String NgaySinh, String DiaChi, String Chucvu, String Email, int GioiTinh) throws IOException, ParseException{
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
       // Date date = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(NgaySinh);
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.Chucvu = Chucvu;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanvien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
           
}
