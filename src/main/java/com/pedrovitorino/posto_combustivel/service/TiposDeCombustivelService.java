package com.pedrovitorino.posto_combustivel.service;

import com.pedrovitorino.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import com.pedrovitorino.posto_combustivel.infrastructure.repository.TiposDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TiposDeCombustivelService {

    private final TiposDeCombustivelRepository tipoDeCombustivelRepository;

    public void criar(TiposDeCombustivel tiposDeCombustivel){
        tipoDeCombustivelRepository.save(tiposDeCombustivel);
    }

    public TiposDeCombustivel buscarTiposDeCombustivelPorId(Integer id){
        return tipoDeCombustivelRepository.findById(id).orElseThrow(() ->
                new NullPointerException("Tipo de combustível não encontrada pelo id" + id));
    }

    public List<TiposDeCombustivel> buscarTiposDeCombustivel(){
        return tipoDeCombustivelRepository.findAll();
    }

    @Transactional
    public void deletarTipoDeCombustivel(Integer id){
        tipoDeCombustivelRepository.deleteById(id);
    }

    public void alterarTipoDeCombustivel(Integer id, TiposDeCombustivel tiposDeCombustivel){
        TiposDeCombustivel bomba = buscarTiposDeCombustivelPorId(id);
        tiposDeCombustivel.setId(bomba.getId());
        tipoDeCombustivelRepository.save(tiposDeCombustivel);
    }
}
