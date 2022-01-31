/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NitroQ
 */
public class AddProducts extends javax.swing.JFrame {

    /**
     * Creates new form AddProducts
     */
    public AddProducts() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_PID = new javax.swing.JLabel();
        lbl_PName = new javax.swing.JLabel();
        lbl_PQty = new javax.swing.JLabel();
        lbl_PGroup = new javax.swing.JLabel();
        lbl_PPurchasePrice = new javax.swing.JLabel();
        lbl_PSellingPrice = new javax.swing.JLabel();
        txt_PID = new javax.swing.JTextField();
        txt_PName = new javax.swing.JTextField();
        txt_PQty = new javax.swing.JTextField();
        txt_PPurchasePrice = new javax.swing.JTextField();
        txt_PSellingPrice = new javax.swing.JTextField();
        combo_PGroup = new javax.swing.JComboBox<>();
        btn_print = new java.awt.Button();
        btn_clear = new java.awt.Button();
        btn_add = new java.awt.Button();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_close = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        addproductperson = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 700));

        lbl_PID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_PID.setText("Product ID:");

        lbl_PName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_PName.setText("Product Name:");

        lbl_PQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_PQty.setText("Quantity:");

        lbl_PGroup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_PGroup.setText("Product Group:");

        lbl_PPurchasePrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_PPurchasePrice.setText("Purchase Price:");

        lbl_PSellingPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_PSellingPrice.setText("Selling Price:");

        txt_PID.setForeground(new java.awt.Color(102, 102, 102));
        txt_PID.setBorder(null);
        txt_PID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PIDFocusGained(evt);
            }
        });

        txt_PName.setForeground(new java.awt.Color(102, 102, 102));
        txt_PName.setBorder(null);
        txt_PName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PNameFocusGained(evt);
            }
        });

        txt_PQty.setForeground(new java.awt.Color(102, 102, 102));
        txt_PQty.setBorder(null);
        txt_PQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PQtyFocusGained(evt);
            }
        });
        txt_PQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PQtyActionPerformed(evt);
            }
        });

        txt_PPurchasePrice.setForeground(new java.awt.Color(102, 102, 102));
        txt_PPurchasePrice.setBorder(null);
        txt_PPurchasePrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PPurchasePriceFocusGained(evt);
            }
        });

        txt_PSellingPrice.setForeground(new java.awt.Color(102, 102, 102));
        txt_PSellingPrice.setBorder(null);
        txt_PSellingPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PSellingPriceFocusGained(evt);
            }
        });
        txt_PSellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PSellingPriceActionPerformed(evt);
            }
        });

        combo_PGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", " " }));

        btn_print.setBackground(new java.awt.Color(32, 153, 158));
        btn_print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_print.setForeground(new java.awt.Color(255, 255, 255));
        btn_print.setLabel("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(32, 153, 158));
        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setLabel("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(32, 153, 158));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setLabel("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Group", "Purchase Price", "Selling Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btn_close.setBackground(new java.awt.Color(32, 153, 158));
        btn_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setLabel("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        addproductperson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/pharma-A(logo).png"))); // NOI18N
        addproductperson.setText("NAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addproductperson)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addproductperson)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lbl_PID)
                                .addGap(8, 8, 8)
                                .addComponent(txt_PID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lbl_PName)
                                .addGap(17, 17, 17)
                                .addComponent(txt_PName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lbl_PQty)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_PQty, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(lbl_PGroup)
                                .addGap(14, 14, 14)
                                .addComponent(combo_PGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_PPurchasePrice)
                                .addGap(16, 16, 16)
                                .addComponent(txt_PPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lbl_PSellingPrice)
                                .addGap(15, 15, 15)
                                .addComponent(txt_PSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 12, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_PID)
                    .addComponent(txt_PID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_PName)
                    .addComponent(txt_PName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_PQty)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_PQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_PGroup)
                            .addComponent(combo_PGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_PPurchasePrice)
                    .addComponent(txt_PPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_PSellingPrice)
                    .addComponent(txt_PSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PSellingPriceActionPerformed

    private void txt_PQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PQtyActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
      txt_PID.setText("");
      txt_PName.setText("");
      txt_PQty.setText("");
      txt_PPurchasePrice.setText("");
      combo_PGroup.setSelectedIndex(0);
      txt_PSellingPrice.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_PIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PIDFocusGained
        // TODO add your handling code here:
        if(txt_PID.getText().equals("Enter product ID"))
        txt_PID.setText("");
    }//GEN-LAST:event_txt_PIDFocusGained

    private void txt_PNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PNameFocusGained
        // TODO add your handling code here:
        if(txt_PName.getText().equals("Enter Product Name"))
        txt_PName.setText("");
    }//GEN-LAST:event_txt_PNameFocusGained

    private void txt_PQtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PQtyFocusGained
        // TODO add your handling code here:
        if(txt_PQty.getText().equals("How many?"))
        txt_PQty.setText("");
    }//GEN-LAST:event_txt_PQtyFocusGained

    private void txt_PPurchasePriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PPurchasePriceFocusGained
        // TODO add your handling code here:
        if(txt_PPurchasePrice.getText().equals("0000.00"))
        txt_PPurchasePrice.setText("");
    }//GEN-LAST:event_txt_PPurchasePriceFocusGained

    private void txt_PSellingPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PSellingPriceFocusGained
        // TODO add your handling code here:
        if(txt_PSellingPrice.getText().equals("0000.00"))
        txt_PSellingPrice.setText("");
    }//GEN-LAST:event_txt_PSellingPriceFocusGained

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
     String msg="ADD Product Slip\n\n\nReciept:\nPharmaA\nNilai\n\n==============================================\nCashier:\nProduct ID:\n\n==============================================\n==============================================\nPurchase\n\nProduct ID:\t\tQuantity:\t\tPrice:\n\n\n"+"\t\t"+txt_PQty.getText()+"\t\t"+txt_PPurchasePrice.getText()+"\n\n\n==============================================\n==============================================\n\t\t\t\tTotal:";
