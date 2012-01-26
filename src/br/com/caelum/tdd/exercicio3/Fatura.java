package br.com.caelum.tdd.exercicio3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Fatura {

	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos;
	private boolean pago;
	
	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.pagamentos = new ArrayList<Pagamento>();
		this.pago = false;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public boolean isPago() {
		pago = this.valor <= getTotalPago();
		
		return pago;
	}
	
	private Double totalPago;
	
	public Double getTotalPago() {
		totalPago = 0.0;
		
		for (Pagamento p : pagamentos) {
			totalPago += p.getValor(); 
		}
		
		return totalPago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	
}
