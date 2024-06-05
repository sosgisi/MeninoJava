import JavaClasses.Customer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DetailedMovie extends javax.swing.JFrame {
    
    Customer customer;
    
    private String fileLoc;
    private String nama;
    private int tiket;
    private String waktu;
    private String tempat;
    //private double harga;
    
    public DetailedMovie(){
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public DetailedMovie(String fileLoc, Customer customer){
        this.customer = customer;
        this.fileLoc = fileLoc;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(fileLoc);
        movie1.setIcon(img);
        movie1.disable();
        //this.customer = new Customer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        time = new javax.swing.ButtonGroup();
        cancelBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        Label = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        tickets = new javax.swing.JComboBox<>();
        ticketsLabel = new javax.swing.JLabel();
        j14 = new javax.swing.JRadioButton();
        j16 = new javax.swing.JRadioButton();
        j18 = new javax.swing.JRadioButton();
        j21 = new javax.swing.JRadioButton();
        j12 = new javax.swing.JRadioButton();
        timeLabel = new javax.swing.JLabel();
        place = new javax.swing.JComboBox<>();
        movie1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelBtn.setBackground(new java.awt.Color(255, 0, 0));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 130, 40));

        submitBtn.setBackground(new java.awt.Color(255, 255, 51));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        submitBtn.setText("Next");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 130, 40));

        Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setText("Place              :");
        getContentPane().add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 270, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name             :");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 120, -1));

        tickets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(tickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 50, -1));

        ticketsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ticketsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ticketsLabel.setText("Tickets           :");
        getContentPane().add(ticketsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 120, -1));

        time.add(j14);
        j14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        j14.setForeground(new java.awt.Color(255, 255, 255));
        j14.setText("14:30");
        getContentPane().add(j14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        time.add(j16);
        j16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        j16.setForeground(new java.awt.Color(255, 255, 255));
        j16.setText("16:40");
        getContentPane().add(j16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        time.add(j18);
        j18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        j18.setForeground(new java.awt.Color(255, 255, 255));
        j18.setText("18:50");
        getContentPane().add(j18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        time.add(j21);
        j21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        j21.setForeground(new java.awt.Color(255, 255, 255));
        j21.setText("21:00");
        getContentPane().add(j21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        time.add(j12);
        j12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        j12.setForeground(new java.awt.Color(255, 255, 255));
        j12.setText("12:20");
        getContentPane().add(j12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("Time               :");
        getContentPane().add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 120, -1));

        place.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        place.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "DJAKARTA XXI", "MALL OF INDONEISA CGV", "EMPORIUM PLUIT XXI", "GRAND PARAGON XXI", "GRAND INDONESIA CGV", "LAGOON AVENUE CGV", "HOLLYWOOD XXI", "KELAPA GADING XXI", "AEON MALL CGV", "METROPOLE XXI", "PLAZA INDONESIA XXI", "GREEN PRAMUKA CGV", " ", " ", " " }));
        getContentPane().add(place, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 270, -1));
        getContentPane().add(movie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 160, 240));

        background.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\detailedMovie-bg.jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        nama = name.getText();
        String tiketStr = tickets.getSelectedItem().toString();
        tiket = Integer.parseInt(tiketStr);
        if(j12.isSelected()){
            waktu = "12:20";
        }else if(j14.isSelected()){
            waktu = "14:30";
        }else if(j16.isSelected()){
            waktu = "16:40";
        }else if(j18.isSelected()){
            waktu = "18:50";
        }else if(j21.isSelected()){
            waktu = "21:00";
        }
        tempat = place.getSelectedItem().toString();
        
        if(nama.isBlank()){
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong!", "message", JOptionPane.WARNING_MESSAGE);
        }else if(!j12.isSelected() && !j14.isSelected() && !j16.isSelected() && !j18.isSelected() && !j21.isSelected()){
            JOptionPane.showMessageDialog(null, "Anda belum memilih jam tayang", "message", JOptionPane.WARNING_MESSAGE);
        }else if(tempat.isBlank()){
            JOptionPane.showMessageDialog(null, "Anda belum memilih tempat bioskop", "message", JOptionPane.WARNING_MESSAGE);
        }else{
            customer.setName(nama);
            customer.setMovieName(customer.queueMovieNames.element().toString());
            //customer.orderMovieNames.add(customer.queueMovieNames.element().toString());
            customer.setTickets(tiket);
            customer.setTime(waktu);
            customer.setPlace(tempat);
            //customer.setPrice(harga*tiket);
            customer.queueMovieNames.poll();
            Seats seats = new Seats(customer);
            seats.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        customer.queueMovieNames.poll();
        Movies movie = new Movies(customer);
        movie.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DetailedMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailedMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailedMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailedMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailedMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JLabel background;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JRadioButton j12;
    private javax.swing.JRadioButton j14;
    private javax.swing.JRadioButton j16;
    private javax.swing.JRadioButton j18;
    private javax.swing.JRadioButton j21;
    private javax.swing.JButton movie1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox<String> place;
    private javax.swing.JButton submitBtn;
    private javax.swing.JComboBox<String> tickets;
    private javax.swing.JLabel ticketsLabel;
    private javax.swing.ButtonGroup time;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
