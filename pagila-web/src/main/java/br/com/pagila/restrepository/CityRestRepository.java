package br.com.pagila.restrepository;

import br.com.pagila.entidades.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cities")
public interface CityRestRepository extends JpaRepository<City, Integer> {
}
