class Airplane{
    private int flightNumber;
    private String Destination, Departure;
    private String DepartureTime;
    private Boolean delay = false;
    
    public Airplane(int flightNumber, String destination, String departure, String departureTime, Boolean delay) {
        this.flightNumber = flightNumber;
        Destination = destination;
        Departure = departure;
        DepartureTime = departureTime;
        this.delay = delay;
    }

    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getDestination() {
        return Destination;
    }
    public void setDestination(String destination) {
        Destination = destination;
    }
    public String getDeparture() {
        return Departure;
    }
    public void setDeparture(String departure) {
        Departure = departure;
    }
    public String getDepartureTime() {
        return DepartureTime;
    }
    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }
    public Boolean getDelay() {
        return delay;
    }
    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

}

class lab4Task6{
    public static void main(String argv[]){
        Airplane a = new Airplane(0012, "Lahore", "Islamabad", "12:00", true);
        a.setDelay(true);
        System.out.println("Flight number:" + a.getFlightNumber());
        System.out.println("Departure: " + a.getDeparture());
        System.out.println("Destination: " + a.getDestination());
        if(a.getDelay())
        {
            System.out.println("Flight is Delayed");
        }
        else{
            System.out.println("Flight is on Time");
        }
    }
}