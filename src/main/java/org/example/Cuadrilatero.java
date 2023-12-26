package org.example;

public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;

    //Metodo constructor1(cuando sea cuadrilatero)
    public Cuadrilatero(float __lado1,float __lado2){
        lado1=__lado1;
        lado2=__lado2;
    }

    //Metodo constructor2(cuando es un cuadrado)
    public Cuadrilatero(float __lado1){
        lado1=lado2=__lado1;//Como es un cuadrilatero tiene todos sus lados iguales


    }

    //Genero los Getter y Setters
    public float getPerimetro(){
        float perimetro=2*(lado1+lado2);
        return perimetro;

    }

    public float getArea(){
        float area =(lado1*lado2);
        return area;
    }

}
