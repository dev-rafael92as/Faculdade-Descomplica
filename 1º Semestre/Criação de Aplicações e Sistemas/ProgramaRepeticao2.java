//salvar como ProgramaRepeticao2.java
import javax.swing.*;

class ProgramaRepeticao2 {
  public static void main(String entrada[]) {
    int n1, n2, soma=0;
    char op=0;
    String msg="", msgEntr="Digite 1 para adicao\nDigite 2 para somatoria\n";
    //entrada de dados
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
    op = (JOptionPane.showInputDialog(msgEntr).charAt(0));
    //processamento

    switch(op) {
      case '1': {
        if(n1 % 2 == 0 && n2 % 2 == 0) {
          soma = n1 + n2;
          msg = msg + "Soma de " + n1 + " por " + n2 + " = " + soma + "\n\n";
        } else {
          msg = msg + "Nao foi possivel calcular a soma pois os numeros digitados nao sao pares";
        }
        break;
      }
      case '2': {
        for(int i=1; i<=n2; i=i+1) {
          soma = soma + n1;
        }
        msg = msg + "Somatoria de " + n1 + " e " + n2 + " vezes eh: " + soma + "\n\n";
        break;
      }
      default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");
    }
    //saída de resultados
    if(op >='1' && op <='3') {
      JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);
  }  
}
