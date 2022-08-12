package serializacao;
import java.io.Serializable;

	public class Aluno implements Serializable {
	  private int matricula;
	  private String nome;
	  
	  
	  //Contrutor
	  public Aluno(int matricula, String nome) {
		  System.out.println("Dentro do construtor");
	    this.setMatricula(matricula);
	    this.setNome(nome);
	  
	   
	  } 

	  public int getMatricula() {
	    return matricula;
	  }

	  public void setMatricula(int matricula) {
	    this.matricula=matricula;
	  }

	  public String getNome() {
	    return nome;
	  }

	  public void setNome(String nome) {
	    this.nome=nome;
	  }
	}

