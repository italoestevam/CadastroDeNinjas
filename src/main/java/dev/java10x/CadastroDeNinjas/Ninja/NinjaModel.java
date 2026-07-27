package dev.java10x.CadastroDeNinjas.Ninja;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma uma classe comum em uma entidade do banco.
@Entity

//JPA = Java persistence API.
@Table( name= "tb_cadastro" )

public class NinjaModel {

    //ATRIBUTOS
    @Id
    //GenerateValue fala com ID para como deve ser a ordem/forma
    //Se vai ser sequencial etc.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Vai passar uma estrategia de como vamos passar esse ID.

    private String id;

    //Vc vai usar no banco de dados, depois estude sobre long
    private String nome ;

    private String email;

    private int idade;

    @ManyToOne
    @JoinColumn()
    //@JOINCOLUMN é a junção entre duas tabelas
    //@JoinColumn Foreing key ou chave estrangeira
    //
    //
    // --> Muitos Ninjas para uma missão.
    // @ManyToOne Na classe NINJA eu só vou ter uma única missão.
    // 1 ÚNICO ELEMENTO/carascteristica.
    private MissoesModel missoes;

   private List<MissoesModel> missoess;

    //Construtor
    public NinjaModel(int idade, String nome, String email) {
        this.idade = idade;
        this.nome = nome;
        this.email = email;
    }

    //Construtor Vazio
    public NinjaModel() {}

    //Getters s Setters
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //O MODEL é uma classe, não é uma ENTIDADE.Lembre-se disso.

}
