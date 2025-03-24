package br.com.pagila.restrepository;

import br.com.pagila.entidades.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "actors")
public interface ActorRestRepository extends JpaRepository<Actor, Integer> {
}
