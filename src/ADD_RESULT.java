
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.beans.binding.Bindings.and;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import oracle.net.aso.l;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drimik
 */
public class ADD_RESULT extends javax.swing.JFrame {
    Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    /**
     * Creates new form ADD_RESULT
     */
    public ADD_RESULT() {
        initComponents();
       
          conn=JavaConnectDb.connectrDb();
    }
    public String calcString (String value)
    {
          grade = null;
         try {
    float s3=Float.parseFloat(value);
   
    if(s3>=80&&s3<=100)
    {
        grade="A+";
        return  grade;
     
        
    }
    else if(s3>=75&&s3<80)
    {
        grade="A";
        return grade;
   
    }
      else if(s3>=70&&s3<75)
    {
        
        grade="A-";
        return grade;
    
    }
    else if(s3>=65&&s3<70)
    {
        grade="B+";
        return grade;
   
    }
   
  
    else if(s3>=60&&s3<65)
    {
        grade="B";
        return grade;
       
    }
      else if(s3>=55&&s3<60)
    {
        grade="B-";
        return grade;
     
    }
      else if(s3>=50&&s3<55)
    {
        grade="C+";
        return grade;
    
    }
         else if(s3>=45&&s3<50)
    {
        grade="C";
        return grade;
  
    }
              else if(s3>=40&&s3<45)
    {
        grade="C";
        return grade;
      
    }
    
     else if(s3<40 && s3>=0)
    {
        grade="F";
        return grade;
      
    }
       else if(s3<0)
    {
        jTex_number_1.setText("");
        JOptionPane.showMessageDialog(null,"Invalid Input number must be in 0 to 100");
      
    }
    else if(s3>100)
    {
        jTex_number_1.setText("");
        JOptionPane.showMessageDialog(null,"Invalid Input number must be in 0 to 100");
      
    }
    
    
           
    
        } catch (Exception e) {
        } 
       
        return grade;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel_SID = new javax.swing.JLabel();
        jTex_sid = new javax.swing.JTextField();
        jt_cname_1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTex_number_1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTex_grade_1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButtonR_1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_course = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_year = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton_SEARCJ = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_SID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_SID.setText("S_ID");
        getContentPane().add(jLabel_SID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 30));

