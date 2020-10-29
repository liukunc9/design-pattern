package org.alanlau.iterator;

import java.util.ArrayList;

/**
 * 表示书架的类
 *
 * @author alan
 * @version 1.0
 * @date 2020/1/11 19:51
 */
public class BookShelf {
    private ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    /**
     * 获取迭代器
     *
     * @return 迭代器
     */
    public Iterator iterator() {
        return new BookShelfIterator();
    }

    /**
     * 书架迭代器
     */
    private class BookShelfIterator implements Iterator<Book> {
        int cursor;

        public BookShelfIterator() {
            cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < books.size();
        }

        @Override
        public Book next() {
            return books.get(cursor++);
        }
    }
}