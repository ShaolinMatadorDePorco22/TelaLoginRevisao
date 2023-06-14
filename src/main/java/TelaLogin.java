import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin {
    public JPanel formPane;
    private JTextField textUsuario;
    private JPasswordField fieldSenha;
    private JButton btnLogar;
    private JButton btnCancelar;
public TelaLogin() {
    btnLogar.addActionListener(new ActionListener() {

        Administrador adm = new Administrador("user123","adm123");

        @Override
        public void actionPerformed(ActionEvent e) {

            String user = textUsuario.getText();
            String senha = String.valueOf(fieldSenha.getPassword());

            if (user.equals(adm.getUser()) && senha.equals(adm.getSenha())){

            JOptionPane.showMessageDialog(null, "logado com sucesso");


            }else {JOptionPane.showMessageDialog(null,"ERROUUUU");}





        }
    });
    btnCancelar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            TelaLogin tela = new TelaLogin();
            textUsuario.setText("");
            fieldSenha.setText("");

        }
    });
}
}
