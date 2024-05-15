public class Program {
    public static void main(String[] args) {
        // Product product = new Product("1", 100);
        // Product product1 = new Product("2", 100);
        // Product product2 = new Product("3", 100);
  
        // VendingMachine vMachine = new VendingMachine();
        // vMachine.addProduct(product);
        // vMachine.addProduct(product1);
        // vMachine.addProduct(product2);
        // System.out.println(vMachine.getProduct("1").getName());

        HoteDrink coffe = new HoteDrink("3in1", 70, 0.3, 90);
        HoteDrink latte = new HoteDrink("latte", 120, 0.2, 90);
        HoteDrink tea = new HoteDrink("black tea", 55, 0.2, 90);

        VendingMachineHoteDrink vm = new VendingMachineHoteDrink();
        vm.addHoteDrink(tea);
        vm.addHoteDrink(latte);
        vm.addHoteDrink(coffe);

        System.out.println(vm.getHoteDrink("latte", 0.2, 90));



        
        
        
    }
}
