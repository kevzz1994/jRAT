package org.jrat;

import org.jrat.ui.Frame;
import org.jrat.util.Constants;

import javax.swing.*;

/**
 * Created by Kevin on 16-10-2015.
 */
public final class Main {

    public static void main(final String... args) {
        new Main();
    }

    public Main() {
        System.out.println("Initializing: jRat...");
        System.out.println("Current version: " + getVersion());
        SwingUtilities.invokeLater(() -> {
            final Frame frame = new Frame(this);
            frame.setVisible(true);
        });
    }

    /**
     * Gets the current version of the application.
     * @return the current version
     */

    public double getVersion() {
        return Constants.VERSION;
    }
}
