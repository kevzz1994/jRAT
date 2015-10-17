package org.jrat.ui;

import org.jrat.Main;
import org.jrat.ui.tabs.Home;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kevin on 16-10-2015.
 */
public final class Frame extends JFrame {

    private final ToolBar toolBar;
    private final TabbedPane pane;
    private final Home home;

    public Frame(final Main main) {
        super(String.format("jRAT v%s by Kevin Schaap [Active connections: %s]",
                main.getVersion(), 0));
        setLayout(new BorderLayout());

        add(toolBar = new ToolBar(), BorderLayout.NORTH);
        add(pane = new TabbedPane(home = new Home()), BorderLayout.CENTER);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(875, 450));
        setMinimumSize(getPreferredSize());
        pack();
        setLocationRelativeTo(null);
    }
}
