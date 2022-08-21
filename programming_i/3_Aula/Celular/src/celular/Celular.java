package celular;

import java.util.Scanner;

public class Celular {
	
	String marca, modelo, processador, cartaoMemoria;
	int peso, memoriaram, armazenamentoInterno;
	double tamanhoTela;
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setCartaoMemoria(String cartaoMemoria) {
		this.cartaoMemoria = cartaoMemoria;
	}
	public String getCartaoMemoria() {
		return cartaoMemoria;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public String getProcessador() {
		return processador;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPeso() {
		return peso;
	}
	
	public void setMemoriaram(int memoriaram) {
		this.memoriaram = memoriaram;
	}
	public int getmemoriaram() {
		return memoriaram;
	}
	
	public void setArmazenamentoInterno(int armazenamentoInterno) {
		this.armazenamentoInterno = armazenamentoInterno;
	}
	public int getArmazenamentoInterno() {
		return armazenamentoInterno;
	}
	
	public void setTamanhoTela(double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	public double getTamanhoTela() {
		return tamanhoTela;
	}
		
	// Entrada de dados
	public void entradaDeDados() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Marca...:");
		setMarca(sc.nextLine());
		
		System.out.println("Modelo...:");
		setModelo(sc.nextLine());

		System.out.println("Processador...:");
		setProcessador(sc.nextLine());

		System.out.println("Cartão de memória...:");
		setCartaoMemoria(sc.nextLine());
		
		System.out.println("Peso...:");
		setPeso(Integer.parseInt(sc.nextLine()));

		System.out.println("Memória RAM...:");
		setMemoriaram(Integer.parseInt(sc.nextLine()));

		System.out.println("Armazenamento interno...:");
		setArmazenamentoInterno(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Tamanho da tela...:");
		setTamanhoTela(Double.parseDouble(sc.nextLine()));

	}
	
	public void imprimir() {
		System.out.println("Marca...................: " + getMarca());
		System.out.println("Modelo..................: " + getModelo());
		System.out.println("Processador.............: " + getProcessador());
		System.out.println("Cartão de memória.......: " + getCartaoMemoria());
		System.out.println("Peso....................: " + getPeso());
		System.out.println("Memória RAM.............: " + getmemoriaram());
		System.out.println("Armazenamento interno...: " + getArmazenamentoInterno());
		System.out.println("Tamanho da tela.........: " + getTamanhoTela());
	}
}
