
import JavaClasses.Customer;

public class Orders extends javax.swing.JFrame {

    Customer customer;
    
    public Orders() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        transparent();
    }
    
    public Orders(Customer customer) {
        this.customer = customer;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        transparent();
        antrian();
    }
    
    public void getOrder(int order){
        customer.setName(customer.orderNames.get(order));
        customer.setTickets(customer.orderTickets.get(order));
        customer.setTime(customer.orderTimes.get(order).toString());
        customer.setPlace(customer.orderPlaces.get(order));
        customer.setSeatNumber(customer.orderSeatNumbers.get(order));
        customer.setMovieName(customer.orderMovieNames.get(order));
        customer.setPrice(customer.orderPrices.get(order));
    }
    
    public void antrian(){
        int iter = customer.getIteration();
        switch(iter){
            case 1:
                System.out.println("Order class: "+iter);
                System.out.println("Order class: "+customer.orderId.get(iter));
                System.out.println("Order class: "+customer.orderId.toString());
                id1.setText(customer.orderIds.get(0));
                total1.setText("Rp. "+customer.orderPrices.get(0));
                pay1.setVisible(true);
                pay1.setOpaque(true);
                pay1.setContentAreaFilled(true);
                pay1.setBorderPainted(true);
                totalHarga.setText(""+customer.totalPrice());
                break;
            case 2:
                id1.setText(customer.orderIds.get(0));
                total1.setText("Rp. "+customer.orderPrices.get(0));
                pay1.setVisible(true);
                pay1.setOpaque(true);
                pay1.setContentAreaFilled(true);
                pay1.setBorderPainted(true);
                id2.setText(customer.orderIds.get(1));
                total2.setText("Rp. "+customer.orderPrices.get(1));
                pay2.setVisible(true);
                pay2.setOpaque(true);
                pay2.setContentAreaFilled(true);
                pay2.setBorderPainted(true);
                totalHarga.setText(""+customer.totalPrice());
                break;
            case 3:
                id1.setText(customer.orderIds.get(0));
                total1.setText("Rp. "+customer.orderPrices.get(0));
                pay1.setVisible(true);
                pay1.setOpaque(true);
                pay1.setContentAreaFilled(true);
                pay1.setBorderPainted(true);
                id2.setText(customer.orderIds.get(1));
                total2.setText("Rp. "+customer.orderPrices.get(1));
                pay2.setVisible(true);
                pay2.setOpaque(true);
                pay2.setContentAreaFilled(true);
                pay2.setBorderPainted(true);
                id3.setText(customer.orderIds.get(2));
                total3.setText("Rp. "+customer.orderPrices.get(2));
                pay3.setVisible(true);
                pay3.setOpaque(true);
                pay3.setContentAreaFilled(true);
                pay3.setBorderPainted(true);
                totalHarga.setText(""+customer.totalPrice());
                break;
            case 4:
                id1.setText(customer.orderIds.get(0));
                total1.setText("Rp. "+customer.orderPrices.get(0));
                pay1.setVisible(true);
                pay1.setOpaque(true);
                pay1.setContentAreaFilled(true);
                pay1.setBorderPainted(true);
                id2.setText(customer.orderIds.get(1));
                total2.setText("Rp. "+customer.orderPrices.get(1));
                pay2.setVisible(true);
                pay2.setOpaque(true);
                pay2.setContentAreaFilled(true);
                pay2.setBorderPainted(true);
                id3.setText(customer.orderIds.get(2));
                total3.setText("Rp. "+customer.orderPrices.get(2));
                pay3.setVisible(true);
                pay3.setOpaque(true);
                pay3.setContentAreaFilled(true);
                pay3.setBorderPainted(true);
                id4.setText(customer.orderIds.get(3));
                total4.setText("Rp. "+customer.orderPrices.get(3));
                pay4.setVisible(true);
                pay4.setOpaque(true);
                pay4.setContentAreaFilled(true);
                pay4.setBorderPainted(true);
                totalHarga.setText(""+customer.totalPrice());
                break;
            case 5:
                id1.setText(customer.orderIds.get(0));
                total1.setText("Rp. "+customer.orderPrices.get(0));
                pay1.setVisible(true);
                pay1.setOpaque(true);
                pay1.setContentAreaFilled(true);
                pay1.setBorderPainted(true);
                id2.setText(customer.orderIds.get(1));
                total2.setText("Rp. "+customer.orderPrices.get(1));
                pay2.setVisible(true);
                pay2.setOpaque(true);
                pay2.setContentAreaFilled(true);
                pay2.setBorderPainted(true);
                id3.setText(customer.orderIds.get(2));
                total3.setText("Rp. "+customer.orderPrices.get(2));
                pay3.setVisible(true);
                pay3.setOpaque(true);
                pay3.setContentAreaFilled(true);
                pay3.setBorderPainted(true);
                id4.setText(customer.orderIds.get(3));
                total4.setText("Rp. "+customer.orderPrices.get(3));
                pay4.setVisible(true);
                pay4.setOpaque(true);
                pay4.setContentAreaFilled(true);
                pay4.setBorderPainted(true);
                id5.setText(customer.orderIds.get(4));
                total5.setText("Rp. "+customer.orderPrices.get(4));
                pay5.setVisible(true);
                pay5.setOpaque(true);
                pay5.setContentAreaFilled(true);
                pay5.setBorderPainted(true);
                totalHarga.setText(""+customer.totalPrice());
                break;
            case 6:
                id1.setText(customer.orderIds.get(0));
                total1.setText("Rp. "+customer.orderPrices.get(0));
                pay1.setVisible(true);
                pay1.setOpaque(true);
                pay1.setContentAreaFilled(true);
                pay1.setBorderPainted(true);
                id2.setText(customer.orderIds.get(1));
                total2.setText("Rp. "+customer.orderPrices.get(1));
                pay2.setVisible(true);
                pay2.setOpaque(true);
                pay2.setContentAreaFilled(true);
                pay2.setBorderPainted(true);
                id3.setText(customer.orderIds.get(2));
                total3.setText("Rp. "+customer.orderPrices.get(2));
                pay3.setVisible(true);
                pay3.setOpaque(true);
                pay3.setContentAreaFilled(true);
                pay3.setBorderPainted(true);
                id4.setText(customer.orderIds.get(3));
                total4.setText("Rp. "+customer.orderPrices.get(3));
                pay4.setVisible(true);
                pay4.setOpaque(true);
                pay4.setContentAreaFilled(true);
                pay4.setBorderPainted(true);
                id5.setText(customer.orderIds.get(4));
                total5.setText("Rp. "+customer.orderPrices.get(4));
                pay5.setVisible(true);
                pay5.setOpaque(true);
                pay5.setContentAreaFilled(true);
                pay5.setBorderPainted(true);
                id6.setText(customer.orderIds.get(5));
                total6.setText("Rp. "+customer.orderPrices.get(5));
                pay6.setVisible(true);
                pay6.setOpaque(true);
                pay6.setContentAreaFilled(true);
                pay6.setBorderPainted(true);
                totalHarga.setText(""+customer.totalPrice());
                break;
        }
    }
    
    
    public void transparent(){
        pay1.setVisible(false);
        pay1.setOpaque(false);
        pay1.setContentAreaFilled(false);
        pay1.setBorderPainted(false);
        pay2.setVisible(false);
        pay2.setOpaque(false);
        pay2.setContentAreaFilled(false);
        pay2.setBorderPainted(false);
        pay3.setVisible(false);
        pay3.setOpaque(false);
        pay3.setContentAreaFilled(false);
        pay3.setBorderPainted(false);
        pay4.setVisible(false);
        pay4.setOpaque(false);
        pay4.setContentAreaFilled(false);
        pay4.setBorderPainted(false);
        pay5.setVisible(false);
        pay5.setOpaque(false);
        pay5.setContentAreaFilled(false);
        pay5.setBorderPainted(false);
        pay6.setVisible(false);
        pay6.setOpaque(false);
        pay6.setContentAreaFilled(false);
        pay6.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        total1 = new javax.swing.JLabel();
        pay1 = new javax.swing.JButton();
        id1 = new javax.swing.JLabel();
        pay2 = new javax.swing.JButton();
        pay3 = new javax.swing.JButton();
        pay4 = new javax.swing.JButton();
        pay5 = new javax.swing.JButton();
        pay6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        total2 = new javax.swing.JLabel();
        total3 = new javax.swing.JLabel();
        total4 = new javax.swing.JLabel();
        total5 = new javax.swing.JLabel();
        total6 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        totalHarga = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        total1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        total1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 210, 40));

        pay1.setBackground(new java.awt.Color(255, 255, 102));
        pay1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pay1.setForeground(new java.awt.Color(255, 51, 51));
        pay1.setText("Check out");
        pay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay1ActionPerformed(evt);
            }
        });
        getContentPane().add(pay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 120, 30));

        id1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 300, 40));

        pay2.setBackground(new java.awt.Color(255, 255, 102));
        pay2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pay2.setForeground(new java.awt.Color(255, 51, 51));
        pay2.setText("Check out");
        pay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay2ActionPerformed(evt);
            }
        });
        getContentPane().add(pay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 120, 30));

        pay3.setBackground(new java.awt.Color(255, 255, 102));
        pay3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pay3.setForeground(new java.awt.Color(255, 51, 51));
        pay3.setText("Check out");
        pay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay3ActionPerformed(evt);
            }
        });
        getContentPane().add(pay3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 120, 30));

        pay4.setBackground(new java.awt.Color(255, 255, 102));
        pay4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pay4.setForeground(new java.awt.Color(255, 51, 51));
        pay4.setText("Check out");
        pay4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay4ActionPerformed(evt);
            }
        });
        getContentPane().add(pay4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 120, 30));

        pay5.setBackground(new java.awt.Color(255, 255, 102));
        pay5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pay5.setForeground(new java.awt.Color(255, 51, 51));
        pay5.setText("Check out");
        pay5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay5ActionPerformed(evt);
            }
        });
        getContentPane().add(pay5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 120, 30));

        pay6.setBackground(new java.awt.Color(255, 255, 102));
        pay6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pay6.setForeground(new java.awt.Color(255, 51, 51));
        pay6.setText("Check out");
        pay6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay6ActionPerformed(evt);
            }
        });
        getContentPane().add(pay6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 120, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Orders:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 130, 60));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-btn2.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 90));

        id2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        id2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 300, 40));

        id3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        id3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 300, 40));

        id4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        id4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 300, 40));

        id5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        id5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 300, 40));

        id6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        id6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(id6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 300, 40));

        total2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        total2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 210, 40));

        total3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        total3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(total3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 210, 40));

        total4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        total4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(total4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 210, 40));

        total5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        total5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(total5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 210, 40));

        total6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        total6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(total6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 210, 40));

        name7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        name7.setForeground(new java.awt.Color(255, 255, 102));
        name7.setText("             Total Order                :");
        getContentPane().add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 330, 30));

        totalHarga.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalHarga.setForeground(new java.awt.Color(255, 255, 102));
        totalHarga.setText("Rp. ");
        getContentPane().add(totalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 210, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Price");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Order id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\order-bg.jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        Dashboard dashboard = new Dashboard(customer);
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void pay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay1ActionPerformed
        // TODO add your handling code here:
        getOrder(0);
        Payments payments = new Payments(customer, 0);
        payments.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pay1ActionPerformed

    private void pay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay2ActionPerformed
        // TODO add your handling code here:
        getOrder(1);
        Payments payments = new Payments(customer, 1);
        payments.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pay2ActionPerformed

    private void pay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay3ActionPerformed
        // TODO add your handling code here:
        getOrder(2);
        Payments payments = new Payments(customer, 2);
        payments.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pay3ActionPerformed

    private void pay5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay5ActionPerformed
        // TODO add your handling code here:
        getOrder(3);
        Payments payments = new Payments(customer, 3);
        payments.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pay5ActionPerformed

    private void pay4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay4ActionPerformed
        // TODO add your handling code here:
        getOrder(4);
        Payments payments = new Payments(customer, 4);
        payments.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pay4ActionPerformed

    private void pay6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay6ActionPerformed
        // TODO add your handling code here:
        getOrder(5);
        Payments payments = new Payments(customer, 5);
        payments.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pay6ActionPerformed

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
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel id6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel name7;
    private javax.swing.JButton pay1;
    private javax.swing.JButton pay2;
    private javax.swing.JButton pay3;
    private javax.swing.JButton pay4;
    private javax.swing.JButton pay5;
    private javax.swing.JButton pay6;
    private javax.swing.JLabel total1;
    private javax.swing.JLabel total2;
    private javax.swing.JLabel total3;
    private javax.swing.JLabel total4;
    private javax.swing.JLabel total5;
    private javax.swing.JLabel total6;
    private javax.swing.JLabel totalHarga;
    // End of variables declaration//GEN-END:variables
}
