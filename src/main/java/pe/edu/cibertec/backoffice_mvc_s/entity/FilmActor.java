package pe.edu.cibertec.backoffice_mvc_s.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmActor {

    @EmbeddedId
    private FilmActorPk filmActorPk;

    @ManyToOne(cascade = CascadeType.REMOVE )
    @JoinColumn(name = "filmId", referencedColumnName = "filmId")
    @MapsId("filmId")
    private Film film;

}
