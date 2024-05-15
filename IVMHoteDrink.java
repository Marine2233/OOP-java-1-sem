import java.util.List;

public interface IVMHoteDrink {

    void initHoteDrink(List<HoteDrink>listDrink);
    void addHoteDrink(HoteDrink drink);
    HoteDrink getHoteDrink(String name,double volume,int temperature);

}
