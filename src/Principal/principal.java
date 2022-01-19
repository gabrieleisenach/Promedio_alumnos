/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author gaboh
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner capturaPantalla=new Scanner(System.in);
        System.out.println("Escriba el nombre del alumno");

        String n_alumno=capturaPantalla.nextLine();
       
        //String n_alumno="Gabriel";
        double n1=6;
        double n2=6;
        double n3=6;
        double n4=6;
        double n5=6;    

        double suma=n1+n2+n3+n4+n5;

        double resultado=suma/5;

        System.out.println("Alumno: "+n_alumno);    
        System.out.println("Resultado: "+resultado);
    }
    
}
