package com.fxb.patterns.iterator.simpleDemo;

public class BookShelfIterator<T> implements Iterator<T> {
    private BookShelf<T> bookShelf;
    private int index;

    public BookShelfIterator() {
    }

    public BookShelfIterator(BookShelf<T> bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.count())
            return true;
        return false;
    }

    @Override
    public T next() {
        return bookShelf.getBookAt(index++);
    }
}
