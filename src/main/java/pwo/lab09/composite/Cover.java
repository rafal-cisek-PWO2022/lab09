package pwo.lab09.composite;

public class Cover extends WaterSystem {
    public void fill() {
        System.out.println("Pokrywa podniesiona");
        super.fill();
    }    

    public void afterFill() {
        System.out.println("Pokrywa opuszczona");
        super.afterFill();
    }

    public void drain() {
        System.out.println("Pokrywa podniesiona");
        super.drain();
    }    

    public void afterDrain() {
        System.out.println("Pokrywa opuszczona");
        super.afterDrain();
    }
}
