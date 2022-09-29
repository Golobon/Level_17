package Lecture_2;

import java.util.LinkedList;
import java.util.List;

public class Solution_3 {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        String author;

        public Book() {
        }

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String output = "";
            if (this instanceof AgathaChristieBook) {
                output = author + ": " + getBook().getTitle() + " is a detective";
            } else if (this instanceof MarkTwainBook) {
                output = getBook().getTitle() + " was written by " + author;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends  Book {
        String title;
        public MarkTwainBook(String title) {
            super.author = "Mark Twain";
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static class AgathaChristieBook extends  Book {
        String title;

        public AgathaChristieBook(String title) {
            super.author = "Agatha Christie";
            this.title = title;
        }
        public AgathaChristieBook(String author, String title) {
            super(author);
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }
}
