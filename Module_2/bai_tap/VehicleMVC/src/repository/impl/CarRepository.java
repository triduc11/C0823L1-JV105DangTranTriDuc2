package repository.impl;

import model.Car;
import repository.ICarRepository;
import utils.FileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarRepository implements ICarRepository<Car> {
    String filePath = "D:\\C0823L1-JV105DangTranTriDuc\\C0823L1-JV105DangTranTriDuc2\\Module_2\\bai_tap\\VehicleMVC\\src\\data\\CarFile";

    public void convertToFile(ArrayList<Car> cars) {
        List<String> stringList = new ArrayList<>();
        for (Car line : cars) {
            stringList.add(line.getInfor());
        }
        FileIO.WriteToFile(filePath, stringList, false);
    }

    @Override
    public void add(Car car) {
        List<String> stringList = new ArrayList<>();
        stringList.add(car.getInfor());
        FileIO.WriteToFile(filePath, stringList, true);
    }

    @Override
    public ArrayList<Car> findAll() {
        ArrayList<Car> cars = new ArrayList<>();
        List<String> stringList = FileIO.ReadFromFile(filePath);
        for (String line : stringList) {
            String[] fields = line.split(",");
            String licensePlate = fields[0];
            String manufacturerName = fields[1];
            int manufactureYear = Integer.parseInt(fields[2]);
            String owner = fields[3];
            int seatingCapacity = Integer.parseInt(fields[4]);
            String carType = fields[5];
            Car car1 = new Car(licensePlate, manufacturerName, manufactureYear, owner, seatingCapacity, carType);
            cars.add(car1);
        }
        return cars;
    }

    @Override
    public void delete(String code) {
        ArrayList<Car> list = findAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLicensePlate().equals(code))
            {
                list.remove(i);
                break;
            }
        }
        convertToFile(list);
    }

    @Override
    public Car findById(String code) {
        ArrayList<Car> list = findAll();
        for (Car car:list) {
            if (Objects.equals(car.getLicensePlate(),code)){
                return car;
            }
        }
        return null ;
    }
}
