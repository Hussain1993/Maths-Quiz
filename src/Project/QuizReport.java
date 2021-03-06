/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * QuizReport.java
 *
 * Created on 25-Jan-2011, 17:09:57
 */

package Project;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author kk
 */
public class QuizReport extends javax.swing.JFrame {

    /** Creates new form QuizReport */
    public QuizReport() {
        initComponents();
        showAll();//show all the quiz records in the database
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
        tblQuiz = new javax.swing.JTable();
        btnMain = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblWel2 = new javax.swing.JLabel();
        btnTotalPoints = new javax.swing.JButton();
        lblPoints = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        lblMessage2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quiz Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblWel.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblWel.setText("Here is the Quiz Report for every pupil that has done the quiz.");

        tblQuiz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Pupil Number", "First Name", "Last Name", "Quiz Number", "Difficulty Set", "Points", "Max Points"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblQuiz);

        btnMain.setText("Main Menu");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        btnStart.setText("Start Another Quiz");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblMessage.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addComponent(lblWel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                        .addComponent(btnStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMain)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMain)
                    .addComponent(btnStart)
                    .addComponent(lblMessage))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Get Total Points", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblWel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblWel2.setText("Select a pupil from above and Press Total Points");

        btnTotalPoints.setText("Total Points");
        btnTotalPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPointsActionPerformed(evt);
            }
        });

        lblPoints.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblPoints.setText("The pupil has");

        lblSearch.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblSearch.setText("Search");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnShow.setText("Show All Data");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        lblMessage2.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblMessage2.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblWel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTotalPoints))
                    .addComponent(lblPoints)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMessage2)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWel2)
                    .addComponent(btnTotalPoints))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPoints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnShow)
                    .addComponent(lblMessage2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        // Display the main menu
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_btnMainActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // Start another quiz
        getValues();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnTotalPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPointsActionPerformed
        //get the total number of points the pupil has acheived
        getTotal();
    }//GEN-LAST:event_btnTotalPointsActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        //show all the records in the database
        showAll();
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //search for a pupil
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    public void showAll(){
        //show all the pupil quiz records
        String pupilNum = "";
        String first = "";
        String last = "";
        int quizNum = 0;
        String skill = "";
        int points = 0;
        int maxPoints = 0;
        try{
            DatabaseConnect.init();
            Connection conn = DatabaseConnect.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT QUIZ_ATTEMPT.PUPIL_NUMBER,PUPILS.PUPIL_FIRST_NAME,PUPILS.PUPIL_LAST_NAME,QUIZ_ATTEMPT.QUIZ_NUMBER,PUPILS.SKILL_LEVEL,QUIZ_ATTEMPT.PUPIL_POINTS,QUIZ.TOTAL_POINTS FROM PUPILS,QUIZ_ATTEMPT,QUIZ WHERE QUIZ_ATTEMPT.PUPIL_NUMBER=PUPILS.PUPIL_NUMBER AND QUIZ_ATTEMPT.QUIZ_NUMBER=QUIZ.QUIZ_NUMBER ORDER BY PUPIL_POINTS DESC");
            DefaultTableModel model = (DefaultTableModel)tblQuiz.getModel();
            if (result != null)
            {
                while (model.getRowCount()>0)
                {
                    model.removeRow(0);
                }
                while (result.next())
                {
                    pupilNum = result.getString("PUPIL_NUMBER");
                    first = result.getString("PUPIL_FIRST_NAME");
                    last = result.getString("PUPIL_LAST_NAME");
                    quizNum = result.getInt("QUIZ_NUMBER");
                    skill = result.getString("SKILL_LEVEL");
                    points = result.getInt("PUPIL_POINTS");
                    maxPoints = result.getInt("TOTAL_POINTS");
                    model.addRow(new Object[]{pupilNum,first,last,quizNum,skill,points,maxPoints});//add values to the table
                }
            }//end if
            stmt.close();
            conn.close();
            result.close();
        }//end try
        catch(Exception ex){
            System.out.print("SQLException: ");
            System.out.println(ex.getMessage());
        }//end catch
    }//end method
    public void getValues(){
        //get the values from the table to start another quiz
        int row = tblQuiz.getSelectedRow();
        try{
            if (row == -1)
            {
                throw new Exception ("Row not selected");
            }
            else
            {
                String pupilNum = (String)tblQuiz.getValueAt(row, 0);
                String first = (String)tblQuiz.getValueAt(row, 1);
                String last = (String)tblQuiz.getValueAt(row, 2);
                String skill = (String)tblQuiz.getValueAt(row, 4);
                new SelectQuiz(pupilNum,first,last,skill).setVisible(true);//opens a new windows to select a quiz
                this.dispose();
            }
        }//end try
        catch(Exception e){
             lblMessage.setText(e.getMessage());
        }
    }//end method
    public void getTotal(){
        //get the total number of points the pupil has got from doing a quiz
        String pupilNum = "";
        String first = "";
        Integer points = 0;
        Integer total = 0;
        ArrayList<Integer>Points = new ArrayList<Integer>();
        ArrayList<Integer>Total = new ArrayList<Integer>();
        int row = tblQuiz.getSelectedRow();
        try{
            if (row == -1)
            {
                throw new Exception ("Row not selected");
            }
            else
            {
                pupilNum = (String)tblQuiz.getValueAt(row, 0);
                try{
                    DatabaseConnect.init();
                    Connection conn = DatabaseConnect.getConnection();
                    Statement stmt = conn.createStatement();
                    ResultSet result = stmt.executeQuery("SELECT QUIZ_ATTEMPT.PUPIL_POINTS, QUIZ.TOTAL_POINTS,PUPILS.PUPIL_FIRST_NAME FROM QUIZ_ATTEMPT, QUIZ,PUPILS WHERE QUIZ_ATTEMPT.QUIZ_NUMBER = QUIZ.QUIZ_NUMBER AND QUIZ_ATTEMPT.PUPIL_NUMBER=PUPILS.PUPIL_NUMBER AND (QUIZ_ATTEMPT.PUPIL_NUMBER='"+pupilNum+"')");
                    if (result!=null)
                    {
                        while (result.next())
                        {
                            first = result.getString("PUPIL_FIRST_NAME");
                            Points.add(result.getInt("PUPIL_POINTS"));
                            Total.add(result.getInt("TOTAL_POINTS"));
                        }
                        for (int i=0; i<Points.size();i++)
                        {
                            points += Points.get(i);//the number points the pupil has acheived
                        }
                        for (int j =0; j<Total.size();j++)
                        {
                            total +=Total.get(j);//the total numbner of points for all the quizzes the pupil has done
                        }
                        lblPoints.setText(first+" has "+points+" point(s) out of a total "+total+" point(s)");
                    }//end if
                    stmt.close();
                    conn.close();
                    result.close();
                }//end try
                catch(Exception ex){
                    System.err.print("SQLException: ");
                    System.err.println(ex.getMessage());
                }
            }//end else
        }//end try
        catch(Exception e){
            lblMessage.setText(e.getMessage());
        }
    }//end method
    public void search(){
        //this searches for a pupil in the quiz report by the pupil number or first name
        String search = txtSearch.getText();
        String pupilNum = "";
        String first = "";
        String last = "";
        int quizNum = 0;
        String skill = "";
        int points = 0;
        int max = 0;
        try{
            if (search.isEmpty())
            {
                throw new Exception ("Search feild empty");
            }
            else
            {
                try{
                DatabaseConnect.init();
                Connection conn = DatabaseConnect.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet result = stmt.executeQuery("SELECT QUIZ_ATTEMPT.PUPIL_NUMBER,PUPILS.PUPIL_FIRST_NAME,PUPILS.PUPIL_LAST_NAME,QUIZ_ATTEMPT.QUIZ_NUMBER,PUPILS.SKILL_LEVEL,QUIZ_ATTEMPT.PUPIL_POINTS,QUIZ.TOTAL_POINTS FROM PUPILS,QUIZ_ATTEMPT,QUIZ WHERE QUIZ_ATTEMPT.PUPIL_NUMBER=PUPILS.PUPIL_NUMBER AND QUIZ_ATTEMPT.QUIZ_NUMBER=QUIZ.QUIZ_NUMBER AND (PUPILS.PUPIL_NUMBER='"+search+"'OR PUPILS.PUPIL_FIRST_NAME='"+search+"') ORDER BY PUPIL_POINTS DESC");
                DefaultTableModel model  = (DefaultTableModel)tblQuiz.getModel();
                if (result != null)
                {
                    while (model.getRowCount()>0)
                    {
                        model.removeRow(0);
                    }
                    while (result.next())
                    {
                        pupilNum = result.getString("PUPIL_NUMBER");
                        first = result.getString("PUPIL_FIRST_NAME");
                        last = result.getString("PUPIL_LAST_NAME");
                        quizNum = result.getInt("QUIZ_NUMBER");
                        skill = result.getString("SKILL_LEVEL");
                        points = result.getInt("PUPIL_POINTS");
                        max = result.getInt("TOTAL_POINTS");
                        model.addRow(new Object[]{pupilNum,first,last,quizNum,skill,points,max});
                    }
                }
                else
                {
                    lblMessage2.setText("No records have been found");
                }
                stmt.close();
                conn.close();
                result.close();
            }//end try
                catch(Exception ex){
                        System.err.print("SQLException: ");
                        System.err.println(ex.getMessage());
                }//end catch
            }
        }//end try
        catch(Exception e){
            lblMessage2.setText(e.getMessage());
        }
    }//end method

    /**
    * @param args the command line arguments
    */
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizReport().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnTotalPoints;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessage2;
    private javax.swing.JLabel lblPoints;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblWel;
    private javax.swing.JLabel lblWel2;
    private javax.swing.JTable tblQuiz;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}
