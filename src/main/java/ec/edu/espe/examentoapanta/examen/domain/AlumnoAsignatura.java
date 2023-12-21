package ec.edu.espe.examentoapanta.examen.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ALUMNO_ASIGNATURA")
public class AlumnoAsignatura {

  @EmbeddedId
  private AlumnoAsignaturaPK PK;

  @Column(name = "CALIFICACION1", nullable = false, precision = 4, scale = 2)
  private BigDecimal calificacion1;

  @Column(name = "CALIFICACION2", nullable = false, precision = 4, scale = 2)
  private BigDecimal calificacion2;

  @Column(name = "CALIFICACION3", nullable = false, precision = 4, scale = 2)
  private BigDecimal calificacion3;

  @Column(name = "PROMEDIO", nullable = false, precision = 4, scale = 2)
  private BigDecimal promedio;

  @Column(name = "ESTADO", nullable = false, length = 3)
  private BigDecimal estado;

  public AlumnoAsignatura() {
  }

  public AlumnoAsignatura(AlumnoAsignaturaPK pK) {
    PK = pK;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((PK == null) ? 0 : PK.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    AlumnoAsignatura other = (AlumnoAsignatura) obj;
    if (PK == null) {
      if (other.PK != null)
        return false;
    } else if (!PK.equals(other.PK))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "AlumnoAsignatura [PK=" + PK + ", calificacion1=" + calificacion1 + ", calificacion2=" + calificacion2
        + ", calificacion3=" + calificacion3 + ", promedio=" + promedio + ", estado=" + estado + "]";
  }

}
