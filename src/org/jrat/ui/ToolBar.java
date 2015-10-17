package org.jrat.ui;

import javax.swing.*;

/**
 * Created by Kevin on 17-10-2015.
 */
public class ToolBar extends JMenuBar {

    public ToolBar() {
        super();
        init();
    }

    private void init() {
        final JMenu file = new JMenu("File");
        add(file);

        final JMenu edit = new JMenu("Edit");
        add(edit);

        final JMenu help = new JMenu("Help");
        final JMenuItem about = new JMenuItem("About");

        about.addActionListener(e -> new About());
        help.add(about);
        add(help);
    }
}
