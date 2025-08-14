package com.pedrovitorino.posto_combustivel.infrastructure.repository;

import com.pedrovitorino.posto_combustivel.infrastructure.entities.abastecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbastecimentoRepository extends JpaRepository<abastecimento, Integer> {
}
