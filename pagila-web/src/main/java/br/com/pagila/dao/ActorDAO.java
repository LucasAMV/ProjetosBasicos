package br.com.pagila.dao;

import br.com.pagila.entidades.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorDAO extends JpaRepository<Actor, Integer> {
}
