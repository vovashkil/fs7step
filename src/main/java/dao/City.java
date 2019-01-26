package dao;

public class City implements Identifiable {
    private final int id;
    private final String name;

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("City: %s", this.name);
    }

    public String getName() {
        return name;
    }

    @Override
    public int id() {
        return this.id;
    }
}
