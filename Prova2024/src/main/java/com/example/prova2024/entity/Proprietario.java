package com.example.prova2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
    @Size(max = 100, min = 3, message = "Deve ter pelo menos 3 caracteres")
    private String nome;
    private String cpf ;
    @Email(message = " Deve ser um email válido")
    private String email ;
    private String telefone ;
    private String endereco ;
    @Past(message = "Deve ser uma data passada ou seja valida")
  private LocalDate dataNascimento;
  private  LocalDate dataCadastro;
  @OneToMany(mappedBy = "proprietario")
   private List<Carro> carros ;
}
