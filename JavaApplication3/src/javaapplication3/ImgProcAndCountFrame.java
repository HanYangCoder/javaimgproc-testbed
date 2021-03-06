/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;
import org.opencv.core.MatOfByte;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author hansherrera
 */
public class ImgProcAndCountFrame extends javax.swing.JFrame {

    String filename;
    /**
     * Creates new form ImgProcAndCountFrame
     */
    public ImgProcAndCountFrame() {
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

        ImgDisplay = new javax.swing.JLabel();
        RunTestButton = new javax.swing.JButton();
        UploadImgButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        TotalCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));

        ImgDisplay.setBackground(new java.awt.Color(254, 254, 254));
        ImgDisplay.setText("jLabel1");

        RunTestButton.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 16)); // NOI18N
        RunTestButton.setText("Run Test");
        RunTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunTestButtonActionPerformed(evt);
            }
        });

        UploadImgButton.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 16)); // NOI18N
        UploadImgButton.setText("Upload Image");
        UploadImgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadImgButtonActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fish Eggs", "Fish Fries" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 16)); // NOI18N
        jLabel1.setText("Total Count");

        TotalCount.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 16)); // NOI18N
        TotalCount.setText("---000---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImgDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 164, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(TotalCount))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(UploadImgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(RunTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ImgDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(TotalCount)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UploadImgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RunTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadImgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadImgButtonActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(ImgDisplay.getHeight(), ImgDisplay.getWidth(), Image.SCALE_SMOOTH);
        ImgDisplay.setIcon(icon);
    }//GEN-LAST:event_UploadImgButtonActionPerformed

    private void RunTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunTestButtonActionPerformed
        
        int threshold = 100;
        Random rng = new Random(12345);
        
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat srcGray = new Mat();
        Mat src = Imgcodecs.imread(filename);

        Imgproc.cvtColor(src, srcGray, Imgproc.COLOR_BGR2GRAY);
        Imgproc.blur(srcGray, srcGray, new Size(3, 3));

        Mat cannyOutput = new Mat();
        Imgproc.Canny(srcGray, cannyOutput, threshold, threshold * 2);
        List<MatOfPoint> contours = new ArrayList<>();
        Mat hierarchy = new Mat();
        Imgproc.findContours(cannyOutput, contours, hierarchy, Imgproc.RETR_TREE, Imgproc.CHAIN_APPROX_SIMPLE);
        Mat drawing = Mat.zeros(cannyOutput.size(), CvType.CV_8UC3);
        
        // this line counts the closed contours present 
        // after Canny edge was applied
        int contourCount = 0;

        for (int i = 0; i < contours.size(); i++) {
            Scalar color = new Scalar(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256));
            Imgproc.drawContours(drawing, contours, i, color, 1, Imgproc.LINE_8, hierarchy, 0, new Point());
            contourCount++;
        }
        System.out.println(contourCount);
        TotalCount.setText(String.valueOf(contourCount));
        ImgDisplay.setIcon(new ImageIcon(HighGui.toBufferedImage(drawing)));
    }//GEN-LAST:event_RunTestButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ImgProcAndCountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImgProcAndCountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImgProcAndCountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImgProcAndCountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImgProcAndCountFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgDisplay;
    private javax.swing.JButton RunTestButton;
    private javax.swing.JLabel TotalCount;
    private javax.swing.JButton UploadImgButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
