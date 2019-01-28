package com.fxb.patterns.iterator.example;
/**
 * 具体的迭代器 不同的迭代器有不同的功能
 * 具体实现不同
 * */
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
