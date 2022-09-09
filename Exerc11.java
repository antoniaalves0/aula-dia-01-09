/* do while*/
import javax.swing.JOptionPane;
public class Exerc11{
    public static void main(String[] args) {
        double salarioBase, salarioNovo, imposto, gratificacao;
        int cont = 1;
        do{
            salarioBase = Double.parseDouble(JOptionPane.showInputDialog("digite o salario base do funcionario:"));

            gratificacao =  salarioBase * 0.5 ;
            imposto  = salarioBase * 0.7 ;
            salarioNovo = salarioBase + gratificacao - imposto; 

            JOptionPane.showMessageDialog(null,"O salario a rEceber é R$" + salarioNovo);

        } while (cont <=3);
        
    }

}