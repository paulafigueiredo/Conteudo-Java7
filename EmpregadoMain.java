
public class EmpregadoMain {

	public static void main(String[] args) {
		
		Empregado angela = new Empregado();
		angela.setNome("Nome: Angela");       //o set aponta o caminho
		angela.setEndereço("Rua: Francisco");
		angela.setTelefone("12345-6789");
		angela.setCodigoSetor(4444);
		angela.setSalarioBase(4923);
		angela.setImposto(15);
		
		System.out.println(angela.getNome()); //o get imprime na tela
		System.out.println(angela.getEndereço());
		System.out.println(angela.getTelefone());
		System.out.println(angela.getCodigoSetor());
		

	}

}
