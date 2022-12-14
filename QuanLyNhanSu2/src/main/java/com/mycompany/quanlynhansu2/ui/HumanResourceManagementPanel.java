package com.mycompany.quanlynhansu2.ui;

import com.mycompany.quanlynhansu2.dao.NhanvienDao;
import com.mycompany.quanlynhansu2.helper.DataValidator;
import com.mycompany.quanlynhansu2.helper.MessageDialogHelper;
import com.mycompany.quanlynhansu2.model.NhanVien;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class HumanResourceManagementPanel extends javax.swing.JPanel {
    private Main parentForm;
    private DefaultTableModel tblModel;
    /**
     * Creates new form HumanResourceManagementPanel
     */
    public HumanResourceManagementPanel() {
        initComponents();
        initTable();
        loadDataToTable();
    }
    // hien thi thong tin len bang
    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã Nhân Viên","Họ và Tên","Ngày Sinh","Địa Chỉ","Giới Tính","Chức Vụ","Email"});
        tblHuman.setModel(tblModel);
    }
    private void loadDataToTable(){
        try{
            NhanvienDao dao = new NhanvienDao();
            List<NhanVien> list = dao.findAll();
            tblModel.setRowCount(0);//hien thi lai du lieu
            for(NhanVien tmp:list){
                tblModel.addRow(new Object[]{
                    tmp.getMaNhanVien(), tmp.getHoTen(),tmp.getNgaySinh(),tmp.getDiaChi(),tmp.getGioiTinh()==1?"Nam":"Nữ",tmp.getChucvu(),tmp.getEmail()
                });
            }
            tblModel.fireTableDataChanged();// cap nhat lai hien thi  du lieu tren bang
        } catch(Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,e.getMessage(),"Lỗi"); // hien thi thong bao loi ra man hinh
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNhanvienId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtChucvu = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemail = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaAddress = new javax.swing.JTextArea();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblHuman = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        jLabel7.setText("jLabel7");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Quản Lý Nhân Viên");

        jLabel2.setText("Mã Nhân Viên:");

        jLabel3.setText("Họ Và Tên:");

        jLabel4.setText("Ngày Sinh:");

        jLabel5.setText("Chức vụ:");

        jLabel6.setText("Giới tính:");

        jLabel8.setText("Địa chỉ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        buttonGroup1.add(rdbMale);
        rdbMale.setText("Nam");

        buttonGroup1.add(rdbFemail);
        rdbFemail.setText("Nữ");

        txaAddress.setColumns(20);
        txaAddress.setRows(5);
        jScrollPane1.setViewportView(txaAddress);

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlynhansu2/icons/new-icon-16.png"))); // NOI18N
        btnNew.setText("Tạo Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlynhansu2/icons/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlynhansu2/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("Câp nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quanlynhansu2/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblHuman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHumanMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblHuman);

        jLabel9.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rdbFemail)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtChucvu, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(txtNgaySinh)
                                        .addComponent(txtName)
                                        .addComponent(txtNhanvienId)))))
                        .addGap(144, 144, 144)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdbMale)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNhanvienId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtChucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbMale)
                            .addComponent(rdbFemail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNew)
                                .addComponent(btnSave))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnUpdate)
                                .addComponent(btnDelete)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        // kiem tra nguoi dung co nhap du lieu vao hay khong
        DataValidator.validateEmpty(txtNhanvienId, sb, "Mã nhân viên không được để trống!");
        DataValidator.validateEmpty(txtName, sb, "Tên nhân viên không được để trống!");
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(),"Lỗi");
            return;
        }
        try{
            NhanVien nv = new NhanVien();
            nv.setMaNhanvien(txtNhanvienId.getText());
            nv.setHoTen(txtName.getText());
            nv.setNgaySinh(txtNgaySinh.getText());
            nv.setEmail(txtEmail.getText());
            nv.setDiaChi(txaAddress.getText());
            nv.setChucvu(txtChucvu.getText());
            nv.setGioiTinh(rdbMale.isSelected()?1:0);
            NhanvienDao dao = new NhanvienDao();
            // chen thong tinh sinh vien vao bang nhan vien
            if(dao.insert(nv)){
            MessageDialogHelper.showMessageDialog(parentForm,"Nhân viên đã được lưu","Thông báo");
            loadDataToTable();
            }
            else{
                MessageDialogHelper.showMessageDialog(parentForm,"Nhân viên không được lưu do lỗi","Cảnh báo");
            }
        } catch(Exception e){
            // hien thi noi dung loi
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // xoa noi dung trong cac truong
        txtEmail.setText("");
        txtChucvu.setText("");
        txtNgaySinh.setText("");
        txtName.setText("");
        txtNhanvienId.setText("");
        txaAddress.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        StringBuilder sb = new StringBuilder();
        // kiem tra nguoi dung co nhap du lieu vao hay khong
        DataValidator.validateEmpty(txtNhanvienId, sb, "Mã nhân viên không được để trống!");
        DataValidator.validateEmpty(txtName, sb, "Tên nhân viên không được để trống!");
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(),"Lỗi");
            return;
        }
        // hoi nguoi dung muon cap nhat khong
        if(MessageDialogHelper.showConfirmDialog(parentForm,"Bạn có muốn cập nhật không", "Hỏi") == JOptionPane.NO_OPTION){
            return;
        }
        try{
            NhanVien nv = new NhanVien();
            nv.setMaNhanvien(txtNhanvienId.getText());
            nv.setHoTen(txtName.getText());
            nv.setNgaySinh(txtNgaySinh.getText());
            nv.setEmail(txtEmail.getText());
            nv.setDiaChi(txaAddress.getText());
            nv.setChucvu(txtChucvu.getText());
            nv.setGioiTinh(rdbMale.isSelected()?1:0);
            NhanvienDao dao = new NhanvienDao();
            // chen thong tinh sinh vien vao bang nhan vien
            if(dao.update(nv)){
            MessageDialogHelper.showMessageDialog(parentForm,"Nhân viên đã được cập nhật","Thông báo");
            loadDataToTable();
            }
            else{
                MessageDialogHelper.showMessageDialog(parentForm,"Nhân viên không được cập nhật do lỗi","Cảnh báo");
            }
        } catch(Exception e){
            // hien thi noi dung loi
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        // kiem tra nguoi dung co nhap du lieu vao hay khong
        DataValidator.validateEmpty(txtNhanvienId, sb, "Mã nhân viên không được để trống!");
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(),"Lỗi");
            return;
        }
        // hoi nguoi dung muon cap nhat khong
        if(MessageDialogHelper.showConfirmDialog(parentForm,"Bạn có muốn xoá nhân viên không", "Hỏi") == JOptionPane.NO_OPTION){
            return;
        }
        try{
            
            NhanvienDao dao = new NhanvienDao();
            // chen thong tinh sinh vien vao bang nhan vien
            if(dao.delete(txtNhanvienId.getText())){
            MessageDialogHelper.showMessageDialog(parentForm,"Nhân viên đã được xóa","Thông báo");
            btnNewActionPerformed(evt);// xoa trang du lieu khi xoa
            loadDataToTable();
            }
            else{
                MessageDialogHelper.showMessageDialog(parentForm,"Nhân viên không được xóa do lỗi","Cảnh báo");
            }
        } catch(Exception e){
            // hien thi noi dung loi
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblHumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHumanMouseClicked
        //hien thi cac thanh phan tren form nhap
        try{
            int row = tblHuman.getSelectedRow();
            if(row>=0){ 
                // nguoi dung da chon 1 hang du lieu
                String id = (String) tblHuman.getValueAt(row,0);
                NhanvienDao dao = new NhanvienDao();
                NhanVien nv = dao.findByID(id);
                if(nv!=null){
                   txtNhanvienId.setText(nv.getMaNhanVien());
                   txtName.setText(nv.getHoTen());
                   txtNgaySinh.setText(nv.getNgaySinh());
                   txtChucvu.setText(nv.getChucvu());
                   txaAddress.setText(nv.getDiaChi());
                   txtEmail.setText(nv.getEmail());
                   rdbMale.setSelected(nv.getGioiTinh()==1?true:false);
                   rdbFemail.setSelected(nv.getGioiTinh()==0?true:false);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,e.getMessage(),"Lỗi");
        }
    }//GEN-LAST:event_tblHumanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JRadioButton rdbFemail;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTable tblHuman;
    private javax.swing.JTextArea txaAddress;
    private javax.swing.JTextField txtChucvu;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNhanvienId;
    // End of variables declaration//GEN-END:variables
}
