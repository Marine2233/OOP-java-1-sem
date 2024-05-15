public class HoteDrink extends BootleOfWoter{
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public HoteDrink(String name, int cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
        
    }
    
}
