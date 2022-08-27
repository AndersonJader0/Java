public class Condicional {
	
        //if (condição) instrução.
        
        /*if (condição) {
        instrução1;
        instrução2;
        }
        */
        public static void main(String[] args) {
            
            int x = 11;
        
        // a condição deve ser colocada entre parenteses e podem conte, várias expressões combinadas com os operadores lógicos.
        //isso dará inicio ou vai pular a execução desse bloco. lembrando que o bloco é definido como o que está dentro das chaves.
        //if (x > 10) {
            //System.out.println("X é maior que 10");
            //System.out.println("***** FIM *****");
        //}
        
        //podemos também adicionar um outro bloco else pois caso o bloco if for false ele será executado.
        
        /*if (condição) {
             instrução;
         }else{
             instrução;
         }	
         */
            /*if (x > 12) {
                System.out.println("X é maior que 12");
            } else {
                System.out.println("X é menor que 12");
            }
                */
            
            //é possível ainda utilizar uma instrução dentro de outra instrução;
            
            if(x > 12){
                System.out.println("X é maior que 12");
            } else if(x == 10){
                System.out.println("X é igual a 12");
            } else {
                System.out.println("X é menor que 12");
        }
     }
}
