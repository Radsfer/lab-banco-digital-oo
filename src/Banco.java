import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Banco {

	private Map<Integer, Conta> contas = new HashMap<>();

	public void adicionarNovaConta(Conta conta) {
		contas.put(conta.getNumero(), conta);
	}

	public void imprimirContas() {
		contas.values().stream()
				.forEach(n -> n.imprimirExtrato());
	}

}
