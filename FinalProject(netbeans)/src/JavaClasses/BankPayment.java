package JavaClasses;

import Interfaces.Payments;

public class BankPayment implements Payments{
    private double price;
    private String cardNumber;
    private String cardholderName;
    
    public BankPayment(double price, String cardNumber, String cardholderName){
        this.price = price;
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
    }
    
    @Override
    public double totalPrice() {
        return price;
    }

    @Override
    public boolean check() {
        boolean bool = false;
        if(cardNumber.matches("-?\\d+(\\.\\d+)?") && !cardholderName.equals("")){
            bool = true;
        }
        return bool;
    }
    
}
