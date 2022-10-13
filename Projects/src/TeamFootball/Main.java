package TeamFootball;

public class Main {
    public static void main(String[] args){
        FootballTeam bimbocaFc = new FootballTeam("Bimboca FC", 1);
        FootballTeam computersFc= new FootballTeam("Computers FC", 0);
        FootballTeam billabongFc = new FootballTeam("BillabongFc", 2);
        Campeonato brasileirao = new Campeonato();

        brasileirao.realizaJogo(bimbocaFc, computersFc);
        brasileirao.realizaJogo(billabongFc, computersFc);
        brasileirao.realizaJogo(billabongFc, bimbocaFc);


        bimbocaFc.imprime();
        computersFc.imprime();
        billabongFc.imprime();
    }
}
