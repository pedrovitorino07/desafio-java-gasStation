package com.pedrovitorino.posto_combustivel.infrastructure.repository;

import com.pedrovitorino.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BombaDeCombustivelRepository extends JpaRepository<BombasDeCombustivel, Integer> {
}
