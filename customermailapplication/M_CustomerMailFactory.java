public class M_CustomerMailFactory implements CustomerMailFactory {
    @Override
    public Customer creaCustomer(){
        return new MountainCustomer();
    }
}
