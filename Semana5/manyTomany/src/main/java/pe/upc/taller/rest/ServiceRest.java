package pe.upc.taller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.upc.taller.entidades.Author;
import pe.upc.taller.entidades.Book;
import pe.upc.taller.servicio.BibliotecaDAO;
import pe.upc.taller.repositorio.AuthorRepository;
import pe.upc.taller.repositorio.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ServiceRest {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BibliotecaDAO bibliotecaDAO;

    @PostMapping("/books")
    public List<Book> saveBook(@RequestBody List<Book> bookList) {
        List<Book> bookResponse = bookRepository.saveAll(bookList);
        return bookResponse;
    }

    @PostMapping("/book/addBook")
    public Book addUpdate(@RequestBody Book book) {
        Book b = null;
        b = bibliotecaDAO.registrar(book);
        return b;
    }

    @GetMapping("/books")
    public List<Book> demo() {
        List<Book> list = (List<Book>) bookRepository.findAll();
        return list;
    }

    @PostMapping("/author")
    public Author add(@RequestBody Author author){
        return authorRepository.save(author);
    }

    @GetMapping("/authors")
    public List<Author> listar(){
        return authorRepository.findAll();
    }
}
