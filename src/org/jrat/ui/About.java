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
        area.setText("jRAT is a cross-platform Remote Administration Tool with a focus on " +
                "controlling and monitoring.");
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
