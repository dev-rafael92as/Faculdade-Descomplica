import javax.swing.*;

class AtividadePratica14 {
  public static void main(String entrada[]) {
    int n1, n2;
    double div, pot;
    String msg = "";

    //entrada de dados
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro!", "saida"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro!"));
    //processando
    div = (int)n1 / (int)n2;
    pot = Math.pow(n1, n2);
    //saída de dados
    msg = "n1 = " + n1 + " / n2 = " + n2 + "\n";
    msg = msg + "O Quociente da divisao entre n1 e n2 = " + div + "\n";
    msg = msg + "A potencia de n1 e n2 = " + pot + "\n";
    JOptionPane.showMessageDialog(null, msg);

    System.exit(0);
  }  
}
