package br.com.codenation;

import br.com.codenation.exceptions.CapitaoNaoInformadoException;
import br.com.codenation.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.exceptions.JogadorNaoEncontradoException;
import br.com.codenation.exceptions.TimeNaoEncontradoException;
import br.com.codenation.meuTime.Jogador;
import br.com.codenation.meuTime.Time;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class DesafioMeuTimeApplication implements MeuTimeInterface {

	List<Time> arrayListTime = new ArrayList<>();
	List<Jogador> arrayListJogador = new ArrayList<>();

	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) {
		try {
			Validacoes.verificarSeTimeJaExiste(id, arrayListTime);
			Time novoTime = new Time(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);
			arrayListTime.add(novoTime);
		}catch (IdentificadorUtilizadoException e) {
			throw new IdentificadorUtilizadoException();
		}
	}

	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
		try {
			Validacoes.verificarSeJogadorJaExiste(id, arrayListJogador);
			Validacoes.buscarTime(idTime, arrayListTime);

			Jogador novoJogador = new Jogador(id, idTime, nome, dataNascimento, nivelHabilidade, salario);

			arrayListJogador.add(novoJogador);
		}catch (UnsupportedOperationException e) {
			throw new UnsupportedOperationException();
		}
	}

	public void definirCapitao(Long idJogador) {
		try{
			Validacoes.buscarJogador(idJogador, arrayListJogador);
			Time.capitao = idJogador;
			Jogador.capitao = true;
		}catch (JogadorNaoEncontradoException e){
			throw new JogadorNaoEncontradoException();
		}
	}

	public Long buscarCapitaoDoTime(Long idTime) {
		Long result;
		try {
			Validacoes.buscarTime(idTime, arrayListTime);
			List<Long> buscarCapitao = arrayListJogador.stream().filter(x -> x.getCapitão() == true).map(Jogador::getId).collect(Collectors.toList());
			Validacoes.verificarSeCapitaoExiste(buscarCapitao);
			result = buscarCapitao.get(0);
		}catch (CapitaoNaoInformadoException e){
			throw new CapitaoNaoInformadoException();
		}
		return result;
	}

	public String buscarNomeJogador(Long idJogador) {
		String result;
		try {
			Validacoes.buscarJogador(idJogador, arrayListJogador);
			List<String> buscarJogador = arrayListJogador.stream().filter(x -> x.getId() == idJogador ).map(Jogador::getNome).collect(Collectors.toList());
			result = buscarJogador.get(0);
		}catch (JogadorNaoEncontradoException e){
			throw new JogadorNaoEncontradoException();
		}
		return result;
	}

	public String buscarNomeTime(Long idTime) {
		String result;
		try {
			Validacoes.buscarTime(idTime, arrayListTime);
			List<String> buscarTime = arrayListTime.stream().filter(x -> x.getId() == idTime).map(Time::getNome).collect(Collectors.toList());
			result = buscarTime.get(0);
		}catch (TimeNaoEncontradoException e){
			throw new TimeNaoEncontradoException();
		}
		return result;
	}

	public List<Long> buscarJogadoresDoTime(Long idTime) {
		List<Long> result;
			try {
				Validacoes.buscarTime(idTime, arrayListTime);
				result = arrayListJogador.stream().filter(x -> x.getIdTime() == idTime).map(Jogador::getId).collect(Collectors.toList());
			}catch (TimeNaoEncontradoException e){
				throw new TimeNaoEncontradoException();
		}
		return result;
	}

	public Long buscarMelhorJogadorDoTime(Long idTime) {
		Long result;
			try {
				Validacoes.buscarTime(idTime, arrayListTime);
				List<Long> melhorJogador = arrayListJogador.stream().filter(x -> x.getIdTime() == idTime)
						.sorted(Comparator.comparing(Jogador::getNivelHabilidade).reversed())
							.map(Jogador::getId).collect(Collectors.toList());

				result = melhorJogador.get(0);
			}catch (TimeNaoEncontradoException e){
				throw new TimeNaoEncontradoException();
			}
		return result;
	}

	public Long buscarJogadorMaisVelho(Long idTime) {
		Long result;
		try {
			Validacoes.buscarTime(idTime, arrayListTime);
			List<Long> maisVelho = arrayListJogador.stream().filter(x -> x.getIdTime() == idTime)
					.sorted(Comparator.comparing(Jogador::getDataNascimento))
					.map(Jogador::getId).collect(Collectors.toList());
			result = maisVelho.get(0);
		}catch (TimeNaoEncontradoException e){
			throw new TimeNaoEncontradoException();
		}
		System.out.println(result);
		return result;
	}

	public List<Long> buscarTimes() {
		List<Long> result = arrayListTime.stream().map(x -> x.getId()).collect(Collectors.toList());
		result.sort(Comparator.naturalOrder());
		return result;
	}

	public Long buscarJogadorMaiorSalario(Long idTime) {
		Long result;
		try {
			Validacoes.buscarTime(idTime, arrayListTime);
			List<Long> maiorSalario = arrayListJogador.stream().filter(x -> x.getIdTime() == idTime)
					.sorted(Comparator.comparing(Jogador::getSalario).reversed())
					.map(Jogador::getId).collect(Collectors.toList());
			result = maiorSalario.get(0);
		}catch (TimeNaoEncontradoException e) {
			throw new TimeNaoEncontradoException();
		}
		return result;
	}

	public BigDecimal buscarSalarioDoJogador(Long idJogador) {
		BigDecimal result;
		try {
			Validacoes.buscarJogador(idJogador, arrayListJogador);
			List<BigDecimal> salarioJogador = arrayListJogador.stream().filter(x -> x.getId() == idJogador).map(Jogador::getSalario).collect(Collectors.toList());
			result = salarioJogador.get(0);
		}catch (JogadorNaoEncontradoException e){
			throw new JogadorNaoEncontradoException();
		}
		return result;
	}

	public List<Long> buscarTopJogadores(Integer top) {
		List<Long> result = new ArrayList<Long>();

		List<Long> topJogadores = arrayListJogador.stream().map(Jogador::getId).collect(Collectors.toList());

		if(topJogadores.size() == 0){
			return new ArrayList<>();
		}

		topJogadores.sort(Comparator.reverseOrder());

		for(int i = 0;  i < top; i++){
			result.add(topJogadores.get(i));
		}

		return result;
	}

}
