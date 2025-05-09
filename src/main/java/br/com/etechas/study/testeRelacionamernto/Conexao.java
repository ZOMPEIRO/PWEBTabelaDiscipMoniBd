package br.com.etechas.study.testeRelacionamernto;

import br.com.etechas.study.entity.Monitor;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name= "TBL_CONEXAO")
public class Conexao

{   @Column(name = "ID_CONEXAO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name= "DT_CRIACAO")
    private LocalDateTime dtCriacao;
    @ManyToOne
    @JoinColumn(name= "ID_MONITOR")
    private Monitor monitor;

}
