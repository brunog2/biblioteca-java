public class Usuario {
	private String nome;
	private String dataNas;
	private String endereco;
	private String cpf;
	
	Usuario(String nome, String dataNas, String endereco, String cpf){
		this.nome = nome;
		this.dataNas = dataNas;
		this.endereco = endereco;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getDataNas() {
		return dataNas;
	}
	public void setDataNas(String dataNas) {
		this.dataNas = dataNas;
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}