import javax.swing.JOptionPane;
public class ViewConversor extends Moedas {

    public static void main(String[] args) {


        int confirm = JOptionPane.YES_OPTION;
        while (confirm == JOptionPane.YES_OPTION) {

            String[] moedas = {"Conversor de Moeda", "Conversor de Temperatura"};
            JOptionPane.showInputDialog(null, "Escolha uma opção", "MENU", JOptionPane.PLAIN_MESSAGE, null, moedas, moedas[0]);

            Moedas moedaSelecionada = new Moedas();

            String input = JOptionPane.showInputDialog(null, "Insira um valor:", JOptionPane.QUESTION_MESSAGE);
            verificarValor(input);
            JOptionPane.showMessageDialog(null, "Valor da conversão é de $ " + moedaSelecionada.getMoedaConversor(Double.parseDouble(input)));
            confirm = JOptionPane.showConfirmDialog(null, "Você deseja continuar no programa?");

        }
        if(confirm == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
        } else {
            JOptionPane.showMessageDialog(null, "Programa Concluido");
        }
    }

    public static double verificarValor(String valor) {
        try {
            if(valor != null){
                double number = Double.parseDouble(valor);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Valor Invalido", "Error" ,JOptionPane.ERROR_MESSAGE);
        }

        return 0;
    }
}