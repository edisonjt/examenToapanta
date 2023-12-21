package ec.edu.espe.examentoapanta.examen.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable

public class AlumnoAsignaturaPK {
  @Column(name = "COD_ALUMNO", nullable = false)
  private Integer codAlumno;
  @Column(name = "COD_ASIGNATURA", nullable = false, length = 10)
  private String codAsignatura;

  public AlumnoAsignaturaPK() {
  }

  public AlumnoAsignaturaPK(Integer codAlumno, String codAsignatura) {
    this.codAlumno = codAlumno;
    this.codAsignatura = codAsignatura;
  }

  @Override
  public String toString() {
    return "AlumnoAsignaturaPK [codCredito=" + codAlumno + ", codCliente=" + codAsignatura + "]";
  }
}
