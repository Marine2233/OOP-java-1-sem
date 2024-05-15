public class BootleOfWoter extends Product{
    private double volume;

    public BootleOfWoter(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;
        
    }

    public double getVolume() {return volume;}

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
}
