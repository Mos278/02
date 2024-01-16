public class D_CustomerMailFactory implements CustomerMailFactory {
    @Override
    public Customer creaCustomer(){
        return new DelinquentCustomer();
    }
}
