public abstract class Pessoa()
	private int id;
	private String nome;
	private int idade;
	private String cpf;
	
	public int retornaId() {
		return this.id;
	}
	
	public String retornaNome() {
		return this.nome;
	}

	public int retornaIdade() {
	       return this.idade;
	}

	public int retornaCpf() {
		return this.cpf;
	}

	public void definirId(int NOVO_ID) {
		this.id = NOVO_ID;
	}

	public void definirNome(String NOVO_NOME) {
		this.nome = NOVO_NOME;
	}

	public void definirIdade(int NOVA_IDADE) {
		this.idade = NOVA_IDADE;
	}

	public void definirCpf(char NOVO_CPF) {
		this.cpf = NOVO_CPF;
	}
}
		
