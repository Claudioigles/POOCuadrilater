package org.example;
/* Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados. Los valores de la longitud deberán introducirse por línea de ordenes.
 Si es un cuadrado, sólo se proporcionará la longitud de uno de los lados al constructor.*/

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Instancio un objeto de cuadrilatero
        Cuadrilatero c1;
        float lado1,lado2;

        //Pido al usuario que me digite los lados
         lado1= Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1:  "));
        lado2= Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2:  "));


        if(lado1==lado2){//Es un cuadrado
            c1=new Cuadrilatero(lado1);//La inicializo con el siguiente contructor
        }else {
            c1=new Cuadrilatero(lado1,lado2);
        }

        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
    }
}