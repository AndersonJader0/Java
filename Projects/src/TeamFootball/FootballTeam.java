package TeamFootball;

public class FootballTeam {
    public static final int RETRANCA = 0;
    public static final int ATAQUE = 1;
    public static final int NEUTRO = 2;

    private String nome;
    private int qtdeJogosRealizados;
    private int pontosGanhos;
    private int estrategia; // RETRANCA / ATAQUE / NEUTRO

    public FootballTeam(String nome, int estrategia){
        this.nome = nome;
        this.estrategia = estrategia;
        qtdeJogosRealizados = 0;
        pontosGanhos = 0;
    }

    public int getEstrategia(){
        return estrategia;
    }

    public void venceu(){
        qtdeJogosRealizados++;
        pontosGanhos = pontosGanhos + 3;
    }
    public void empatou(){
        qtdeJogosRealizados++;
        pontosGanhos = pontosGanhos + 1;
    }
    public void perdeu(){
        qtdeJogosRealizados++;
    }
    public void imprime(){
        System.out.println("Time: " + nome +
        "\nJogos: " + qtdeJogosRealizados +
        "\nPontos: " + pontosGanhos +
                        "\nEstratégia: " + estrategia);
    }
}