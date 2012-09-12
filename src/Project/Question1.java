/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Question1.java
 *
 * Created on 25-Jan-2011, 10:40:50
 */

package Project;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author kk
 */
public class Question1 extends javax.swing.JFrame {

    /** Creates new form Question1 */
    int quizNum = 0;
    String quizlevel = "";
    int questionid = 0;
    String pupilNum = "";
    public Question1(int quizNumber,String quizLevel,String pupil) {
        initComponents();
        quizNum = quizNumber;
        quizlevel = quizLevel;
        pupilNum = pupil;
        lblMethod.setVisible(false);//set the label method to false, this will be set to true  if a pupil answers a question wrong
        /**
         * check which type of skill level the pupil has been set
         * and display a question that is relevent to that skill level
         */
        if (quizlevel.equals("Hard"))
        {
            displayQuestionHard();
        }
        else
        {
            displayQuestionEasy();
        }
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
        lblQuestion = new javax.swing.JLabel();
        lblAnswer = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        lblMethod = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblPoints = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Question 1");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Question 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblQuestion.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblQuestion.setText("Question appears here:");

        lblAnswer.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblAnswer.setText("Type answer here:");

        lblMethod.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblMethod.setText("Method appears here if the question is wrong.");

        btnNext.setText("Next >");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblPoints.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblPoints.setText("Points here");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(lblQuestion)
                            .addGap(104, 104, 104))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblAnswer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMethod))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPoints)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                        .addComponent(btnNext)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblQuestion)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnswer)
                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMethod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(lblPoints))
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

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       /**
        * Check which type of skill level has been set a check an answer
        * that is relevent to that skill level
        */
        if (quizlevel.equals("Hard"))
        {
            checkAnswerHard();
        }
        else
        {
            checkAnswerEasy();
        }
    }//GEN-LAST:event_btnNextActionPerformed
public void displayQuestionHard(){
    //diplay a hard difficulty question
    //set up array list to hold questions
    ArrayList<String>Questions = new ArrayList();
    ArrayList<String>Method = new ArrayList();
    ArrayList<Integer>Points = new ArrayList<Integer>();
      try{
          DatabaseConnect.init();
          Connection conn = DatabaseConnect.getConnection();
          Statement stmt = conn.createStatement();
          ResultSet result = stmt.executeQuery("SELECT QUESTION,QUESTION_METHOD,POINTS FROM QUIZ_QUESTIONS WHERE QUIZ_NUMBER="+quizNum+"AND QUESTION_LEVEL='"+quizlevel+"'");
          while (result.next())
          {
              //add the values to the array lists
              Questions.add(result.getString("QUESTION"));
              Method.add(result.getString("QUESTION_METHOD"));
              Points.add(result.getInt("POINTS"));
          }
          for (int i =0;i<1;i++)
          {
              //display the question and the number of points the question is worth
              lblQuestion.setText(Questions.get(i));
              lblMethod.setText(Method.get(i));//the method will not be displayed because the setVisiable method for this label is set to false
              lblPoints.setText("This question is worth: "+Points.get(i).toString()+" point(s)");
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
public void checkAnswerHard(){
    //this checks for a answer for a hard difficulty setting
    String answer = txtAnswer.getText();
    //set up array list to answers and the number of points the question worth
    ArrayList<String>Answers = new ArrayList();
    ArrayList<Integer>Points = new ArrayList();
    int pointsPupil = 0;//the number of points the pupil has got
    try{
        DatabaseConnect.init();
        Connection conn = DatabaseConnect.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT POINTS,QUESTION_ANSWER FROM QUIZ_QUESTIONS WHERE QUIZ_NUMBER="+quizNum+" AND QUESTION_LEVEL='"+quizlevel+"'");
        while (result.next())
        {
            //add the values to the array list
            Answers.add(result.getString("QUESTION_ANSWER"));
            Points.add(result.getInt("POINTS"));
        }
        for (int i=0;i<1;i++)
        {
            if (answer.equals(Answers.get(i)))
            {
                //check that the answer is correct
                pointsPupil += Points.get(i);//add the points to the pupil
                new Question2(quizNum,quizlevel,pupilNum,pointsPupil).setVisible(true);//move onto next question
                this.dispose();
            }
            else
            {
              lblMethod.setVisible(true);//this displays the method of the question which was set when the question was displayed
            }
        }//end for
        stmt.close();
        conn.close();
        result.close();
    }//end try
    catch(Exception ex){
        System.err.print("SQLException: ");
        System.err.println(ex.getMessage());
    }
}//end method
public void displayQuestionEasy(){
    //display a easy difficulty level question
    ArrayList<String>Questions = new ArrayList();
    ArrayList<String>Method = new ArrayList();
    ArrayList<Integer>Points = new ArrayList<Integer>();
    try{
        DatabaseConnect.init();
        Connection conn = DatabaseConnect.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT QUESTION,QUESTION_METHOD,POINTS FROM QUIZ_QUESTIONS WHERE QUIZ_NUMBER="+quizNum+"AND QUESTION_LEVEL='"+quizlevel+"'");
        while (result.next())
        {
            //add the result to the array list
            Questions.add(result.getString("QUESTION"));
            Method.add(result.getString("QUESTION_METHOD"));
            Points.add(result.getInt("POINTS"));
        }
        for (int i = 0;i<1;i++)
        {
            lblQuestion.setText(Questions.get(i));//display question
            lblMethod.setText(Method.get(i));
            lblPoints.setText("This question is worth: "+Points.get(i).toString()+" point(s)");//display the number of points the question is worth
        }
        stmt.close();
        conn.close();
        result.close();
    }//end try
    catch(Exception ex){
        System.err.print("SQLException: ");
        System.err.println(ex.getMessage());
    }

}//END METHOD
public void checkAnswerEasy(){
    //check the answer for a easy difficulty question
    String answer = txtAnswer.getText();
    ArrayList<String>Answers = new ArrayList();
    ArrayList<Integer>Points = new ArrayList();
    int pointsPupil = 0;
    try{
        DatabaseConnect.init();
        Connection conn = DatabaseConnect.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT POINTS,QUESTION_ANSWER,QUESTION FROM QUIZ_QUESTIONS WHERE QUIZ_NUMBER="+quizNum+" AND QUESTION_LEVEL='"+quizlevel+"'");
        while (result.next())
        {
            Answers.add(result.getString("QUESTION_ANSWER"));
            Points.add(result.getInt("POINTS"));
        }
        if (answer.equals(Answers.get(0)))
        {
            //check that the answer that has been entered is correct
            pointsPupil += Points.get(0);//add the number of points the pupil deserves
            new Question2(quizNum,quizlevel,pupilNum,pointsPupil).setVisible(true);//go to next question
            this.dispose();
        }
        else
        {
            lblMethod.setVisible(true);//display the method on the user interface if they have answered the question wrong
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
    /**
    * @param args the command line arguments
    */
    /**
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question1().setVisible(true);
            }
        });
    }
  */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblMethod;
    private javax.swing.JLabel lblPoints;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JTextField txtAnswer;
    // End of variables declaration//GEN-END:variables

}
