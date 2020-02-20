/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vikram
 */
public class Flight {
    private String flightId;
    private String airlinerName;
    private String airPlaneName;
    private String departureLocation;
    private String arrivalLocation;
    private String timeOfDay;
    private Date departureDate;
    private Date arrivalDate;
    private int pricePerSeat;
    private int totalSeatsAvailable; //write function to calculate
    private boolean[][] seats;

    public Flight(boolean[][] seats, int rows, int cols) {
        this.seats = seats;
    }
    
    
    
    

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getPricePerSeat() {
        return pricePerSeat;
    }

    public void setPricePerSeat(int pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }

    public boolean[][] getSeats() {
        return seats;
    }

    public void setSeats(boolean[][] seats) {
        this.seats = seats;
    }
    

    public int getTotalSeatsAvailable() {
        return totalSeatsAvailable;
    }

    public void setTotalSeatsAvailable(int totalSeatsAvailable) {
        this.totalSeatsAvailable = totalSeatsAvailable;
    }
//    
//    private ArrayList<Seat> seat;
//
//    public ArrayList<Seat> getSeat() {
//        return seat;
//    }
//
//    public void setSeat(ArrayList<Seat> seat) {
//        this.seat = seat;
//    }

    

    public int getPerSeatRate() {
        return pricePerSeat;
    }

    public void setPerSeatRate(int perSeatRate) {
        this.pricePerSeat = pricePerSeat;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
    
    @Override
    public String toString(){
        return flightId;
    }
}
