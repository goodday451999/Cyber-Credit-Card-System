/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyber.creditcard;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author MELLOW
 */
public class NewJFrame extends javax.swing.JFrame {
    
    class User
    {
        private String fname ;
        private String username;
        private String password;
        private Card cardlist[];
        private int noofcards;
        public void setnoofcards(int l)
        {
            this.noofcards=l;
        }
        public int getnoofcards()
        {
            return this.noofcards;
        }
        public Card[] getcardlist()
        {
            return this.cardlist;
        }
        public void setcardlist(Card c[])
        {
            this.cardlist=c;
        }
        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public User(String fname, String username, String password) {
            this.fname = fname;
            this.username = username;
            this.password = password;
            this.cardlist = new Card[100];
            for(int i = 0 ; i < 100 ; i++)
                cardlist[i] = new Card();
        }
        
        public User(String username , String password)
        {
            this.password = password;
            this.username = username;
            this.cardlist = new Card[100];
            for(int i = 0 ; i < 100 ; i++)
                cardlist[i] = new Card();
        }
        
    }
    
class Card
    {
        String Number;
        String e1 , e2;
        String pin , cvv;
        float balance;

        public String getNumber() {
            return Number;
        }

        public void setNumber(String Number) {
            this.Number = Number;
        }

        public String getE1() {
            return e1;
        }

        public void setE1(String e1) {
            this.e1 = e1;
        }

        public String getE2() {
            return e2;
        }

        public void setE2(String e2) {
            this.e2 = e2;
        }

        public String getPin() {
            return pin;
        }

        public void setPin(String pin) {
            this.pin = pin;
        }

        public String getCvv() {
            return cvv;
        }

        public void setCvv(String cvv) {
            this.cvv = cvv;
        }

        public float getBalance() {
            return balance;
        }

        public void setBalance(float balance) {
            this.balance = balance;
        }

        public Card(String Number, String e1, String e2, String pin, String cvv, int balance) {
            this.Number = Number;
            this.e1 = e1;
            this.e2 = e2;
            this.pin = pin;
            this.cvv = cvv;
            this.balance = balance;
        }
        
        public Card(){
            
        }
        
        
    }

    Card[] lis = new Card[100];
    User arra[] = new User[100];
    int ctr = 0;
    float total=0;
    String current;
    int cr=0;
    class items
    {
    String name;
    int price;
    public String getname()
    {
        return this.name;
    }
    public int getprice()
    {
        if(fnameinput6.getText().compareTo("Mango")==0)
        {
            this.price=60;
        }
        else if(fnameinput6.getText().compareTo("Colgate")==0)
        {
            this.price=95;
        }
        else if(fnameinput6.getText().compareTo("Soap")==0)
        {
            this.price=35;
        }
        else if(fnameinput6.getText().compareTo("Handwash")==0)
        {
            this.price=50;
        }
        else if(fnameinput6.getText().compareTo("Soft Drink")==0)
        {
            this.price=40;
        }
        else if(fnameinput6.getText().compareTo("Chips")==0)
        {
            this.price=20;
        }
        else if(fnameinput6.getText().compareTo("Shampoo")==0)
        {
            this.price=150;
        }
        else if(fnameinput6.getText().compareTo("Chocolate")==0)
        {
            this.price=75;
        }
        else if(fnameinput6.getText().compareTo("Cookies")==0)
        {
            this.price=40;
        }
        else if(fnameinput6.getText().compareTo("Deodorant")==0)
        {
            this.price=350;
        }
        else if(fnameinput6.getText().compareTo("Hair Oil")==0)
        {
            this.price=80;
        }
        else if(fnameinput6.getText().compareTo("Shower Gel")==0)
        {
            this.price=160;
        }
        return this.price;
        }
}
class coupon
{
    public int getdiscount(String s)
    {
        if(s.compareTo("20KADHAMMAL")==0)
        {
            return 20;
        }
        else if(s.compareTo("10KADHAMMAL")==0)
        {
            return 10;
        }
        else if(s.compareTo("30KADHAMMAL")==0)
        {
            return 30;
        }
        else if(s.compareTo("40KADHAMMAL")==0)
        {
            return 40;
        }
        else if(s.compareTo("50KADHAMMAL")==0)
        {
            return 50;
        }
        return 0;
    }
} 

    /**
     * Creates new form NewJFrame
     */
    
