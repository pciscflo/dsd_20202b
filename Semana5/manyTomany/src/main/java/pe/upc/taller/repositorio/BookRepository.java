package pe.upc.taller.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.upc.taller.entidades.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
}
