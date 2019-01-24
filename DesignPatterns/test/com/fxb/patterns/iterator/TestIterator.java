package com.fxb.patterns.iterator;

import com.fxb.patterns.iterator.simpleDemo.Book;
import com.fxb.patterns.iterator.simpleDemo.BookShelf;
import com.fxb.patterns.iterator.simpleDemo.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        BookShelf<Book> shelf = new BookShelf<Book>();
        System.out.println("初始书架中书的数量" + shelf.count());
        System.out.println("-------------------------------------------");
        for(int i = 0 ; i < 5 ; i++){
            Book book = new Book("book---" + i + 1);
            book.setAuthor("author---" + i + 1);
            book.setCost("cost---" + 100 * (i + 1) + "元");
            shelf.append(book);
        }
        Iterator<Book> it = shelf.iterator();
        while (it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName()+"   " +book.getAuthor()+"   "+book.getCost());
        }
        System.out.println("-------------------------------------------");
    }
}
