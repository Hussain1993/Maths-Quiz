/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on 12-Dec-2010, 13:11:35
 */

package Project;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hussain Miah
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    public Login() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lblUserErr = new javax.swing.JLabel();
        lblPassErr = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnPass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome - Login");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WELCOME - Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lblWelcome.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblWelcome.setText("Enter your Username and Password to begin:");

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblUsername.setText("Username: ");

        lblPass.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblPass.setText("Password: ");

        lblMessage.setForeground(new java.awt.Color(255, 0, 0));

        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });

        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });

        lblUserErr.setForeground(new java.awt.Color(255, 0, 0));

        lblPassErr.setForeground(new java.awt.Color(255, 0, 0));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Need to Register? Click Register");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnPass.setText("Forgot Username or Password?");
        btnPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPass)
                                    .addComponent(lblUsername))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserErr, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogin))
                            .addComponent(lblPassErr, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblWelcome)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPass, lblUsername});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPass, txtUsername});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserErr)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassErr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(lblMessage)
                    .addComponent(jLabel1)
                    .addComponent(btnRegister)
                    .addComponent(btnPass))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        try{
            if (txtUsername.getText().length() == 0)
            {
                throw new Exception ("Enter username");
            }
            else
            {
                String patt = "^[A-Za-z0-9]+$";//only letters and  numbers
                Pattern regPat = Pattern.compile(patt);
                Matcher matcher = regPat.matcher(txtUsername.getText());
                if (matcher.find())
                {
                    throw new Exception ("");
                }
                else
                {
                    throw new Exception ("Only letters and numbers can be entered");
                }
            }//end else
        }//end try
        catch(Exception e){
            lblUserErr.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
    try {
            if (txtPass.getText().length() == 0)
            {
                throw new Exception ("Enter password");
            }
            else
            {
                String patt = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$";
                Pattern regPat = Pattern.compile(patt);
                Matcher matcher = regPat.matcher(txtPass.getText());
                if (matcher.find())
                {
                    throw new Exception ("");
                }
                else
                {
                    throw new Exception ("Password is in wrong format");
                }
            }//end else
        }//end try
        catch (Exception e){
            lblPassErr.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try{
            if (checkForm() == false)
            {
                //Check if form is blank
                throw new Exception ("Blank form");
            }
            if (checkForm() == true)
            {
                if (valUser() == false || valPassword() == false)
                {
                    //validate all fields
                    throw new Exception ("Error on form");
                }
                else
                {
                    /**
                     * If the form passes the validation checks
                     * tryLofin is called so they can login
                     */
                    tryLogin();
                }
            }//end if
        }//end try
        catch (Exception e){
              lblMessage.setText(e.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        /**
         * If the person needs to register, they can press
         * the register button and be presented with the Register form
         */
        new RegisterUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
            lblUserErr.setText("Only letters and numbers can be entered");
    }//GEN-LAST:event_txtUsernameFocusGained

    private void btnPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassActionPerformed
        /**
         * If the user has forgotten their username or password
         * then they will be presented with a warning screen.
         */
        new PasswordMessage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPassActionPerformed
public void tryLogin(){
    /**
     * This procedure checks the login-in details
     */
        try{
            //connect to the database
            DatabaseConnect.init();
            Connection conn = DatabaseConnect.getConnection();
            //enable SQL statements
            Statement stmt = conn.createStatement();
            //retrieve login feilds from interface
            String user = txtUsername.getText().trim();
            String pass = txtPass.getText().trim();
            //create and execute query
            ResultSet result = stmt.executeQuery("SELECT * from LOGIN where USER_NAME ='" +user+ "' AND PASSWORD ='" +pass+ "'");
            //check result
            if (result.next())
            {
                lblMessage.setText("Well done you have logged in");
                //The mian menu gets displayed once they have logged in
                new MainMenu().setVisible(true);
                this.dispose();

            }
            else
            {
                lblMessage.setText("Wrong details have been entered");
            }
            stmt.close();
            conn.close();
            result.close();
        }//end try
        catch(Exception ex){
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
        }
    }//END METHOD TRYLOGIN
public boolean checkForm(){
    //Checks if the form is blank
    boolean state = true;
    if (txtUsername.getText().length() == 0)
    {
        lblUserErr.setText("Enter username");
        state = false;
    }
    if (txtPass.getText().length() == 0)
    {
        lblPassErr.setText("Enter password");
        state = false;
    }
    return state;
}//END METHOD CHECKFROM
public boolean valUser(){
    //validates username
    boolean state = true;
    String patt = "^[A-Za-z0-9]+$";//only letters and numbers
            Pattern regPat = Pattern.compile(patt);
            String user = txtUsername.getText();
            Matcher matcher = regPat.matcher(user);
            if (matcher.find())
            {
                lblUserErr.setText("");
                state = true;
            }
            else
            {
                lblUserErr.setText("Only letters and numbers");
                state = false;
            }
    return state;
}//END METHOD VALUSER
public boolean valPassword(){
    //validates password
    boolean state = true;
    String patt = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$";
            Pattern regPat = Pattern.compile(patt);
            String pass = txtPass.getText();
            Matcher matcher =  regPat.matcher(pass);
            if (matcher.find())
            {
                lblPassErr.setText("");
                state = true;
            }
            else
            {
                lblPassErr.setText("Password: One uppercase, One lowercase and One number");
                state = false;
            }
    return state;
}//END METHOD VALPASSWORD
    /**
    * @param args the command line arguments
    */
/*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPass;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPassErr;
    private javax.swing.JLabel lblUserErr;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
