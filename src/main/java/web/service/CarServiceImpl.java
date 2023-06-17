package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsList(int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("1", 1, "1"));
        carList.add(new Car("2", 2, "2"));
        carList.add(new Car("3", 3, "3"));
        carList.add(new Car("4", 4, "4"));
        carList.add(new Car("5", 5, "5"));
        return carList.stream().limit(count).toList();
    }
}
