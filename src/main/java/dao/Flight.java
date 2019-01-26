package dao;

public class Flight implements Identifiable {
    private final String flightNumber;
    private final City from;
    private final City to;

    public Flight(String flightNumber, City from, City to) {
        this.flightNumber = flightNumber;
        this.from = from;
        this.to = to;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public City getFrom() {
        return from;
    }

    public City getTo() {
        return to;
    }

    @Override
    public int id() {
        return this.flightNumber.hashCode();
    }
}
