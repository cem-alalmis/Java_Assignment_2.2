
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Bilgisayar",15000.0);
        Product product2 = new Product(2,"Telefon",8500.0);

        Customer customer1 = new Customer(1,"Engin Demiroğ");
        Student customer2 = new Student(2,"Cem Alalmış");

        IBankService iBankService = new CentralBankService();
        ProductManager productManager = new ProductManager(iBankService);

        productManager.sell(product1,customer1);
        productManager.sell(product1,customer2);



    }

}