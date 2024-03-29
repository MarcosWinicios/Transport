package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Horario {
	private int id = 0;
	private Date hrSaidaPrimeiroPonto = new Date();
	private Date hrRegresso = new Date();
	private Turno turno = new Turno(); 
    public SimpleDateFormat formatoDate = new SimpleDateFormat("HH:mm");
    private int validacao = 0;
    
    public Horario(int id, String hrSaidaPrimeiroPonto, String hrRegresso, Turno turno){
    	this.id = id;
    	try {
			this.hrSaidaPrimeiroPonto = this.formatoDate.parse(hrSaidaPrimeiroPonto);
			this.hrRegresso = this.formatoDate.parse(hrRegresso);
			this.turno = turno;
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }
    public Horario(int id, String hrSaidaPrimeiroPonto, String hrRegresso, Turno turno, int validacao){
    	this.id = id;
    	try {
			this.hrSaidaPrimeiroPonto = this.formatoDate.parse(hrSaidaPrimeiroPonto);
			this.hrRegresso = this.formatoDate.parse(hrRegresso);
			this.turno = turno;
			this.validacao = validacao;
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }
    public Horario(String hrSaidaPrimeiroPonto, String hrRegresso, Turno turno){
    	try {
			this.hrSaidaPrimeiroPonto = this.formatoDate.parse(hrSaidaPrimeiroPonto);
			this.hrRegresso = this.formatoDate.parse(hrRegresso);
			this.turno = turno;
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }
	public Horario(){
		
	}
	
    public int getId() {
    	return this.id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    
    public String getHrSaidaPrimeiroPonto() {
		return this.formatoDate.format(hrSaidaPrimeiroPonto);
	}
	public void setHrSaidaPrimeiroPonto(String hrSaidaPrimeiroPonto) {
		try {
			this.hrSaidaPrimeiroPonto = this.formatoDate.parse(hrSaidaPrimeiroPonto);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getHrSaidaPrimeiroPontoDate(){
		return this.hrSaidaPrimeiroPonto;
	}
	public Date getHrRegressoDate(){
		return this.hrRegresso;
	}

	public String getHrRegresso() {
		return this.formatoDate.format(hrRegresso);
	}

	public void setHrRegresso(String hrRegresso) {
		try {
			this.hrRegresso = this.formatoDate.parse(hrRegresso);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Turno getTurno(){
		return this.turno;
	}
	public void setTurno(Turno turno){
		this.turno = turno;
	}

	public int getValidacao() {
		return validacao;
	}
	public void setValidacao(int validacao) {
		this.validacao = validacao;
	}

}
