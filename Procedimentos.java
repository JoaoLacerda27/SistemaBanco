package main;

import javax.swing.JOptionPane;

public class Procedimentos {

    int [] NumeroConta = new int[15];
    String[] NomeCliente = new String[15];
    double[] ValorAplicado = new double[15];
    int Num;
    double Num1;
    String nomes;

    public void Leitura() {
        for (int i = 0; i < NumeroConta.length; i++) {
            NumeroConta[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
        }

        for (int i = 0; i < NomeCliente.length; i++) {
            NomeCliente[i] = (JOptionPane.showInputDialog("Digite o nome do cliente: "));
        }

        for (int i = 0; i < ValorAplicado.length; i++) {
            ValorAplicado[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o nome do cliente: "));
        }

    }

    public void Classificacao() {
        for (int i = 0; i < 15; i++) {
            for (int j = i + 1; j < 15; j++) {
                if (NumeroConta[i] > NumeroConta[j]) {
                    Num = NumeroConta[i];
                    NumeroConta[i] = NumeroConta[j];
                    NumeroConta[j] = Num;

                    Num1 = ValorAplicado[i];
                    ValorAplicado[i] = ValorAplicado[j];
                    ValorAplicado[j] = Num1;

                    nomes = NomeCliente[i];
                    NomeCliente[i] = NomeCliente[j];
                    NomeCliente[j] = nomes;

                }
            }
        }

    }

}
