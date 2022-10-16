import javax.swing.*;

public class PacManGameM extends JFrame {

    public PacManGameM() {
        add(new GameM());
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 440);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PacManGameM();
    }
}
