package bankingsys;


import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rudraksha
 */
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    public UserLogin() {
        initComponents();
        lblemail.setVisible(false);
        txtemail.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnfpass = new javax.swing.JButton();
        btnfuname = new javax.swing.JButton();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel2.setText("Enter Username :");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel3.setText("Enter Password :");

        btnback.setBackground(new java.awt.Color(51, 51, 255));
        btnback.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText(" BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnsubmit.setBackground(new java.awt.Color(51, 51, 255));
        btnsubmit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(51, 51, 255));
        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR ALL");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  USER LOGIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        btnfpass.setBackground(new java.awt.Color(51, 51, 255));
        btnfpass.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnfpass.setForeground(new java.awt.Color(255, 255, 255));
        btnfpass.setText("FORGOT PASSWORD ?");
        btnfpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfpassActionPerformed(evt);
            }
        });

        btnfuname.setBackground(new java.awt.Color(51, 51, 255));
        btnfuname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnfuname.setForeground(new java.awt.Color(255, 255, 255));
        btnfuname.setText("FORGOT USERNAME ?");
        btnfuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfunameActionPerformed(evt);
            }
        });

        lblemail.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        lblemail.setText("Enter Email-ID :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnfpass)
                                .addGap(168, 168, 168)
                                .addComponent(btnfuname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnback)
                                .addGap(136, 136, 136)
                                .addComponent(btnsubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnclear)))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtpassword)
                            .addComponent(txtemail))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btnsubmit)
                    .addComponent(btnclear))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfpass)
                    .addComponent(btnfuname))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        HomePage hp = new HomePage();
        hp.show();
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtusername.setText("");
        txtusername.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        String un,passwd;
        un=txtusername.getText();
        passwd=txtpassword.getText();
        
        try
        {
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/BankSystem");
           String chk = "Select * from customerinfo where username = ?";
           PreparedStatement pst=cn.prepareStatement(chk);
           pst.setString(1,un);
           ResultSet rs = pst.executeQuery();
            if(rs.next())
            {String password= rs.getString("password");
              if(passwd.equals(password))
              {
               JOptionPane.showMessageDialog(rootPane,"Login Successful..!!");
               UserOperations uo = new UserOperations();
               uo.show();
               this.dispose();
              }
              else{JOptionPane.showMessageDialog(null,"Invalid Password","Login Error",JOptionPane.ERROR_MESSAGE);}
            }
            else{JOptionPane.showMessageDialog(null,"Username not Found","Login Error",JOptionPane.ERROR_MESSAGE);}
        }   
        //cn.close();
        catch(Exception ex){JOptionPane.showMessageDialog(rootPane,ex);}
       
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnfpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfpassActionPerformed
         lblemail.setVisible(true);
         txtemail.setVisible(true);
         String email = txtemail.getText(),passwd;
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/BankSystem");
           Statement st = cn.createStatement();
           String qry = "select Password from customerinfo where emailid = '"+email+"'";
           ResultSet rs = st.executeQuery(qry);
           if(rs.next()){
               passwd = rs.getString(1); 
               JOptionPane.showMessageDialog(rootPane,"Your Password has been sent to your Email-ID.\nKindly check your mail");
               String ToEmail = email;
               String FromEmail = "infoprojectemail2@gmail.com";
                  String FromEmailPassword = "#cec@mvlu";//My Password
                  String Subject = "Your Password for Banking System";
        
                  Properties properties = new Properties();
                  properties.put("mail.smtp.auth","true");
                  properties.put("mail.smtp.starttls.enable","true");
                  properties.put("mail.smtp.host","smtp.gmail.com");
                  properties.put("mail.smtp.port","587");
        
                  Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
                  protected PasswordAuthentication getPasswordAuthentication()
                  {
                    return new PasswordAuthentication(FromEmail, FromEmailPassword);
                  }
                  })  ;      
        
                  try {
                  MimeMessage message = new MimeMessage(session);
                  message.setFrom(new InternetAddress(FromEmail));
                  //message.addRecipients(Message.RecipientType.TO, new InternetAddress(ToEmail));
                  message.addRecipients(Message.RecipientType.TO,InternetAddress.parse(ToEmail));
                  message.setSubject(Subject);
                  message.setText("Your Password for your account is "+passwd+".");
                  Transport.send(message);
                  } catch (Exception e) {System.out.println(e+"Error Occurred");}
           }
           else{JOptionPane.showMessageDialog(rootPane,"Sorry,no Password found for given Email-ID.");}
        } catch (Exception e) {JOptionPane.showMessageDialog(null,e,"Error Message",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnfpassActionPerformed

    private void btnfunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfunameActionPerformed
        lblemail.setVisible(true);
        txtemail.setVisible(true);
        String email = txtemail.getText(),uname;
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/BankSystem");
           Statement st = cn.createStatement();
           String qry = "select username from customerinfo where emailid = '"+email+"'";
           ResultSet rs = st.executeQuery(qry);
           if(rs.next()){
               uname = rs.getString(1); 
               JOptionPane.showMessageDialog(rootPane,"Your Username has been sent to your Email-ID.\nKindly check your mail");
               String ToEmail = email;
               String FromEmail = "infoprojectemail2@gmail.com";
                  String FromEmailPassword = "#cec@mvlu";//My Password//My Password
                  String Subject = "Your Username for Banking System";
        
                  Properties properties = new Properties();
                  properties.put("mail.smtp.auth","true");
                  properties.put("mail.smtp.starttls.enable","true");
                  properties.put("mail.smtp.host","smtp.gmail.com");
                  properties.put("mail.smtp.port","587");
        
                  Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
                  protected PasswordAuthentication getPasswordAuthentication()
                  {
                    return new PasswordAuthentication(FromEmail, FromEmailPassword);
                  }
                  })  ;      
        
                  try {
                  MimeMessage message = new MimeMessage(session);
                  message.setFrom(new InternetAddress(FromEmail));
                  //message.addRecipients(Message.RecipientType.TO, new InternetAddress(ToEmail));
                  message.addRecipients(Message.RecipientType.TO,InternetAddress.parse(ToEmail));
                  message.setSubject(Subject);
                  message.setText("Your username for Email-ID : "+email+" is "+uname+".");
                  Transport.send(message);
                  } catch (Exception e) {System.out.println(e+"Error Occurred");}
           }
           else{JOptionPane.showMessageDialog(rootPane,"Sorry,no username found for given Email-ID.");}
        } catch (Exception e) {JOptionPane.showMessageDialog(null,e,"Error Message",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnfunameActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnfpass;
    private javax.swing.JButton btnfuname;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblemail;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