    public NewJFrame() {
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

        placeholder = new javax.swing.JPanel();
        catalog = new javax.swing.JPanel();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jSeparator38 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jSeparator39 = new javax.swing.JSeparator();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jSeparator41 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jSeparator42 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jSeparator43 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jSeparator44 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jSeparator45 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        welcomePage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        root = new javax.swing.JPanel();
        cartPage = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        fnameinput6 = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        unameinput9 = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        fnameinput5 = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        fnameinput7 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jSeparator31 = new javax.swing.JSeparator();
        addcard1 = new javax.swing.JLabel();
        addanothercard1 = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jSeparator33 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        signinPage = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        unameinput1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        pwdinput1 = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        signup1 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        signupPage = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fnameinput = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        unameinput = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        pwdinput = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        signup = new javax.swing.JLabel();
        signin = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        addcardPage = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cardNumber = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        e1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();
        jSeparator9 = new javax.swing.JSeparator();
        unameinput3 = new javax.swing.JTextField();
        e2 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        addanothercard = new javax.swing.JLabel();
        addcard = new javax.swing.JLabel();
        jSeparator46 = new javax.swing.JSeparator();
        balance = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jSeparator47 = new javax.swing.JSeparator();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        paymentPage1 = new javax.swing.JPanel();
        cno = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        e11 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        unameinput6 = new javax.swing.JTextField();
        e22 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        cvv2 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        proceed2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        paymentPage2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pwdinput4 = new javax.swing.JPasswordField();
        jSeparator16 = new javax.swing.JSeparator();
        proceed3 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        confirmationPage = new javax.swing.JPanel();
        fnameinput4 = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        unameinput8 = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        proceed4 = new javax.swing.JLabel();
        proceed5 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 500));

        placeholder.setBackground(new java.awt.Color(0, 204, 204));
        placeholder.setLayout(new java.awt.CardLayout());

        catalog.setBackground(new java.awt.Color(255, 255, 255));
        catalog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator25.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator25.setOrientation(javax.swing.SwingConstants.VERTICAL);
        catalog.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 20, 400));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 0, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("ITEM CATALOUGE");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));
        catalog.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 39));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 0, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Cost");
        catalog.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, 20));

        jSeparator27.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator27.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 10));

        jSeparator34.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator34.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 10));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 0, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Items");
        catalog.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 20));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Mango");
        catalog.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 30));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("60");
        catalog.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 70, 30));

        jSeparator26.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator26.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, 10));

        jSeparator35.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator35.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 10));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Colgate");
        catalog.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 30));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("95");
        catalog.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 70, 30));

        jSeparator36.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator36.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 10));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Soap");
        catalog.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("35");
        catalog.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 70, 30));

        jSeparator37.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator37.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 10));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Handwash");
        catalog.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 30));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("50");
        catalog.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 70, 30));

        jSeparator38.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator38.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 10));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Soft Drink");
        catalog.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 30));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("40");
        catalog.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 70, 30));

        jSeparator39.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator39.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 200, 10));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Chips");
        catalog.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("20");
        catalog.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 70, 30));

        jSeparator40.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator40.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 200, 10));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Shampoo");
        catalog.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 30));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("150");
        catalog.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 70, 30));

        jSeparator41.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator41.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, 10));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Chocolate");
        catalog.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 30));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("75");
        catalog.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 70, 30));

        jSeparator42.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator42.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, 10));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Cookies");
        catalog.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 110, 30));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("40");
        catalog.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 70, 30));

        jSeparator43.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator43.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 200, 10));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Deodorant");
        catalog.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, 30));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("350");
        catalog.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 70, 30));

        jSeparator44.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator44.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 200, 10));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Hair Oil");
        catalog.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 30));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("80");
        catalog.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 70, 30));

        jSeparator45.setForeground(new java.awt.Color(102, 0, 255));
        jSeparator45.setPreferredSize(new java.awt.Dimension(50, 25));
        catalog.add(jSeparator45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 200, 10));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Shower Gel");
        catalog.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 110, 30));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("160");
        catalog.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 70, 30));

        placeholder.add(catalog, "card3");

        welcomePage.setBackground(new java.awt.Color(0, 204, 204));
        welcomePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyber/creditcard/user icon3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        welcomePage.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 183, 160));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Card System");
        welcomePage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        help.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        help.setForeground(new java.awt.Color(255, 255, 255));
        help.setText("?");
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        welcomePage.add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 431, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("to");
        welcomePage.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 270, 30, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Welcome");
        welcomePage.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Cyber Credit");
        welcomePage.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        placeholder.add(welcomePage, "card2");

        root.setBackground(new java.awt.Color(0, 0, 0));
        root.setLayout(new java.awt.CardLayout());

        cartPage.setBackground(new java.awt.Color(102, 0, 255));
        cartPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Jhalwa Shopping Cart");
        cartPage.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 250, 39));

        fnameinput6.setBackground(new java.awt.Color(102, 0, 255));
        fnameinput6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fnameinput6.setForeground(new java.awt.Color(255, 255, 255));
        fnameinput6.setBorder(null);
        fnameinput6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameinput6ActionPerformed(evt);
            }
        });
        cartPage.add(fnameinput6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 390, 28));
        cartPage.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 390, 10));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Item Quantity");
        cartPage.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 39));

        unameinput9.setBackground(new java.awt.Color(102, 0, 255));
        unameinput9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unameinput9.setForeground(new java.awt.Color(255, 255, 255));
        unameinput9.setBorder(null);
        unameinput9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameinput9ActionPerformed(evt);
            }
        });
        cartPage.add(unameinput9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 28));
        cartPage.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, 10));

        fnameinput5.setBackground(new java.awt.Color(102, 0, 255));
        fnameinput5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fnameinput5.setForeground(new java.awt.Color(255, 255, 255));
        fnameinput5.setBorder(null);
        fnameinput5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameinput5ActionPerformed(evt);
            }
        });
        cartPage.add(fnameinput5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 230, 28));
        cartPage.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 230, 10));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("PROMO Code");
        cartPage.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 39));

        fnameinput7.setEditable(false);
        fnameinput7.setBackground(new java.awt.Color(102, 0, 255));
        fnameinput7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fnameinput7.setForeground(new java.awt.Color(255, 255, 255));
        fnameinput7.setBorder(null);
        fnameinput7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameinput7ActionPerformed(evt);
            }
        });
        cartPage.add(fnameinput7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 110, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("TOTAL PRICE : ");
        cartPage.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 140, 39));
        cartPage.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 110, 10));

        addcard1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addcard1.setForeground(new java.awt.Color(255, 255, 255));
        addcard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addcard1.setText("Add Item");
        addcard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        addcard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addcard1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addcard1MouseEntered(evt);
            }
        });
        cartPage.add(addcard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 100, 40));

        addanothercard1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addanothercard1.setForeground(new java.awt.Color(255, 255, 255));
        addanothercard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addanothercard1.setText("Make Payment");
        addanothercard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        addanothercard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addanothercard1MouseClicked(evt);
            }
        });
        cartPage.add(addanothercard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 150, 40));

        jSeparator32.setOrientation(javax.swing.SwingConstants.VERTICAL);
        cartPage.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 10, 60));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyber/creditcard/rupee.png"))); // NOI18N
        cartPage.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, 40));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText(" (Select from the provided catalouge)");
        cartPage.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 50));
        cartPage.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Item Name");
        cartPage.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 59, 100, 50));

        root.add(cartPage, "card8");

        signinPage.setBackground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Name");

        unameinput1.setBackground(new java.awt.Color(0, 102, 102));
        unameinput1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unameinput1.setForeground(new java.awt.Color(255, 255, 255));
        unameinput1.setBorder(null);
        unameinput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameinput1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");

        pwdinput1.setBackground(new java.awt.Color(0, 102, 102));
        pwdinput1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwdinput1.setBorder(null);
        pwdinput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdinput1ActionPerformed(evt);
            }
        });

        signup1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signup1.setForeground(new java.awt.Color(255, 255, 255));
        signup1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup1.setText("Log In");
        signup1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup1MouseClicked(evt);
            }
        });

        jSeparator23.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Sign In page");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Payment Gateway");

        javax.swing.GroupLayout signinPageLayout = new javax.swing.GroupLayout(signinPage);
        signinPage.setLayout(signinPageLayout);
        signinPageLayout.setHorizontalGroup(
            signinPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signinPageLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(signinPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(signinPageLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(signinPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unameinput1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdinput1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(signinPageLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45))
            .addGroup(signinPageLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(signup1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        signinPageLayout.setVerticalGroup(
            signinPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signinPageLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(signinPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(signinPageLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(signinPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signinPageLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(unameinput1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pwdinput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(signup1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        root.add(signinPage, "card2");

        signupPage.setBackground(new java.awt.Color(0, 102, 102));
        signupPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Full Name");
        signupPage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 106, 39));

        fnameinput.setBackground(new java.awt.Color(0, 102, 102));
        fnameinput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fnameinput.setForeground(new java.awt.Color(255, 255, 255));
        fnameinput.setBorder(null);
        fnameinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameinputActionPerformed(evt);
            }
        });
        signupPage.add(fnameinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 358, 28));
        signupPage.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 358, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name");
        signupPage.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 106, 39));

        unameinput.setBackground(new java.awt.Color(0, 102, 102));
        unameinput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unameinput.setForeground(new java.awt.Color(255, 255, 255));
        unameinput.setBorder(null);
        unameinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameinputActionPerformed(evt);
            }
        });
        signupPage.add(unameinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 358, 28));
        signupPage.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 358, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        signupPage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 106, 39));

        pwdinput.setBackground(new java.awt.Color(0, 102, 102));
        pwdinput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pwdinput.setBorder(null);
        pwdinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdinputActionPerformed(evt);
            }
        });
        signupPage.add(pwdinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 360, -1));
        signupPage.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 358, 10));

        signup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup.setText("SignUp");
        signup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        signupPage.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 90, 40));

        signin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText("Already a member? SignIn here");
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
        });
        signupPage.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, 30));
        signupPage.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 250, 10));

        jSeparator24.setOrientation(javax.swing.SwingConstants.VERTICAL);
        signupPage.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 10, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Sign Up page");
        signupPage.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 160, 40));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Payment Gateway");
        signupPage.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 40));

        root.add(signupPage, "card3");

        addcardPage.setBackground(new java.awt.Color(0, 102, 102));
        addcardPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Credit Card Number");
        addcardPage.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 190, 39));

        cardNumber.setBackground(new java.awt.Color(0, 102, 102));
        cardNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardNumber.setForeground(new java.awt.Color(255, 255, 255));
        cardNumber.setBorder(null);
        cardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberActionPerformed(evt);
            }
        });
        addcardPage.add(cardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 290, 28));
        addcardPage.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 290, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Expiry Date (MM/YYYY)");
        addcardPage.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 210, 39));

        e1.setBackground(new java.awt.Color(0, 102, 102));
        e1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        e1.setForeground(new java.awt.Color(255, 255, 255));
        e1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        e1.setBorder(null);
        e1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e1MouseClicked(evt);
            }
        });
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        addcardPage.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 30, 28));
        addcardPage.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 20, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Card Pin");
        addcardPage.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 106, 39));

        pin.setBackground(new java.awt.Color(0, 102, 102));
        pin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pin.setBorder(null);
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        addcardPage.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 50, 30));
        addcardPage.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 50, 10));

        unameinput3.setEditable(false);
        unameinput3.setBackground(new java.awt.Color(0, 102, 102));
        unameinput3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unameinput3.setForeground(new java.awt.Color(255, 255, 255));
        unameinput3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        unameinput3.setText("/");
        unameinput3.setBorder(null);
        unameinput3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameinput3ActionPerformed(evt);
            }
        });
        addcardPage.add(unameinput3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 10, 28));

        e2.setBackground(new java.awt.Color(0, 102, 102));
        e2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        e2.setForeground(new java.awt.Color(255, 255, 255));
        e2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        e2.setBorder(null);
        e2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e2MouseClicked(evt);
            }
        });
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });
        addcardPage.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 40, 28));
        addcardPage.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 40, 10));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CVV");
        addcardPage.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 40, 39));

        cvv.setBackground(new java.awt.Color(0, 102, 102));
        cvv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cvv.setForeground(new java.awt.Color(255, 255, 255));
        cvv.setBorder(null);
        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });
        addcardPage.add(cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 40, 28));
        addcardPage.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 30, 10));

        addanothercard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addanothercard.setForeground(new java.awt.Color(255, 255, 255));
        addanothercard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addanothercard.setText("Add Another Card");
        addanothercard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        addanothercard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addanothercardMouseClicked(evt);
            }
        });
        addcardPage.add(addanothercard, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 300, 40));

        addcard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addcard.setForeground(new java.awt.Color(255, 255, 255));
        addcard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addcard.setText("Add Card and Proceed to Payment");
        addcard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        addcard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addcardMouseClicked(evt);
            }
        });
        addcardPage.add(addcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 300, 40));
        addcardPage.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 140, 10));

        balance.setBackground(new java.awt.Color(0, 102, 102));
        balance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        balance.setForeground(new java.awt.Color(255, 255, 255));
        balance.setBorder(null);
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        addcardPage.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 140, 28));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Account Balance");
        addcardPage.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 289, 160, 50));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyber/creditcard/rupee.png"))); // NOI18N
        addcardPage.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 40));

        jSeparator47.setOrientation(javax.swing.SwingConstants.VERTICAL);
        addcardPage.add(jSeparator47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 10, 30));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Add Card Details");
        addcardPage.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 160, 40));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Payment Gateway");
        addcardPage.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 160, 40));

        root.add(addcardPage, "card4");

        paymentPage1.setBackground(new java.awt.Color(0, 102, 102));
        paymentPage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cno.setBackground(new java.awt.Color(0, 102, 102));
        cno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cno.setForeground(new java.awt.Color(255, 255, 255));
        cno.setBorder(null);
        cno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnoActionPerformed(evt);
            }
        });
        paymentPage1.add(cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 290, 30));
        paymentPage1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 290, 10));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Expiry Date (MM/YYYY)");
        paymentPage1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 210, 50));

        e11.setBackground(new java.awt.Color(0, 102, 102));
        e11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        e11.setForeground(new java.awt.Color(255, 255, 255));
        e11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        e11.setBorder(null);
        e11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e11MouseClicked(evt);
            }
        });
        e11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e11ActionPerformed(evt);
            }
        });
        paymentPage1.add(e11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 30, 30));
        paymentPage1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 20, 10));

        unameinput6.setEditable(false);
        unameinput6.setBackground(new java.awt.Color(0, 102, 102));
        unameinput6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unameinput6.setForeground(new java.awt.Color(255, 255, 255));
        unameinput6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        unameinput6.setText("/");
        unameinput6.setBorder(null);
        unameinput6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameinput6ActionPerformed(evt);
            }
        });
        paymentPage1.add(unameinput6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 10, 30));

        e22.setBackground(new java.awt.Color(0, 102, 102));
        e22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        e22.setForeground(new java.awt.Color(255, 255, 255));
        e22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        e22.setBorder(null);
        e22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e22MouseClicked(evt);
            }
        });
        e22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e22ActionPerformed(evt);
            }
        });
        paymentPage1.add(e22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 40, 30));
        paymentPage1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 40, 10));
        paymentPage1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 40, 10));

        cvv2.setBackground(new java.awt.Color(0, 102, 102));
        cvv2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cvv2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cvv2.setBorder(null);
        cvv2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cvv2MouseClicked(evt);
            }
        });
        cvv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvv2ActionPerformed(evt);
            }
        });
        paymentPage1.add(cvv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 40, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CVV");
        paymentPage1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 106, 40));

        proceed2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proceed2.setForeground(new java.awt.Color(255, 255, 255));
        proceed2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceed2.setText("Proceed");
        proceed2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        proceed2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceed2MouseClicked(evt);
            }
        });
        paymentPage1.add(proceed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 160, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Credit Card Number");
        paymentPage1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 190, 40));

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        paymentPage1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 10, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Page 1 of 3");
        paymentPage1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 160, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Payment Gateway");
        paymentPage1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 160, 40));

        root.add(paymentPage1, "card5");

        paymentPage2.setBackground(new java.awt.Color(0, 102, 102));
        paymentPage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Card Pin");
        paymentPage2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 90, 39));

        pwdinput4.setBackground(new java.awt.Color(0, 102, 102));
        pwdinput4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pwdinput4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdinput4.setBorder(null);
        pwdinput4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwdinput4MouseClicked(evt);
            }
        });
        pwdinput4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdinput4ActionPerformed(evt);
            }
        });
        paymentPage2.add(pwdinput4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 50, 30));
        paymentPage2.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 50, 10));

        proceed3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proceed3.setForeground(new java.awt.Color(255, 255, 255));
        proceed3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceed3.setText("Make Transaction");
        proceed3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        proceed3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceed3MouseClicked(evt);
            }
        });
        paymentPage2.add(proceed3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 180, 40));

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);
        paymentPage2.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 10, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Page 2 of 3");
        paymentPage2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 100, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Payment Gateway");
        paymentPage2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 160, 40));

        root.add(paymentPage2, "card6");

        confirmationPage.setBackground(new java.awt.Color(0, 102, 102));
        confirmationPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fnameinput4.setBackground(new java.awt.Color(0, 102, 102));
        fnameinput4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fnameinput4.setForeground(new java.awt.Color(255, 255, 255));
        fnameinput4.setBorder(null);
        fnameinput4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameinput4ActionPerformed(evt);
            }
        });
        confirmationPage.add(fnameinput4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 240, 28));
        confirmationPage.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 240, 10));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Balance Deducted");
        confirmationPage.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 39));

        unameinput8.setBackground(new java.awt.Color(0, 102, 102));
        unameinput8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unameinput8.setForeground(new java.awt.Color(255, 255, 255));
        unameinput8.setBorder(null);
        unameinput8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameinput8ActionPerformed(evt);
            }
        });
        confirmationPage.add(unameinput8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, 28));
        confirmationPage.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 240, 10));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Remaining Balance");
        confirmationPage.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, 39));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Thank You !");
        confirmationPage.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 390, 39));

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        confirmationPage.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 10, 60));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Page 3 of 3");
        confirmationPage.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 100, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Payment Gateway");
        confirmationPage.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 160, 40));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyber/creditcard/tick.png"))); // NOI18N
        confirmationPage.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Transaction Status : SUCCESS");
        confirmationPage.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 390, 39));

        proceed4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proceed4.setForeground(new java.awt.Color(255, 255, 255));
        proceed4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceed4.setText("Go To Shopping Cart");
        proceed4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        proceed4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceed4MouseClicked(evt);
            }
        });
        confirmationPage.add(proceed4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 220, 40));

        proceed5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proceed5.setForeground(new java.awt.Color(255, 255, 255));
        proceed5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceed5.setText("EXIT");
        proceed5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        proceed5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceed5MouseClicked(evt);
            }
        });
        confirmationPage.add(proceed5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 80, 40));

        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);
        confirmationPage.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 10, 30));

        root.add(confirmationPage, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(placeholder, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        System.out.println("We are pleased to inform you that we cant help you!!");
        //JOptionPane.showConfirmDialog(null,"Sorry, Help cant come to the phone right now!!");
        JOptionPane.showMessageDialog(null,"Sorry!! Our server is a bit busy right now, please try again later!");
    }//GEN-LAST:event_helpMouseClicked

    private void unameinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameinputActionPerformed

    private void pwdinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdinputActionPerformed

    private void fnameinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameinputActionPerformed

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        
        root.removeAll();
        root.add(signinPage);
        root.repaint();
        root.revalidate();
    }//GEN-LAST:event_signinMouseClicked

    private void unameinput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameinput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameinput1ActionPerformed

    private void pwdinput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdinput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdinput1ActionPerformed

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        arra[ctr] = new User(fnameinput.getText(),unameinput.getText(),pwdinput.getText());
        ctr++;
        current=fnameinput.getText();
