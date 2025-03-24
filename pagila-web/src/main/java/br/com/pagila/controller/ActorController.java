package br.com.pagila.controller;

import br.com.pagila.dao.ActorDAO;
import br.com.pagila.entidades.Actor;
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
@RequestMapping("/api/actor")
public class ActorController {

    @Autowired
    ActorDAO actorDAO;

    @GetMapping("/{id}")
    public ResponseEntity<Actor> getActor(@PathVariable Integer id) {
        Optional<Actor> actor = this.actorDAO.findById(id);
        return actor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @GetMapping
    public ResponseEntity<List<Actor>> getAllActors() {
        List<Actor> actors = this.actorDAO.findAll();
        return ResponseEntity.ok(actors);
    }

}
