/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TeachersMainMenu.java
 *
 * Created on 26-Dec-2010, 17:29:36
 */

package Project;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kk
 */
public class TeachersMainMenu extends javax.swing.JFrame {

    /** Creates new form TeachersMainMenu */
    public TeachersMainMenu() {
        initComponents();
        //set current date and time
        Date toDay = new java.util.Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEE,dd MMMM yyyy HH:mm:ss");
        String formattedDate = formatter.format(toDay);
        lblDate.setText("Today's Date and Time: "+formattedDate);
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
        jLabel1 = new javax.swing.JLabel();
        btnPupilDiary = new javax.swing.JButton();
        btnQuizReport = new javax.swing.JButton();
        btnClass = new javax.swing.JButton();
        btnHomework = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teacher's Hub");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teacher's Hub Main Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Select which area of the Teacher's Hub you will like to enter.");

        btnPupilDiary.setText("Pupil Diary");
        btnPupilDiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPupilDiaryActionPerformed(evt);
            }
        });

        btnQuizReport.setText("Quiz Report");
        btnQuizReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizReportActionPerformed(evt);
            }
        });

        btnClass.setText("Class Work Record");
        btnClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassActionPerformed(evt);
            }
        });

        btnHomework.setText("Homework Record");
        btnHomework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeworkActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDate.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPupilDiary)
                            .addComponent(btnClass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHomework)
                            .addComponent(btnQuizReport)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClass, btnHomework, btnPupilDiary, btnQuizReport});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuizReport)
                    .addComponent(btnPupilDiary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClass)
                    .addComponent(btnHomework))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblDate)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void btnPupilDiaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPupilDiaryActionPerformed
        new EnterPasswordPupilDiary().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPupilDiaryActionPerformed

    private void btnClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassActionPerformed
        new InsertCW().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClassActionPerformed

    private void btnQuizReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizReportActionPerformed
        this.dispose();
        new QuizReport().setVisible(true);
    }//GEN-LAST:event_btnQuizReportActionPerformed

    private void btnHomeworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeworkActionPerformed
        this.dispose();
        new InsertHW().setVisible(true);
    }//GEN-LAST:event_btnHomeworkActionPerformed

    /**
    * @param args the command line arguments
    */
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachersMainMenu().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClass;
    private javax.swing.JButton btnHomework;
    private javax.swing.JButton btnPupilDiary;
    private javax.swing.JButton btnQuizReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    // End of variables declaration//GEN-END:variables

}
