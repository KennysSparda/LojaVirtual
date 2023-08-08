public Funcionario extends Pessoa {
	private String matricula;
	private String senha;
	
	public Funcionario(int NOVO_ID, String NOVO_NOME, int NOVA_IDADE, String NOVO_CPF, String NOVA_MATRICULA, String NOVA_SENHA) {
		this.id = NOVO_ID;
		this.nome = NOVO_NOME;
		this.idade = NOVA_IDADE;
		this.cpf = NOVO_CPF;
		this.matricula = NOVA_MATRICULA;
		this.senha = NOVA_SENHA;
	}

	public retornarMatricula() {
		return this.matricula;
	}

	public verificarSenha(String SENHA_DIGITADA) {
		if ( SENHA_DIGITADA == this.senha) {
			System.out.println("Senha correta");
			return true;
		} else {
			System.out.println("Senha incorreta");
			return false;
		}
	}

	public definirSenha( String NOVA_SENHA ) {
		this.senha = NOVA_SENHA;
	}

}





