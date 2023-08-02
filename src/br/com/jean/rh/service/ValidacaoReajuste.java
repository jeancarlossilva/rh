package br.com.jean.rh.service;

import java.math.BigDecimal;

import br.com.jean.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
