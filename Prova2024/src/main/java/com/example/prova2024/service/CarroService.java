package com.example.prova2024.service;

import com.example.prova2024.entity.Carro;
import com.example.prova2024.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
    @Autowired
    CarroRepository carroRepository;

    public Carro cadastrarCarro(Carro carro) {
        return carroRepository.save( carro);
    }

    public Carro buscarCarro(Long Id) {
        return carroRepository.findById(Id).orElse(null);

    }

    public Carro updateCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    public void deleteCarro(Long Id) {
        carroRepository.deleteById(Id);
    }
}
