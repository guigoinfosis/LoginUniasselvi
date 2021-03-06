
public class Funcionario  extends PessoaFisica {
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		this.nome = "";
		this.cpf = "";
		this.salario = 0.0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void getCpf() {
		 this.cpf = cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return this.salario * 0.10;

	}
}
