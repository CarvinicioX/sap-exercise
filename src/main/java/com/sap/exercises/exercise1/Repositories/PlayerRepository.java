package com.sap.exercises.exercise1.Repositories;

import com.sap.exercises.exercise1.Entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {
}
