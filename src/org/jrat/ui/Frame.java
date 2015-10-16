package org.jrat.ui;

import org.jrat.Main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kevin on 16-10-2015.
 */
public class Frame extends JFrame {

    public Frame(final Main main) {
        super(String.format("jRAT v%s by Kevin Schaap [Connections: %s]", main.getVersion(), 0));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(875, 450));
        setMinimumSize(getPreferredSize());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
