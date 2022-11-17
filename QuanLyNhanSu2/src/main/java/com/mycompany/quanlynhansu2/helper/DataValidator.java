package com.mycompany.quanlynhansu2.helper;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// kiem tra truong du lieu nhap
public class DataValidator {
    public static void validateEmpty(JTextField field,StringBuilder sb,String errorMessage){
        // kiem tra du lieu nhap vao co rong hay khong
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red); // hien thi truong do dang loi bang mau do
            field.requestFocus(); // tro con tro nhap lieu ve truong dang loi
        }
        else{
            field.setBackground(Color.white); // khong gap loi thi de sang mau trang
        }
        
    }
     // kiem tra truong pass nhap vao co rong hay khong
     public static void validateEmpty(JPasswordField field,StringBuilder sb,String errorMessage){
        String password = new String(field.getPassword());
        if(password.equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red); // hien thi truong do dang loi bang mau do
            field.requestFocus(); // tro con tro nhap lieu ve truong dang loi
        }
        else{
            field.setBackground(Color.white); // khong gap loi thi de sang mau trang
        }
    }
}
