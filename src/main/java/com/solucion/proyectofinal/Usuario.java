/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solucion.proyectofinal;

/**
 *
 * @author Sebastian
 */
public class Usuario
{
     public int edad;
     public String nombre;

    public Usuario() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "edad=" + this.edad + ", nombre=" + this.nombre + '}';
    }
    
    
     
     public static void main(String[ ] arg){
         Usuario urs = new Usuario();
         
         System.out.println("sin modificar datos"+ urs);
         urs.setEdad(40);
         urs.setNombre("Sebastian");
         System.out.println("Con datos"+ urs);
         
         
         System.out.println("Edad: "+ urs.getEdad());
         System.out.println("Nombre: "+ urs.getNombre());
         
         Usuario urs2 = new Usuario();
         urs2.setEdad(23);
         urs2.setNombre("Marjhorick");
         
         System.out.println("urs2"+ urs2.toString());
         
         
         
         
         
         
         
         
     }
}

