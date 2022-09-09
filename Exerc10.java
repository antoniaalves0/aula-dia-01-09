/*for */
import javax.swing.JOptionPane;
public class Exerc10{
    public static void main(String[] args) {
        double preco, desconto, precoNovo;
        for (int cont=1; cont<=3; cont = cont+1){
            preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));

            desconto = preco *  0.1;
            precoNovo = preco - desconto;

            JOptionPane.showMessageDialog(null, "O preço do produto com desconto e R$" + precoNovo);
            cont= cont +1 ;

        }
        
    }
}