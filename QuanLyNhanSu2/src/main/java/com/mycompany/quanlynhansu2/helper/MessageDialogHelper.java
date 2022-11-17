package com.mycompany.quanlynhansu2.helper;

import java.awt.Component;
import javax.swing.JOptionPane;

// hien thi thong bao theo yeu cau
public class MessageDialogHelper {
    // hien thi thong bao
    public static void showMessageDialog(Component parent,String content,String title){
        JOptionPane.showMessageDialog(parent, content,title,JOptionPane.INFORMATION_MESSAGE);
    }
    // hien thi thong bao loi
    public static void showErrorDialog(Component parent,String content,String title){
        JOptionPane.showMessageDialog(parent, content,title,JOptionPane.ERROR_MESSAGE);
    }
    // hoi nguoi dung khang dinh cai gi day
    public static int showConfirmDialog(Component parent,String content,String title){
        int choose = JOptionPane.showConfirmDialog(parent, content,title,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return choose;
    }
}
