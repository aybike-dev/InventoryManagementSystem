
package ınventorycontrolsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Aybike
 */
public class new_password extends javax.swing.JFrame {

    public new_password() {
        
        super("Forgot Password Form");
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_email = new javax.swing.JTextField();
        btn_exit3 = new javax.swing.JButton();
        lbl_email = new javax.swing.JLabel();
        btn_showPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_exit3.setText("EXIT");
        btn_exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit3ActionPerformed(evt);
            }
        });

        lbl_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_email.setText("e-mail address:");

        btn_showPassword.setText("Show Password");
        btn_showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exit3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_showPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_exit3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_showPassword)
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit3ActionPerformed

        reports close = new reports();
        close.setVisible(false);
        dispose();
    }//GEN-LAST:event_btn_exit3ActionPerformed

    private void btn_showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showPasswordActionPerformed

        String email=txt_email.getText();

        try {

            

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=Inventory;user=sa;password=12345";
                Connection con = DriverManager.getConnection(url);
                Statement st = con.createStatement();
                
                
                
                ResultSet rs = st.executeQuery("select * from Users where email='"+email+"'");

                if(rs.next()){

                    JOptionPane.showMessageDialog(null, "Your Password: " + rs.getString("password"));

                }
                else{
                    JOptionPane.showMessageDialog(null, "This Email is not registered!");
                }
            

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Could not connect the database! " + ex.toString());
        }

    }//GEN-LAST:event_btn_showPasswordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit3;
    private javax.swing.JButton btn_showPassword;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
