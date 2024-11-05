package org.example.headfirst.chapter9.iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    List<MenuItem> items;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (items.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        return items.remove(0);
    }
}
