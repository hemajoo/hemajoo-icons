package com.hemajoo.media.icon.collection.test.core;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.util.SystemInfo;
import com.hemajoo.media.icon.collection.idea.IconCollectionIdea;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SimpleSwingFrame
{
    private static void createAndShowGUI()
    {
        FlatDarkLaf.setup();  //Must be called first of all Swing code as this sets the look and feel to FlatDark.

        try
        {
            final JPanel panel = new JPanel(); // FlowLayout.
            Box box = Box.createVerticalBox();

            box.add(new JButton("FlatDarkLaf button!"));
            box.add(new JTextField("FlatDarkLaf text field!"));

            DefaultListModel<String> iconListModel = new DefaultListModel<>();
            DefaultListModel<String> collectionListModel = new DefaultListModel<>();

            Map<String, FlatSVGIcon> elements = new HashMap<>();

            int index = 0;
            for (IconCollectionIdea element : Arrays.stream(IconCollectionIdea.values()).toList())
            {
                if (element != IconCollectionIdea.UNKNOWN)
                {
                    iconListModel.add(index++, element.name());
                    elements.put(element.name(), new FlatSVGIcon(element.getName(), 18, 18));
                }
            }


            //JList<String> collectionList = new JList<>(collectionListModel);
            JList<String> collectionList = new JList<>(new String[] { "IDEA", "Calypso", "Fadenil", "Aws", "Azure" });
            JList<String> iconList = new JList<>(iconListModel);
            iconList.setCellRenderer(new IconListCellRenderer(elements));

            iconList.setVisibleRowCount(15);
            collectionList.setVisibleRowCount(15);
            JScrollPane collectionScrollPane = new JScrollPane(collectionList);
            JScrollPane iconScrollPane = new JScrollPane(iconList);
            //panel.add(box);
            panel.add(collectionScrollPane);
            panel.add(iconScrollPane);

            final JFrame frame = new JFrame("Icons from collection: ");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            if( SystemInfo.isMacFullWindowContentSupported )
            {
                frame.getRootPane().putClientProperty("apple.awt.transparentTitleBar", true);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(final String[] args)
    {
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("apple.awt.application.name", "SimpleSwingFrame");
        System.setProperty("apple.awt.application.appearance", "system");

        SwingUtilities.invokeLater(SimpleSwingFrame::createAndShowGUI);
    }
}
