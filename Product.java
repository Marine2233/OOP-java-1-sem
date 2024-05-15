/*Задача 2 - Инкапсуляция
� Реализуйте конструкторы, get/set методы, постройте логику 
ТорговогоАвтомата на основе кода
сделанного в предыдущем задании. 
ДЗ: Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
 и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат 
и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/
public abstract class Product{
    private int cost;
    private String name;

    public Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public int getCost(){return cost;}
    public void setCost(int cost){this.cost = cost;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    


}