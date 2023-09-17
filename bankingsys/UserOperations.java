package bankingsys;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rudraksha
 */
public class UserOperations extends javax.swing.JFrame {

    /**
     * Creates new form UserOperations
     */
    /*public UserOperations(String para) {
        
        initComponents();
        lblname.setText(para);
        lblamt.setVisible(false);
        txtamt.setVisible(false);
        btnsubmit.setVisible(false);
        lbloption.setVisible(false);
    }*/
    public UserOperations() {
        initComponents();
        lblamt.setVisible(false);
        txtamt.setVisible(false);
        btnsubmit.setVisible(false);
        lbloption.setVisible(false);
        lblpass.setVisible(false);
        txtpass.setVisible(false);
        lblcamt.setVisible(false);
        lblcamount.setVisible(false);
        tblpanel.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboperation = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblamt = new javax.swing.JLabel();
        txtamt = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        lbloption = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnback = new javax.swing.JButton();
        lblcamount = new javax.swing.JLabel();
        lblcamt = new javax.swing.JLabel();
        tblpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltrans = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   USER OPERATIONS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        cboperation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Operation--", "Check Balance", "Deposit Amount", "Withdraw Amount", "View Transactions", "Apply For Loan", "Apply for Credit Card" }));
        cboperation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboperationItemStateChanged(evt);
            }
        });
        jPanel1.add(cboperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 76, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        jLabel2.setText("Choose what would you like to do :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 75, -1, 20));

        lblamt.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        lblamt.setText("Enter Amount :");
        jPanel1.add(lblamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 140, 220, 24));
        jPanel1.add(txtamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 141, 127, 24));

        btnsubmit.setBackground(new java.awt.Color(51, 51, 255));
        btnsubmit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 418, -1, -1));

        lbloption.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbloption.setForeground(new java.awt.Color(255, 0, 0));
        lbloption.setText("Select valid Operation");
        jPanel1.add(lbloption, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 75, 133, 21));
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 279, 25, 25));

        lblpass.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        lblpass.setText("Enter Password :");
        jPanel1.add(lblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 183, 220, 26));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 184, 127, 26));

        btnback.setBackground(new java.awt.Color(51, 51, 255));
        btnback.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 418, 77, -1));

        lblcamount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.add(lblcamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 239, 127, 22));

        lblcamt.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        lblcamt.setText("Current Balance :");
        jPanel1.add(lblcamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 239, 122, 22));

        tbltrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbltrans);

        javax.swing.GroupLayout tblpanelLayout = new javax.swing.GroupLayout(tblpanel);
        tblpanel.setLayout(tblpanelLayout);
        tblpanelLayout.setHorizontalGroup(
            tblpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        tblpanelLayout.setVerticalGroup(
            tblpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );

        jPanel1.add(tblpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 279, -1, -1));

        jButton1.setText("View Transactions");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
      String option = cboperation.getSelectedItem().toString();
      //String name = lblname.getText();
      String passwd = txtpass.getText();
      int amtchk=0;
      int newamt=0;
      int accno=0;
      String emailid="";
      String adminEmailid="infoprojectemail2@gmail.com";
        if(option.equalsIgnoreCase("Withdraw Amount")){
           int amt = Integer.parseInt(txtamt.getText());
           if(amt>=500){
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/BankSystem");
           Statement st = cn.createStatement();
           String qry = "select amount from customerinfo where password = '"+passwd+"'";
           String qry1 = "select emailid from customerinfo where password = '"+passwd+"'";
           ResultSet rs = st.executeQuery(qry);
           if(rs.next()){amtchk = rs.getInt(1); }
           ResultSet rs1 = st.executeQuery(qry1);
           if(rs1.next()){emailid = rs1.getString(1); }
           if(amtchk < amt)
           {JOptionPane.showMessageDialog(rootPane,"Sorry,Not Enough Amount in your account..!!");}
           else{
           String chk = "update customerinfo set amount = amount - ? where password = ?";
           PreparedStatement pst=cn.prepareStatement(chk);
           pst.setInt(1,amt);
           pst.setString(2,passwd);
           int ch = pst.executeUpdate();
           if(ch==1)
           {
               JOptionPane.showMessageDialog(rootPane,"Amount Withdrawn Successfully..!!");
               String qry2 = "select amount from customerinfo where password = '"+passwd+"'";
               ResultSet rs2 = st.executeQuery(qry2);
               if(rs2.next()){newamt = rs2.getInt(1); }
               String qru = "select accno from customerinfo where password = '"+passwd+"'";
               ResultSet re = st.executeQuery(qru);
               if(re.next()){accno = re.getInt(1); }
               
               String date,time,trans="Withdrawal";
               date = java.time.LocalDate.now().toString();
               time = java.time.LocalTime.now().toString();
               String qre = "insert into usertransaction(accno,date,time,amount,transactions,password,balance) values("+accno+",'"+date+"','"+time+"',"+amt+",'"+trans+"','"+passwd+"',"+newamt+") ";
               int ch1 = st.executeUpdate(qre);
               if(ch1==1){JOptionPane.showMessageDialog(rootPane,"done..!!");}
               else{JOptionPane.showMessageDialog(rootPane,"nope..!!");}
             
                  String ToEmail = emailid;
                  String FromEmail = adminEmailid;
                  String FromEmailPassword = "#cec@mvlu";//My Password
                  String Subject = "Your Account Had a Transaction";
        
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
                  message.setText("Your A/c "+accno+" was Debited by Rs."+amt+"\nYour New Balance is Rs."+newamt);
                  Transport.send(message);
                  } catch (Exception e) {System.out.println(e+"Error Occurred");}
           }
           else{JOptionPane.showMessageDialog(rootPane,"Amount not Withdrawn..!!");}
           cn.close();}
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e,"Transaction Failed",JOptionPane.ERROR_MESSAGE);
            }}
           else{JOptionPane.showMessageDialog(rootPane,"Sorry,Amount should be more than 500");}
        }
        else if(option.equalsIgnoreCase("Deposit Amount"))
        {  int amt = Integer.parseInt(txtamt.getText());
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/BankSystem");
           Statement st = cn.createStatement();
           String qry ="update customerinfo set amount = amount + "+amt+" where password = '"+passwd+"' ";
           int ch = st.executeUpdate(qry);
           if(ch==1)
           {
               JOptionPane.showMessageDialog(rootPane,"Amount Deposited Successfully..!!");
               String qryt = "select amount from customerinfo where password = '"+passwd+"'";
               ResultSet rst = st.executeQuery(qryt);
               if(rst.next()){newamt = rst.getInt(1); }
               String qr = "select accno from customerinfo where password = '"+passwd+"'";
               ResultSet r = st.executeQuery(qr);
               if(r.next()){newamt = r.getInt(1); }
               
                String date,time,trans="Deposit";
               date = java.time.LocalDate.now().toString();
               time = java.time.LocalTime.now().toString();
               String qre = "insert into usertransaction(accno,date,time,amount,transactions,password,balance) values("+accno+",'"+date+"','"+time+"',"+amt+",'"+trans+"','"+passwd+"',"+newamt+") ";
               int ch1 = st.executeUpdate(qre);
               if(ch1==1){JOptionPane.showMessageDialog(rootPane,"done..!!");}
               else{JOptionPane.showMessageDialog(rootPane,"nope..!!");}
               
                  String ToEmail = emailid;
                  String FromEmail = adminEmailid;
                  String FromEmailPassword = "#cec@mvlu";//My Password
                  String Subject = "Your Account Had a Transaction";
        
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
                  message.setText("Your A/c "+accno+" was Credited  by Rs."+amt+"\nYour New Balance is Rs."+newamt);
                  Transport.send(message);
                  } catch (Exception e) {System.out.println(e+"Error Occurred");}
           }
           else{JOptionPane.showMessageDialog(rootPane,"Amount not deposited..!!");}
           cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e,"Transaction Failed",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(option.equalsIgnoreCase("Apply For Loan"))
        {
            int amt = Integer.parseInt(txtamt.getText());
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/BankSystem");
           Statement st = cn.createStatement();
           String qry ="select * from loaninfo where password = '"+passwd+"' ";
           ResultSet rs = st.executeQuery(qry);
           if(rs.next())
           {
               JOptionPane.showMessageDialog(rootPane,"Sorry,you already have an ongoing loan\n you cannot apply for another");
           }
           else 
           {try {
                   String qry1 ="select accno,fname,emailid,amount,password,pancardno,address from customerinfo where password = '"+passwd+"' ";
                   ResultSet rs1 = st.executeQuery(qry1);
                   if(rs1.next())
                   {
                       accno = rs1.getInt(1); 
                       String fname = rs1.getString(2); 
                       String email = rs1.getString(3); 
                       int amount = rs1.getInt(4); 
                       String pass = rs1.getString(5); 
                       String pan = rs1.getString(6);
                       String address = rs1.getString(7);
                       String qry2 ="insert into loaninfo(accno,fname,emailid,amount,password,pancardno,address) values("+accno+",'"+fname+"','"+email+"',"+amt+",'"+pass+"','"+pan+"','"+address+"') ";
                       st.executeQuery(qry1);
                       int ch = st.executeUpdate(qry2);
                       if(ch==1)
                       {
                          JOptionPane.showMessageDialog(rootPane,"Your Loan has been Recieved\nIt will be approved by admin after checking eligibility!!"); 
                       }
                       else{JOptionPane.showMessageDialog(rootPane,"Record not inserted"); }
                   }
               } catch (Exception e) {JOptionPane.showMessageDialog(null,e,"Error Occured",JOptionPane.ERROR_MESSAGE);
               }
           }
           }
            catch (Exception e) {JOptionPane.showMessageDialog(null,e,"Error Occured",JOptionPane.ERROR_MESSAGE);}
       }
        else if((option.equalsIgnoreCase("Check Balance")))
        {try {
              Class.forName("org.apache.derby.jdbc.ClientDriver");
           Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/BankSystem");
           Statement st = cn.createStatement();
           String qryamt = "select amount from customerinfo where password = '"+passwd+"'";
           ResultSet rsamt = st.executeQuery(qryamt);
           if(rsamt.next())
           {int amtbal = rsamt.getInt(1);
           lblcamount.setText(String.valueOf(amtbal));
           //JOptionPane.showMessageDialog(rootPane, " Record Found..!!");
           }
           else{JOptionPane.showMessageDialog(rootPane, "No Record Found..!!");}
        } catch (Exception e) { JOptionPane.showMessageDialog(null,e,"Error Occured",JOptionPane.ERROR_MESSAGE);
           }
        }
        else if((option.equalsIgnoreCase("View Transactions"))){
              try{ 
                      
                  DefaultTableModel model = new DefaultTableModel(new String[]{"Account Number", "Date", "Time", "Amount", "Transaction","Balance"}, 0);
                      Class.forName("org.apache.derby.jdbc.ClientDriver");
                      Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/QuestionPaper");
                      Statement st = cn.createStatement();
                      String query = "select accno,date,time,amount,transactions,balance from usertransaction where password = '"+passwd+"' ";
                      ResultSet rs = st.executeQuery(query);
                      if (rs.next() == false) 
                      { 
                        JOptionPane.showMessageDialog(rootPane, "Error" ,"No Data Found",JOptionPane.ERROR_MESSAGE);
                      }
                      else{
                          while(rs.next())
                        {
                                 int d = rs.getInt(1);
                                 String e = rs.getString(2);
                                String f = rs.getString(3);
                                String g = rs.getString(4);
                                String h = rs.getString(5);
                                int i = rs.getInt(6);
                                 tbltrans.removeAll();
                                model.addRow(new Object[]{d, e, f, g, h, i});
                        }
                        tbltrans.setModel(model);
                        }
                        cn.close();
                     }
                  catch(Exception ex){
                       JOptionPane.showMessageDialog(rootPane, "ERROR " ,ex.toString(),JOptionPane.ERROR_MESSAGE);
                    }
            }
         /*else if(option.equalsIgnoreCase("Apply for Credit Card"))
        {
            
        }*/
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void cboperationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboperationItemStateChanged
       String option = cboperation.getSelectedItem().toString();
       if(option.equalsIgnoreCase("--Select Operation--")){
            lbloption.setVisible(true);
            lblamt.setVisible(false);
            txtamt.setVisible(false);
            btnsubmit.setVisible(false);
        }
       if(option.equalsIgnoreCase("Check Balance")){
            lbloption.setVisible(false);
            lblcamt.setVisible(true);
            lblcamount.setVisible(true);
            lblpass.setVisible(true);
            txtpass.setVisible(true);
           btnsubmit.setVisible(true);
        }
        else if(option.equalsIgnoreCase("Deposit Amount"))
        {
            lbloption.setVisible(false);
            lblamt.setVisible(true);
            txtamt.setVisible(true);
            btnsubmit.setVisible(true);
            lblpass.setVisible(true);
            txtpass.setVisible(true);
        }
       else if(option.equalsIgnoreCase("Withdraw Amount"))
        {
            lbloption.setVisible(false);
            lblamt.setVisible(true);
            txtamt.setVisible(true);
            btnsubmit.setVisible(true);
            lblpass.setVisible(true);
            txtpass.setVisible(true);
        }
       else if(option.equalsIgnoreCase("Apply For Loan"))
        {
            lbloption.setVisible(false);
            lblamt.setVisible(true);
            txtamt.setVisible(true);
            btnsubmit.setVisible(true);
            lblpass.setVisible(true);
            txtpass.setVisible(true);
        }
       else if(option.equalsIgnoreCase("Apply for Credit Card"))
        {
            lbloption.setVisible(false);
            lblamt.setVisible(false);
            txtamt.setVisible(false);
            btnsubmit.setVisible(false);
        }
       else if(option.equalsIgnoreCase("View Transactions"))
        {
            lbloption.setVisible(false);
            lblamt.setVisible(false);
            txtamt.setVisible(false);
            btnsubmit.setVisible(false);
            lblpass.setVisible(false);
            txtpass.setVisible(true);
            tblpanel.setVisible(true);
            
            
            
            
        }
       
    }//GEN-LAST:event_cboperationItemStateChanged

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        UserLogin ul = new UserLogin();
        ul.show();
        dispose();
                
    }//GEN-LAST:event_btnbackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{ 
                 String pass= txtpass.getText().toString();
                      
                  DefaultTableModel model = new DefaultTableModel(new String[]{"Account Number", "Date", "Time", "Amount", "Transaction","Balance"}, 0);
                      Class.forName("org.apache.derby.jdbc.ClientDriver");
                      Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/BankSystem");
                      Statement st = cn.createStatement();
                      String query = "select accno,date,time,amount,transactions,balance from usertransaction where password = '"+pass+"' ";
                      ResultSet rs = st.executeQuery(query);

                          while(rs.next())
                        {
                                 int d = rs.getInt(1);
                                 String e = rs.getString(2);
                                String f = rs.getString(3);
                                String g = rs.getString(4);
                                String h = rs.getString(5);
                                int i = rs.getInt(6);
                                 tbltrans.removeAll();
                                model.addRow(new Object[]{d, e, f, g, h, i});
                        }
                        tbltrans.setModel(model);
                        
                        cn.close();
                     }
                  catch(Exception ex){
                       JOptionPane.showMessageDialog(rootPane, ex,"Error",JOptionPane.ERROR_MESSAGE);
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> cboperation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblamt;
    private javax.swing.JLabel lblcamount;
    private javax.swing.JLabel lblcamt;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbloption;
    private javax.swing.JLabel lblpass;
    private javax.swing.JPanel tblpanel;
    private javax.swing.JTable tbltrans;
    private javax.swing.JTextField txtamt;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
