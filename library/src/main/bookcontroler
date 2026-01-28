package com.library.dea.controller;

import com.library.dea.entity.Book;
import com.library.dea.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookControler {

    private BookService bookService;

    public void BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // get all books
    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.showAll();
    }

    // pagination
    @GetMapping
    public Page<Book> getBooks(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return bookService.getBooks(pageable);
    }

    // find by title
    @GetMapping("/find/title/{title}")
    public List<Book> getAllBooksByTitle(@PathVariable String title) {
        return bookService.getAllByTitle(title);
    }

    // find by author
    @GetMapping("/find/author/{author}")
    public List<Book> getAllBooksByAuthor(@PathVariable String author) {
        return bookService.getAllByAuthor(author);
    }

    // find by min price
    @GetMapping("/find/price/{minPrice}")
    public List<Book> getAllByMinPrice(@PathVariable Double minPrice) {
        return bookService.getAllByMinPrice(minPrice);
    }

    // find by min amount
    @GetMapping("/find/amount/{minAmount}")
    public List<Book> getAllByMinAmount(@PathVariable Integer minAmount) {
        return bookService.getAllByMinAmount(minAmount);
    }

    // find by id
    @GetMapping("/{id}")
    public Book getBook(@PathVariable Integer id) {
        return bookService.showById(id);
    }

    // create book
    @PostMapping("/add")
    public Book createBook(@RequestBody Book book) {
        return bookService.add(book);
    }

    // update book
    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
        return bookService.update(id, book);
    }

    // delete book
    @DeleteMapping("/delete/{id}")
    public void deleteBookById(@PathVariable Integer id) {
        bookService.deleteBook(id);
    }
}
