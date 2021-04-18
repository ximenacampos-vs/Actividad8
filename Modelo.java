/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Modelo {
    
    private double tipoServicios;
    private double funcionario;
    private double rangoFecha;

    public void setTipoServicios(double tipoServicios) {
        this.tipoServicios = tipoServicios;
    }
    public void setFuncionario(double funcionario) {
        this.funcionario = funcionario;
    }
    public void setRangoFecha(double rangoFecha) {
        this.rangoFecha = rangoFecha;
    }       


    public Double getTipoServicios() {
        return tipoServicios;
    }
    public Double getFuncionario() {
        return funcionario;
    }
    public Double getRangoFecha() {
        return rangoFecha;
    }
    
    public void calcularFecha(int A){
        rangoFecha = rangoFecha * A;
    }
    public void calcularFuncionario(double A){
        funcionario = funcionario * A;
    }

  
}

    
