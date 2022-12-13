/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author fra
 */
public class JustCreate {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
        // TODO code application logic here
        int iterations = 0;
        while (true) {
            Object o = new Object();
            o = null;
            iterations++;
            if ((iterations % 1000) == 0) {
                System.out.println(iterations);
                try {Thread.sleep(1);}
                catch (InterruptedException e) {
                    System.out.println("error");                  
                }
            }
        }
    }
}
