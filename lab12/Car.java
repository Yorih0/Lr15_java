import java.util.*;
import java.util.stream.Collectors;

public class Car {
    int id;
    String brand;
    String model;
    double rating;
    List<Integer> expertReviews;

    public Car(int id, String brand, String model, double rating, List<Integer> expertReviews) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rating = rating;
        this.expertReviews = new ArrayList<>(expertReviews);
    }

    public double getAverageReview() {
        if (expertReviews == null || expertReviews.isEmpty()) 
            return 0.0;

        double sum = 0;

        for (int r : expertReviews) 
            sum += r;
        return sum / expertReviews.size();
    }

    @Override
    public String toString() {
        return String.format(
            "Car{id=%d, brand='%s', model='%s', rating=%.2f, avgReview=%.2f, reviews=%s}", id, brand, model, rating, getAverageReview(), expertReviews
        );
    }
}