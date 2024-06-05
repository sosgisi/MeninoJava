
import JavaClasses.*;
import javax.swing.JOptionPane;

public class Payments extends javax.swing.JFrame {
    
    Customer customer;
    int currentOrder;
    
    public Payments() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public Payments(Customer customer, int currentOrder){
        this.customer = customer;
        this.currentOrder = currentOrder;
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        name.setText(customer.getName());
        movie.setText(customer.getMovieName());
        ticket.setText(""+customer.getTickets());
        time.setText(customer.getTime());
        place.setText(customer.getPlace());
        seatNumber.setText(customer.getSeatNumber());
        totalPrice.setText(""+customer.getPrice());
        jPanelBank.setVisible(false);
        jPanelDana.setVisible(false);
        jPanelGopay.setVisible(false);
        jPanelShopee.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBank = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cardNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cardholderName = new javax.swing.JTextField();
        cancelBankBtn = new javax.swing.JButton();
        payBankBtn = new javax.swing.JButton();
        background2 = new javax.swing.JLabel();
        jPanelShopee = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        phoneNumberShopee = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cancelShopeeBtn = new javax.swing.JButton();
        payShopeeBtn = new javax.swing.JButton();
        pinNumberShopee = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        background5 = new javax.swing.JLabel();
        jPanelGopay = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        phoneNumberGopay = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cancelGopayBtn = new javax.swing.JButton();
        payGopayBtn = new javax.swing.JButton();
        pinNumberGopay = new javax.swing.JPasswordField();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        background4 = new javax.swing.JLabel();
        jPanelDana = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        phoneNumberDana = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cancelDanaBtn = new javax.swing.JButton();
        payDanaBtn = new javax.swing.JButton();
        pinNumberDana = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        background3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        movie = new javax.swing.JLabel();
        ticket = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        place = new javax.swing.JLabel();
        seatNumber = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        shopee = new javax.swing.JButton();
        bank = new javax.swing.JButton();
        gopay = new javax.swing.JButton();
        dana = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBank.setPreferredSize(new java.awt.Dimension(390, 390));
        jPanelBank.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Card number");
        jPanelBank.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 30));

        cardNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelBank.add(cardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Cardholder name");
        jPanelBank.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, 30));

        cardholderName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelBank.add(cardholderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 290, 30));

        cancelBankBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelBankBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelBankBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBankBtn.setText("Cancel");
        cancelBankBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBankBtnActionPerformed(evt);
            }
        });
        jPanelBank.add(cancelBankBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 100, 30));

        payBankBtn.setBackground(new java.awt.Color(51, 102, 255));
        payBankBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        payBankBtn.setForeground(new java.awt.Color(255, 255, 255));
        payBankBtn.setText("Pay Now");
        payBankBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBankBtnActionPerformed(evt);
            }
        });
        jPanelBank.add(payBankBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, 30));

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bank-payment.png"))); // NOI18N
        jPanelBank.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 390, 390));

        jPanelShopee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Phone number");
        jPanelShopee.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 30));

        phoneNumberShopee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelShopee.add(phoneNumberShopee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("PIN number");
        jPanelShopee.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, 30));

        cancelShopeeBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelShopeeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelShopeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelShopeeBtn.setText("Cancel");
        cancelShopeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelShopeeBtnActionPerformed(evt);
            }
        });
        jPanelShopee.add(cancelShopeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 100, 30));

        payShopeeBtn.setBackground(new java.awt.Color(51, 102, 255));
        payShopeeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        payShopeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        payShopeeBtn.setText("Pay Now");
        payShopeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payShopeeBtnActionPerformed(evt);
            }
        });
        jPanelShopee.add(payShopeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, 30));

        pinNumberShopee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelShopee.add(pinNumberShopee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 290, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/10.png"))); // NOI18N
        jPanelShopee.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 80, 80));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 153, 0));
        jLabel25.setText("YOU WILL GET 10% DISCOUNT!");
        jPanelShopee.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, -1));

        background5.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\shopee-payment.png")); // NOI18N
        jPanelShopee.add(background5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelShopee, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 390, 390));

        jPanelGopay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Phone number");
        jPanelGopay.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 30));

        phoneNumberGopay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelGopay.add(phoneNumberGopay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("PIN number");
        jPanelGopay.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, 30));

        cancelGopayBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelGopayBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelGopayBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelGopayBtn.setText("Cancel");
        cancelGopayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelGopayBtnActionPerformed(evt);
            }
        });
        jPanelGopay.add(cancelGopayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 100, 30));

        payGopayBtn.setBackground(new java.awt.Color(51, 102, 255));
        payGopayBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        payGopayBtn.setForeground(new java.awt.Color(255, 255, 255));
        payGopayBtn.setText("Pay Now");
        payGopayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payGopayBtnActionPerformed(evt);
            }
        });
        jPanelGopay.add(payGopayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, 30));

        pinNumberGopay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelGopay.add(pinNumberGopay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 290, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/40.png"))); // NOI18N
        jPanelGopay.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 80, 80));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 153, 0));
        jLabel24.setText("YOU WILL GET 40% DISCOUNT!");
        jPanelGopay.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, -1));

        background4.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\gopay-payment.png")); // NOI18N
        jPanelGopay.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelGopay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 390, 390));

        jPanelDana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Phone number");
        jPanelDana.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 30));

        phoneNumberDana.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelDana.add(phoneNumberDana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("PIN number");
        jPanelDana.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, 30));

        cancelDanaBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelDanaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelDanaBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelDanaBtn.setText("Cancel");
        cancelDanaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelDanaBtnActionPerformed(evt);
            }
        });
        jPanelDana.add(cancelDanaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 100, 30));

        payDanaBtn.setBackground(new java.awt.Color(51, 102, 255));
        payDanaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        payDanaBtn.setForeground(new java.awt.Color(255, 255, 255));
        payDanaBtn.setText("Pay Now");
        payDanaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payDanaBtnActionPerformed(evt);
            }
        });
        jPanelDana.add(payDanaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, 30));

        pinNumberDana.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelDana.add(pinNumberDana, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 290, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/20.png"))); // NOI18N
        jPanelDana.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 80, 80));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 153, 0));
        jLabel23.setText("YOU WILL GET 20% DISCOUNT!");
        jPanelDana.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, -1));

        background3.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\dana-payment.png")); // NOI18N
        jPanelDana.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelDana, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 390, 390));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-btn2.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 90));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Order description:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 220, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tickets            :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Time               :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Place               :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Movie             :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seat Number  :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name             :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, -1));

        movie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movie.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(movie, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, 30));

        ticket.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ticket.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 260, 30));

        time.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 260, 30));

        place.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        place.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(place, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 280, 30));

        seatNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        seatNumber.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(seatNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 280, 30));

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 260, 30));

        name1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("Pay using:");
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 160, 30));

        shopee.setBackground(new java.awt.Color(0, 0, 0));
        shopee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        shopee.setForeground(new java.awt.Color(255, 255, 102));
        shopee.setText("ShopeePay");
        shopee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopeeActionPerformed(evt);
            }
        });
        getContentPane().add(shopee, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 150, 30));

        bank.setBackground(new java.awt.Color(0, 0, 0));
        bank.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bank.setForeground(new java.awt.Color(255, 255, 102));
        bank.setText("Bank Transfer");
        bank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankActionPerformed(evt);
            }
        });
        getContentPane().add(bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 150, 30));

        gopay.setBackground(new java.awt.Color(0, 0, 0));
        gopay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gopay.setForeground(new java.awt.Color(255, 255, 102));
        gopay.setText("GoPay");
        gopay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gopayActionPerformed(evt);
            }
        });
        getContentPane().add(gopay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 150, 30));

        dana.setBackground(new java.awt.Color(0, 0, 0));
        dana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dana.setForeground(new java.awt.Color(255, 255, 102));
        dana.setText("Dana");
        dana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danaActionPerformed(evt);
            }
        });
        getContentPane().add(dana, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 102));
        jLabel7.setText("Total Price      :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 160, -1));

        totalPrice.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalPrice.setForeground(new java.awt.Color(255, 153, 102));
        getContentPane().add(totalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 230, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\10-percent.png")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 30, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\40-percent.png")); // NOI18N
        jLabel18.setText("jLabel8");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 30, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon("D:\\Semester 5\\SDPD\\FinalProject(netbeans)\\src\\Images\\20-percent.png")); // NOI18N
        jLabel19.setText("jLabel8");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 30, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/black-background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        Orders orders = new Orders(customer);
        orders.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void danaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danaActionPerformed
        // TODO add your handling code here:
        jPanelDana.setVisible(true);
    }//GEN-LAST:event_danaActionPerformed

    private void shopeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopeeActionPerformed
        // TODO add your handling code here:
        jPanelShopee.setVisible(true);
    }//GEN-LAST:event_shopeeActionPerformed

    private void bankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankActionPerformed
        // TODO add your handling code here:
        jPanelBank.setVisible(true);
    }//GEN-LAST:event_bankActionPerformed

    private void gopayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gopayActionPerformed
        // TODO add your handling code here:
        jPanelGopay.setVisible(true);
    }//GEN-LAST:event_gopayActionPerformed

    private void cancelBankBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBankBtnActionPerformed
        // TODO add your handling code here:
        jPanelBank.setVisible(false);
    }//GEN-LAST:event_cancelBankBtnActionPerformed

    private void payBankBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBankBtnActionPerformed
        // TODO add your handling code here:
        BankPayment bankPayment = new BankPayment(customer.getPrice(), cardNumber.getText(), cardholderName.getText());
        if(bankPayment.check()){
            JOptionPane.showMessageDialog(null, "YOU'VE PAY "+bankPayment.totalPrice(), "PAYMENT SUCCESSFUL!", JOptionPane.INFORMATION_MESSAGE);
            customer.orderNames.remove(currentOrder);
            customer.orderTickets.remove(currentOrder);
            customer.orderTimes.remove(currentOrder);
            customer.orderPlaces.remove(currentOrder);
            customer.orderMovieNames.remove(currentOrder);
            customer.orderSeatNumbers.remove(currentOrder);
            customer.orderPrices.remove(currentOrder);
            customer.orderIds.remove(currentOrder);
            customer.setIteration(customer.getIteration()-1);
            Dashboard dashboard = new Dashboard(customer);
            dashboard.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Phone number or pin is not correct", "message", JOptionPane.WARNING_MESSAGE);
            cardNumber.setText("");
            cardholderName.setText("");
        }
    }//GEN-LAST:event_payBankBtnActionPerformed

    private void cancelShopeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelShopeeBtnActionPerformed
        // TODO add your handling code here:
        jPanelShopee.setVisible(false);
    }//GEN-LAST:event_cancelShopeeBtnActionPerformed

    private void payShopeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payShopeeBtnActionPerformed
        // TODO add your handling code here:
        ShopeePayment shopeePayment = new ShopeePayment(customer.getPrice(), phoneNumberShopee.getText(), pinNumberShopee.getText());
        if(shopeePayment.check()){
            JOptionPane.showMessageDialog(null, "YOU'VE PAY "+shopeePayment.totalPrice(), "PAYMENT SUCCESSFUL!", JOptionPane.INFORMATION_MESSAGE);
            customer.orderNames.remove(currentOrder);
            customer.orderTickets.remove(currentOrder);
            customer.orderTimes.remove(currentOrder);
            customer.orderPlaces.remove(currentOrder);
            customer.orderMovieNames.remove(currentOrder);
            customer.orderSeatNumbers.remove(currentOrder);
            customer.orderPrices.remove(currentOrder);
            customer.orderIds.remove(currentOrder);
            customer.setIteration(customer.getIteration()-1);
            Dashboard dashboard = new Dashboard(customer);
            dashboard.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Phone number or pin is not correct", "message", JOptionPane.WARNING_MESSAGE);
            phoneNumberShopee.setText("");
            pinNumberShopee.setText("");
        }
    }//GEN-LAST:event_payShopeeBtnActionPerformed

    private void cancelGopayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelGopayBtnActionPerformed
        // TODO add your handling code here:
        jPanelGopay.setVisible(false);
    }//GEN-LAST:event_cancelGopayBtnActionPerformed

    private void payGopayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payGopayBtnActionPerformed
        // TODO add your handling code here:
        GopayPayment gopayPayment = new GopayPayment(customer.getPrice(), phoneNumberGopay.getText(), pinNumberGopay.getText());
        if(gopayPayment.check()){
            JOptionPane.showMessageDialog(null, "YOU'VE PAY "+gopayPayment.totalPrice(), "PAYMENT SUCCESSFUL!", JOptionPane.INFORMATION_MESSAGE);
            customer.orderNames.remove(currentOrder);
            customer.orderTickets.remove(currentOrder);
            customer.orderTimes.remove(currentOrder);
            customer.orderPlaces.remove(currentOrder);
            customer.orderMovieNames.remove(currentOrder);
            customer.orderSeatNumbers.remove(currentOrder);
            customer.orderPrices.remove(currentOrder);
            customer.orderIds.remove(currentOrder);
            customer.setIteration(customer.getIteration()-1);
            Dashboard dashboard = new Dashboard(customer);
            dashboard.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Phone number or pin is not correct", "message", JOptionPane.WARNING_MESSAGE);
            phoneNumberGopay.setText("");
            pinNumberGopay.setText("");
        }
    }//GEN-LAST:event_payGopayBtnActionPerformed

    private void cancelDanaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelDanaBtnActionPerformed
        // TODO add your handling code here:
        jPanelDana.setVisible(false);
    }//GEN-LAST:event_cancelDanaBtnActionPerformed

    private void payDanaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payDanaBtnActionPerformed
        // TODO add your handling code here:
        DanaPayment danaPayment = new DanaPayment(customer.getPrice(), phoneNumberDana.getText(), pinNumberDana.getText());
        if(danaPayment.check()){
            JOptionPane.showMessageDialog(null, "YOU'VE PAY "+danaPayment.totalPrice(), "PAYMENT SUCCESSFUL!", JOptionPane.INFORMATION_MESSAGE);
            customer.orderNames.remove(currentOrder);
            customer.orderTickets.remove(currentOrder);
            customer.orderTimes.remove(currentOrder);
            customer.orderPlaces.remove(currentOrder);
            customer.orderMovieNames.remove(currentOrder);
            customer.orderSeatNumbers.remove(currentOrder);
            customer.orderPrices.remove(currentOrder);
            customer.orderIds.remove(currentOrder);
            customer.setIteration(customer.getIteration()-1);
            Dashboard dashboard = new Dashboard(customer);
            dashboard.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Phone number or pin is not correct", "message", JOptionPane.WARNING_MESSAGE);
            phoneNumberDana.setText("");
            pinNumberDana.setText("");
        }
    }//GEN-LAST:event_payDanaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel background3;
    private javax.swing.JLabel background4;
    private javax.swing.JLabel background5;
    private javax.swing.JButton bank;
    private javax.swing.JButton cancelBankBtn;
    private javax.swing.JButton cancelDanaBtn;
    private javax.swing.JButton cancelGopayBtn;
    private javax.swing.JButton cancelShopeeBtn;
    private javax.swing.JTextField cardNumber;
    private javax.swing.JTextField cardholderName;
    private javax.swing.JButton dana;
    private javax.swing.JButton gopay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelBank;
    private javax.swing.JPanel jPanelDana;
    private javax.swing.JPanel jPanelGopay;
    private javax.swing.JPanel jPanelShopee;
    private javax.swing.JLabel movie;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JButton payBankBtn;
    private javax.swing.JButton payDanaBtn;
    private javax.swing.JButton payGopayBtn;
    private javax.swing.JButton payShopeeBtn;
    private javax.swing.JTextField phoneNumberDana;
    private javax.swing.JTextField phoneNumberGopay;
    private javax.swing.JTextField phoneNumberShopee;
    private javax.swing.JPasswordField pinNumberDana;
    private javax.swing.JPasswordField pinNumberGopay;
    private javax.swing.JPasswordField pinNumberShopee;
    private javax.swing.JLabel place;
    private javax.swing.JLabel seatNumber;
    private javax.swing.JButton shopee;
    private javax.swing.JLabel ticket;
    private javax.swing.JLabel time;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
