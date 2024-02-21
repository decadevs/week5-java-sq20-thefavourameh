package service.impl;


import enums.Books;
import model.Library;
import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.LibraryService;
import service.impl.LibraryServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryServiceImplTest {

    private LibraryService libraryService;
    private Library library;
    private User user1;
    private User user2;

    @BeforeEach
    public void setUp() {
        libraryService = new LibraryServiceImpl();
        library = new Library(Books.JAVA);
        user1 = new User("Alice", true, false, false);
        user2 = new User("Bob", true, false, false);
    }

    @Test
    public void testAddUserToQueue() {
        libraryService.addUserToQueue(user1);
        libraryService.addUserToQueue(user2);

    }

    @Test
    public void testGiveBook() {
        libraryService.addUserToQueue(user1);
        String result = libraryService.giveBook(library);
        assertEquals("Alice has taken JAVA Book", result);

    }

    @Test
    public void testGiveBookFIFO() {
        libraryService.addUserToQueue(user1);
        String result = libraryService.giveBookFIFO(library);
        assertEquals("Alice has taken JAVA Book", result);

    }
}