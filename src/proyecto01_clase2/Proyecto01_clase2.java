/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto01_clase2;

import java.util.Scanner;
public class Proyecto01_clase2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,suma;
        Scanner lectura=new Scanner(System.in);
        //entrada
        System.out.println("Ingresar número 1: ");
        n1=lectura.nextInt();
        System.out.println("Ingresar número 2: ");
        n2=lectura.nextInt();
        //proceso
        suma=n1+n2;
        //salida
        System.out.println("La suma de los números es: "+suma);
    }
}
