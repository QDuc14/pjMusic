package GUI;
import javax.swing.*;

public class FORM2 extends JFrame {
    private JPanel panel1;
    private JTextField txtSearch;
    private JButton Artist;
    private JButton btnSearch;
    private JButton songButton;
    private JButton playerButton;
    private JTextPane tieuSuTextPane;
    private JTextPane albumTextPane;
    public FORM2(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }
    public static void main(String[] args){
        JFrame frame = new FORM2( "Play Song");
        frame.setVisible(true);
    }
}
