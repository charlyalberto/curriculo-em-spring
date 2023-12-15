package com.example.curriculoSpring.Repository;

import com.example.curriculoSpring.Model.CurriculoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculoRepository extends JpaRepository<CurriculoModel, Long> {
}
