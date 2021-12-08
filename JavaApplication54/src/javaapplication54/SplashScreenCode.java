/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication54;

/**
 *
 * @author hyacinth mioten
 */
public class SplashScreenCode {
    public static void main(String[] args) {
        SplashScreen screen = new SplashScreen();
        screen.setVisible(true);
        SignInFrame SignIn = new SignInFrame();
            try {
                for (int i=0; i<=100; i++) {
                    Thread.sleep(40);
                    screen.ProgressBar.setValue(i);
                    screen.Percentage.setText(Integer.toString(i)+"%");
                
                if (i==100) {
                    screen.setVisible(false);
                    SignIn.setVisible(true);
                }
            }
        }
        catch (Exception e) {}
        
        new SplashScreen().setVisible(false);
        //n.setVisible(true);
        screen.dispose();
    }
}
