package carRacing;

import car.Car;
import java.util.ArrayList;
import java.util.List;

public class Winner {

    public List<String> findWinersString(List<Car> cars) {

        int maxLocation = findMaxLocation(cars, 0);

        return findWinnerNames(cars, maxLocation);
    }

    private static List<String> findWinnerNames(List<Car> cars, int maxLocation) {
        List<String> winnerNames = new ArrayList<>();
        for (Car car : cars) {
            winnersList(maxLocation, winnerNames, car);
        }
        return winnerNames;
    }

    private static int findMaxLocation(List<Car> cars, int maxLocation) {
        for (Car car : cars) {
            maxLocation = car.maxLocation(maxLocation);
        }
        return maxLocation;
    }

    private static void winnersList(int maxLocation, List<String> winnerNames, Car car) {
        if (maxLocation == car.getLocation()) {
            winnerNames.add(car.cardName());
        }
    }

    public List<Car> findWinners(List<Car> cars) {

        int maxLocation = findMaxLocation(cars, 0);
        return findWinners(cars, maxLocation);
    }

    private static List<Car> findWinners(List<Car> cars, int maxLocation) {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            winners(maxLocation, winners, car);
        }
        return winners;
    }

    private static void winners(int maxLocation, List<Car> winners, Car car) {
        if (car.isMatchLocation(maxLocation)) {
            winners.add(car);
        }
    }
}
