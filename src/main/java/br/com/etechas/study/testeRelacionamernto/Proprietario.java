package br.com.etechas.study.testeRelacionamernto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "proprietario" )
public class Proprietario
{
    @Id
    private int id;
    private String nome;

}
