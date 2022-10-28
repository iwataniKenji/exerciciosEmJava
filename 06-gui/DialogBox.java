// classe que cria dialogs
import javax.swing.JOptionPane;

public class DialogBox {

  static JOptionPane jop = new JOptionPane();
  public static void main (String arg[]) {
    boolean ir = true;

    while (ir) {
      // 1 -> a partir de onde dialog será gerado
      // 2 -> texto do dialog
      // 3 -> tipo do dialog
      // 4 -> ícone
      String response = jop.showInputDialog(null, "Seu nome é:", "Entrada de nome", jop.ERROR_MESSAGE);
      
      int value = jop.showConfirmDialog(null, "Confirma o nome: " + response, "Confirma nome", jop.YES_NO_CANCEL_OPTION);

      if (value == 0) {
        jop.showMessageDialog(null, "CONFIRMOU o nome", "Confirmação de nome", jop.PLAIN_MESSAGE);
        ir = false;
      } else if (value == 1) {
        jop.showMessageDialog(null, "NEGOU o nome", "Negação de nome", jop.ERROR_MESSAGE);
        ir = false;
      } else if (value == 2) {
        jop.showMessageDialog(null, "CANCELOU a operação", "Cancelar", jop.ERROR_MESSAGE/);
      }
    }
  }  
}
