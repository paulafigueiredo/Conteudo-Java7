
public class Pessoa {

	public String nome;
	public String endere�o; //atributos
	public String telefone;
	
	public Pessoa () { //construtor vazio para o main nao pedir parametro
		
	
	}
	public Pessoa (String nome, String endere�o, String telefone) 
	{
		this.nome = nome;
		this.endere�o = endere�o;   //construtor
		this.telefone = telefone;
		
		//atributo        //parametro
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
		
}
