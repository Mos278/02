public class R_CustomerMailFactory implements CustomerMailFactory {
    @Override
    public Customer creaCustomer(){
        return new RegularCustomer();
    }
}
