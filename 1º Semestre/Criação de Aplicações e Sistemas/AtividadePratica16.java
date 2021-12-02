// salvar como AtividadePratica16.java
import javax.swing.*;

class AtividadePratica16 {
  public static int soma(int vet[]) {
    int s=0;
    for(int i = 0; i<vet.length; i++) {
      s = s + vet[i];
    }
    return s;
  }

  public static int produto(int vet[]) {
    int p=1;
    for(int i = 0; i<vet.length; i++) {
      p = p * vet[i];
    }
    return p;
  }

  public static void main(String entrada[]) {
    int s=0, vetor[] = {10, 20, 30, 40, 50}, r;

    s = soma(vetor);
    JOptionPane.showMessageDialog(null, "A somatoria eh: " + s);
    r = produto(vetor);
    JOptionPane.showMessageDialog(null, "A produtoria eh : " + r);
    System.exit(0);
  }  
}
