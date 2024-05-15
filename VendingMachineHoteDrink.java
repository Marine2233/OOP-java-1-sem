import java.util.ArrayList;
import java.util.List;

public class VendingMachineHoteDrink implements IVMHoteDrink {
    private List<HoteDrink>listDrink;

    @Override
    public void initHoteDrink(List<HoteDrink> listDrink) {
        this.listDrink = listDrink;}

    @Override
    public void addHoteDrink(HoteDrink drink) {
        if(listDrink == null)
            listDrink = new ArrayList<>();
        listDrink.add(drink);}

    @Override
    public HoteDrink getHoteDrink(String name, double volume, int temperature) {
        for (HoteDrink hoteDrink : listDrink) {
            if (hoteDrink.getName().equalsIgnoreCase(name) && hoteDrink.getVolume() == volume && hoteDrink.getTemperature() == temperature) {
                System.out.println(hoteDrink.getName() + "\nvolume: " + hoteDrink.getVolume());
                return hoteDrink;
            }  
        }
        return null;
    }
    
}
