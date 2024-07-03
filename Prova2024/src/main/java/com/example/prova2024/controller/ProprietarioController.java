package com.example.prova2024.controller;

import com.example.prova2024.entity.Proprietario;
import com.example.prova2024.service.ProprietarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("proprietario")
public class ProprietarioController {


    @Autowired
    ProprietarioService proprietarioService;
    @PostMapping("cadastrar")
    public Proprietario cadastrarProprietario (@RequestBody @Valid Proprietario proprietario){
        return proprietarioService.cadastrarProprietario(proprietario);

    }
    @GetMapping("buscar")
    public Proprietario buscarProprietario(@RequestParam Long Id){
        return  proprietarioService.buscarProprietario(Id);
    }

    @PutMapping("update")
    public Proprietario updateProprietario(@RequestBody Proprietario proprietario){
        return proprietarioService.updateProprietario(proprietario);
    }

    @DeleteMapping("delete/{Id}")
    public void deleteProprietario(@PathVariable Long Id){
        proprietarioService.deleteProprietario(Id);
    }
}