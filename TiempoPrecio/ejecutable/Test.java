package ejecutable;
import javax.swing.JOptionPane;
public class Test 
{
   public static void main(String[] args) 
   {
    /*Declaracion
         * de
         * variables
         */
        int x;
        int y=300;
        

        // input
        x = Integer.parseInt(JOptionPane.showInputDialog("Duración de la llamada: "));

        int z= 300 +(x-3)*50;

        // processing
        
        if (x<=3)
        {
         JOptionPane.showMessageDialog(null," El costo es:  " + y + "$", "Numero mayor de tres", JOptionPane.PLAIN_MESSAGE);
        }
        else{
         if (x>3){
            JOptionPane.showMessageDialog(null," El costo es:  " + z + "$", "Numero mayor de tres", JOptionPane.PLAIN_MESSAGE);
         }
        }

   } 
}
