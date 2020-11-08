package pe.upc.taller.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.upc.taller.entidades.Author;


public interface AuthorRepository extends JpaRepository<Author,Long> {
}
