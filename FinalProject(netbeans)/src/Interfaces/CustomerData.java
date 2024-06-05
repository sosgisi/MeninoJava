package Interfaces;

public interface CustomerData {
    public String getName();
    public int getTickets();
    public String getTime();
    public String getPlace();
    public String getSeatNumber();
    public String getMovieName();
    public int getIteration();
    public double getPrice();
    //public String getId();
    public void setName(String name);
    public void setTickets(int tickets);
    public void setTime(String time);
    public void setPlace(String place);
    public void setSeatNumber(String seatNumber);
    public void setMovieName(String movieName);
    public void setIteration(int iteration);
    public void setPrice(double price);
    //public void setId(String id);
    
    double price();
    double totalPrice();
}
