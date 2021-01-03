package br.com.stefanini.maratonadev.dto;

/**
 * @author danilodorgam
 * @version 0.1.0
 * @created 29/10/2020 on 18:33
 */
public class CarroDto {

	private String placa;

	private int ano;

	private String modelo;

	private String marca;

	private Long idCliente;

	private String nomeCliente;

	private Boolean estaAlugado;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Boolean getEstaAlugado() {
		return estaAlugado;
	}

	public void setEstaAlugado(Boolean estaAlugado) {
		this.estaAlugado = estaAlugado;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
}
