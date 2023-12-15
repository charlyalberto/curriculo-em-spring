package com.example.curriculoSpring.Controller;

import com.example.curriculoSpring.Model.CurriculoModel;
import com.example.curriculoSpring.Service.CurriculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curriculos")
public class CurriculoController {

    @Autowired
    private CurriculoService curriculoService;

    @GetMapping
    public ResponseEntity<List<CurriculoModel>> getAllCurriculos() {
        List<CurriculoModel> curriculos = curriculoService.getAllCurriculos();
        return ResponseEntity.ok(curriculos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CurriculoModel> getCurriculoById(@PathVariable Long id) {
        CurriculoModel curriculo = curriculoService.getCurriculoById(id);
        return ResponseEntity.ok(curriculo);
    }

    @PostMapping
    public ResponseEntity<CurriculoModel> createCurriculo(@RequestBody CurriculoModel curriculo) {
        CurriculoModel createdCurriculo = curriculoService.createCurriculo(curriculo);
        return ResponseEntity.ok(createdCurriculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CurriculoModel> updateCurriculo(@PathVariable Long id, @RequestBody CurriculoModel curriculo) {
        CurriculoModel updatedCurriculo = curriculoService.updateCurriculo(id, curriculo);
        return ResponseEntity.ok(updatedCurriculo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurriculo(@PathVariable Long id) {
        curriculoService.deleteCurriculo(id);
        return ResponseEntity.noContent().build();
    }

}
