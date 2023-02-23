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
        int y;
        int z;
    


        // input
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero: "));

        // processing
        if(x>y){
            if(x>z)
            {
                JOptionPane.showMessageDialog(null,"El numero mayor es: "+ x, "Numero mayor de tres", JOptionPane.PLAIN_MESSAGE);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El numero mayor es: "+ z, "Numero mayor de tres", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else if (y>z)
        {
            JOptionPane.showMessageDialog(null,"El numero mayor es: "+ y,  "Numero mayor de tres", JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El numero mayor es: "+ z,  "Numero mayor de tres", JOptionPane.PLAIN_MESSAGE);
        }
        System.exit(0);


    }
}
