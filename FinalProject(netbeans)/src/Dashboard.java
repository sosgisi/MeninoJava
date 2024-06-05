
import JavaClasses.Customer;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    Customer customer;
    
    public Dashboard() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //this.customer = new Customer();
        this.customer = Customer.getInstance();
    }
    public Dashboard(Customer customer) {
        this.customer = customer;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        moviesButton = new javax.swing.JButton();
        Payments = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/popcorn.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\tickets.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 70, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\movie-icon.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 70, 70));

        moviesButton.setBackground(new java.awt.Color(255, 153, 0));
        moviesButton.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        moviesButton.setText("Movies");
        moviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(moviesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 190, -1));

        Payments.setBackground(new java.awt.Color(255, 153, 102));
        Payments.setFont(new java.awt.Font("Serif", 0, 30)); // NOI18N
        Payments.setText("Your Orders");
        Payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentsActionPerformed(evt);
            }
        });
        getContentPane().add(Payments, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 190, 30));

        background.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\dashboard-bg.jpg")); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesButtonActionPerformed
        // TODO add your handling code here:
        Movies movies = new Movies(customer);
        movies.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_moviesButtonActionPerformed

    private void PaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentsActionPerformed
        // TODO add your handling code here:
        Orders order = new Orders(customer);
        order.setVisible(true);
        this.dispose();
//        try{
//            String nama = customer.getName();
//            Orders order = new Orders(customer);
//            order.setVisible(true);
//            this.dispose();
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Anda belum memesan tiket!", "message", JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_PaymentsActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Payments;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton moviesButton;
    // End of variables declaration//GEN-END:variables
}
