package funcModel;

public class Funcionario {
	
	private Long id;
	private String name;
	private String cpf;
	
	public Funcionario() {}
	
	public Funcionario(Long id, String name, String cpf) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "("+ this.cpf +")";
	}
}
