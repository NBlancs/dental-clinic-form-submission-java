/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.openjfx.dental.clinic.form.submission.java.application;

/**
 *
 * @author User
 */
public class patient_dashboard_frm extends javax.swing.JFrame {

    /**
     * Creates new form patient_dashboard_frm
     */
    public patient_dashboard_frm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutbtn = new javax.swing.JButton();
        fillupbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 832));
        setMinimumSize(new java.awt.Dimension(1280, 832));
        setResizable(false);
        getContentPane().setLayout(null);

        aboutbtn.setBackground(new java.awt.Color(75, 148, 242));
        aboutbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        aboutbtn.setForeground(new java.awt.Color(255, 255, 255));
        aboutbtn.setText("About");
        aboutbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        aboutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(aboutbtn);
        aboutbtn.setBounds(22, 162, 182, 46);

        fillupbtn.setBackground(new java.awt.Color(75, 148, 242));
        fillupbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fillupbtn.setForeground(new java.awt.Color(255, 255, 255));
        fillupbtn.setText("Fill Up Form");
        fillupbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fillupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillupbtnActionPerformed(evt);
            }
        });
        getContentPane().add(fillupbtn);
        fillupbtn.setBounds(22, 243, 182, 46);

        logoutbtn.setBackground(new java.awt.Color(75, 148, 242));
        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("Logout");
        logoutbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn);
        logoutbtn.setBounds(36, 670, 155, 46);

        bg.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/User/Documents/NetBeansProjects/dental-clinic-form-submission-java-application/src/dentalclinic-bg-frms/patient-dashboard-frm.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1280, 832);
        getContentPane().add(jScrollBar1);
        jScrollBar1.setBounds(200, 550, 10, 48);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aboutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbtnActionPerformed
        // TODO add your handling code here:
        patient_dashboard_frm patientDashboard = new patient_dashboard_frm();
        patientDashboard.show();
        dispose();
    }//GEN-LAST:event_aboutbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        login_frm_patient patientLogin = new login_frm_patient();
        patientLogin.show();
        dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void fillupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillupbtnActionPerformed
        // TODO add your handling code here:
        patient_fillup_form_frm patientFill = new patient_fillup_form_frm();
        patientFill.show();
        dispose();
    }//GEN-LAST:event_fillupbtnActionPerformed

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
            java.util.logging.Logger.getLogger(patient_dashboard_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient_dashboard_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient_dashboard_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient_dashboard_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient_dashboard_frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutbtn;
    private javax.swing.JLabel bg;
    private javax.swing.JButton fillupbtn;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JButton logoutbtn;
    // End of variables declaration//GEN-END:variables
}
