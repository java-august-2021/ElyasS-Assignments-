public class Mammal {
    protected int energyLevel = 100;

    public int displayEnergy(){
        System.out.println(energyLevel);
        return this.energyLevel;
    }

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }
}
