package org.jrat.ui.impl;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kevin on 18-10-2015.
 */
public final class Helper {

    private static Map<String, ImageIcon> images = new HashMap<>();

    public static Image getImage(final String name) {
        final ImageIcon icon = images.get(name);
        if (icon == null) {
            try {
                final ImageIcon image = new ImageIcon(ImageIO.read(new File(name)));
                images.put(name, image);
                return image.getImage();
            } catch (Exception e) {
                return null;
            }
        }
        return icon.getImage();
    }
}
