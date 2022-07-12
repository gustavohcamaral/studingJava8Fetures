//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.Period;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class RestaurantSuggestionService {
//    List<Restaurant> restaurants;
////    1. Restaurant is online
////    2. Restaurant didn't have any orders in the year specified in the method argument
////    Set<String> suggestNotOrderedRestaurants(int year){
////        List<Restaurant> rest = restaurants.stream()
////                .filter(r -> r.getStatus().equals("online")).toList();
////        rest.stream()
////                .filter(r -> r.getOrders().stream().filter(o -> o.getDate().getYear() != year).)
////                .forEach(r -> System.out.println(r.getName()));
//
//
//        return null;
//    }
////    1. Belong to one of the customer's favourite cuisines
////    2. Belongs to the city specified in the method argument
////    3. Have had at least 1 order with a rating higher than 7
//    Set<String> suggestHighRatingRestaurants(Customer customer, String city){
//        return null;
//    }
//
////    1. Belong to one of the customer's favourite cuisines
////    2. Restaurant is online
////    3. Have had at least 1 order, placed by a different customer, with a rating higher than 7
//    Set<String> suggestRestaurants(Customer customer){
//        return null;
//    }
//}
//class Customer{
//    private String name;
//    List<String> favouriteCuisines;
//
//    public Customer(String name, List<String> favouriteCuisines) {
//        this.name = name;
//        this.favouriteCuisines = favouriteCuisines;
//    }
//
//    public String getName() {return name; }
//
//    public List<String> getFavouriteCuisines() { return favouriteCuisines; }
//}
//
//class Restaurant{
//    private String name;
//    private String cousine;
//    List<Order> orders;
//
//    private String status;
//
//    public Restaurant(String name, String cousine, String status){
//        this.name = name;
//        this.cousine = cousine;
//        this.status = status;
//    }
//
//    public String getName() { return name; }
//
//    public String getCousine() { return cousine; }
//
//
//    public String getStatus() { return status; }
//
//    public List<Order> getOrders() { return orders; }
//
//    public void setOrders(List<Order> orders) {
//        this.orders = orders;
//    }
//
//}
//
//class Order{
//    private Restaurant restaurant;
//    private Customer customer;
//    private LocalDate date;
//    private int rating;
//
//    public Restaurant getRestaurant() { return restaurant; }
//
//    public Customer getCustomer() { return customer; }
//
//    public LocalDate getDate() { return date; }
//
//    public int getRating() { return rating; }
//
//}
