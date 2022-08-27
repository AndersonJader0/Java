public class IncDec {

    public static void main(String[] args) {

    int z = 10, w = 5, a = 5;

    //x++      adiciona +1 no x;
    //++x      adiciona +1 no x tbm.

    // x--     subtrai 1 no x
    // --×     subtrai 1 no x tbm.

    z = w++;
    System.out.println("z = " + z);
    System.out.println("w = " + w);

    z= --a;
    System.out.println("z = " + z);  //resultado 4
    System.out.println("a = " + a); //resultado 4
   }
}