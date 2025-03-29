package br.com.pagila.business.dao;

import br.com.pagila.business.entidades.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorDAO extends JpaRepository<Actor, Integer> {
}
