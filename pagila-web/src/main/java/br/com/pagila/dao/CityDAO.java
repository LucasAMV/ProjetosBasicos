package br.com.pagila.dao;

import br.com.pagila.entidades.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDAO extends JpaRepository<City, Integer> {
}
