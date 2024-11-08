package org.example.headfirst.chapter9.iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("This operation is not supported");
    }
}
