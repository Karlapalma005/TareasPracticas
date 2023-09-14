/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacuatro;
import java.util.Scanner;

public class PracticaCuatro {

    
    public static void main(String[] args) {
     Scanner lectura = new Scanner( System.in);
System.out.println("Cantidad en pesos: ");
double pesos = lectura.nextDouble ();

System.out.println("cantidad en doloares");
double dolares = pesos/17;
System.out.println("Euros: "); 

double euros = pesos/18;


System.out.println("Tu cantidad de dolares es" + dolares + " euros ");
System.out.println("Tu cantidad de euros es" + euros + " dolares ");
    }
    
    }
    
