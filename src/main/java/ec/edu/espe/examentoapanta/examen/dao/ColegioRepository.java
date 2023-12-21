package ec.edu.espe.examentoapanta.examen.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examentoapanta.examen.domain.Colegio;

@Repository
public interface ColegioRepository extends CrudRepository<Colegio, Integer> {
  public List<Colegio> findByNombreOrderByNombre(Integer codColegio);
}
