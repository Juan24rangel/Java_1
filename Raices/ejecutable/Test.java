package ejecutable;
import javax.swing.JOptionPane;
public class Test 

{
    public static void main(String[] args) 
    {
        int a;
        int b;
        int c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero: "));

        int r1 = (-b - (b^2 - 4*a*c)^(1/2))/2*a;
        int r2 = (-b + (b^2 - 4*a*c)^(1/2))/2*a;

        //output
        
        JOptionPane.showMessageDialog(null, "Ecuación: " +a + " x^2  + " + b + " x  + " + c, "Raices de la ecuacion", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "La primera raiz es: " +r1, "Raices de la ecuacion", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "La segunda raiz es: " +r2, "Raices de la ecuacion", JOptionPane.PLAIN_MESSAGE);

    }   
}
