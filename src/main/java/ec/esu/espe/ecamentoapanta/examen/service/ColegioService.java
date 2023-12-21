package ec.esu.espe.ecamentoapanta.examen.service;

import java.util.List;
import org.springframework.stereotype.Service;

import ec.edu.espe.examentoapanta.examen.dao.ColegioRepository;
import ec.edu.espe.examentoapanta.examen.domain.Colegio;
import ec.edu.espe.examentoapanta.examen.exception.CreateException;

@Service

public class ColegioService {

  private final ColegioRepository colegioRepository;

  public ColegioService(ColegioRepository colegioRepository) {
    this.colegioRepository = colegioRepository;
  }

  public Colegio create(Colegio colegio) {
    try {
      return this.colegioRepository.save(colegio);
    } catch (Exception e) {
      throw new CreateException("Ocurrio un error al crear el Colegio: " + colegio.toString(), e);
    }
  }

  public List<Colegio> obtenerPersonaPorApellidos(String nombre) {
    return this.colegioRepository.findByNombreOrderByNombre(nombre);
  }

}
