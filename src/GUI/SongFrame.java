package GUI;
import javax.swing.*;

public class SongFrame extends JFrame {
    private JPanel main;
    private JTextField textField1;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JFormattedTextField formattedTextField3;
    private JTextArea textArea1;
    private JButton playButton;
    private JTextPane textPane1;
    private JButton searchButton;
    private JButton artistSongButton;
    private JScrollPane listRecommend;

    public SongFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(main);
        this.pack();
    }
    public static void main(String[] args){
        JFrame frame = new SongFrame( "Play Song");
        frame.setVisible(true);
    }
}
