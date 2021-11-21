/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

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
 * @author hyacinth mioten
 */
public class ThesisJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    String filename;
    public ThesisJFrame() {
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

        BGC = new javax.swing.JPanel();
        ImgDisplay = new javax.swing.JLabel();
        Upload = new javax.swing.JButton();
        RunTest = new javax.swing.JButton();
        SaveTest = new javax.swing.JButton();
        Classifications = new javax.swing.JComboBox();
        DisplayFishCount = new javax.swing.JLabel();
        FishCount = new javax.swing.JLabel();
        DisplayEggCount = new javax.swing.JLabel();
        EggCount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        BGC.setBackground(new java.awt.Color(255, 255, 255));
        BGC.setLayout(null);

        ImgDisplay.setBackground(new java.awt.Color(255, 255, 255));
        ImgDisplay.setForeground(new java.awt.Color(255, 255, 255));
        ImgDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImgDisplay.setOpaque(true);
        ImgDisplay.setPreferredSize(new java.awt.Dimension(1131, 754));
        BGC.add(ImgDisplay);
        ImgDisplay.setBounds(60, 150, 1123, 754);

        Upload.setBackground(new java.awt.Color(255, 255, 255));
        Upload.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Upload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Upload Button.png"))); // NOI18N
        Upload.setContentAreaFilled(false);
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });
        BGC.add(Upload);
        Upload.setBounds(50, 920, 340, 90);

        RunTest.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RunTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Run Test Button.png"))); // NOI18N
        RunTest.setBorderPainted(false);
        RunTest.setContentAreaFilled(false);
        RunTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunTestActionPerformed(evt);
            }
        });
        BGC.add(RunTest);
        RunTest.setBounds(450, 920, 340, 90);

        SaveTest.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SaveTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Save Test Button.png"))); // NOI18N
        SaveTest.setBorderPainted(false);
        SaveTest.setContentAreaFilled(false);
        BGC.add(SaveTest);
        SaveTest.setBounds(850, 920, 340, 90);

        Classifications.setBackground(new java.awt.Color(0, 41, 64));
        Classifications.setEditable(true);
        Classifications.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Classifications.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fish eggs", "Fish fries" }));
        Classifications.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Classifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassificationsActionPerformed(evt);
            }
        });
        BGC.add(Classifications);
        Classifications.setBounds(1220, 150, 636, 86);

        DisplayFishCount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        DisplayFishCount.setText("Total fish count:");
        BGC.add(DisplayFishCount);
        DisplayFishCount.setBounds(1225, 328, 342, 61);

        FishCount.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        FishCount.setText("0000");
        BGC.add(FishCount);
        FishCount.setBounds(1530, 398, 104, 64);

        DisplayEggCount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        DisplayEggCount.setText("Total egg count:");
        BGC.add(DisplayEggCount);
        DisplayEggCount.setBounds(1225, 502, 174, 32);

        EggCount.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        EggCount.setText("0000");
        BGC.add(EggCount);
        EggCount.setBounds(1530, 660, 104, 64);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Short instruction how to run test. One or two sentence(s).");
        BGC.add(jLabel2);
        jLabel2.setBounds(60, 110, 611, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Select image classification:");
        BGC.add(jLabel3);
        jLabel3.setBounds(1220, 110, 290, 32);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/I_Design.png"))); // NOI18N
        BG.setPreferredSize(new java.awt.Dimension(1980, 1020));
        BG.setVerifyInputWhenFocusTarget(false);
        BGC.add(BG);
        BG.setBounds(0, -70, 1980, 1020);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RunTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunTestActionPerformed
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

        int contourCount = 0;

        for (int i = 0; i < contours.size(); i++) {
            Scalar color = new Scalar(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256));
            Imgproc.drawContours(drawing, contours, i, color, 1, Imgproc.LINE_8, hierarchy, 0, new Point());
            contourCount++;
        }
        System.out.println(contourCount);
        FishCount.setText(String.valueOf(contourCount));
        ImgDisplay.setIcon(new ImageIcon(HighGui.toBufferedImage(drawing)));              
    }//GEN-LAST:event_RunTestActionPerformed

    private void ClassificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassificationsActionPerformed
//        jComboBox comboBox = new jComboBox();
//        comboBox.addItem("fish eggs");
//        comboBox.addItem("fish fries");
//        comboBox.setSelectedItem(null);
    }//GEN-LAST:event_ClassificationsActionPerformed

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(ImgDisplay.getWidth(), ImgDisplay.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);
        ImgDisplay.setIcon(icon);
    }//GEN-LAST:event_UploadActionPerformed

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
            java.util.logging.Logger.getLogger(ThesisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThesisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThesisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThesisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThesisJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JPanel BGC;
    private javax.swing.JComboBox Classifications;
    private javax.swing.JLabel DisplayEggCount;
    private javax.swing.JLabel DisplayFishCount;
    private javax.swing.JLabel EggCount;
    private javax.swing.JLabel FishCount;
    private javax.swing.JLabel ImgDisplay;
    private javax.swing.JButton RunTest;
    private javax.swing.JButton SaveTest;
    private javax.swing.JButton Upload;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}