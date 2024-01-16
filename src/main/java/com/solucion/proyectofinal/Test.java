/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solucion.proyectofinal;

/**
 *
 * @author Sebastian
 */
public class Test {
    String fechaGeneración;
    String nroTest;
    String resultado;

    public Test() {
    }

    public Test(String fechaGeneración, String nroTest, String resultado) {
        this.fechaGeneración = fechaGeneración;
        this.nroTest = nroTest;
        this.resultado = resultado;
    }

    public String getFechaGeneración() {
        return fechaGeneración;
    }

    public void setFechaGeneración(String fechaGeneración) {
        this.fechaGeneración = fechaGeneración;
    }

    public String getNroTest() {
        return nroTest;
    }

    public void setNroTest(String nroTest) {
        this.nroTest = nroTest;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    
}
