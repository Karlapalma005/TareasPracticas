/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arearectangulo;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class AreaRectangulo {

    
    public static void main(String[] args) {
        Scanner LecturaDatos = new Scanner(System.in);
        System.out.println("Ingrese el lado");
        int lado = LecturaDatos.nextInt();
        
        int area = lado*lado;
        
        System.out.println("El area de un rectangulo es " + area);
        
        LecturaDatos.close();
    }
    
}
