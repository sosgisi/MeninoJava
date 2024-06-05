package JavaClasses;
import Interfaces.CustomerData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// Singleton Design pattern

public class Customer implements CustomerData{
    private static Customer instance;
    
    private String name;
    private int tickets;
    private String time;
    private String place;
    private String seatNumber;
    private String movieName;
    private double price;
    private int iteration;
    
    public ArrayList<String> orderNames = new ArrayList<String>();
    public ArrayList<Integer> orderTickets = new ArrayList<Integer>();
    public ArrayList<String> orderTimes = new ArrayList<String>();
    public ArrayList<String> orderPlaces = new ArrayList<String>();
    public ArrayList<String> orderSeatNumbers = new ArrayList<String>(); 
    public Queue queueSeatNumbers = new LinkedList<>();
    public ArrayList<String> orderMovieNames = new ArrayList<String>();
    public Queue queueMovieNames = new LinkedList<>();
    public ArrayList<Double> orderPrices = new ArrayList<Double>();
    public ArrayList<String> orderIds = new ArrayList<String>();
    
    public HashMap<Integer, String> orderId = new HashMap<Integer, String>();

    public Customer(){
    }
    
    public static Customer getInstance(){
        if(instance == null){
            instance = new Customer();
        }
        return instance;
    }
    
    @Override
    public double price() {
        String temp = place.substring(place.length()-3);
        int price = 0;
        if(temp.equals("XXI")){
            price = 35000;
        }else if(temp.equals("CGV")){
            price = 50000;
        }
        return price * tickets;
    }

    @Override
    public double totalPrice() {
        double totalPrice = 0;
        for(Double orderPrices : orderPrices){
            totalPrice += orderPrices;
        }
        return totalPrice;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTickets() {
        return tickets;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public String getPlace() {
        return place;
    }

    @Override
    public String getSeatNumber() {
        return seatNumber;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }


    @Override
    public String getMovieName() {
        return movieName;
    }

    @Override
    public int getIteration() {
        return iteration;
    }

    @Override
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }


}
