import javax.swing.JOptionPane;

public class Moedas {
    private String[] moedas = {"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras"};
    private String moedaSelecionada = (String) JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja girar seu dinheiro", "Moedas", JOptionPane.PLAIN_MESSAGE, null, moedas, moedas[0]);

    public double getMoedaConversor(double valor) {

        switch (moedaSelecionada) {
            case "De Reais a Dólares":
                return valor * 0.19;
            case "De Reais a Euros":
                return valor * 0.18;
            case "De Reais a Libras":
                return valor * 0.16;
            default:
                throw new IllegalStateException("Unexpected value: " + moedaSelecionada);
        }
    }


}
