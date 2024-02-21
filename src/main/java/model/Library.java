package model;
import enums.Books;

    public class Library {
        private Books books;

        public Library(Books books) {
            this.books = books;
        }

        public Books getBooks() {
            return books;
        }

    }

