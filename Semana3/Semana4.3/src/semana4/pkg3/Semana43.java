/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana4.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Semana43 {

    /**
     * @param args the command line arguments
     */
    public static void Menu(int Option){
        switch (Option) {
            case 1:
                EJ1();
                break;
            case 2:
                EJ2();
                break;
            case 3:
                EJ3();
                break;
            default:
                throw new AssertionError();
        }
    }
    public static void EJ1(){
        for(int x = 0; x <= 5; x++){
            System.out.println(""
                    + "");
        }
    }
    public static void EJ2(){
        String Num = JOptionPane.showInputDialog("Numero a multiplicar: ");
        for(int x = 1; x <= 10; x++){
            System.out.println(Num + " * " + x + " = " + (Integer.parseInt(Num) * x));
        }
    }
    public static void EJ3(){
        String Num = JOptionPane.showInputDialog("Seleccione un numero: ");
        for(int x = 0; x < Integer.parseInt(Num); x++){
            for(int y = 0; y <= x; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String Option = JOptionPane.showInputDialog("Ejercicio a ejecutar: ");
        Menu(Integer.parseInt(Option));
 
    }
    
}
