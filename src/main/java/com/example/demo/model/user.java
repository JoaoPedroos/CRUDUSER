import com.

@Entity
@Table(name= "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private Long id;

    private String nome;
    private String email;
    private Int idade;
    private Double saldo;

    public User(){

    }

    public Long getId(){
        return id;
    }

    public Long setId(){
        return id = id;
    }

    public String getNome(){
        return nome;
    }

    public String setNome(){
        return nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public String setEmail(){
        return email = email;
    }

    public Int getIdade(){
        return idade;
    }

    public Int setIdade(){
        return idade = idade;
    }

    public Double getSaldo(){
        return saldo;
    } 

    public Double setSaldo(){
        return saldo = saldo;
    }
}