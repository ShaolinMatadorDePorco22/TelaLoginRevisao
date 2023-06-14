import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        TelaLogin form = new TelaLogin();

        frame.setContentPane(form.formPane);
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setTitle("Tela Login");



    }
}
