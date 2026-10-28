package estudos.ModificadoresEstaticos;

public class Carro {
    private String nameCar;
    private int speedmx;
    private static int speedlm = 250; // ao usar static qualquer objeto que utilize speelm terar o mesmo valor

    public void imprime() {
        System.out.println("*---------------------* ");
        System.out.println("the nema of the car is " + nameCar);
        System.out.println("velocidade maxima " + speedmx);
        System.out.println("velocidade limete " + Carro.speedlm);
        // o correto e colocar a class e não o this por mais que funsione
    }

    public Carro(String nameCar, int speedmx) {
        this.nameCar = nameCar;
        this.speedmx = speedmx;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public int getSpeedmx() {
        return speedmx;
    }

    public void setSpeedmx(int speedmx) {
        this.speedmx = speedmx;
    }

    public static int getSpeedlm() {
        return speedlm;
    }

    public static void setSpeedlm(int speedlm) {
        Carro.speedlm = speedlm;// pode se usar o this pois isso não é um objeto
    }

}
