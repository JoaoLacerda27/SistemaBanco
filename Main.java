package main;

import javax.swing.JOptionPane;

public class Main {

    private static int[] NumeroConta = new int[15];
    private static String[] NomeCliente = new String[15];
    private static double[] ValorAplicado = new double[15];
    private static int Num;

    public static void main(String[] args) {

        String func;
        int func1;

        do {
            func = JOptionPane.showInputDialog(
                    "Seja Bem Vindo ! \n Digite a função que deseja executar: \n 1 - Leitura \n 2 - Aplicar Juros \n 3 - Pesquisar \n 9 - Encerrar Programa");
            func1 = Integer.parseInt(func);
            switch (func1) {
                case 1:
                    Leitura();
                    break;
                case 2:
                    int n_conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
                    double percent = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de juros a ser aplicado: "));
                    AplicarJuros(n_conta, percent);
                    break;
                case 3:
                    int n;
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta a ser pesquisado: "));
                    Pesquisar(n);
                    break;
            }

        } while (func1 != 9);

    }

    public static void Leitura() {
        for (int i = 0; i < NumeroConta.length; i++) {
            NumeroConta[i] = (int) (100000.0 * Math.random());
            NomeCliente[i] = (JOptionPane.showInputDialog("Digite o nome do cliente: "));
            ValorAplicado[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser Aplicado: "));
        }

        Classificacao();

        String[] x = new String[15];
        String[] y = new String[15];

        for (int i = 0; i < 15; i++) {
            x[i] = Integer.toString(NumeroConta[i]);
            y[i] = Double.toString(ValorAplicado[i]);
            JOptionPane.showMessageDialog(null, NomeCliente[i] + "\n Número da conta: " + x[i], "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public static void Classificacao() {
        for (int i = 0; i < 15; i++) {
            for (int j = i + 1; j < 15; j++) {
                if (NumeroConta[i] > NumeroConta[j]) {
                    Num = NumeroConta[i];
                    NumeroConta[i] = NumeroConta[j];
                    NumeroConta[j] = Num;
                }

            }
        }
    }

    public static void Pesquisar(int numeroconta) {
        boolean real = true;
        for (int i = 0; i < 15; i++) {
            if (NumeroConta[i] == numeroconta) {
                double valor = ValorAplicado[i];
                String nome = NomeCliente[i];
                Exibir(numeroconta, valor, nome);
                real = false;

            }

        }

        if (real == true) {
            String frase = ("O CLIENTE NÃO ESTA CADASTRADO !");
            Exibir(frase);

        }

    }

    public static void Exibir(int numero, double valor, String nome) {
        String nome1, nome2;
        nome1 = Integer.toString(numero);
        nome2 = Double.toString(valor);
        JOptionPane.showMessageDialog(null, nome1 + "\n" + nome2 + "\n" + nome, "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void Exibir(String frase) {
        JOptionPane.showMessageDialog(null, frase, "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void AplicarJuros(int nconta, double percentual) {
        boolean real = true;
        for (int i = 0; i < 15; i++) {
            if (NumeroConta[i] == nconta) {
                ValorAplicado[i] = (percentual / 100) * ValorAplicado[i];
                real = false;
            }

            if (real = true) {
                String frase = ("O CLIENTE NÃO ESTA CADASTRADO !");
                Exibir(frase);
            }

        }

    }
}
