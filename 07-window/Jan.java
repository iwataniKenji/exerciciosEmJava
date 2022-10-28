import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // interface

public class Jan implements ActionListener {
  
  static JFrame window = new JFrame("Título da janela");
  static JLabel label = new JLabel("Teste");
  static JTextField box = new JTextField(5); // caixa com tamanho de 5 caracteres
  static JButton button = new JButton("Botão");
  static JButton otherButton = new JButton("Outro teste");
  static JOptionPane optionPane = new JOptionPane();
  static Jan thisWindow = new Jan();

  public void main(String arg[]) {
    criaJan();    
  } 

  public static criaJan() {
    // finaliza a aplicação no terminal
    window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
    window.setDefaultCloseOperation(window.DISPOSE_ON_CLOSE);

    int largura = 600, altura = 400;

    window.setTitle("Cadastro de pessoas");
    window.setSize(largura, altura);
    window.setVisible(true);

    box.setColumns(20);

    label.setText(window.getTitle());
    button.setText("Sair");
    otherButton.setText("Limpar");
    window.setTitle(label.getText());

    window.add(label);
    window.add(box);
    window.add(button);
    window.add(otherButton);

    button.addActionListener(thisWindow);
    otherButton.addActionListener(thisWindow);

    // justify center e align start
    window.setLayout(new FlowLayout);
    window.setVisible(true);
  }

  // evento -> instrução
  public void actionPerformed(ActionEvent event) {
    // source e target
    if (event.getSource().equals(button)) {
      int exitResponse = optionPane.showConfirmDialog(
        null,
        "Deseja sair?",
        "Saida",
        optionPane.YES_NO_OPTION
      )

      if (exitResponse == 0) {
        window.dispose();
      }
    } else if (event.getSource().equals(otherButton)) {
      box.setText("");
      box.requestFocus();
    }
  }
}