new Print(msg).setVisible(true);
   int count = 2;
    
    final JFileChooser fc = new JFileChooser();

        final JFileChooser SaveAs = new JFileChooser();
        SaveAs.setApproveButtonText("Save");
        int actionDialog = SaveAs.showOpenDialog(this);

        File fileName = new File(SaveAs.getSelectedFile() + ".doc");
        try {
            if (fileName == null) {
                return;
            }
            try (BufferedWriter outFile = new BufferedWriter(new FileWriter(fileName))) {
                outFile.write(msg); //put in textfile
            } //put in textfile
        } catch (IOException ex) {
        }
msg="";
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
String data1 = txt_PID.getText();
String data2 = txt_PName.getText();
String data3 = txt_PPurchasePrice.getText();
Object data4= combo_PGroup.getSelectedItem();
String data5 = txt_PSellingPrice.getText(); 
String data6 =txt_PQty.getText();

if(data1.equals(""))
     JOptionPane.showMessageDialog(null,"Product ID Field Empty");
 else if(data2.equals(""))
     JOptionPane.showMessageDialog(null,"Product Name Field Empty");
 else if(data3.equals(""))
     JOptionPane.showMessageDialog(null,"Purchase price Field Empty");
 else if(data4.equals("Choose"))
     JOptionPane.showMessageDialog(null,"Please select group");
  else if(data5.equals(""))
     JOptionPane.showMessageDialog(null,"Selling price field empty");
   else if(data6.equals(""))
     JOptionPane.showMessageDialog(null,"Quantity Field Empty");
 else{
    Object[] row = { data1, data2, data6, data4,data3,data5 };
    model.addRow(row);}
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
       this.hide();
    }//GEN-LAST:event_btn_closeActionPerformed

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
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addproductperson;
    private java.awt.Button btn_add;
    private java.awt.Button btn_clear;
    private java.awt.Button btn_close;
    private java.awt.Button btn_print;
    private javax.swing.JComboBox<String> combo_PGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_PGroup;
    private javax.swing.JLabel lbl_PID;
    private javax.swing.JLabel lbl_PName;
    private javax.swing.JLabel lbl_PPurchasePrice;
    private javax.swing.JLabel lbl_PQty;
    private javax.swing.JLabel lbl_PSellingPrice;
    private javax.swing.JTextField txt_PID;
    private javax.swing.JTextField txt_PName;
    private javax.swing.JTextField txt_PPurchasePrice;
    private javax.swing.JTextField txt_PQty;
    private javax.swing.JTextField txt_PSellingPrice;
    // End of variables declaration//GEN-END:variables
}
