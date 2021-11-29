//salvar como AtividadePratica15.java
import javax.swing.*;

class AtividadePratica15 {
  public static void main(String entrada[]) {
    int n1, n2, prod=0;
    char op=0;
    String msg="", msgEntr="Digite 1 para produto\nDigite 2 para produtoria\n";
    //entrada de dados
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
    op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
    //processamento
    switch(op) {
      case '1': {
        if(n1>0 && n2>0) {
          prod = n1 * n2;
          msg = msg + "Produto de " + n1 + " por " + n2 + " = " + prod + "\n\n";
        }
        break;
      }
      case '2': {
        int i=1;
        while(i<=n2) {
          prod = prod * n1;
          i=i+1;
        }
        msg = msg + "Produtoria de " + n1 + ", " + n2 + " vezes eh: " + prod + "\n\n";
        break;
      }
      default: JOptionPane.showMessageDialog(null, "Opçao invalida, calculos nao realizados");
    }
    //saída de resultados
    if(op>='1' && op<='3') {
      JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);
  }
}