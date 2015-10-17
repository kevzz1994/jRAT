package org.jrat.ui;

import javax.swing.*;

/**
 * Created by Kevin on 17-10-2015.
 */
public class Tab extends JPanel {

    private String name;
    private Icon icon;

    public Tab(final String name, final Icon icon) {
        this.name = name;
        this.icon = icon;
    }

    public Tab(final String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(final Icon icon) {
        this.icon = icon;
    }
}
