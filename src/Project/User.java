/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * User.java
 *
 * Created on 26-Jan-2011, 19:41:47
 */

package Project;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kk
 */
public class User extends javax.swing.JFrame {

    /** Creates new form User */
    public User() {
        initComponents();
        getNum();//get the number of users in the database
        showAll();//show all the users in the database
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
        lblWel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btnChange = new javax.swing.JButton();
        btnMain = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblWel.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblWel.setText("jLabel1");

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "First Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUser);

        btnChange.setText("Change Password");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnMain.setText("Main Menu");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 12));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChange)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblWel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange)
                    .addComponent(btnMain)
                    .addComponent(lblMessage))
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        getValues();
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        //Display main menu
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMainActionPerformed
public void getNum(){
    //Get the number of users in the databse and display this on the user interface
    try{
        int num = 0;
        DatabaseConnect.init();
        Connection conn = DatabaseConnect.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM LOGIN");
        if (result != null)
        {
            while (result.next())
            {
                num++;
            }
        }
        lblWel.setText("There are/is "+num+" user in the database");
        stmt.close();
        conn.close();
        result.close();
    }//end try
    catch(Exception ex){
        System.err.print("SQLException: ");
        System.err.println(ex.getMessage());
    }
}//end method
public void showAll(){
    //show all the users in the database
     try{
        DatabaseConnect.init();
        Connection conn = DatabaseConnect.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM LOGIN");
        DefaultTableModel model = (DefaultTableModel)tblUser.getModel();
        if (result != null)
        {
            while (model.getRowCount()>0)
            {
                model.removeRow(0);
            }
            while (result.next())
            {
                String first = result.getString("FIRST_NAME");
                String last = result.getString("LAST_NAME");
                model.addRow(new Object[]{first,last});
            }
        }
        stmt.close();
        conn.close();
        result.close();
     }//end try
     catch(Exception ex){
         System.err.print("SQLException: ");
         System.err.println(ex.getMessage());
     }
}//end method
public void getValues(){
    //get the selected values from the table and pass these onto another form so the user can change their password
    int row = tblUser.getSelectedRow();
    try{
        if (row ==  -1)
        {
            throw new Exception ("Row not selected");
        }
        else
        {
            String first = (String)tblUser.getValueAt(row, 0);
            String last = (String)tblUser.getValueAt(row, 1);
            new ChangePass(first,last).setVisible(true);//this opens the form to change the password
            this.dispose();
        }
    }
    catch(Exception e){
        lblMessage.setText(e.getMessage());
    }
}//end method
    /**
    * @param args the command line arguments
    */
/*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnMain;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblWel;
    private javax.swing.JTable tblUser;
    // End of variables declaration//GEN-END:variables

}
