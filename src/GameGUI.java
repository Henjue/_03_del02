import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI extends JFrame{
    private JPanel mainPanel;
    private JButton continueButton;
    private JComboBox<String> language;
    private JLabel mainText;
    private double width;
    private double height;
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public void startGame() {
        mainPanel.remove(continueButton);
        mainPanel.remove(language);
        mainPanel.remove(mainText);
        this.pack();
        this.setSize((int)this.screenSize.getWidth(),(int)this.screenSize.getHeight());

    }

    public GameGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize((int)this.screenSize.getWidth(),(int)this.screenSize.getHeight());

        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mainText.setText("(Button has been pressed)");
                Spil.lang = language.getSelectedIndex();
                startGame();
            }
        });

        String[] lang_list = new String[] {"Danish", "English", "Swahili"};

        //language.setSelectedIndex(lang_list.length - 1);
        for (String lang :lang_list) {
            language.addItem(lang);
        }

        /*language.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Spil.lang = language.getSelectedIndex();
            }
        });*/
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

