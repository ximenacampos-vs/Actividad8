/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


    import java.awt.BorderLayout;
    import java.awt.FlowLayout;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;    

public class Vista extends JFrame{
    
    public JButton servicios, funcionario, fecha;
    private JPanel panelB, panelR, panelX;
    public JLabel lProduccion, lMensaje;
    
    public Vista(){
        
        getContentPane().setLayout(new BorderLayout());
        
        panelB = new JPanel();
        panelB.setLayout(new FlowLayout());
        panelR = new JPanel();
        panelR.setLayout(new FlowLayout());
        panelX = new JPanel();
        panelX.setLayout(new FlowLayout());
        
        servicios = new JButton("Tipo de servicio");
        funcionario = new JButton("Funcionario");
        fecha = new JButton("Rango de fecha");
        
        lProduccion = new JLabel("Produccion:");
        lMensaje = new JLabel("Ingrese el tipo de servicio que desee.");
        
        panelB.add(servicios);
        panelB.add(funcionario);
        panelB.add(fecha);
        
        panelR.add(lProduccion);
        
        panelX.add(lMensaje);
        
        add(panelX, BorderLayout.NORTH);
        add(panelB, BorderLayout.CENTER);
        add(panelR, BorderLayout.SOUTH);
    }
    
}
