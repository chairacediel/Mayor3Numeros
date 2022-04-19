/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor3numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Mayor3Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       //variables
        int x,y,z,mayor=0;
        
    
        //entrada
         x=Integer.parseInt(JOptionPane.showInputDialog("Digite x:"));
         y=Integer.parseInt(JOptionPane.showInputDialog("Digite y:"));
         z=Integer.parseInt(JOptionPane.showInputDialog("Digite z:"));
        
        //procesos
        if(x>y)
            if(x>z)
            {
                mayor=x; 
            }
        else
        {
            mayor=z;
            
        }
        else 
        {
            if(y>z)
            {
               mayor =y; 
            }
            
            else
            
            mayor =y;
        }
         
                
        
        //salida
        
        JOptionPane.showMessageDialog(null,"EL MAYOR ES" + mayor,"poo",JOptionPane.WARNING_MESSAGE);
       // fin
     System.exit(0);
        
        
    }
    
}
