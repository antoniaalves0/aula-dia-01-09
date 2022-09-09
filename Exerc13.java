/* */
import javax.swing.JOptionPane;
public class Exerc13{
    public static void main(String[] args) {
        double trab, aval, exame, notaPt, notaPa, notaPe, notaPeso;
        for (int cont = 1; cont <=3; cont = cont +1){
            trab = Double.parseDouble(JOptionPane.showInputDialog("digite a nota do "));
            aval = Double.parseDouble(JOptionPane.showInputDialog("digite a nota do "));
            exame = Double.parseDouble(JOptionPane.showInputDialog("digite a nota do "));

            notaPt = trab * 2;
            notaPa = aval *3;
            notaPe = exame *5;

            notaPeso = (notaPt+notaPa+ notaPe)/10;
            JOptionPane.showMessageDialog(null, notaPeso);
            cont = cont +1;
        }
    }
}