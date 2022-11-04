package Armas;

public class Revolver extends Arma{

    private int cartucho = 6;

    public Revolver(double destruicao, int cartucho){
        super(destruicao);
        this.cartucho = cartucho;
    }

    public int getCartucho() {
        return cartucho;
    }

    public void setCartucho(int cartucho) {
        this.cartucho = cartucho;
    }

    public void disparar() {
        if(this.getCartucho() >= 1){
            this.setCartucho(this.getCartucho()-1);
        } else{
            System.out.println("Recarregue a arma!");
        }
    }

    @Override
    public void recarregar() {
        if(this.getCartucho() < 1){
            this.setCartucho(this.getCartucho()+6);
        }else if(this.getCartucho() == 1){
            this.setCartucho(this.getCartucho()+5);
        }else if(this.getCartucho() == 2){
            this.setCartucho(this.getCartucho()+4);
        }else if(this.getCartucho() == 3){
            this.setCartucho(this.getCartucho()+3);
        }else if(this.getCartucho() == 4){
            this.setCartucho(this.getCartucho()+2);
        }else if(this.getCartucho() == 5){
            this.setCartucho(this.getCartucho()+1);
        }
    }
}
