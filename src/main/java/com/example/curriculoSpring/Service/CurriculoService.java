package com.example.curriculoSpring.Service;

import com.example.curriculoSpring.Model.CurriculoModel;
import com.example.curriculoSpring.Repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;

    public List<CurriculoModel> getAllCurriculos() {
        return curriculoRepository.findAll();
    }

    public CurriculoModel getCurriculoById(Long id) {
        Optional<CurriculoModel> optionalCurriculo = curriculoRepository.findById(id);
        return optionalCurriculo.orElse(null);
    }

    public CurriculoModel createCurriculo(CurriculoModel curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public CurriculoModel updateCurriculo(Long id, CurriculoModel curriculo) {
        if (curriculoRepository.existsById(id)) {
            curriculo.setId(id);
            return curriculoRepository.save(curriculo);
        } else {
            return null;
        }
    }

    public void deleteCurriculo(Long id) {
        curriculoRepository.deleteById(id);
    }
}
