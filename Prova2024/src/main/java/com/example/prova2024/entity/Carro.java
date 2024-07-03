package com.example.prova2024.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Carro {






    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
    @Size(max = 100, min = 3, message = " Deve ter pelo menos 3 caracteres")
  private  String modelo;
    @Size(max = 100, min = 2, message = "Deve ter pelo menos 2 caracteres ")
    private String marca ;
    @Min(value = 1885,message = "Deve ser maior que 1885 e menor ou igual ao ano atual")
    @Max(value = 2024)
    private  int ano ;
    private  String cor;
    @Min(value = 0,message = "Deve ser maior que 0")
    private double preco ;
    @Min(value = 0,message ="Deve ser maior ou igual a 0" )
    private double quilometragem;

   private Tipo tipo ;
    private LocalDate dataCadastro;
@ManyToOne
    private Proprietario proprietario;
}
