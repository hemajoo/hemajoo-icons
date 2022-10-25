package com.hemajoo.media.icon.collection.test.core;

import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class IconListCellRenderer extends DefaultListCellRenderer
{
    private final Map<String, FlatSVGIcon> elements;

    public IconListCellRenderer(Map<String, FlatSVGIcon> elements)
    {
        this.elements = elements;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
    {
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        FlatSVGIcon icon = elements.get(value);
        label.setIcon(icon);

        return label;
    }
}
