import JavaClasses.Customer;
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class Movies extends javax.swing.JFrame {

    Customer customer;
    
    public Movies() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    public Movies(Customer customer) {
        this.customer = customer;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pageTitle = new javax.swing.JLabel();
        movie2 = new javax.swing.JButton();
        movie3 = new javax.swing.JButton();
        movie4 = new javax.swing.JButton();
        movie5 = new javax.swing.JButton();
        movie6 = new javax.swing.JButton();
        movie1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        movie1Desc = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        movie3Desc = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        movie4Desc = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        movie5Desc = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        movie6Desc = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        movie2Desc = new javax.swing.JTextArea();
        backBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pageTitle.setFont(new java.awt.Font("Stencil", 1, 50)); // NOI18N
        pageTitle.setForeground(new java.awt.Color(255, 255, 255));
        pageTitle.setText("Movies");
        getContentPane().add(pageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 200, 60));

        movie2.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\mv-moon.jpg")); // NOI18N
        movie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie2ActionPerformed(evt);
            }
        });
        getContentPane().add(movie2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 160, 240));

        movie3.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\mv-bee.jpg")); // NOI18N
        movie3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie3ActionPerformed(evt);
            }
        });
        getContentPane().add(movie3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 160, 240));

        movie4.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\mv-jaws.jpg")); // NOI18N
        movie4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie4ActionPerformed(evt);
            }
        });
        getContentPane().add(movie4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 160, 240));

        movie5.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\mv-parasite.jpg")); // NOI18N
        movie5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie5ActionPerformed(evt);
            }
        });
        getContentPane().add(movie5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 160, 240));

        movie6.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\mv-lucy.jpg")); // NOI18N
        movie6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie6ActionPerformed(evt);
            }
        });
        getContentPane().add(movie6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 160, 240));

        movie1.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\mv-reacher.jpg")); // NOI18N
        movie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie1ActionPerformed(evt);
            }
        });
        getContentPane().add(movie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 240));

        jScrollPane2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        movie1Desc.setBackground(new java.awt.Color(0, 0, 0));
        movie1Desc.setColumns(20);
        movie1Desc.setFont(new java.awt.Font("Segoe UI Emoji", 1, 10)); // NOI18N
        movie1Desc.setForeground(new java.awt.Color(255, 255, 255));
        movie1Desc.setRows(5);
        movie1Desc.setText("One morning in an ordinary town, \nfive people are shot dead in a \nseemingly random attack. All \nevidence points to a single suspect: \nan ex-military sniper who is quickly \nbrought into custody. The man's \ninterrogation yields one statement: \nGet Jack Reacher (Tom Cruise). \nReacher, an enigmatic ex-Army \ninvestigator, believes the authorities \nhave the right man but agrees to help \nthe sniper's defense attorney \n(Rosamund Pike). However, the more \nReacher delves into the case, the less \nclear-cut it appears.");
        movie1Desc.setBorder(null);
        movie1Desc.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                movie1DescAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(movie1Desc);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 180, 250));

        jScrollPane3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        movie3Desc.setBackground(new java.awt.Color(0, 0, 0));
        movie3Desc.setColumns(20);
        movie3Desc.setFont(new java.awt.Font("Segoe UI Emoji", 1, 10)); // NOI18N
        movie3Desc.setForeground(new java.awt.Color(255, 255, 255));
        movie3Desc.setRows(5);
        movie3Desc.setText("One man's brutal campaign for \nvengeance takes on national stakes \nafter it's revealed he's a former \noperative of a powerful and \nclandestine organization known as \nBeekeepers.");
        movie3Desc.setBorder(null);
        movie3Desc.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                movie3DescAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(movie3Desc);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 180, 250));

        jScrollPane4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        movie4Desc.setBackground(new java.awt.Color(0, 0, 0));
        movie4Desc.setColumns(20);
        movie4Desc.setFont(new java.awt.Font("Segoe UI Emoji", 1, 10)); // NOI18N
        movie4Desc.setForeground(new java.awt.Color(255, 255, 255));
        movie4Desc.setRows(5);
        movie4Desc.setText("When a young woman is killed by a \nshark while skinny-dipping near the \nNew England tourist town of Amity \nIsland, police chief Martin Brody \n(Roy Scheider) wants to close the \nbeaches, but mayor Larry Vaughn \n(Murray Hamilton) overrules him, \nfearing that the loss of tourist revenue\nwill cripple the town. Ichthyologist \nMatt Hooper (Richard Dreyfuss) and \ngrizzled ship captain Quint (Robert \nShaw) offer to help Brody capture the \nkiller beast, and the trio engage in an \nepic battle of man vs. nature.");
        movie4Desc.setBorder(null);
        movie4Desc.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                movie4DescAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(movie4Desc);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 180, 250));

        jScrollPane5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        movie5Desc.setBackground(new java.awt.Color(0, 0, 0));
        movie5Desc.setColumns(20);
        movie5Desc.setFont(new java.awt.Font("Segoe UI Emoji", 1, 10)); // NOI18N
        movie5Desc.setForeground(new java.awt.Color(255, 255, 255));
        movie5Desc.setRows(5);
        movie5Desc.setText("Greed and class discrimination \nthreaten the newly formed symbiotic \nrelationship between the wealthy \nPark family and the destitute Kim \nclan.");
        movie5Desc.setBorder(null);
        movie5Desc.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                movie5DescAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(movie5Desc);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 180, 250));

        jScrollPane6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane6AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        movie6Desc.setBackground(new java.awt.Color(0, 0, 0));
        movie6Desc.setColumns(20);
        movie6Desc.setFont(new java.awt.Font("Segoe UI Emoji", 1, 10)); // NOI18N
        movie6Desc.setForeground(new java.awt.Color(255, 255, 255));
        movie6Desc.setRows(5);
        movie6Desc.setText("When a boyfriend tricks Lucy (Scarlett \nJohansson) into delivering a briefcase \nto a supposed business contact, the \nonce-carefree student is abducted by \nthugs who intend to turn her into a \ndrug mule. She is surgically implanted \nwith a package containing a powerful \nchemical, but it leaks into her system, \ngiving her superhuman abilities, \nincluding telekinesis and telepathy. \nWith her former captors in pursuit, \nLucy seeks out a neurologist (Morgan \nFreeman), who she hopes will be able \nto help her.");
        movie6Desc.setBorder(null);
        movie6Desc.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                movie6DescAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(movie6Desc);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 180, 250));

        jScrollPane7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane7AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        movie2Desc.setBackground(new java.awt.Color(0, 0, 0));
        movie2Desc.setColumns(20);
        movie2Desc.setFont(new java.awt.Font("Segoe UI Emoji", 1, 10)); // NOI18N
        movie2Desc.setForeground(new java.awt.Color(255, 255, 255));
        movie2Desc.setRows(5);
        movie2Desc.setText("A look at three defining chapters in \nthe life of Chiron, a young black man \ngrowing up in Miami. His epic journey \nto manhood is guided by the kindness, \nsupport and love of the community \nthat helps raise him.");
        movie2Desc.setBorder(null);
        movie2Desc.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                movie2DescAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane7.setViewportView(movie2Desc);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 180, 250));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-btn2.png"))); // NOI18N
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/movies-bg.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1200, 750));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void movie1DescAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_movie1DescAncestorAdded
        // TODO add your handling code here:
        movie1Desc.setEditable(false);
        movie1Desc.setOpaque(false);
        movie1Desc.setBackground(new java.awt.Color(0,0,0,1));
        //jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }//GEN-LAST:event_movie1DescAncestorAdded

    private void jScrollPane2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane2AncestorAdded
        // TODO add your handling code here:
        jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setOpaque(false);
    }//GEN-LAST:event_jScrollPane2AncestorAdded

    private void movie3DescAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_movie3DescAncestorAdded
        // TODO add your handling code here:
        movie3Desc.setEditable(false);
        movie3Desc.setOpaque(false);
        movie3Desc.setBackground(new java.awt.Color(0,0,0,1));
    }//GEN-LAST:event_movie3DescAncestorAdded

    private void jScrollPane3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane3AncestorAdded
        // TODO add your handling code here:
        jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.getViewport().setOpaque(false);
        jScrollPane3.setOpaque(false);
    }//GEN-LAST:event_jScrollPane3AncestorAdded

    private void movie4DescAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_movie4DescAncestorAdded
        // TODO add your handling code here:
        movie4Desc.setEditable(false);
        movie4Desc.setOpaque(false);
        movie4Desc.setBackground(new java.awt.Color(0,0,0,1));
    }//GEN-LAST:event_movie4DescAncestorAdded

    private void jScrollPane4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane4AncestorAdded
        // TODO add your handling code here:
        jScrollPane4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.getViewport().setOpaque(false);
        jScrollPane4.setOpaque(false);
    }//GEN-LAST:event_jScrollPane4AncestorAdded

    private void movie5DescAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_movie5DescAncestorAdded
        // TODO add your handling code here:
        movie5Desc.setEditable(false);
        movie5Desc.setOpaque(false);
        movie5Desc.setBackground(new java.awt.Color(0,0,0,1));
    }//GEN-LAST:event_movie5DescAncestorAdded

    private void jScrollPane5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane5AncestorAdded
        // TODO add your handling code here:
        jScrollPane5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.getViewport().setOpaque(false);
        jScrollPane5.setOpaque(false);
    }//GEN-LAST:event_jScrollPane5AncestorAdded

    private void movie6DescAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_movie6DescAncestorAdded
        // TODO add your handling code here:
        movie6Desc.setEditable(false);
        movie6Desc.setOpaque(false);
        movie6Desc.setBackground(new java.awt.Color(0,0,0,1));
    }//GEN-LAST:event_movie6DescAncestorAdded

    private void jScrollPane6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane6AncestorAdded
        // TODO add your handling code here:
        jScrollPane6.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane6.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.getViewport().setOpaque(false);
        jScrollPane6.setOpaque(false);
    }//GEN-LAST:event_jScrollPane6AncestorAdded

    private void movie2DescAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_movie2DescAncestorAdded
        // TODO add your handling code here:
        movie2Desc.setEditable(false);
        movie2Desc.setOpaque(false);
        movie2Desc.setBackground(new java.awt.Color(0,0,0,1));
    }//GEN-LAST:event_movie2DescAncestorAdded

    private void jScrollPane7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane7AncestorAdded
        // TODO add your handling code here:
        jScrollPane7.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane7.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.getViewport().setOpaque(false);
        jScrollPane7.setOpaque(false);
    }//GEN-LAST:event_jScrollPane7AncestorAdded

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // TODO add your handling code here:
        Dashboard dashboard = new Dashboard(customer);
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void movie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie1ActionPerformed
        // TODO add your handling code here:
        customer.queueMovieNames.add("Reacher");
        Icon id = movie1.getIcon();
        DetailedMovie detailed = new DetailedMovie(id.toString(), customer);
        detailed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_movie1ActionPerformed

    private void movie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie2ActionPerformed
        // TODO add your handling code here:
        customer.queueMovieNames.add("Moonlight");
        Icon id = movie2.getIcon();
        DetailedMovie detailed = new DetailedMovie(id.toString(), customer);
        detailed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_movie2ActionPerformed

    private void movie3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie3ActionPerformed
        // TODO add your handling code here:
        customer.queueMovieNames.add("The BeeKeeper");
        Icon id = movie3.getIcon();
        DetailedMovie detailed = new DetailedMovie(id.toString(), customer);
        detailed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_movie3ActionPerformed

    private void movie4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie4ActionPerformed
        // TODO add your handling code here:
        customer.queueMovieNames.add("Jaws");
        Icon id = movie4.getIcon();
        DetailedMovie detailed = new DetailedMovie(id.toString(), customer);
        detailed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_movie4ActionPerformed

    private void movie5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie5ActionPerformed
        // TODO add your handling code here:
        customer.queueMovieNames.add("Parasite");
        Icon id = movie5.getIcon();
        DetailedMovie detailed = new DetailedMovie(id.toString(), customer);
        detailed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_movie5ActionPerformed

    private void movie6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie6ActionPerformed
        // TODO add your handling code here:
        customer.queueMovieNames.add("Lucy");
        Icon id = movie6.getIcon();
        DetailedMovie detailed = new DetailedMovie(id.toString(), customer);
        detailed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_movie6ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton movie1;
    private javax.swing.JTextArea movie1Desc;
    private javax.swing.JButton movie2;
    private javax.swing.JTextArea movie2Desc;
    private javax.swing.JButton movie3;
    private javax.swing.JTextArea movie3Desc;
    private javax.swing.JButton movie4;
    private javax.swing.JTextArea movie4Desc;
    private javax.swing.JButton movie5;
    private javax.swing.JTextArea movie5Desc;
    private javax.swing.JButton movie6;
    private javax.swing.JTextArea movie6Desc;
    private javax.swing.JLabel pageTitle;
    // End of variables declaration//GEN-END:variables
}
