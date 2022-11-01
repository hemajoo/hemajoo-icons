package com.hemajoo.media.icon.collection.idea;

public interface IconCollectionItemAware
{
    IconCollectionCategoryAware getCategory();

    String name();

    String getIconPath();

    String getDarkIconPath();
}
