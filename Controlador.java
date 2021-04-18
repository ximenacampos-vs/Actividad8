/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener{
    
    private Modelo modelo;
    private Vista vista;
    
    private double produccion = 0,contFuncionario = 0;

    public Controlador(Modelo modelo, Vista vista) {
        
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.servicios.addActionListener(this);
        this.vista.fecha.addActionListener(this);
        this.vista.funcionario.addActionListener(this);
                
    }
    
    public void iniciarVista(){
        
        vista.setTitle("Autolavado Estrella");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
    }        
    
    public void actionPerformed(ActionEvent evento){
        if (vista.servicios == evento.getSource()) {
            
            registrar();
            modelo.setTipoServicios(produccion);         
            vista.lProduccion.setText(modelo.getTipoServicios().toString());
            
        } else if(vista.fecha == evento.getSource()){
            
            int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "de cuantos dias de produccion desea consultar"));
                     
            modelo.setRangoFecha(produccion);    
            modelo.calcularFecha(dias);            
            vista.lProduccion.setText(modelo.getRangoFecha().toString());
            
        } else if(vista.funcionario == evento.getSource()){
                      
            modelo.setFuncionario(produccion);          
            modelo.calcularFuncionario(contFuncionario);
            vista.lProduccion.setText(modelo.getFuncionario().toString());
            
        }
    }
    
    public void registrar(){
        
        double automovil = 50000;
        double camioneta = 70000; 
        double f = 0;
        
        int opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion que desee."+"\n"+"1. Lavado Basico"+"\n"+"2. Lavado Especial"+"\n"+"3. Desinfeccion Basica"+"\n"+"4. Desinfeccion Avanzada"+"\n"+"5. Combos"));                   
        
        switch(opcion1){
            case 1:
                int opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué tipo de vehiculo tiene?"+"\n"+"1. Automovil"+"\n"+"2. Camioneta"));
                
                if (opcion2 == 1) {
                    f = automovil;
                    contFuncionario++;
                } else {
                    f = camioneta;
                    contFuncionario++;
                }
                
                produccion = produccion + f;
                                
                break;
            case 2:
                int opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué tipo de vehiculo tiene?"+"\n"+"1. Automovil"+"\n"+"2. Camioneta"));
                
                if (opcion3 == 1) {
                    f = automovil + (automovil * 0.15);
                    contFuncionario++;
                } else {
                    f = camioneta + (camioneta * 0.15);
                    contFuncionario++;
                }
                
                produccion = produccion + f;
                
                break;
            case 3:
                int opcion4 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué tipo de vehiculo tiene?"+"\n"+"1. Automovil"+"\n"+"2. Camioneta"));
                
                if (opcion4 == 1) {
                    f = automovil - (automovil * 0.20);
                    contFuncionario++;
                } else {
                    f = camioneta - (camioneta * 0.20);
                    contFuncionario++;
                }
                
                produccion = produccion + f;
                
                break;
            case 4:
                int opcion5 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué tipo de vehiculo tiene?"+"\n"+"1. Automovil"+"\n"+"2. Camioneta"));
                
                if (opcion5 == 1) {
                    f = automovil + (automovil * 0.10);
                    contFuncionario++;
                } else {
                    f = camioneta + (camioneta * 0.10);
                    contFuncionario++;
                }
                
                produccion = produccion + f;
                
                break;
            case 5:
                int opcion6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija el combo que desee."+"\n"+"Combo 1 Lavado, Polichado y Desengrasante por Debajo"+"\n"+"Combo 2 Lavado, Polichado y Desengrasante por Debajo + Grafitado de Chasis"+"\n"+"Combo 3 Lavado, Polichado y Desengrasante por Debajo + Grafitado de Chasis + Tapiceria"));
                
                if (opcion6 == 1) {
                  
                    f = camioneta + (camioneta * 0.35);
                    contFuncionario++;
                } else if(opcion6 == 2){
                   
                    f = camioneta + (camioneta * 0.48);
                    contFuncionario++;
                } else{
                   
                    f = camioneta + (camioneta * 0.60);
                    contFuncionario++;
                }
                
                produccion = produccion + f;
        }
        
    }
        
}

