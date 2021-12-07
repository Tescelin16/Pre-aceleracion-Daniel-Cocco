package com.alkemy.movies.repository;

import com.alkemy.movies.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character,Long> {

}