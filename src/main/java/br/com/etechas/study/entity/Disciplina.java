package br.com.etechas.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "tbl_disciplina")

public class Disciplina
{
    @Column(name= "id_disciplina") //configurando o mnome do campo no BD
    @Id //Define a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "tx_nome")
    private String nome;

}
