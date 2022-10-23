import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI extends JFrame{
    private JPanel mainPanel;
    private JButton continueButton;
    private JLabel mainText;
    private JComboBox<String> language;

    public GameGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainText.setText("(Button has been pressed)");
            }
        });

        String[] lang_list = new String[] {"Danish", "English", "Swahili"};

        //language.setSelectedIndex(lang_list.length - 1);
        for (String lang :lang_list) {
            language.addItem(lang);
        }

        language.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int user_lang = language.getSelectedIndex();
                System.out.println(user_lang);
                Spil.lang = user_lang;
            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
