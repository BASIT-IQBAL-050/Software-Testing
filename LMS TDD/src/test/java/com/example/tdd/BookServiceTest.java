package com.example.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookServiceTest {

    private BookService bookService;

    @BeforeEach
    public void setUp() {
        //IBookRepository bookRepository = new BookRepository();
        IBookRepository bookRepository = new FakeRepositoryForTest();
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testGetBooksByAuthor() {
        FakeRepositoryForTest.booksList = null;
        List<Book> books = bookService.getBooksByAuthor("Kent Beck");
        Assertions.assertEquals(0, books.size());
//        Assertions.assertEquals("Test Driven Development", books.get(0).getTitle());
    }

    @Test
    public void testGetBooksByAuthor_NoBooksFound() {
        List<Book> books = bookService.getBooksByAuthor("Unknown Author");
        Assertions.assertEquals(0, books.size());
    }
    //--------------------------------------------------------------------------------------
    //-----------------------------TASKS---------------------------------------------------
    //--------------------------------------------------------------------------------------
    // 1. getBookByTitle .... Test Cases...........

    //1. Case 01 (What if the book repository is empty)
    @Test
    public void getBookByTitle_EmptyRepository(){
        FakeRepositoryForTest.booksList = null;
        List<Book> books = bookService.getBookByTitle("Test Driven Development");
        List<Book> emptyList = Collections.emptyList();
        Assertions.assertEquals(0,books.size());

    }
    // 2. Case 02 (What if no book is found related to that title)
    @Test
    public void getBookByTitle_NoBookFound(){
        List<Book> books = bookService.getBookByTitle("No Book Found");
        Assertions.assertEquals(0, books.size());
    }
    // 3. Case 03 (What if one Book is found )
    @Test
    public  void getBookTitle_OneBookFound(){
        FakeRepositoryForTest.booksList= Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
        List<Book> books = bookService.getBookByTitle("Refactoring");
        Assertions.assertEquals(1,books.size());
        Assertions.assertEquals("Refactoring", books.get(0).getTitle());
    }
    // 4. Case 04 (What if multiple books or list of books is found)
    @Test
    public  void getBookTitle_MultipleBookFound(){
        FakeRepositoryForTest.booksList= Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Clean Code", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
        List<Book> books = bookService.getBookByTitle("Clean Code");
        Assertions.assertEquals(2,books.size());
        Assertions.assertEquals("Clean Code", books.get(0).getTitle());
    }
    // 5. Case 05 (What if the title field is empty)
    @Test
    public void getBookTitle_EmptyTitleField(){
        FakeRepositoryForTest.booksList= Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
        List<Book> books = bookService.getBookByTitle("");
        Assertions.assertEquals(0,books.size());

    }
    // 6. Case 06 (What if the title field has null value)
    @Test
    public void getBookTitle_NullTitleField(){
        FakeRepositoryForTest.booksList= Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
        List<Book> books = bookService.getBookByTitle(null);
        Assertions.assertEquals(0,books.size());

    }
    //7. Case 07 (What if the case of the title are different)
    @Test
    public void getBookTitle_CaseCheckTitle(){
        FakeRepositoryForTest.booksList= Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
        List<Book> books = bookService.getBookByTitle("clEAN cODe");
        Assertions.assertEquals(1,books.size());

    }
    //---------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------
    // 2. getBookByTitleAndAuthor............Test Cases:

    // 1. Case 01 (What if the book repository is empty)
    @Test
    public void getBookByTitleAndAuthor_EmptyRepository(){
        FakeRepositoryForTest.booksList = null;
        List<Book> books = bookService.getBookByTitleAndAuthor("Test Driven Development", "Kent Beck");
        Assertions.assertEquals(0, books.size());
    }

    // 2. Case 02 (What if no book is found related to that title and author)
    @Test
    public void getBookByTitleAndAuthor_NoBookFound(){
        FakeRepositoryForTest.booksList = Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
        List<Book> books = bookService.getBookByTitleAndAuthor("Unknown Title", "Unknown Author");
        Assertions.assertEquals(0, books.size());
    }

    // 3. Case 03 (What if one Book is found)
    @Test
    public void getBookByTitleAndAuthor_OneBookFound(){
        FakeRepositoryForTest.booksList = Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
        List<Book> books = bookService.getBookByTitleAndAuthor("Refactoring", "Martin Fowler");
        Assertions.assertEquals(1, books.size());
        Assertions.assertEquals("Refactoring", books.get(0).getTitle());
        Assertions.assertEquals("Martin Fowler", books.get(0).getAuthor());
    }

    // 4. Case 04 (What if multiple books or list of books is found)
    @Test
    public void getBookByTitleAndAuthor_MultipleBookFound(){
        FakeRepositoryForTest.booksList = Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Clean Code", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler"),
                new Book("5", "Clean Code", "Robert C. Martin")
        );
        List<Book> books = bookService.getBookByTitleAndAuthor("Clean Code", "Robert C. Martin");
        Assertions.assertEquals(2, books.size());
        Assertions.assertEquals("Clean Code", books.get(0).getTitle());
        Assertions.assertEquals("Robert C. Martin", books.get(0).getAuthor());
    }

    // 5. Case 05 (What if the title or author fields are empty)
    @Test
    public void getBookByTitleAndAuthor_EmptyFields(){
        FakeRepositoryForTest.booksList = Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
        List<Book> books = bookService.getBookByTitleAndAuthor("", "");
        Assertions.assertEquals(0, books.size());
    }

    // 6. Case 06 (What if the title or author fields have null values)
    @Test
    public void getBookByTitleAndAuthor_NullFields(){
        FakeRepositoryForTest.booksList = Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
        List<Book> books = bookService.getBookByTitleAndAuthor(null, null);
        Assertions.assertEquals(0, books.size());
    }

    // 7. Case 07 (What if the case of the title and author are different)
    @Test
    public void getBookByTitleAndAuthor_CaseCheck(){
        FakeRepositoryForTest.booksList = Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
        List<Book> books = bookService.getBookByTitleAndAuthor("clean code", "robert c. martin");
        Assertions.assertEquals(1, books.size());
        Assertions.assertEquals("Clean Code", books.get(0).getTitle());
        Assertions.assertEquals("Robert C. Martin", books.get(0).getAuthor());
    }


}
