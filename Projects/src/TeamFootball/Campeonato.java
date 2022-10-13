package TeamFootball;

public class Campeonato {
    private int qtdeJogos;

    public Campeonato() {
        qtdeJogos = 0;
    }

    public void realizaJogo(FootballTeam timeCasa, FootballTeam timeVisitante) {
        qtdeJogos++;
        if (timeCasa.getEstrategia() == 0 && timeVisitante.getEstrategia() == 1) {
            timeCasa.venceu();
            timeVisitante.perdeu();
        } else if (timeCasa.getEstrategia() == 1 && timeVisitante.getEstrategia() == 0) {
            timeVisitante.venceu();
            timeCasa.perdeu();
        } else if (timeCasa.getEstrategia() == timeVisitante.getEstrategia()) {
            timeCasa.empatou();
            timeVisitante.empatou();
        } else if (timeCasa.getEstrategia() == 2 && timeVisitante.getEstrategia() == 0) {
            timeCasa.venceu();
            timeVisitante.perdeu();
        } else if (timeCasa.getEstrategia() == 2 && timeVisitante.getEstrategia() == 1) {
            timeCasa.perdeu();
            timeVisitante.venceu();
        }
    }
}
