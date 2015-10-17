package org.jrat.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kevin on 17-10-2015.
 */
public final class About extends JDialog {

    public About() {
        super();
        init();
    }

    private void init() {
        setTitle("About jRAT");
        setLayout(new BorderLayout());
        final JTextArea area = new JTextArea();
        area.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. \n" +
                "Duis quis est ac ante auctor convallis. \n" +
                "Cras sed aliquam neque. \n" +
                "Aenean vel nisi purus. \n" +
                "Etiam et augue vitae purus porta posuere vel quis nibh. \n" +
                "Integer interdum pretium nibh, sed commodo odio. \n" +
                "Integer accumsan lobortis mi eget lobortis. \n" +
                "Pellentesque tincidunt est felis, non vulputate sem suscipit et. \n" +
                "Cras molestie non tortor dictum ultrices. \n" +
                "Sed convallis nulla sit amet facilisis aliquet. \n" +
                "Mauris ultricies nisl in ante lacinia auctor.");
        area.setEditable(false);
        add(new JScrollPane(area), BorderLayout.CENTER);
        setPreferredSize(new Dimension(420, 225));
        setMinimumSize(getPreferredSize());
        setResizable(false);
        setLocationRelativeTo(getOwner());
        pack();
        setVisible(true);
    }
}
