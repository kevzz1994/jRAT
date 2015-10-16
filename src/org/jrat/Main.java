package org.jrat;

import org.jrat.ui.Frame;

/**
 * Created by Kevin on 16-10-2015.
 */
public class Main {

    private double version = 0.01;

    public static void main(final String... args) {
        new Main();
    }

    public Main() {
        System.out.println("Initializing: jRat...");
        System.out.println("Current version: " + version);
        new Frame(this);
    }

    /**
     * Gets the current version of the application.
     * @return the current version
     */

    public double getVersion() {
        return version;
    }
}
