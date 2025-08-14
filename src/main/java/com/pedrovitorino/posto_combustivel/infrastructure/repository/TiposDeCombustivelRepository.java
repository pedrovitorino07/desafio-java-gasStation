package com.pedrovitorino.posto_combustivel.infrastructure.repository;

import com.pedrovitorino.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiposDeCombustivelRepository extends JpaRepository<TiposDeCombustivel, Integer> {
}
