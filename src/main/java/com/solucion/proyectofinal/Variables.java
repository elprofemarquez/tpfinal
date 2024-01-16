/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solucion.proyectofinal;

/**
 *
 * @author Sebastian
 */
public class Variables {

    public void getRta() {//procedimiento
        
        int importe;
        String profesor;
        boolean funciona;
        float diametro;
        short peso;
        long masa;
        char letra;
        
        
        importe=34;
        profesor="Oscar Marquez";
        funciona=false;//true/**/
        peso=70;
        masa=3238949834L;
        letra='a';
        
        System.out.println("importe "+importe);
        System.out.println("Profesor "+profesor);
        System.out.println("funciona "+funciona);
        System.out.println("peso "+peso);
        System.out.println("masa "+masa);
        System.out.println("letra "+letra);
        
        
    }

    public static void main(String[ ] arg)
        {
            Variables v = new Variables();//
            v.getRta();
            //Nombre de la clase nombre del objeto = new Nombre del contructor
        }
   

}
