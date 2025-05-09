package br.com.etechas.study.testeRelacionamernto;


import jakarta.persistence.*;

@Entity
@Table(name = "telefone")
public class Telefone
{
    @Id
    private  int id;
    private String numero;
    private String ddd;

    @OneToOne
    @JoinColumn(name= "Id_proprietario")
    private Proprietario proprietario;
}
