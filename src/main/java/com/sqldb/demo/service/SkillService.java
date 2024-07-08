package com.sqldb.demo.service;

import com.sqldb.demo.model.Skills;
import java.util.List;

public interface SkillService {
    List<Skills> getAllSkills();
    Skills insertSkill(String skillName);
//    Skills getSkillById(Long id);
//    Skills saveSkill(Skills skill);
//    void deleteSkill(Long id);
//    List<Skills> searchSkills(String word);
}
