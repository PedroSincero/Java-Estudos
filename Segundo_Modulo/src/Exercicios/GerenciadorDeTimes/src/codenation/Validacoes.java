package br.com.codenation;

import br.com.codenation.exceptions.CapitaoNaoInformadoException;
import br.com.codenation.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.exceptions.JogadorNaoEncontradoException;
import br.com.codenation.exceptions.TimeNaoEncontradoException;
import br.com.codenation.meuTime.Jogador;
import br.com.codenation.meuTime.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Validacoes {

    public static void verificarSeTimeJaExiste(Long idTime, List<Time> arrayListTime)  throws IdentificadorUtilizadoException {
        Boolean time = arrayListTime.stream().anyMatch(x -> x.getId() == idTime);
        if(time) throw new IdentificadorUtilizadoException();
    }

    public static void verificarSeJogadorJaExiste(Long idJogador, List<Jogador> arrayListJogador) throws IdentificadorUtilizadoException {
        Boolean jogador = arrayListJogador.stream().anyMatch(x -> x.getId() == idJogador);
        if(jogador) throw new IdentificadorUtilizadoException();
    }

    public static void buscarJogador(Long idJogador, List<Jogador> arrayListJogador) throws JogadorNaoEncontradoException {
        Boolean jogador = arrayListJogador.stream().anyMatch(x -> x.getId() == idJogador);
        if(!jogador) throw new JogadorNaoEncontradoException();
    }

    public static void buscarTime(Long idTime, List<Time> arrayListTime) throws TimeNaoEncontradoException {
        Boolean time = arrayListTime.stream().anyMatch(x -> x.getId() == idTime);
        if(!time) throw new TimeNaoEncontradoException();
    }

    public static void verificarSeCapitaoExiste(List<Long> buscarCapitao) throws CapitaoNaoInformadoException {
        if(buscarCapitao.size() == 0) throw new CapitaoNaoInformadoException();
    }

//    public static ArrayList verificarSeExisteTopJogadores(List<Long> topJogadores) {
//        if(topJogadores.size() == 0){
//            return new ArrayList<>();
//        }
//        return null;
//    }
}
