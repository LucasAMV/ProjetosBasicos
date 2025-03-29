package br.com.pagila.repository;

import br.com.pagila.model.Actor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "actor")
public interface ActorRepository extends JpaRepository<Actor, Integer> {

    @Query("SELECT a FROM Actor a WHERE a.firstName ILIKE :prefix%")
    Page<Actor> startsWith(@Param("prefix") String prefix, Pageable pageable);

    @Query("SELECT a FROM Actor a WHERE a.firstName ILIKE %:name% OR a.lastName ILIKE %:name%")
    Page<Actor> findByNameContains(@Param("name") String name, Pageable pageable);

    @Override
    @RestResource(exported = false) // Desabilita DELETE para recursos individuais
    void deleteById(@NonNull @Param("id") Integer id);

}
