package br.com.pagila.business.controller.restrepository;

import br.com.pagila.business.entidades.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "actor")
public interface ActorRestRepository extends JpaRepository<Actor, Integer> {
}
