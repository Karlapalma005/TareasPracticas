/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaultima;
import java.util.Scanner;

public class PracticaUltima {

    public static void main(String[] args) {
    Scanner lectura = new Scanner( System.in);
System.out.println("Dime tu edad: ");
int edad = lectura.nextInt ();
lectura.nextLine();
System.out.println("Dime tu nombre");
String nombre = lectura.nextLine();
lectura.close ();
System.out.println("Hola " + nombre + " tu edad es " + edad);
    }
    
}
