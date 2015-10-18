package org.jrat.ui;

import org.jrat.Main;
import org.jrat.ui.impl.Helper;
import org.jrat.ui.tabs.Home;
import org.pushingpixels.substance.api.skin.*;

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
        setLookAndFeel();
        setLayout(new BorderLayout());

        add(toolBar = new ToolBar(), BorderLayout.NORTH);
        add(pane = new TabbedPane(home = new Home()), BorderLayout.CENTER);

        assert Helper.getImage("logo.png") != null;
        setIconImage(Helper.getImage("logo.png"));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(875, 450));
        setMinimumSize(getPreferredSize());
        pack();
        setLocationRelativeTo(null);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(new SubstanceNebulaBrickWallLookAndFeel()); //SubstanceGraphiteLookAndFeel()
            SwingUtilities.updateComponentTreeUI(this);
            JFrame.setDefaultLookAndFeelDecorated(true);
            JPopupMenu.setDefaultLightWeightPopupEnabled(false);
            ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
