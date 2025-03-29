package br.com.pagila.business.controller.custom;

import br.com.pagila.business.dao.ActorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/api/actor")
public class ActorCustomController {

    @Autowired
    ActorDAO actorDAO;

    /*
    @GetMapping("/{id}")
    public ResponseEntity<Actor> getActor(@PathVariable Integer id) {
        Optional<Actor> actor = this.actorDAO.findById(id);
        return actor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @GetMapping
    public ResponseEntity<List<Actor>> getAllActors() {
        List<Actor> actors = this.actorDAO.findAll();
        return ResponseEntity.ok(actors);
    }*/

}
