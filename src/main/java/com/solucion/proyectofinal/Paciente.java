/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solucion.proyectofinal;

/**
 *
 * @author Sebastian
 */
public class Paciente {
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String dni;

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, String direccion, String telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
    }
    public Paciente(String nombre, String apellido, String direccion, String telefono, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = String.valueOf(dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", dni=" + dni + '}';
    }
    
    @Override
    public boolean equals(Object obj)
            {
                if(this == obj)
                {return true;}
                
                if(obj == null || getClass() != obj.getClass() )
                {return false;}
                
                Paciente p = (Paciente)obj;// casting 
                
                if((this.apellido == p.apellido)&&(this.direccion == p.direccion)&&(this.dni == p.dni)&&(this.nombre== p.nombre)&&(this.telefono== p.telefono))
                return true;
                else
                return false;
            
            }
    
    
    public static void main(String[] arg )
    {
        Paciente unPaciente = new Paciente("Dayron", "Magallanes", "Av San Martin", "12312823", "7878766876");
       // System.out.println(unPaciente);
        Paciente otroPaciente = new Paciente("Dayron", "Magallanes", "Av San Martin", "12312323", "7878766876");
        
        System.out.println(unPaciente.equals(otroPaciente));
        
        
    }
}
