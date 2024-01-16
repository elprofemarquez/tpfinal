/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solucion.proyectofinal;



/**
 *
 * @author Sebastian
 */
public class Constructor {
    public static void main(String[ ] arg)
        {
            Fecha fechita = new Fecha(6,11,1999);
            Fecha f3 = new Fecha();
            
            
            Object obj = new Object();
            obj=fechita;
            System.out.println(obj);
            
        }

}

class Fecha// clase
{

    public int dia; // atributos
    public int mes;
    public int anho;

    public Fecha() {
    }

 

    public Fecha(int dia) {
        this.dia = dia;
    }

    public Fecha(int dia, int mes, int anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

   
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + this.dia + ", mes=" + this.mes + ", anho=" + this.anho + '}';
    }

    
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }
    
    public void setAnho(String anho) {//este metodo edita un año recibiendo una cadena de caracteres
        //this.anho = anho;
    }
    //clase hijo
    class FechaEntrada extends Fecha{       

        public FechaEntrada(int dia) {
            super(dia);
        }
    }
    
    

}
