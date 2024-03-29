package model;

public class Ponto{
	private int id = 0;
	private int ordem;
	private String endereco;
	private int validacao = 0;
	
    public Ponto(int id, String endereco){
        this.id = id;
        this.endereco = endereco;
    }
    public Ponto(int id, String endereco, int validacao){
        this.id = id;
        this.endereco = endereco;
        this.validacao = validacao;
    }
    
    public Ponto(int id, String endereco, int ordem,  int validacao){
        this.id = id;
        this.endereco = endereco;
        this.validacao = validacao;
    }
    
    public Ponto(String endereco){
        this.endereco = endereco;
    }
    public Ponto() {
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public int getOrdem() {
		return this.ordem;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getValidacao() {
		return validacao;
	}
	public void setValidacao(int validacao) {
		this.validacao = validacao;
	}
}