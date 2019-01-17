/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pukm.controller.ControllerAnggota;
import pukm.model.Anggota;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FormViewAnggota extends javax.swing.JFrame {
    private ControllerAnggota controllerAnggota = new ControllerAnggota();
    /**
     * Creates new form FormViewAnggota
     */
    public FormViewAnggota() {
        initComponents();
        setTableAnggota(controllerAnggota.getAllAnggota());
    }

    public FormViewAnggota(String id, String nama) {
         initComponents();
         lblIdUkm.setText(id);
         lblNamaUkm.setText(nama);
         setTableAnggota(controllerAnggota.getAllAnggota());
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        mnDelete = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdAnggota = new javax.swing.JTextField();
        txtNamaAnggota = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        txtJabatan = new javax.swing.JTextField();
        lblIdUkm = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNamaUkm = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnggota = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();

        mnDelete.setText("Delete");
        mnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDeleteActionPerformed(evt);
            }
        });
        popup.add(mnDelete);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("ID Anggota");

        jLabel2.setText("Nama Anggota");

        jLabel3.setText("Alamat");

        jLabel4.setText("Saldo Anggota");

        jLabel5.setText("ID UKM");

        jLabel6.setText("Jabatan");

        lblIdUkm.setText("id_ukm");

        jLabel9.setText("Nama Ukm");

        lblNamaUkm.setText("nama_ukm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamat)
                            .addComponent(txtNamaAnggota)
                            .addComponent(txtIdAnggota)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNamaUkm)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSaldo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblIdUkm)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblIdUkm))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblNamaUkm))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClose.setText("Close");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnSave)
                .addGap(39, 39, 39)
                .addComponent(btnClear)
                .addGap(37, 37, 37)
                .addComponent(btnClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Field Anggota");

        jLabel8.setText("Action");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblAnggota.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAnggotaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAnggotaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblAnggota);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("OutPut");

        lblOutput.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOutput.setText("READY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(61, 61, 61))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(lblOutput)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOutput)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int id_anggota = Integer.parseInt(txtIdAnggota.getText());
        String nama_anggota = txtNamaAnggota.getText();
        String alamat = txtAlamat.getText();
        int saldo_anggota = Integer.parseInt(txtSaldo.getText());
        int id_ukm =Integer.parseInt(lblIdUkm.getText());
        String jabatan = txtJabatan.getText();
        String nama_ukm = lblNamaUkm.getText();
        
        Anggota data = new Anggota(id_anggota,id_ukm, nama_anggota, alamat, saldo_anggota,nama_ukm,jabatan);
        
        if(btnSave.getText().equals("Save")){
            if(controllerAnggota.insertAnggota(data)){
                lblOutput.setText("Insert Berhasil");
            }else{
                lblOutput.setText("Insert Gagal");
            }
        }else{
            //update data di database
            if(controllerAnggota.updateAnggota(data)){
                lblOutput.setText("Update Berhasil");
            }else{
                lblOutput.setText("Upate Gagal");
            }
        }
        setClear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        setClear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblAnggotaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnggotaMousePressed
        if(evt.getClickCount()==2){
            int idxrow = tblAnggota.getSelectedRow();
            txtIdAnggota.setText(tblAnggota.getModel().getValueAt(idxrow, 0).toString());
            txtNamaAnggota.setText(tblAnggota.getModel().getValueAt(idxrow, 2).toString());
            txtAlamat.setText(tblAnggota.getModel().getValueAt(idxrow, 3).toString());
            txtSaldo.setText(tblAnggota.getModel().getValueAt(idxrow, 4).toString());
            lblIdUkm.setText(tblAnggota.getModel().getValueAt(idxrow, 1).toString());
            lblNamaUkm.setText(tblAnggota.getModel().getValueAt(idxrow, 5).toString());
            txtJabatan.setText(tblAnggota.getModel().getValueAt(idxrow, 6).toString());
            btnSave.setText("Update");
        }
        if(evt.isPopupTrigger()){
            popup.show(tblAnggota, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblAnggotaMousePressed

    private void tblAnggotaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnggotaMouseReleased
        if(evt.getClickCount()==2){
            int idxrow = tblAnggota.getSelectedRow();
            txtIdAnggota.setText(tblAnggota.getModel().getValueAt(idxrow, 0).toString());
            txtNamaAnggota.setText(tblAnggota.getModel().getValueAt(idxrow, 2).toString());
            txtAlamat.setText(tblAnggota.getModel().getValueAt(idxrow, 3).toString());
            txtSaldo.setText(tblAnggota.getModel().getValueAt(idxrow, 4).toString());
            lblIdUkm.setText(tblAnggota.getModel().getValueAt(idxrow, 1).toString());
            lblNamaUkm.setText(tblAnggota.getModel().getValueAt(idxrow, 5).toString());
            txtJabatan.setText(tblAnggota.getModel().getValueAt(idxrow, 6).toString());
            btnSave.setText("Update");
        }
        if(evt.isPopupTrigger()){
            popup.show(tblAnggota, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblAnggotaMouseReleased

    private void mnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDeleteActionPerformed
        int result = JOptionPane.showConfirmDialog(rootPane, "Apakah Yakin Untuk Didelete?","Delete Dialog",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            int id = Integer.parseInt(tblAnggota.getModel().getValueAt(tblAnggota.getSelectedRow(), 0).toString());
            controllerAnggota.deleteAnggota(id);
            setClear();
        }
    }//GEN-LAST:event_mnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    private void setTableAnggota(List<Anggota> listAnggota){
        if(listAnggota==null){
            JOptionPane.showMessageDialog(this,"Data Anggota Gagal Diambil Dari Database",
                    "DATABASE FAILED",JOptionPane.ERROR_MESSAGE);
        }else{
            //setting table admin
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(new String[]{
                "ID Anggota",
                "ID UKM",
                "Nama Anggota",
                "Alamat",
                "Saldo Anggota",
                "Nama UKM",
                "Jabatan"
            });
            
            //mengambil data untuk table admin
            for(Anggota a : listAnggota){
                Object[] o = new Object[7];
                o[0] = a.getId_anggota();
                o[1] = a.getId_ukm();
                o[2] = a.getNama_anggota();
                o[3] = a.getAlamat();
                o[4] = a.getSaldo_anggota();
                o[5] = a.getNama_ukm();
                o[6] = a.getJabatan();
                tableModel.addRow(o);
        }
            tblAnggota.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            tblAnggota.setModel(tableModel);
    }
    }
    
    private void setClear(){
        txtIdAnggota.setText("");
        txtNamaAnggota.setText("");
        txtAlamat.setText("");
        txtSaldo.setText("");
        lblIdUkm.setText("id_ukm");
        lblNamaUkm.setText("nama_ukm");
        txtJabatan.setText("");
        setTableAnggota(controllerAnggota.getAllAnggota());
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormViewAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormViewAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormViewAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormViewAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormViewAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdUkm;
    private javax.swing.JLabel lblNamaUkm;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JMenuItem mnDelete;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTable tblAnggota;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtJabatan;
    private javax.swing.JTextField txtNamaAnggota;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