//        JOptionPane.showMessageDialog(null,"Your Details are:");
        String msg = "<html>Full name = "+fnameinput.getText()+" <br>"
                + "Username = "+unameinput.getText()+"<br>"
                + "</html>";
        
                JOptionPane optionpane = new JOptionPane();
                optionpane.setMessage(msg);
                optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dilog = optionpane.createDialog(null,"You have entered:");
                dilog.setVisible(true);
                
        root.removeAll();
        root.add(addcardPage);
        root.repaint();
        root.revalidate();

    }//GEN-LAST:event_signupMouseClicked

    private void cardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e1ActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void unameinput3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameinput3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameinput3ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e2ActionPerformed

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvActionPerformed

    private void addanothercardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addanothercardMouseClicked
        // TODO add your handling code here:
         Card c = new Card(cardNumber.getText(),e1.getText(),e2.getText(),pin.getText(),cvv.getText(),Integer.parseInt(balance.getText()));
   
                Card[] temp = new Card[100];
                for(int j = 0 ; j < 100 ; j++)
                temp[j] = new Card();
                int index = 0;
                for(int j = 0 ; j < ctr ; j++)
                {
                    if(current.equals(arra[j].getFname()))
                        index = j;
                }
                temp = arra[index].getcardlist();
             
                    int length=0;
                    for(int k = 0 ; k < 100 ; k++)
                    {
                        if(!(temp[k].getNumber()==null))
                            length++;
                    }
                    temp[length] = new Card();
                    temp[length] = c;
                
                    arra[index].setnoofcards(length);
                
                arra[index].setcardlist(temp);
        //Code to reset fields
        
        cardNumber.setText("");
        e1.setText("");
        e2.setText("");
        pin.setText("");
        cvv.setText("");
        balance.setText("");
        
        JOptionPane.showMessageDialog(null,"Card Added Successfully!");
        
        root.removeAll();
        root.add(addcardPage);
        root.repaint();
        root.revalidate();
    }//GEN-LAST:event_addanothercardMouseClicked

    private void addcardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcardMouseClicked
        // TODO add your handling code here:
        Card c = new Card(cardNumber.getText(),e1.getText(),e2.getText(),pin.getText(),cvv.getText(),Integer.parseInt(balance.getText()));
   
                Card[] temp = new Card[100];
                for(int j = 0 ; j < 100 ; j++)
                temp[j] = new Card();
                int index = 0;
                for(int j = 0 ; j < ctr ; j++)
                {
                    if(current.equals(arra[j].getFname()))
                        index = j;
                }
                temp = arra[index].getcardlist();
             
                    int length=0;
                    for(int k = 0 ; k < 100 ; k++)
                    {
                        if(!(temp[k].getNumber()==null))
                            length++;
                    }
                    temp[length] = new Card();
                    temp[length] = c;
                
                    arra[index].setnoofcards(length);
                
                arra[index].setcardlist(temp);
    
        // code to add record
        
        JOptionPane.showMessageDialog(null,"Card Added Successfully!");
        
        root.removeAll();
        root.add(paymentPage1);
        root.repaint();
        root.revalidate();
    }//GEN-LAST:event_addcardMouseClicked

    private void cnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnoActionPerformed

    private void e11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e11ActionPerformed

    private void cvv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvv2ActionPerformed

    private void unameinput6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameinput6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameinput6ActionPerformed

    private void e22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e22ActionPerformed

    private void proceed2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceed2MouseClicked
        // TODO add your handling code here:
        String cardNum = cno.getText();
        String cvv = cvv2.getText();
        String e111 = e11.getText();
        String e222 = e22.getText();
        
        int index = 0;
        for(int j = 0 ; j < ctr ; j++)
        {
            if(current.equals(arra[j].getFname()))
                index = j;
        }

        lis = arra[index].getcardlist();
        boolean found = false;
        boolean valid = false;
        for(int i = 0 ; i <= arra[index].getnoofcards() ; i++)
        {
            
                if(lis[i].getNumber().equals(cardNum) && lis[i].getCvv().equals(cvv) && lis[i].getE1().equals(e111) && lis[i].getE2().equals(e222))
                {
                    found = true;
                    cr=i;
                }
            
        }
        if(found == true)
            valid = true;
        if(valid==true)
        {
        root.removeAll();
        root.add(paymentPage2);
        root.repaint();
        root.revalidate();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "CARD NOT FOUND");
        }
    }//GEN-LAST:event_proceed2MouseClicked

    private void pwdinput4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdinput4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdinput4ActionPerformed

    private void proceed3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceed3MouseClicked
        // TODO add your handling code here:
        if(lis[cr].getPin().equals(pwdinput4.getText()))
        {    
            if(total>lis[cr].getBalance())
            {
                JOptionPane.showMessageDialog(this, "UNSUFFICIENT BALANCE... TRANSACTION CANCELLED");
                System.exit(0);
            }
            fnameinput4.setText(Float.toString(lis[cr].getBalance()-total));
            unameinput8.setText(Float.toString(total));
            lis[cr].setBalance((lis[cr].getBalance()-(total)));
        root.removeAll();
        root.add(confirmationPage);
        root.repaint();
        root.revalidate();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "PAYMENT UNSUCCESSFUL... TRANSACTION CANCELLED");
            System.exit(0);
        }
    }//GEN-LAST:event_proceed3MouseClicked

    private void fnameinput4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameinput4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameinput4ActionPerformed

    private void unameinput8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameinput8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameinput8ActionPerformed

    private void proceed4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceed4MouseClicked
        // TODO add your handling code here:
        total=0;
        fnameinput7.setText("");
        root.removeAll();
        root.add(cartPage);
        root.repaint();
        root.revalidate();
        
        placeholder.removeAll();
        placeholder.add(catalog);
        placeholder.repaint();
        placeholder.revalidate();
    }//GEN-LAST:event_proceed4MouseClicked

    private void proceed5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceed5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_proceed5MouseClicked

    private void signup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup1MouseClicked
        // TODO add your handling code here:
        String uid = unameinput1.getText();
       String pass = pwdinput1.getText();
       boolean login_success = false;
       for(int i = 0 ; i < ctr ; i++)
       {
           if(arra[i].getUsername().equals(uid) && arra[i].getPassword().equals(pass))
               login_success = true;
       }
       if(login_success == false)
       {
           JOptionPane.showMessageDialog(this, "Incorrect Username or Password");
           unameinput1.setText("");
           pwdinput1.setText("");
       }
       if(login_success == true)
       {
           root.removeAll();
        root.add(paymentPage1);
        root.repaint();
        root.revalidate();
       }
    }//GEN-LAST:event_signup1MouseClicked

    private void fnameinput5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameinput5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameinput5ActionPerformed

    private void unameinput9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameinput9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameinput9ActionPerformed

    private void fnameinput6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameinput6ActionPerformed
    
    }//GEN-LAST:event_fnameinput6ActionPerformed

    private void fnameinput7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameinput7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameinput7ActionPerformed

    private void addcard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcard1MouseClicked
        // TODO add your handling code here:
        items it=new items();
        int i=0;
        float pri;
       // System.out.println("ENTER ITEM NAME");
        String s=fnameinput6.getText();
        pri=it.getprice();
                if(pri==0)
                {
                    JOptionPane.showMessageDialog(this, "ENTER ITEM FROM LIST ONLY");
                    fnameinput6.setText("                  ");
                    unameinput9.setText("                  ");
                    fnameinput5.setText("                  ");
                }
        int qu=Integer.parseInt(unameinput9.getText());
                pri=pri*qu;        
                
        String pro=fnameinput5.getText();
        coupon c=new coupon();
        float dis;
        dis=c.getdiscount(pro);
        dis=(dis*pri);
        dis=dis/100;
        pri=pri-dis;
        total=total+pri;
        fnameinput7.setText(Float.toString(total));
        fnameinput6.setText("");
        unameinput9.setText("");
        fnameinput5.setText("");
       // System.out.println("YOUR PRICE IS "+total);
    }//GEN-LAST:event_addcard1MouseClicked

    private void addanothercard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addanothercard1MouseClicked
        // TODO add your handling code here:
        root.removeAll();
        root.add(signupPage);
        root.repaint();
        root.revalidate();
        
        placeholder.removeAll();
        placeholder.add(welcomePage);
        placeholder.repaint();
        placeholder.revalidate();
        
    }//GEN-LAST:event_addanothercard1MouseClicked

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceActionPerformed

    private void cvv2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvv2MouseClicked
        // TODO add your handling code here:
        cvv2.setText("");
    }//GEN-LAST:event_cvv2MouseClicked

    private void pwdinput4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwdinput4MouseClicked
        // TODO add your handling code here:
        pwdinput4.setText("");
    }//GEN-LAST:event_pwdinput4MouseClicked

    private void e11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e11MouseClicked
        // TODO add your handling code here:
        e11.setText("");
    }//GEN-LAST:event_e11MouseClicked

    private void e22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e22MouseClicked
        // TODO add your handling code here:
        e22.setText("");
    }//GEN-LAST:event_e22MouseClicked

    private void e1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MouseClicked
        // TODO add your handling code here:
        e1.setText("");
    }//GEN-LAST:event_e1MouseClicked

    private void e2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e2MouseClicked
        // TODO add your handling code here:
        e2.setText("");
    }//GEN-LAST:event_e2MouseClicked

    private void addcard1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcard1MouseEntered
    }//GEN-LAST:event_addcard1MouseEntered

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addanothercard;
    private javax.swing.JLabel addanothercard1;
    private javax.swing.JLabel addcard;
    private javax.swing.JLabel addcard1;
    private javax.swing.JPanel addcardPage;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField cardNumber;
    private javax.swing.JPanel cartPage;
    private javax.swing.JPanel catalog;
    private javax.swing.JTextField cno;
    private javax.swing.JPanel confirmationPage;
    private javax.swing.JTextField cvv;
    private javax.swing.JPasswordField cvv2;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField e11;
    private javax.swing.JTextField e2;
    private javax.swing.JTextField e22;
    private javax.swing.JTextField fnameinput;
    private javax.swing.JTextField fnameinput4;
    private javax.swing.JTextField fnameinput5;
    private javax.swing.JTextField fnameinput6;
    private javax.swing.JTextField fnameinput7;
    private javax.swing.JLabel help;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel paymentPage1;
    private javax.swing.JPanel paymentPage2;
    private javax.swing.JPasswordField pin;
    private javax.swing.JPanel placeholder;
    private javax.swing.JLabel proceed2;
    private javax.swing.JLabel proceed3;
    private javax.swing.JLabel proceed4;
    private javax.swing.JLabel proceed5;
    private javax.swing.JPasswordField pwdinput;
    private javax.swing.JPasswordField pwdinput1;
    private javax.swing.JPasswordField pwdinput4;
    private javax.swing.JPanel root;
    private javax.swing.JLabel signin;
    private javax.swing.JPanel signinPage;
    private javax.swing.JLabel signup;
    private javax.swing.JLabel signup1;
    private javax.swing.JPanel signupPage;
    private javax.swing.JTextField unameinput;
    private javax.swing.JTextField unameinput1;
    private javax.swing.JTextField unameinput3;
    private javax.swing.JTextField unameinput6;
    private javax.swing.JTextField unameinput8;
    private javax.swing.JTextField unameinput9;
    private javax.swing.JPanel welcomePage;
    // End of variables declaration//GEN-END:variables
}
