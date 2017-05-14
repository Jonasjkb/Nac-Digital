package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_NAC_CLIENTE")
@SequenceGenerator(name="seqCliente", sequenceName="SQ_T_NAC_CLIENTE", allocationSize=1)
public class Cliente {

	@Id
	@Column(name="CD_CLIENTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqCliente")
	private int codigo;
	
	@Column(name="NM_CLIENTE", nullable=false, length=60)
	private String nome;
	
	@Column(name="SB_CLIENTE", nullable=false)
	private String sobrenome;
	
	@Column(name="DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;

	@Column(name="DS_ENDERECO", nullable=false)
	private String endereco;
	
	@Column(name="NR_CPF")
	private String cpf;
	
	@Column(name="NR_RG")
	private String rg;

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
	
}