        jTex_sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTex_sidActionPerformed(evt);
            }
        });
        getContentPane().add(jTex_sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 170, 30));

        jt_cname_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jt_cname_1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jt_cname_1CaretUpdate(evt);
            }
        });
        jt_cname_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_cname_1ActionPerformed(evt);
            }
        });
        jt_cname_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_cname_1KeyReleased(evt);
            }
        });
        getContentPane().add(jt_cname_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Course Code");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, 30));

        jTex_number_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTex_number_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTex_number_1ActionPerformed(evt);
            }
        });
        jTex_number_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTex_number_1KeyReleased(evt);
            }
        });
        getContentPane().add(jTex_number_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Number");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 120, 35));

        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel14.setText("Semester");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 110, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fall", "Summer", "Spring" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 110, 30));

        jTex_grade_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTex_grade_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTex_grade_1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTex_grade_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 140, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("GRADE");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 120, -1));

        jButtonR_1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButtonR_1.setForeground(new java.awt.Color(255, 0, 51));
        jButtonR_1.setText("SAVE");
        jButtonR_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonR_1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonR_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 100, 40));

        jTable_course.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 24), new java.awt.Color(102, 255, 51))); // NOI18N
        jTable_course.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTable_course.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_course.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_courseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_course);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 460, 220));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setText("Year");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 50, 30));

        jComboBox_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jComboBox_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_yearActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 70, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 3), "Add Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Emoji", 1, 24), new java.awt.Color(255, 51, 51))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 370, 280));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51), 6), "FIll First", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 102, 255))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 120));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 110, 40));

        jButton_SEARCJ.setText("SEARCH");
        jButton_SEARCJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCJActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_SEARCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 80, 40));

        setSize(new java.awt.Dimension(882, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTex_number_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTex_number_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTex_number_1ActionPerformed

    private void jTex_grade_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTex_grade_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTex_grade_1ActionPerformed

    private void jTex_sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTex_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTex_sidActionPerformed

    private void jTex_number_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTex_number_1KeyReleased
 String ret1=jTex_number_1.getText();
        calcString(ret1);
        jTex_grade_1.setText(grade);
    }//GEN-LAST:event_jTex_number_1KeyReleased

    
    private void jt_cname_1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jt_cname_1CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_cname_1CaretUpdate

    private void jt_cname_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_cname_1KeyReleased
        // TODO add your handling code here:
                String sql2 = "select CREDIT from COURSE_LIST where COURSECODE=?";
             try {
            pst=(OraclePreparedStatement) conn.prepareStatement(sql2);
              pst.setString(1, jt_cname_1.getText());
               rs=(OracleResultSet) pst.executeQuery();
               while(rs.next())
               {
                      
               String add1=rs.getString("CREDIT");
              
                c1= Float.parseFloat(add1);
               
                  
               }
               
              
        } catch (SQLException ex) {
            Logger.getLogger(ADD_RESULT.class.getName()).log(Level.SEVERE, null, ex);
        }
             finally{
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
    }//GEN-LAST:event_jt_cname_1KeyReleased

    private void jt_cname_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_cname_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_cname_1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
     
     
 // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButtonR_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonR_1ActionPerformed
int p= JOptionPane.showConfirmDialog(null,"Do You Really Want to Add this Course ?","ADD",JOptionPane.YES_NO_OPTION);
if (p==0)
{
        try{
            String got1=jt_cname_1.getText();
            String got3=jComboBox_year.getSelectedItem().toString();
            String got2=jComboBox2.getSelectedItem().toString();
            String got4=jTex_sid.getText();
            String sql2="select COURSE_CODE from course  where  course.course_code='"+got1+"' and course.SEMESTER='"+got2+"' and course.YEAR='"+got3+"' and course.STUDENT_ID='"+got4+"'  ";
           pst = (OraclePreparedStatement) conn.prepareStatement(sql2);
            rs = (OracleResultSet) pst.executeQuery();
           
           if(rs.next())
           {
               
                 try {
              pst = (OraclePreparedStatement) conn.prepareStatement(sql);
              pst.setString(1,jTex_sid.getText());
              pst.setString(2,jt_cname_1.getText());
              pst.setString(3,jTex_number_1.getText());
              pst.setString(4,jTex_grade_1.getText());
               pst.setString(5,jComboBox2.getSelectedItem().toString());
                pst.setString(6,jComboBox_year.getSelectedItem().toString());
                   
               } catch (Exception e) {
               }
    
             
                 try {
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Result Inserted Seccessfully");
          
     } 
                 catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
     }
           }
           else 
           {
               JOptionPane.showMessageDialog(null," '"+got1+"' Course not vailable for this '"+got2+"' semester for ID '"+got4+"'");
           }
        
    
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null,"check the constraint ID must be DIGIT  ");
            
        }  
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonR_1ActionPerformed

    private void jTable_courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_courseMouseClicked
    int i=jTable_course.getSelectedRow();
     
         String Table_click= (jTable_course.getModel().getValueAt(i,0).toString());
        TableModel model=jTable_course.getModel();
        jt_cname_1.setText(model.getValueAt(i,1).toString());
        String s1=model.getValueAt(i,1).toString();
             // TODO add your handling code here:
             
    
    
        
    }//GEN-LAST:event_jTable_courseMouseClicked

    private void jComboBox_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_yearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     student_main_form st1=new student_main_form();
        st1.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_SEARCJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCJActionPerformed
          try {
            //String sql="SELECT STUDENT_ID,COURSE_CODE,SEMESTER,TYPE,CREDIT FROM COURSE WHERE STUDENT_ID=? and SEMESTER =?";
            String got1=jTex_sid.getText();
           String got2=jComboBox2.getSelectedItem().toString();
           String got3=jComboBox_year.getSelectedItem().toString();
             String sql="select SEMESTER,COURSE_CODE from course where STUDENT_ID ='"+got1+"'and SEMESTER='"+got2+"' and YEAR='"+got3+"'";
             //String sql3="SELECT SEMESTER,COURSE_CODE,TYPE FROM COURSE UNION SELECT GRADE,SEMESTER FROM table2";
             
            pst=(OraclePreparedStatement) conn.prepareStatement(sql);
            
            rs=(OracleResultSet) pst.executeQuery();
             jTable_course.setModel(DbUtils.resultSetToTableModel(rs));
            /*if(rs.isClosed())
            {
          
                       jTable_course.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No Course Assigned ");
              
         DefaultTableModel tMOdel = (DefaultTableModel) jTable_course.getModel();
tMOdel.setRowCount(0);
          
            }
             */
            
        } catch (Exception e) {
        } 

    }//GEN-LAST:event_jButton_SEARCJActionPerformed

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
            java.util.logging.Logger.getLogger(ADD_RESULT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD_RESULT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD_RESULT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD_RESULT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADD_RESULT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonR_1;
    private javax.swing.JButton jButton_SEARCJ;
    public static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_SID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_course;
    private javax.swing.JTextField jTex_grade_1;
    private javax.swing.JTextField jTex_number_1;
    public static javax.swing.JTextField jTex_sid;
    private javax.swing.JTextField jt_cname_1;
    // End of variables declaration//GEN-END:variables
 float c1;
 float c2;
 float c3;
 float c4;
 float cgpa;
 String cgpa_count;
   String sql = "INSERT INTO RESULT_TABLE "
                    +"(STUDENT_ID,Course_CODE,MARKS,GRADE,SEMESTER,YEAR)"
                    +"VALUES (?,?,?,?,?,?)";
 
 String grade=null;
}
