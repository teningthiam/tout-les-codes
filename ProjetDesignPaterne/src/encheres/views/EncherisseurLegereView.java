package encheres.views;

import javax.swing.*;
import java.awt.*;

public class EncherisseurLegereView extends JPanel {
    private JLabel labelNom;
    private JLabel labelPrix;
    private JTextField textEnchere;
    private JButton boutonEncherir;

    public EncherisseurLegereView() {
        labelNom = new JLabel("Article");
        labelPrix = new JLabel("Prix actuel");
        textEnchere = new JTextField();
        boutonEncherir = new JButton("Encherir");

        setLayout(new BorderLayout());
        add(labelNom, BorderLayout.NORTH);
        add(labelPrix, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(textEnchere);
        panel.add(boutonEncherir);

        add(panel, BorderLayout.SOUTH);
    }

    // Getters for components
    public JLabel getLabelNom() {
        return labelNom;
    }

    public JLabel getLabelPrix() {
        return labelPrix;
    }

    public JTextField getTextEnchere() {
        return textEnchere;
    }

    public JButton getBoutonEncherir() {
        return boutonEncherir;
    }
}
