package com.sqldb.demo.dao;

import com.sqldb.demo.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skills, Long>{
    @Query("SELECT s FROM Skills s")
    List<Skills> findAllSKills();

    @Override
    Skills save(Skills entity);
}
