package com.example.android.miwok.data;

import java.net.URL;

/**
 * {@link Category} represents a group of {@link Word}.
 */
public class Category {

    /**
     * Name of words category
     */
    private String name;

    /**
     * Number of words in the category
     */
    private int numberOfItems;

    /**
     * Link to backend resources for a detailed information
     */
    private URL link;

    /**
     * @return category name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of this category
     * @param name The name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number of elements in this category
     */
    public int getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Set the number of elements in this category
     * @param numberOfItems The number of the elements to be set
     */
    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    /**
     * @return get the link of the backend resource for get elements information
     */
    public URL getLink() {
        return link;
    }

    /**
     * Set the backend resource for elements information
     * @param link Url of backend resources
     */
    public void setLink(URL link) {
        this.link = link;
    }
}
