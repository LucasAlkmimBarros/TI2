package com.ti2cc;

public class Carro {
	private int placa;
	private String modelo;
	private int ano;

	public Carro() {
		this.placa = -1;
		this.modelo = "";
		this.ano = -1;
	}

	public Carro(int codigo, String moedelo, int ano) {
		this.placa = codigo;
		this.modelo = moedelo;
		this.ano = ano;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setLogin(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + "]";
	}
}
