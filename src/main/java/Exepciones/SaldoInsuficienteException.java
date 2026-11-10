/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exepciones;

public class SaldoInsuficienteException extends Exception{
    private final double montoFaltante;
    public SaldoInsuficienteException(String mensaje, double montoFaltante){
        super(mensaje);
        this.montoFaltante = montoFaltante;
    }
    public double getMontoFaltante(){
        return montoFaltante;
    }
}
