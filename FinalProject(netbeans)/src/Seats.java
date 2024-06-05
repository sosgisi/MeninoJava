
import JavaClasses.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Seats extends javax.swing.JFrame {

    Customer customer;
    private int tiket;
    private int temp;
    
    public Seats(Customer customer) {
        this.customer = customer;
        this.tiket = customer.getTickets();
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        s2 = new javax.swing.JButton();
        s3 = new javax.swing.JButton();
        s4 = new javax.swing.JButton();
        s10 = new javax.swing.JButton();
        s11 = new javax.swing.JButton();
        s12 = new javax.swing.JButton();
        s13 = new javax.swing.JButton();
        s19 = new javax.swing.JButton();
        s20 = new javax.swing.JButton();
        s21 = new javax.swing.JButton();
        s28 = new javax.swing.JButton();
        s1 = new javax.swing.JButton();
        s29 = new javax.swing.JButton();
        s30 = new javax.swing.JButton();
        s31 = new javax.swing.JButton();
        s37 = new javax.swing.JButton();
        s38 = new javax.swing.JButton();
        s39 = new javax.swing.JButton();
        s40 = new javax.swing.JButton();
        s6 = new javax.swing.JButton();
        s14 = new javax.swing.JButton();
        s23 = new javax.swing.JButton();
        s32 = new javax.swing.JButton();
        s41 = new javax.swing.JButton();
        s22 = new javax.swing.JButton();
        s7 = new javax.swing.JButton();
        s8 = new javax.swing.JButton();
        s15 = new javax.swing.JButton();
        s9 = new javax.swing.JButton();
        s16 = new javax.swing.JButton();
        s17 = new javax.swing.JButton();
        s18 = new javax.swing.JButton();
        s24 = new javax.swing.JButton();
        s25 = new javax.swing.JButton();
        s26 = new javax.swing.JButton();
        s27 = new javax.swing.JButton();
        s33 = new javax.swing.JButton();
        s34 = new javax.swing.JButton();
        s35 = new javax.swing.JButton();
        s36 = new javax.swing.JButton();
        s42 = new javax.swing.JButton();
        s43 = new javax.swing.JButton();
        s44 = new javax.swing.JButton();
        s45 = new javax.swing.JButton();
        s5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 130, 40));

        submitBtn.setBackground(new java.awt.Color(0, 255, 0));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 130, 40));

        s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s2.setPreferredSize(new java.awt.Dimension(30, 30));
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s3.setPreferredSize(new java.awt.Dimension(30, 30));
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        s4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s4.setPreferredSize(new java.awt.Dimension(30, 30));
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        s10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s10.setPreferredSize(new java.awt.Dimension(30, 30));
        s10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10ActionPerformed(evt);
            }
        });
        getContentPane().add(s10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        s11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s11.setPreferredSize(new java.awt.Dimension(30, 30));
        s11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s11ActionPerformed(evt);
            }
        });
        getContentPane().add(s11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        s12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s12.setPreferredSize(new java.awt.Dimension(30, 30));
        s12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s12ActionPerformed(evt);
            }
        });
        getContentPane().add(s12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        s13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s13.setPreferredSize(new java.awt.Dimension(30, 30));
        s13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s13ActionPerformed(evt);
            }
        });
        getContentPane().add(s13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        s19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s19.setPreferredSize(new java.awt.Dimension(30, 30));
        s19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s19ActionPerformed(evt);
            }
        });
        getContentPane().add(s19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        s20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s20.setPreferredSize(new java.awt.Dimension(30, 30));
        s20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s20ActionPerformed(evt);
            }
        });
        getContentPane().add(s20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        s21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s21.setPreferredSize(new java.awt.Dimension(30, 30));
        s21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s21ActionPerformed(evt);
            }
        });
        getContentPane().add(s21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        s28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s28.setPreferredSize(new java.awt.Dimension(30, 30));
        s28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s28ActionPerformed(evt);
            }
        });
        getContentPane().add(s28, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s1.setPreferredSize(new java.awt.Dimension(30, 30));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        s29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s29.setPreferredSize(new java.awt.Dimension(30, 30));
        s29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s29ActionPerformed(evt);
            }
        });
        getContentPane().add(s29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        s30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s30.setPreferredSize(new java.awt.Dimension(30, 30));
        s30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s30ActionPerformed(evt);
            }
        });
        getContentPane().add(s30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        s31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s31.setPreferredSize(new java.awt.Dimension(30, 30));
        s31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s31ActionPerformed(evt);
            }
        });
        getContentPane().add(s31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        s37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s37.setPreferredSize(new java.awt.Dimension(30, 30));
        s37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s37ActionPerformed(evt);
            }
        });
        getContentPane().add(s37, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        s38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s38.setPreferredSize(new java.awt.Dimension(30, 30));
        s38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s38ActionPerformed(evt);
            }
        });
        getContentPane().add(s38, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        s39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s39.setPreferredSize(new java.awt.Dimension(30, 30));
        s39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s39ActionPerformed(evt);
            }
        });
        getContentPane().add(s39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        s40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s40.setPreferredSize(new java.awt.Dimension(30, 30));
        s40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s40ActionPerformed(evt);
            }
        });
        getContentPane().add(s40, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        s6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s6.setPreferredSize(new java.awt.Dimension(30, 30));
        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });
        getContentPane().add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        s14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s14.setPreferredSize(new java.awt.Dimension(30, 30));
        s14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s14ActionPerformed(evt);
            }
        });
        getContentPane().add(s14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        s23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s23.setPreferredSize(new java.awt.Dimension(30, 30));
        s23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s23ActionPerformed(evt);
            }
        });
        getContentPane().add(s23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        s32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s32.setPreferredSize(new java.awt.Dimension(30, 30));
        s32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s32ActionPerformed(evt);
            }
        });
        getContentPane().add(s32, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        s41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s41.setPreferredSize(new java.awt.Dimension(30, 30));
        s41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s41ActionPerformed(evt);
            }
        });
        getContentPane().add(s41, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        s22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s22.setPreferredSize(new java.awt.Dimension(30, 30));
        s22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s22ActionPerformed(evt);
            }
        });
        getContentPane().add(s22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        s7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s7.setPreferredSize(new java.awt.Dimension(30, 30));
        s7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7ActionPerformed(evt);
            }
        });
        getContentPane().add(s7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        s8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s8.setPreferredSize(new java.awt.Dimension(30, 30));
        s8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s8ActionPerformed(evt);
            }
        });
        getContentPane().add(s8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        s15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s15.setPreferredSize(new java.awt.Dimension(30, 30));
        s15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s15ActionPerformed(evt);
            }
        });
        getContentPane().add(s15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        s9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s9.setPreferredSize(new java.awt.Dimension(30, 30));
        s9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s9ActionPerformed(evt);
            }
        });
        getContentPane().add(s9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        s16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s16.setPreferredSize(new java.awt.Dimension(30, 30));
        s16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s16ActionPerformed(evt);
            }
        });
        getContentPane().add(s16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        s17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s17.setPreferredSize(new java.awt.Dimension(30, 30));
        s17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s17ActionPerformed(evt);
            }
        });
        getContentPane().add(s17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        s18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s18.setPreferredSize(new java.awt.Dimension(30, 30));
        s18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s18ActionPerformed(evt);
            }
        });
        getContentPane().add(s18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        s24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s24.setPreferredSize(new java.awt.Dimension(30, 30));
        s24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s24ActionPerformed(evt);
            }
        });
        getContentPane().add(s24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        s25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s25.setPreferredSize(new java.awt.Dimension(30, 30));
        s25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s25ActionPerformed(evt);
            }
        });
        getContentPane().add(s25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        s26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s26.setPreferredSize(new java.awt.Dimension(30, 30));
        s26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s26ActionPerformed(evt);
            }
        });
        getContentPane().add(s26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        s27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s27.setPreferredSize(new java.awt.Dimension(30, 30));
        s27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s27ActionPerformed(evt);
            }
        });
        getContentPane().add(s27, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        s33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s33.setPreferredSize(new java.awt.Dimension(30, 30));
        s33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s33ActionPerformed(evt);
            }
        });
        getContentPane().add(s33, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        s34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s34.setPreferredSize(new java.awt.Dimension(30, 30));
        s34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s34ActionPerformed(evt);
            }
        });
        getContentPane().add(s34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        s35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s35.setPreferredSize(new java.awt.Dimension(30, 30));
        s35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s35ActionPerformed(evt);
            }
        });
        getContentPane().add(s35, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        s36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s36.setPreferredSize(new java.awt.Dimension(30, 30));
        s36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s36ActionPerformed(evt);
            }
        });
        getContentPane().add(s36, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        s42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s42.setPreferredSize(new java.awt.Dimension(30, 30));
        s42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s42ActionPerformed(evt);
            }
        });
        getContentPane().add(s42, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        s43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s43.setPreferredSize(new java.awt.Dimension(30, 30));
        s43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s43ActionPerformed(evt);
            }
        });
        getContentPane().add(s43, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        s44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s44.setPreferredSize(new java.awt.Dimension(30, 30));
        s44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s44ActionPerformed(evt);
            }
        });
        getContentPane().add(s44, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        s45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s45.setPreferredSize(new java.awt.Dimension(30, 30));
        s45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s45ActionPerformed(evt);
            }
        });
        getContentPane().add(s45, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        s5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chair.png"))); // NOI18N
        s5.setPreferredSize(new java.awt.Dimension(30, 30));
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });
        getContentPane().add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCREEN");
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 270, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("B");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 20, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("C");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 20, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("D");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 20, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 20, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("F");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 20, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("G");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 20, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("H");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 20, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("I");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 20, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("2");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 20, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("A");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 20, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("3");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 20, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("4");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 20, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("5");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 20, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("1");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 20, 30));

        background.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\detailedMovie-bg.jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if(temp!=tiket){
            JOptionPane.showMessageDialog(null, "Jumlah bangku tidak sesuai dengan pilihan anda", "message", JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Pesanan anda telah dibuat! Silahkan ke menu Order untuk pembayaran.", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            //Orders order = new Orders(customer);
            int temp = customer.getIteration();
            for(int i = 0; i<7; i++){
                if(temp==i){
                    temp += 1;
                    break;
                }
            }
            customer.setIteration(temp);
            customer.setSeatNumber(customer.queueSeatNumbers.toString());
            String hashTime = ""+customer.getTime().hashCode();
            String hashSeat = ""+customer.getSeatNumber().hashCode();
            String hash = hashTime+hashSeat;
            //customer.orderIds.add(hash);
            System.out.println(customer.getIteration());
            //customer.setId(hash);
            customer.orderIds.add(hash);
            customer.orderId.put(customer.getIteration(), hash);
            //customer.setId(hash);
            customer.orderNames.add(customer.getName());
            customer.orderTickets.add(customer.getTickets());
            customer.orderTimes.add(customer.getTime());
            customer.orderPlaces.add(customer.getPlace());
            customer.orderSeatNumbers.add(customer.queueSeatNumbers.toString());
            customer.setSeatNumber(customer.orderSeatNumbers.toString());
            customer.queueSeatNumbers.clear();
            customer.orderMovieNames.add(customer.getMovieName());
            customer.orderPrices.add(customer.price());
            Dashboard dashboard = new Dashboard(customer);
            dashboard.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        Movies movie = new Movies(customer);
        movie.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s1.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("1A");
            //customer.setSeatNumber("1A");
            //seatNumber.add("1A");
        }
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s2.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("1B");
            //seatNumber.add("1B");
        }
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s3.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("1C");
            //seatNumber.add("1C");
        }
    }//GEN-LAST:event_s3ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s4.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("1D");
            //seatNumber.add("1D");
        }
    }//GEN-LAST:event_s4ActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s5.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("1E");
            //seatNumber.add("1E");
        }
    }//GEN-LAST:event_s5ActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s6.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("1F");
            //seatNumber.add("1F");
        }
    }//GEN-LAST:event_s6ActionPerformed

    private void s7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s7.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("1G");
            //seatNumber.add("1G");
        }
    }//GEN-LAST:event_s7ActionPerformed

    private void s8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s8ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s8.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("1H");
            //seatNumber.add("1H");
        }
    }//GEN-LAST:event_s8ActionPerformed

    private void s9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s9ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s9.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("1I");
            //seatNumber.add("1I");
        }
    }//GEN-LAST:event_s9ActionPerformed

    private void s10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s10.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("2A");
            //seatNumber.add("2A");
        }
    }//GEN-LAST:event_s10ActionPerformed

    private void s11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s11ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s11.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("2B");
            //seatNumber.add("2B");
        }
    }//GEN-LAST:event_s11ActionPerformed

    private void s12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s12ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s12.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("2C");
            //seatNumber.add("2C");
        }
    }//GEN-LAST:event_s12ActionPerformed

    private void s13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s13ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s13.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("2D");
            //seatNumber.add("2D");
        }
    }//GEN-LAST:event_s13ActionPerformed

    private void s14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s14ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s14.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("2E");
            //seatNumber.add("2E");
        }
    }//GEN-LAST:event_s14ActionPerformed

    private void s15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s15ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s15.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("2F");
            //seatNumber.add("2F");
        }
    }//GEN-LAST:event_s15ActionPerformed

    private void s16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s16ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s16.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("2G");
            //seatNumber.add("2G");
        }
    }//GEN-LAST:event_s16ActionPerformed

    private void s17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s17ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s17.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("2H");
            //seatNumber.add("2H");
        }
    }//GEN-LAST:event_s17ActionPerformed

    private void s18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s18ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s18.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("2I");
            //seatNumber.add("2I");
        }
    }//GEN-LAST:event_s18ActionPerformed

    private void s19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s19ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s19.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("3A");
            //seatNumber.add("3A");
        }
    }//GEN-LAST:event_s19ActionPerformed

    private void s20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s20ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s20.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("3B");
            //seatNumber.add("3B");
        }
    }//GEN-LAST:event_s20ActionPerformed

    private void s21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s21ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s21.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("3C");
            //seatNumber.add("3C");
        }
    }//GEN-LAST:event_s21ActionPerformed

    private void s22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s22ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s22.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("3D");
            //seatNumber.add("3D");
        }
    }//GEN-LAST:event_s22ActionPerformed

    private void s23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s23ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s23.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("3E");
            //seatNumber.add("3E");
        }
    }//GEN-LAST:event_s23ActionPerformed

    private void s24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s24ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s24.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("3F");
            //seatNumber.add("3F");
        }
    }//GEN-LAST:event_s24ActionPerformed

    private void s25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s25ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s25.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("3G");
            //seatNumber.add("3G");
        }
    }//GEN-LAST:event_s25ActionPerformed

    private void s26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s26ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s26.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("3H");
            //seatNumber.add("3H");
        }
    }//GEN-LAST:event_s26ActionPerformed

    private void s27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s27ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s27.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("3I");
            //seatNumber.add("3I");
        }
    }//GEN-LAST:event_s27ActionPerformed

    private void s28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s28ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s28.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("4A");
            //seatNumber.add("4A");
        }
    }//GEN-LAST:event_s28ActionPerformed

    private void s29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s29ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s29.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("4B");
            //seatNumber.add("4B");
        }
    }//GEN-LAST:event_s29ActionPerformed

    private void s30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s30ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s30.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("4C");
            //seatNumber.add("4C");
        }
    }//GEN-LAST:event_s30ActionPerformed

    private void s31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s31ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s31.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("4D");
            //seatNumber.add("4D");
        }
    }//GEN-LAST:event_s31ActionPerformed

    private void s32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s32ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s32.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("4E");
            //seatNumber.add("4E");
        }
    }//GEN-LAST:event_s32ActionPerformed

    private void s33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s33ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s33.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("4F");
            //seatNumber.add("4F");
        }
    }//GEN-LAST:event_s33ActionPerformed

    private void s34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s34ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s34.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("4G");
            //seatNumber.add("4G");
        }
    }//GEN-LAST:event_s34ActionPerformed

    private void s35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s35ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s35.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("4H");
            //seatNumber.add("4H");
        }
    }//GEN-LAST:event_s35ActionPerformed

    private void s36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s36ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s36.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("4I");
            //seatNumber.add("4I");
        }
    }//GEN-LAST:event_s36ActionPerformed

    private void s37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s37ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s37.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("5A");
            //seatNumber.add("5A");
        }
    }//GEN-LAST:event_s37ActionPerformed

    private void s38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s38ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s38.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("5B");
            //seatNumber.add("5B");
        }
    }//GEN-LAST:event_s38ActionPerformed

    private void s39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s39ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s39.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("5C");
            //seatNumber.add("5C");
        }
    }//GEN-LAST:event_s39ActionPerformed

    private void s40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s40ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s40.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("5D");
            //seatNumber.add("5D");
        }
    }//GEN-LAST:event_s40ActionPerformed

    private void s41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s41ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s41.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("5E");
            //seatNumber.add("5E");
        }
    }//GEN-LAST:event_s41ActionPerformed

    private void s42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s42ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s42.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("5F");
            //seatNumber.add("5F");
        }
    }//GEN-LAST:event_s42ActionPerformed

    private void s43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s43ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s43.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("5G");
            //seatNumber.add("5G");
        }
    }//GEN-LAST:event_s43ActionPerformed

    private void s44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s44ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
            
        }else{
            s44.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("5H");
            //seatNumber.add("5H");
        }
    }//GEN-LAST:event_s44ActionPerformed

    private void s45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s45ActionPerformed
        // TODO add your handling code here:
        if(temp==tiket){
        }else{
            s45.setBackground(Color.green);
            temp += 1;
            customer.queueSeatNumbers.add("5I");
            //seatNumber.add("5I");
        }
    }//GEN-LAST:event_s45ActionPerformed

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
        jLabel2.setOpaque(true);
    }//GEN-LAST:event_jLabel2AncestorAdded

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
    private javax.swing.JLabel background;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton s1;
    private javax.swing.JButton s10;
    private javax.swing.JButton s11;
    private javax.swing.JButton s12;
    private javax.swing.JButton s13;
    private javax.swing.JButton s14;
    private javax.swing.JButton s15;
    private javax.swing.JButton s16;
    private javax.swing.JButton s17;
    private javax.swing.JButton s18;
    private javax.swing.JButton s19;
    private javax.swing.JButton s2;
    private javax.swing.JButton s20;
    private javax.swing.JButton s21;
    private javax.swing.JButton s22;
    private javax.swing.JButton s23;
    private javax.swing.JButton s24;
    private javax.swing.JButton s25;
    private javax.swing.JButton s26;
    private javax.swing.JButton s27;
    private javax.swing.JButton s28;
    private javax.swing.JButton s29;
    private javax.swing.JButton s3;
    private javax.swing.JButton s30;
    private javax.swing.JButton s31;
    private javax.swing.JButton s32;
    private javax.swing.JButton s33;
    private javax.swing.JButton s34;
    private javax.swing.JButton s35;
    private javax.swing.JButton s36;
    private javax.swing.JButton s37;
    private javax.swing.JButton s38;
    private javax.swing.JButton s39;
    private javax.swing.JButton s4;
    private javax.swing.JButton s40;
    private javax.swing.JButton s41;
    private javax.swing.JButton s42;
    private javax.swing.JButton s43;
    private javax.swing.JButton s44;
    private javax.swing.JButton s45;
    private javax.swing.JButton s5;
    private javax.swing.JButton s6;
    private javax.swing.JButton s7;
    private javax.swing.JButton s8;
    private javax.swing.JButton s9;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
