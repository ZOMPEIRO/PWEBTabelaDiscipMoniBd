package br.com.etechas.study.testeRelacionamernto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name= "TBL_DISPONIBILIDADE")
public class Dipsonibilidade
{
    @Column(name= "ID_DISPONIBILIDADE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TX_DIA_SEMANA")
    @Enumerated(EnumType.STRING)
    private DiaDaSemanaEnum diaSemana;
    @Column(name= "DT_DAS")
    private LocalDateTime dtDas;
    @Column(name= "DT_ATE")
    private LocalDateTime dtAte;
}
