package br.com.pagila.business.controller.custom;

import br.com.pagila.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/city")
public class CityCustomController {

    @Autowired
    CityRepository cityDAO;

    /*
    @GetMapping("/{id}")
    public ResponseEntity<City> getCity(@PathVariable Integer id) {
        Optional<City> city = this.cityDAO.findById(id);
        return city.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<City>> getAllCities() {
        List<City> cities = this.cityDAO.findAll();
        return ResponseEntity.ok(cities);
    }
    */
}
