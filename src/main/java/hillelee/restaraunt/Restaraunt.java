package hillelee.restaraunt;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Data;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.groupingBy;

public class Restaraunt {
    public static void main(String[] args) {
        List<Dish> menu = null;

        Map<DishType, Double> dishTypeToAverageCalories = menu.stream()
                                                              .collect(groupingBy(Dish::getType, averagingInt(Dish::getCalories)));
    }
}

@Data
class Dish {
    DishType type;
    Integer calories;
}

enum DishType {
    CHICKEN;
}