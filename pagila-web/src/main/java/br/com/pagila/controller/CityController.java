package br.com.pagila.controller;

import br.com.pagila.dao.CityDAO;
import br.com.pagila.entidades.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Validated
@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    CityDAO cityDAO;

    @GetMapping("/{id}")
    public ResponseEntity<City> getCity(@PathVariable Integer id) {
        Optional<City> city = this.cityDAO.findById(id);
        return city.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<City>> getAllCities() {
        List<City> cities = this.cityDAO.findAll();
        return ResponseEntity.ok(cities);
    }

}
