/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author hyacinth mioten
 */
public class SignInFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignInFrame
     */
    public SignInFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignInPanel = new javax.swing.JPanel();
        SignIn_UNTextField = new javax.swing.JTextField();
        SignIn_UNLabel = new javax.swing.JLabel();
        SignIn_PassField = new javax.swing.JPasswordField();
        SignIn_PassLabel = new javax.swing.JLabel();
        SignIn_SignInButton = new javax.swing.JButton();
        SignIn_ForgotPass = new javax.swing.JButton();
        SignIn_SignUpOpt = new javax.swing.JButton();
        SignIn_FreshCount = new javax.swing.JLabel();
        SignIn_Description = new javax.swing.JLabel();
        SignIn_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        SignInPanel.setMaximumSize(new java.awt.Dimension(1920, 1080));
        SignInPanel.setMinimumSize(new java.awt.Dimension(1920, 1080));
        SignInPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        SignInPanel.setLayout(null);

        SignIn_UNTextField.setBackground(new java.awt.Color(242, 244, 248));
        SignIn_UNTextField.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        SignIn_UNTextField.setForeground(new java.awt.Color(204, 204, 204));
        SignIn_UNTextField.setText("Username");
        SignIn_UNTextField.setBorder(null);
        SignIn_UNTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        SignIn_UNTextField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        SignIn_UNTextField.setName(""); // NOI18N
        SignIn_UNTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SignIn_UNTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SignIn_UNTextFieldFocusLost(evt);
            }
        });
        SignIn_UNTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SignIn_UNTextFieldKeyTyped(evt);
            }
        });
        SignInPanel.add(SignIn_UNTextField);
        SignIn_UNTextField.setBounds(190, 230, 510, 80);

        SignIn_UNLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Name.png"))); // NOI18N
        SignInPanel.add(SignIn_UNLabel);
        SignIn_UNLabel.setBounds(170, 220, 610, 120);

        SignIn_PassField.setBackground(new java.awt.Color(242, 244, 248));
        SignIn_PassField.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        SignIn_PassField.setForeground(new java.awt.Color(204, 204, 204));
        SignIn_PassField.setText("Password");
        SignIn_PassField.setToolTipText(" ");
        SignIn_PassField.setBorder(null);
        SignIn_PassField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        SignIn_PassField.setEchoChar('\u0000');
        SignIn_PassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SignIn_PassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SignIn_PassFieldFocusLost(evt);
            }
        });
        SignInPanel.add(SignIn_PassField);
        SignIn_PassField.setBounds(190, 415, 510, 80);

        SignIn_PassLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Password.png"))); // NOI18N
        SignInPanel.add(SignIn_PassLabel);
        SignIn_PassLabel.setBounds(170, 410, 610, 110);

        SignIn_SignInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Sign In Button.png"))); // NOI18N
        SignIn_SignInButton.setContentAreaFilled(false);
        SignIn_SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIn_SignInButtonActionPerformed(evt);
            }
        });
        SignInPanel.add(SignIn_SignInButton);
        SignIn_SignInButton.setBounds(160, 620, 640, 120);

        SignIn_ForgotPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Forgot Password.png"))); // NOI18N
        SignIn_ForgotPass.setContentAreaFilled(false);
        SignInPanel.add(SignIn_ForgotPass);
        SignIn_ForgotPass.setBounds(390, 740, 160, 35);

        SignIn_SignUpOpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Sign Up Option.png"))); // NOI18N
        SignIn_SignUpOpt.setContentAreaFilled(false);
        SignIn_SignUpOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIn_SignUpOptActionPerformed(evt);
            }
        });
        SignInPanel.add(SignIn_SignUpOpt);
        SignIn_SignUpOpt.setBounds(330, 950, 290, 40);

        SignIn_FreshCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignIn_FreshCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Fresh Count.png"))); // NOI18N
        SignInPanel.add(SignIn_FreshCount);
        SignIn_FreshCount.setBounds(1021, 366, 678, 133);

        SignIn_Description.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Description.png"))); // NOI18N
        SignInPanel.add(SignIn_Description);
        SignIn_Description.setBounds(960, 560, 782, 80);

        SignIn_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Background.jpg"))); // NOI18N
        SignInPanel.add(SignIn_BG);
        SignIn_BG.setBounds(0, -240, 1970, 1370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignIn_SignUpOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIn_SignUpOptActionPerformed
        new SignUpFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SignIn_SignUpOptActionPerformed

    private void SignIn_UNTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SignIn_UNTextFieldKeyTyped

    }//GEN-LAST:event_SignIn_UNTextFieldKeyTyped

    private void SignIn_UNTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SignIn_UNTextFieldFocusGained
        if (SignIn_UNTextField.getText().equals("Username")) {
            SignIn_UNTextField.setText("");
            SignIn_UNTextField.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_SignIn_UNTextFieldFocusGained

    private void SignIn_UNTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SignIn_UNTextFieldFocusLost
        if (SignIn_UNTextField.getText().equals("")) {
            SignIn_UNTextField.setText("Username");
            SignIn_UNTextField.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_SignIn_UNTextFieldFocusLost

    private void SignIn_PassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SignIn_PassFieldFocusGained
        if (SignIn_PassField.getText().equals("Password")) {
            SignIn_PassField.setText(null);
            SignIn_PassField.setEchoChar('*');
        }
    }//GEN-LAST:event_SignIn_PassFieldFocusGained

    private void SignIn_PassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SignIn_PassFieldFocusLost
        if (SignIn_PassField.getText().equals("")) {
            SignIn_PassField.setText("Password");
            SignIn_PassField.setEchoChar('\u0000');
            SignIn_PassField.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_SignIn_PassFieldFocusLost

    private void SignIn_SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIn_SignInButtonActionPerformed
        new ThesisJFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SignIn_SignInButtonActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(SignInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SignInPanel;
    private javax.swing.JLabel SignIn_BG;
    private javax.swing.JLabel SignIn_Description;
    private javax.swing.JButton SignIn_ForgotPass;
    private javax.swing.JLabel SignIn_FreshCount;
    private javax.swing.JPasswordField SignIn_PassField;
    private javax.swing.JLabel SignIn_PassLabel;
    private javax.swing.JButton SignIn_SignInButton;
    private javax.swing.JButton SignIn_SignUpOpt;
    private javax.swing.JLabel SignIn_UNLabel;
    private javax.swing.JTextField SignIn_UNTextField;
    // End of variables declaration//GEN-END:variables
}