package org.jrat.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kevin on 17-10-2015.
 */
public final class TabbedPane extends JTabbedPane {

    public TabbedPane(final Component... components) {
        super();
        init(components);
    }

    private void init(final Component... components) {
        for (Component component : components) {
            if (component instanceof Tab) {
                final Tab tab = (Tab) component;
                addTab(tab);
            }
        }
    }

    private void addTab(final Tab tab) {
        this.addTab(tab.getName(), tab.getIcon(), tab);
    }
}
