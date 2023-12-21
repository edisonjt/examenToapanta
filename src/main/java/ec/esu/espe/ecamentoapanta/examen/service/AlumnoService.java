package ec.esu.espe.ecamentoapanta.examen.service;

import org.springframework.stereotype.Service;

import ec.edu.espe.examentoapanta.examen.dao.AlumnoRepository;
import ec.edu.espe.examentoapanta.examen.dao.ColegioRepository;
import ec.edu.espe.examentoapanta.examen.domain.Alumno;
import ec.edu.espe.examentoapanta.examen.domain.Colegio;
import jakarta.transaction.Transactional;

@Service
public class AlumnoService {

  private final AlumnoRepository alumnoRepository;
  private final ColegioRepository colegioRepository;

  public AlumnoService(AlumnoRepository alumnoRepository, ColegioRepository colegioRepository) {
    this.alumnoRepository = alumnoRepository;
    this.colegioRepository = colegioRepository;
  }

  @Transactional
  public Alumno crearAlumno(Alumno alumno) {

  }
}
