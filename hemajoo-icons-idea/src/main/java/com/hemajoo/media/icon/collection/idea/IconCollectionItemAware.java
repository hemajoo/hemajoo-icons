package com.hemajoo.media.icon.collection.idea;

public interface IconCollectionItemAware
{
    IconCollectionCategoryAware getCategory();

    /**
     * Return the path of the file representing the icon for a given variant.
     * @return Path.
     */
    String getVariant(Enum<? extends IconCollectionVariantAware> variant);

    /**
     * Name of the icon.
     * @return Name.
     */
    String name();
}
