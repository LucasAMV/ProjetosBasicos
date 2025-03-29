package br.com.pagila.business.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FilmCategoryId implements Serializable {

    private static final long serialVersionUID = 7976397290117298219L;

    @Column(name = "film_id", nullable = false)
    private Integer filmId;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FilmCategoryId entity = (FilmCategoryId) o;
        return Objects.equals(this.filmId, entity.filmId) &&
                Objects.equals(this.categoryId, entity.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, categoryId);
    }

}
