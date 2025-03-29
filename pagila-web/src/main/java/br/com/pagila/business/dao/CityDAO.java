package br.com.pagila.business.dao;

import br.com.pagila.business.entidades.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDAO extends JpaRepository<City, Integer> {
}
