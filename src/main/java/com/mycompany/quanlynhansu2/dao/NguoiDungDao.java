package com.mycompany.quanlynhansu2.dao;

import com.mycompany.quanlynhansu2.helper.DatabaseHelper;
import com.mycompany.quanlynhansu2.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// thao tac tren bang nguoi dung
public class NguoiDungDao {
    public NguoiDung checkLogin(String tenDangNhap,String matKhau) throws Exception{
        String sql = "select tenDangNhap, matKhau from nguoidung "
                + " where tendangnhap=? and matKhau = ?"; //lay thong tin cua ten dang nhap va mat khau
        try(
           Connection con = DatabaseHelper.openConnection();
           PreparedStatement pstmt = con.prepareStatement(sql);
           ){
            pstmt.setString(1,tenDangNhap); // thiet lap gia tri truyen vao ten dang nhap
            pstmt.setString(2,matKhau);// thiet lap gia tri truyen vao mat khau
            try(ResultSet rs = pstmt.executeQuery()){ // thuc hien truy van,tra ve tap ResultSet
                if(rs.next()){// neu ResultSet doc duoc
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    return nd;
                }
                
            }
        }
        return null; // dang nhap khong thanh cong
    }
}
