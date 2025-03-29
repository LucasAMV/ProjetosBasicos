package br.com.pagila.business.controller.restrepository;

import br.com.pagila.business.entidades.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "city")
public interface CityRestRepository extends JpaRepository<City, Integer> {
}
