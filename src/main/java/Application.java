import dao.City;
import dao.DAO;
import dao.DAOCityHashMap;

public class Application {
    public static void main(String[] args) {
        DAO<City> cities = new DAOCityHashMap();
        cities.store(new City(1, "Kyiv"));
        cities.store(new City(2, "New-York"));
        cities.store(new City(3, "Chicago"));

        cities.getAll().forEach(System.out::println);
    }
}
