package pe.upc.taller.servicio;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.upc.taller.entidades.Author;
import pe.upc.taller.entidades.Book;

import java.util.List;

public interface BibliotecaDAO {

    public Book registrar(Book book) ;

    public Author registrar(Author author);
}
