package com.sqldb.demo.service;

import com.sqldb.demo.dao.SkillRepository;
import com.sqldb.demo.model.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public List<Skills> getAllSkills() {
        return skillRepository.findAll();
    }

    @Override
    public Skills insertSkill(String skillName) {
        Skills skill = new Skills();
        skill.setSkillName(skillName);
        return skillRepository.save(skill);
    }



}
