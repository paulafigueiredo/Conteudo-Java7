
public class Pessoa {

	public String nome;
	public String enderešo; //atributos
	public String telefone;
	
	public Pessoa () { //construtor vazio para o main nao pedir parametro
		
	
	}
	public Pessoa (String nome, String enderešo, String telefone) 
	{
		this.nome = nome;
		this.enderešo = enderešo;   //construtor
		this.telefone = telefone;
		
		//atributo        //parametro
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
		
}
