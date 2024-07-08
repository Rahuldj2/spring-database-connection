package com.sqldb.demo.api;

import com.sqldb.demo.model.Skills;
import com.sqldb.demo.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<Skills> getAllSkills() {
        return skillService.getAllSkills();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Skills> getSkillById(@PathVariable Long id) {
//        Skills skill = skillService.getSkillById(id);
//        if (skill == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(skill);
//    }
//
//    @PostMapping
//    public Skills createSkill(@RequestBody Skills skill) {
//        return skillService.saveSkill(skill);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Skills> updateSkill(@PathVariable Long id, @RequestBody Skills skillDetails) {
//        Skills skill = skillService.getSkillById(id);
//        if (skill == null) {
//            return ResponseEntity.notFound().build();
//        }
//        skill.setSkillName(skillDetails.getSkillName());
//        Skills updatedSkill = skillService.saveSkill(skill);
//        return ResponseEntity.ok(updatedSkill);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteSkill(@PathVariable Long id) {
//        Skills skill = skillService.getSkillById(id);
//        if (skill == null) {
//            return ResponseEntity.notFound().build();
//        }
//        skillService.deleteSkill(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/search")
//    public List<Skills> searchSkills(@RequestParam String word) {
//        return skillService.searchSkills(word);
//    }
}
