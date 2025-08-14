package com.pedrovitorino.posto_combustivel.service;

import com.pedrovitorino.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.pedrovitorino.posto_combustivel.infrastructure.repository.BombaDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BombaDeCombustivelService {

    private final BombaDeCombustivelRepository bombaDeCombustivelRepository;

    public void criar(BombasDeCombustivel bombaDeCombustivel) {
        bombaDeCombustivelRepository.save(bombaDeCombustivel);
    }

    public BombasDeCombustivel buscarBombaCombustivelPorId(Integer id) {
        return bombaDeCombustivelRepository.findById(id).orElseThrow(() ->
                new NullPointerException("Bomba de combustível não encontrada pelo id" + id));
    }

    public List<BombasDeCombustivel> buscarBombasDeCombustivel(){
        return bombaDeCombustivelRepository.findAll();
    }

    @Transactional
    public void deletarBombaCombustivel(Integer id){
        bombaDeCombustivelRepository.deleteById(id);
    }

    public void alterarBombaCombustivel(Integer id, BombasDeCombustivel bombaDeCombustivel){
        BombasDeCombustivel bomba = buscarBombaCombustivelPorId(id);
        bombaDeCombustivel.setId(bomba.getId());
        bombaDeCombustivelRepository.save(bombaDeCombustivel);
    }
}
