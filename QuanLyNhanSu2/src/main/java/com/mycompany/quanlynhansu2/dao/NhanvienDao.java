package com.mycompany.quanlynhansu2.dao;

import com.mycompany.quanlynhansu2.helper.DatabaseHelper;
import com.mycompany.quanlynhansu2.model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// thuc hien chuc nang them xoa sua
public class NhanvienDao {
    public boolean insert(NhanVien nv) throws Exception{
        String sql = "INSERT INTO [dbo].[NhanVien]([MaNhanVien],[HoTen],[GioiTinh],[NgaySinh],[DiaChi],[Chucvu],[Email])" +
                " values(?,?,?,?,?,?,?)";
       
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            pstmt.setString(1,nv.getMaNhanVien()); 
            pstmt.setString(2,nv.getHoTen());
            pstmt.setInt(3,nv.getGioiTinh());
            pstmt.setString(4,nv.getNgaySinh());
            pstmt.setString(5,nv.getDiaChi());
            pstmt.setString(6,nv.getChucvu());
            pstmt.setString(7,nv.getEmail());
            return pstmt.executeUpdate()>0;//kiem tra so ban ghi doc duoc
        }
    }
    public boolean update(NhanVien nv) throws Exception{
        // cap nhat thong tin theo msv
       String sql = "update dbo.NhanVien"+
   " SET HoTen = ?,GioiTinh = ?,NgaySinh = ?,DiaChi = ?,Chucvu = ?,Email =?"+
               " where MaNhanVien =?";
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            pstmt.setString(1,nv.getHoTen()); 
            pstmt.setInt(2,nv.getGioiTinh());
            pstmt.setString(3,nv.getNgaySinh());
            pstmt.setString(4,nv.getDiaChi());
            pstmt.setString(5,nv.getChucvu());
            pstmt.setString(6,nv.getEmail());
            pstmt.setString(7, nv.getMaNhanVien());
            return pstmt.executeUpdate()>0;//kiem tra so ban ghi doc duoc
        }
    }
    public boolean delete(String maNhanVien) throws Exception{
        // xoa thong tin theo msv
       String sql = "delete from nhanvien"+
               " where MaNhanVien =?";
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            pstmt.setString(1,maNhanVien); 
            
            return pstmt.executeUpdate()>0;//kiem tra so ban ghi doc duoc
        }
    }
    // tim kiem thong tin theo msv
    public NhanVien findByID(String maNhanVien) throws Exception{
       String sql = "select * from nhanvien where maNhanVien =?";
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            pstmt.setString(1,maNhanVien); 
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){                    NhanVien nv = createNhanVien(rs);
                    return nv;
                }
            }
            return null; // khong tim thay nhan vien
        }
    }

    private NhanVien createNhanVien(final ResultSet rs) throws SQLException {
        // kiem tra co du lieu trong ReSultSet hay khong
        NhanVien nv = new NhanVien();
        nv.setMaNhanvien(rs.getString("manhanvien"));
        nv.setHoTen(rs.getString("hoten"));
        nv.setGioiTinh(rs.getInt("gioitinh"));
        nv.setNgaySinh(rs.getString("ngaysinh"));
        nv.setDiaChi(rs.getString("diachi"));
        nv.setChucvu(rs.getString("chucvu"));
        nv.setEmail(rs.getString("email"));
        return nv;
    }
    // tra ve tat ca danh sach nhan vien hien co trong csdl
    public List<NhanVien> findAll() throws Exception{
       String sql = "select * from nhanvien";
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            try(ResultSet rs = pstmt.executeQuery();){
                List<NhanVien> list = new ArrayList<>();
                while(rs.next()){// kiem tra co du lieu trong ReSultSet hay khong
                    NhanVien nv = createNhanVien(rs);
                    list.add(nv);
                }
                return list;
            }
        }
    }
}
