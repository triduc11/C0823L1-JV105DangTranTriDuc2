package repository.impl;

import model.Car;
import model.Truck;
import repository.ITruckRepository;
import utils.FileIO;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository<Truck> {
    String filePath = "D:\\C0823L1-JV105DangTranTriDuc\\C0823L1-JV105DangTranTriDuc2\\Module_2\\bai_tap\\VehicleMVC\\src\\data\\TruckFile";
    public void convertToFile(ArrayList<Truck> trucks) {
        List<String> stringList = new ArrayList<>();
        for (Truck line : trucks) {
            stringList.add(line.getInfor());
        }
        FileIO.WriteToFile(filePath, stringList, false);
    }
    @Override
    public void add(Truck truck) {
        List<String> stringList = new ArrayList<>();
        stringList.add(truck.getInfor());
        FileIO.WriteToFile(filePath, stringList, true);
    }

    @Override
    public ArrayList<Truck> findAll() {
        ArrayList<Truck> trucks = new ArrayList<>();
        List<String> stringList = FileIO.ReadFromFile(filePath);
        for (String line : stringList) {
            String[] fields = line.split(",");
            String licensePlate = fields[0];
            String manufacturerName = fields[1];
            int manufactureYear = Integer.parseInt(fields[2]);
            String owner = fields[3];
            double payloadCapacity= Double.parseDouble(fields[4]);
            Truck truck1 = new Truck(licensePlate, manufacturerName, manufactureYear, owner, payloadCapacity);
            trucks.add(truck1);
        }
        return trucks;
    }

    @Override
    public void delete(String code) {

    }

    @Override
    public Truck findById(String code) {
        return null;
    }
}
