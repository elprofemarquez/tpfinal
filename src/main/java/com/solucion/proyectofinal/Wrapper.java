/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solucion.proyectofinal;

/**
 *
 * @author Sebastian
 */
public class Wrapper {

    public Wrapper() {
        //Declaración
        Integer entero = Integer.valueOf(10);
        System.out.println(entero.getClass());
        Double decimal = Double.valueOf(3.14);
        System.out.println(decimal.getClass());
        Boolean buleano = Boolean.valueOf("true");
        System.out.println(buleano);

    }
    
    public static void main(String arg[] )
    {
        Wrapper w=new Wrapper();
    }
    
}
