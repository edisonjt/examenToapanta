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

    Colegio colegio = colegioRepository.findById(alumno.getCodigoColegio()).orElse(null);
    if (colegio == null) {
      throw new RuntimeException("El colegio no está registrado");
    }

    Date fechaActual = new Date();
    if (alumno.getFechaNacimiento().after(fechaActual)) {
      throw new RuntimeException("La fecha de nacimiento no puede ser mayor a la fecha actual");
    }

    alumnoRepository.save(alumno);

    return alumno;
  }
}
