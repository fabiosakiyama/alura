package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		if(funcionario.isGerente()) {
			throw new ValidacaoException("Gerentes não podem ser promovidos!");
		}
		Cargo cargoAtual = funcionario.getCargo();
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario não bateu a meta!");
		}
	}
}
