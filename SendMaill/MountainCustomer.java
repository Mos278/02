
public class MountainCustomer extends Customer {
    @Override
    public String createMail() {
        return "Mountain Customer Mail";
    }

    @Override
    public String sentBrochure() {
       return "Mountain Customer Brochure";
    }
}
