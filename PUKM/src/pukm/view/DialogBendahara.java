/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.view;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pukm.controller.ControllerBendahara;
import pukm.controller.ControllerUkm;
import pukm.model.Bendahara;
import pukm.model.Ukm;

/**
 *
 * @author User
 */
public class DialogBendahara extends javax.swing.JDialog {
    
    ControllerBendahara cb= new ControllerBendahara();
     ControllerUkm ukm= new ControllerUkm();
    /**
     * Creates new form DialogBendahara
     */
    public DialogBendahara(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTableBendahara(cb.getAllBendahara());
        setCbxUkm(ukm.getallData());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        delete = new javax.swing.JMenuItem();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdBendahara = new javax.swing.JTextField();
        txtNamaBendahara = new javax.swing.JTextField();
        cbxUkm = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBendahara = new javax.swing.JTable();
        lbResult = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        popUpMenu.add(delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setText("Field Bendahara");

        jLabel5.setText("Action");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Id Bendahara");

        jLabel2.setText("Nama Bendahara");

        jLabel3.setText("UKM");

        cbxUkm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("UserName");

        jLabel8.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(txtIdBendahara, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaBendahara)
                            .addComponent(cbxUkm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdBendahara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNamaBendahara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxUkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblBendahara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Bendahara", "Nama Bendahara", "Id UKM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBendahara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblBendaharaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBendaharaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblBendahara);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbResult.setText("Output");

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
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbResult)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(44, 44, 44)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(lbResult)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblBendaharaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBendaharaMousePressed
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            int row= tblBendahara.getSelectedRow();
            String id_bendahara= tblBendahara.getModel().getValueAt(row, 0).toString();
            int id_ukm=Integer.parseInt(tblBendahara.getModel().getValueAt(row, 1).toString());
            String nama_bendahara=tblBendahara.getModel().getValueAt(row, 2).toString();
            String username=tblBendahara.getModel().getValueAt(row, 3).toString();
            String password=tblBendahara.getModel().getValueAt(row, 4).toString();

            txtIdBendahara.setText(id_bendahara);
            txtNamaBendahara.setText(nama_bendahara);
            txtUsername.setText(username);
            txtPassword.setText(password);
            cbxUkm.setSelectedItem(id_ukm);
            btnSave.setText("Update");
        }

        if(evt.isPopupTrigger()){
            popUpMenu.show(tblBendahara, evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_tblBendaharaMousePressed

    private void tblBendaharaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBendaharaMouseReleased
        // TODO add your handling code here:

        if(evt.getClickCount()==2){
            int row= tblBendahara.getSelectedRow();
            String id_bendahara= tblBendahara.getModel().getValueAt(row, 0).toString();
            int id_ukm=Integer.parseInt(tblBendahara.getModel().getValueAt(row, 1).toString());
            String nama_bendahara=tblBendahara.getModel().getValueAt(row, 2).toString();
            String username=tblBendahara.getModel().getValueAt(row, 3).toString();
            String password=tblBendahara.getModel().getValueAt(row, 4).toString();

            txtIdBendahara.setText(id_bendahara);
            txtNamaBendahara.setText(nama_bendahara);
            txtUsername.setText(username);
            txtPassword.setText(password);
            cbxUkm.setSelectedItem(id_ukm);
            btnSave.setText("Update");
        }

        if(evt.isPopupTrigger()){
            popUpMenu.show(tblBendahara, evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_tblBendaharaMouseReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int id_bendahara= Integer.parseInt(txtIdBendahara.getText().toString());
        String id_ukm=cbxUkm.getSelectedItem().toString();
        String nama_bendahara=txtNamaBendahara.getText();
        String username=txtUsername.getText();
        String password=txtPassword.getText();
        
        char [] x= new char[5];
        
        for(int c=0;c<id_ukm.length();c++){
            if(id_ukm.charAt(c)!='-'){
                x[c]=id_ukm.charAt(c);
            }
            else{
                break;
            }
        }
        
        int idukm=Integer.parseInt(new String(x));
        Bendahara bendahara= new Bendahara(id_bendahara, idukm, nama_bendahara,
            username, password);

        if(btnSave.getText().equals("Save")){
            if(cb.insertBendahara(bendahara)){
                lbResult.setText("Saved");
                setTableBendahara(cb.getAllBendahara());
            }else{
                lbResult.setText("Failed Saved");
            }
        }else{
            if(cb.updateBendahara(bendahara)){
                lbResult.setText("Updated");
                setTableBendahara(cb.getAllBendahara());
                btnSave.setText("Save");
            }else{
                lbResult.setText("Failed Updated");
            }
        }
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(rootPane, "Apakah Yakin Untuk Didelete?","Delete Dialog",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            int id = Integer.parseInt(tblBendahara.getModel().getValueAt(tblBendahara.getSelectedRow(), 0).toString());
            cb.deleteBendahara(id);
            clear();
        }
  
    }//GEN-LAST:event_deleteActionPerformed

    private void setTableBendahara(List<Bendahara> listBendahara){
        if(listBendahara==null){
            JOptionPane.showMessageDialog(this, "Failed geting Data");
        }else{
            DefaultTableModel model= new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{
                "ID Bendahara",
                "ID UKM",
                "Nama Bendahara",
                "Username",
                "Password"
            });
            
            for(Bendahara b:listBendahara){
                Object [] ob= new Object[5];
                ob[0]=b.getId_bendahara();
                ob[1]=b.getId_ukm();
                ob[2]=b.getNama_bendahara();
                ob[3]=b.getUsername();
                ob[4]=b.getPassword();
                model.addRow(ob);
            }
            
            tblBendahara.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            tblBendahara.setModel(model);
            
        }
    }
    
    private void setCbxUkm(List<Ukm> listUkm){
        
        DefaultComboBoxModel boxModel= new DefaultComboBoxModel();
        for(Ukm u:listUkm){
            boxModel.addElement(u.id_ukm +"-"+u.nama_ukm);
        }
        cbxUkm.setModel(boxModel);
        
    }
    
    public void clear(){
        txtIdBendahara.setText("");
        txtNamaBendahara.setText("");
        txtPassword.setText("");
        txtUsername.setText("");
        cbxUkm.setSelectedItem(0);
        btnSave.setText("Save");
        
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DialogBendahara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogBendahara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogBendahara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogBendahara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogBendahara dialog = new DialogBendahara(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxUkm;
    private javax.swing.JMenuItem delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbResult;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JTable tblBendahara;
    private javax.swing.JTextField txtIdBendahara;
    private javax.swing.JTextField txtNamaBendahara;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
