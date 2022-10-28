public class Pessoa {

	private int cpf = 0;
	private String nome = "";

	public int getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}
	
  // throws -> delega tratamento da exception
  public void setCpf(int cpf) throws CpfNegException, CpfGdrException {
		// gatilho da "catapulta"
		if (cpf >= 0) {
			if (cpf <= 1000) {
				this.cpf = cpf;
			} else {
				throw new CpfGdrException();
			}
		} else {
      // chama constructor -> gera o objeto -> lança o objeto
			throw new CpfNegException();
		}
	}

	public void setNome(String nome) throws NomeException {
		if (nome.length() >= 10 && nome.length() <= 20) {
			this.nome = nome;
		} else {
			throw new NomeException();
		}
	}
}
