package com.example.prova2024.service;

import com.example.prova2024.entity.Proprietario;
import com.example.prova2024.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioService {
    @Autowired
    ProprietarioRepository proprietarioRepository;

    public Proprietario cadastrarProprietario(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public Proprietario buscarProprietario(Long Id) {
        return proprietarioRepository.findById(Id).orElse(null);

    }

    public Proprietario updateProprietario(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public void deleteProprietario(Long Id) {
        proprietarioRepository.deleteById(Id);
    }

}