/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFiles;

/**
 *
 * @author sajid
 */
public class InventorySupervisor extends javax.swing.JFrame {

    /**
     * Creates new form InventorySupervisor
     */
    public InventorySupervisor() {
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

        supervisorBackground = new javax.swing.JPanel();
        assignProduct = new javax.swing.JLabel();
        updateStock = new javax.swing.JLabel();
        addProduct = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Supervisor");

        supervisorBackground.setBackground(new java.awt.Color(204, 255, 255));

        assignProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        assignProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/before assign product.png"))); // NOI18N
        assignProduct.setText("Assign Products");
        assignProduct.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                assignProductMouseMoved(evt);
            }
        });
        assignProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                assignProductMouseExited(evt);
            }
        });

        updateStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/before update stock.png"))); // NOI18N
        updateStock.setText("Check/Update Stock");
        updateStock.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                updateStockMouseMoved(evt);
            }
        });
        updateStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateStockMouseExited(evt);
            }
        });

        addProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/before add product.png"))); // NOI18N
        addProduct.setText("Add Products");
        addProduct.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addProductMouseMoved(evt);
            }
        });
        addProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addProductMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please choose your Option");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/pharma-A(logo).png"))); // NOI18N
        jLabel1.setText("       Welcome to PharmaA Inventory Module");

        javax.swing.GroupLayout supervisorBackgroundLayout = new javax.swing.GroupLayout(supervisorBackground);
        supervisorBackground.setLayout(supervisorBackgroundLayout);
        supervisorBackgroundLayout.setHorizontalGroup(
            supervisorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supervisorBackgroundLayout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(updateStock, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(assignProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
            .addGroup(supervisorBackgroundLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(supervisorBackgroundLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        supervisorBackgroundLayout.setVerticalGroup(
            supervisorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supervisorBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(supervisorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateStock, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(251, 251, 251))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supervisorBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supervisorBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateStockMouseExited
updateStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/before update stock.png"))); // NOI18N
    }//GEN-LAST:event_updateStockMouseExited

    private void addProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductMouseExited
addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/before add product.png"))); // NOI18N
    }//GEN-LAST:event_addProductMouseExited

    private void updateStockMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateStockMouseMoved
updateStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/after update stock.png"))); // NOI18N
    }//GEN-LAST:event_updateStockMouseMoved

    private void addProductMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductMouseMoved
addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/after add product.png"))); // NOI18N

    }//GEN-LAST:event_addProductMouseMoved

    private void assignProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignProductMouseExited
        assignProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/before assign product.png"))); // NOI18N
    }//GEN-LAST:event_assignProductMouseExited

    private void assignProductMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignProductMouseMoved
        assignProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/after assign product.png"))); // NOI18N
    }//GEN-LAST:event_assignProductMouseMoved

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
            java.util.logging.Logger.getLogger(InventorySupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventorySupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventorySupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventorySupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventorySupervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addProduct;
    private javax.swing.JLabel assignProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel supervisorBackground;
    private javax.swing.JLabel updateStock;
    // End of variables declaration//GEN-END:variables
}
