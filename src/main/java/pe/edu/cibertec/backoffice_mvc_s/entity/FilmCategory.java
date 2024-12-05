package pe.edu.cibertec.backoffice_mvc_s.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmCategory {

    @EmbeddedId
    private FilmCategoryPk filmCategoryPk;
    private Date lastUpdate;

    @ManyToOne(cascade = CascadeType.REMOVE )
    @JoinColumn(name = "filmId", referencedColumnName = "filmId")
    @MapsId("filmId")
    private Film film;

}
