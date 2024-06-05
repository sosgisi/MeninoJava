package JavaClasses;

import Interfaces.Payments;

public class GopayPayment implements Payments{
private double price;
    private String phoneNumber;
    private String pin;
    
    public GopayPayment(double price, String phoneNumber, String pin){
        this.price = price;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }
            
    @Override
    public double totalPrice() {
        double discount = 0.40 * price;
        return price - discount;
    }

    @Override
    public boolean check() {
        boolean bool = false;
        if(phoneNumber.matches("-?\\d+(\\.\\d+)?") && pin.matches("-?\\d+(\\.\\d+)?")){
            bool = true;
        }
        return bool;
    }
    
}
