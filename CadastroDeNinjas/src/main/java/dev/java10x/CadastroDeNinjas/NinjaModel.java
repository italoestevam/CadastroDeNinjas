package dev.java10x.CadastroDeNinjas;
import jakarta.persistence.*;

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

    Long id;  //Vc vai usar no banco de dados, depois estude sobre long
    String nome ;
    String email;
    int idade;

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
