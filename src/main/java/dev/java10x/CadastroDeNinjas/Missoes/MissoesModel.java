package dev.java10x.CadastroDeNinjas.Missoes;
import dev.java10x.CadastroDeNinjas.Ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "tb_missoes")

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaMissao;
    private String dificuldade;

    @OneToMany(mappedBy ="missoes" )
    //Uma missão vai/pode ter vários ninjas.
    //1 Ninja não pode fazer duas coisas ao mesmo tempo.
    private List<NinjaModel> ninja ;

    public MissoesModel(Long id, String nomeDaMissao, String dificuldade) {
        this.id = id;
        this.nomeDaMissao = nomeDaMissao;
        this.dificuldade = dificuldade;
    }

    public MissoesModel() {
    }

    //Getter s Setters
    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getNomeDaMissao() {
        return nomeDaMissao;
    }

    public void setNomeDaMissao(String nomeDaMissao) {
        this.nomeDaMissao = nomeDaMissao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
