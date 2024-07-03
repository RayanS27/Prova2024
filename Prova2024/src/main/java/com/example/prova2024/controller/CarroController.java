package com.example.prova2024.controller;

import com.example.prova2024.entity.Carro;

import com.example.prova2024.service.CarroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("carro")
public class CarroController {
    @Autowired
    CarroService carroService;
    @PostMapping("cadastrar")
    public Carro cadastrarCarro (@RequestBody @Valid Carro carro){
        return carroService.cadastrarCarro(carro);

    }
    @GetMapping("buscar")
    public Carro buscarCarro(@RequestParam Long Id){
        return  carroService.buscarCarro(Id);
    }

    @PutMapping("update")
    public Carro updateCarro(@RequestBody Carro carro){
        return carroService.updateCarro(carro);
    }

    @DeleteMapping("delete/{Id}")
    public void deleteCarro(@PathVariable Long Id){
        carroService.deleteCarro(Id);
    }
}
