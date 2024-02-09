
public class ProductManager implements IProductService{
    private IBankService iBankService;
    public ProductManager(IBankService iBankService){
        this.iBankService = iBankService;
    }
    @Override
    public void sell(Product product, Customer customer) {
        double price = product.getPrice();
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
        System.out.println("Ürünlerinizin toplam fiyatı: " + product.getPrice());

        CurrencyRate currencyRate = new CurrencyRate(price,1);
        iBankService.convertRate(currencyRate);
        System.out.println(price);
        CurrencyRate currencyRates = new CurrencyRate(price,2);
        price =  iBankService.convertRate(currencyRates);
        System.out.println(price);
    }
    public void sell(Product product, Student student){
        double price = product.getPrice() * student.getDiscountRate();
        System.out.println("Öğrenci olduğunuz için %10 indirim kazandınız");
        System.out.println("Ürünlerinizin toplam fiyatı: " + product.getPrice());
        System.out.println("Öğrenci indirimli fiyatınız: " + price);
    }

}