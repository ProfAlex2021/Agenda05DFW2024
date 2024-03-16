
import javax.swing.JOptionPane;

public class IfAninhadoSemana {

    public static void main(String[] args) {
        //declaração de variáveis
        int dia; // variável para armazenamento da semana
        //entrada de dados com conversão de tipos juntas
        dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número de 1 a 7"));
        //processamento
        if (dia == 1) { //if 1
            JOptionPane.showMessageDialog(null, "Você escolheu Domingo");
        } else {
            if (dia == 2) { //if 2
                JOptionPane.showMessageDialog(null, "Você escolheu Segunda");
            } else {
                if (dia == 3) { //if 3
                    JOptionPane.showMessageDialog(null, "Você escolheu Terça");
                } else {
                    if (dia == 4) { //if 4
                        JOptionPane.showMessageDialog(null, "Você escolheu Quarta");
                    } else {
                        if (dia == 5) { //if 5
                            JOptionPane.showMessageDialog(null, "Você escolheu Quinta");
                        } else {
                            if (dia == 6) { //if 6
                                JOptionPane.showMessageDialog(null, "Você escolheu Sexta");
                            } else {
                                if (dia == 7) { //if 7
                                    JOptionPane.showMessageDialog(null, "Você escolheu Sábado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Número Inválido");
                                } // fim do if 7
                            } // fim do if 6
                        } // fim do if 5
                    } // fim do if 4
                } // fim do if 3
            } // fim do if 2
        } // fim do if 1
    } // fim do método main
} // fim da classe
