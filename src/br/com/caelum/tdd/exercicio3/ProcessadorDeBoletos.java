package br.com.caelum.tdd.exercicio3;

import java.util.List;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {
		double valorPago = 0.0;
		for(Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
			fatura.getPagamentos().add(pagamento);
			valorPago += boleto.getValor();
		}
		
		if (valorPago >= fatura.getValor()) {
			fatura.setPago(true);
		}
	}
}
