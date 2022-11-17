package com.mycompany.quanlynhansu2.dao;

import com.mycompany.quanlynhansu2.helper.DatabaseHelper;
import com.mycompany.quanlynhansu2.model.BangLuong;
import com.mycompany.quanlynhansu2.model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// them, xoa , sua cap nhat voi bang diem
public class BangLuongDao {
    public boolean insert(BangLuong bl) throws Exception{
        String sql = "INSERT INTO [dbo].[BangLuong]([MaNhanVien],[LuongCoBan],[SoNgayCong]) values(?,?,?)";
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            pstmt.setString(1,bl.getMaNhanVien());
            pstmt.setInt(2,bl.getLuongCoBan());
            pstmt.setInt(3,bl.getSoNgayCong());
            return pstmt.executeUpdate()>0;
        }
    }
    public boolean update(BangLuong bl) throws Exception{
        // cap nhat theo msv
        String sql = "UPDATE [dbo].[BangLuong] " +
                "SET [LuongCoBan] = ?, [SoNgayCong] = ?" + 
                " WHERE [MaNhanVien] = ?";
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            pstmt.setInt(1,bl.getLuongCoBan());
            pstmt.setInt(2,bl.getSoNgayCong());
            pstmt.setString(3,bl.getMaNhanVien());
            return pstmt.executeUpdate()>0;
        }
    }
    public boolean deleteByMaNhanVien(String maNhanVien) throws Exception{
        // xoa theo ma nhan vien
         String sql = "delete from bangluong " + " where [MaNhanVien]=?";
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            pstmt.setString(1,maNhanVien);
            return pstmt.executeUpdate()>0;
        }
    }
    public BangLuong findByMaNhanVien(String maNhanVien) throws Exception{
        // bang luong theo ma nhan vien
         String sql = "select * from bangluong where [MaNhanVien]=?";
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            pstmt.setString(1,maNhanVien);
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    BangLuong bl = new BangLuong();
                    bl.setMa(rs.getInt("Ma"));
                    bl.setMaNhanVien(rs.getString("MaNhanVien"));
                    bl.setLuongCoBan(rs.getInt("LuongCoBan"));
                    bl.setSoNgayCong(rs.getInt("SoNgayCong"));
                    return bl;
                }
            }
            return null;
        }
    }
    public List<BangLuong> findAllByMaNhanVien() throws Exception{
        // bang luong theo ma nhan vien
         String sql = "select * from bangluong";
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            try(ResultSet rs = pstmt.executeQuery();){
                List<BangLuong> list = new ArrayList<>();
                while(rs.next()){
                    createBangLuong(rs, list);
                }
                return list;// tra ve danh sach
            }
        }
    }

    private void createBangLuong(final ResultSet rs, List<BangLuong> list) throws SQLException {
        BangLuong bl = new BangLuong();
        bl.setMa(rs.getInt("Ma"));
        bl.setMaNhanVien(rs.getString("MaNhanVien"));
        bl.setLuongCoBan(rs.getInt("LuongCoBan"));
        bl.setSoNgayCong(rs.getInt("SoNgayCong"));
        list.add(bl);
    }
}
