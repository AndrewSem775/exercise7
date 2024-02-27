public class BuisnessContact extends ContactBook{
    private int phoneNumber;
    public BuisnessContact(String name, String email, int phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("oh yea and also the phone number is: " + phoneNumber);
    }
}
