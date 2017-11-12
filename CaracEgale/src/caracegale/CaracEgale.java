/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracegale;
import java.util.* ; 
import javax.swing.*; 
/**
 *
 * @author nicol
 */
public class CaracEgale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String sir = JOptionPane.showInputDialog("Introduceti sirul sir: ") ; 
        
        if(areToateCarEgale(sir) == 1) 
        {
            System.out.println("Sirul are toate caracterele identice !");
        }
        else 
        {
            System.out.println("Sirul nu are toate caracterele identice !");
        }
        
        // TODO code application logic here
    }
    
    public static int areToateCarEgale(String sir) 
    {
        int ok = 1 ; 
        int n = sir.length() ; 
        
        for (int i = 0; i < n-2; i++) 
        {
            if(sir.charAt(i) != sir.charAt(i+1))
            {
                ok = 0 ; 
            }
            
        }
        return ok ; 
        
    }
    
}
