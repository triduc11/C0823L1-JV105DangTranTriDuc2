package Service.impl;

import Model.Facility;
import Model.House;
import Model.Room;
import Model.Villa;
import Repository.impl.FacilityRepository;
import Service.IFacilityService;
import Utils.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityService implements IFacilityService<Facility> {
    FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public ArrayList<Facility> display() {
        return facilityRepository.display();
    }

    @Override
    public Facility update(String id) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Facility> list = display();
        if (id.contains("SVVL")) {
            System.out.println("1.Update serviceName");
            System.out.println("2.Update area");
            System.out.println("3.Update rentalCost");
            System.out.println("4.Update maxCapacity");
            System.out.println("5.Update rentalType");
            System.out.println("6.Update maintenanceThreshold");
            System.out.println("7.Update roomStandard");
            System.out.println("8.Update poolArea");
            System.out.println("9.Update numberOfFloors");
            System.out.println("Choose option");
            for (Facility facility : list) {
                if (facility.getServiceCode().equals(id)) {
                    Villa villa = (Villa) facility;
                    int n = Integer.parseInt(scanner.nextLine());
                    switch (n) {
                        case 1:
                            System.out.println("-Update serviceName");
                            villa.setServiceName(Valid.validName());
                            break;
                        case 2:
                            System.out.println("-Update area");
                            villa.setArea(Double.parseDouble(scanner.nextLine()));
                            break;
                        case 3:
                            System.out.println("-Update rentalCost");
                            villa.setRentalCost(Valid.validRentCost());
                            break;
                        case 4:
                            System.out.println("-Update maxCapacity");
                            villa.setMaxCapacity(Valid.validMaxCapacity());
                            break;
                        case 5:
                            System.out.println("-Update rentalType");
                            villa.setRentalType(scanner.nextLine());
                            break;
                        case 6:
                            System.out.println("-Update maintenanceThreshold");
                            villa.setMaintenanceThreshold(Integer.parseInt(scanner.nextLine()));
                            break;
                        case 7:
                            System.out.println("-Update roomStandard");
                            villa.setRoomStandard(scanner.nextLine());
                            break;
                        case 8:
                            System.out.println("-Update poolArea");
                            villa.setPoolArea(Valid.validArea());
                            break;
                        case 9:
                            System.out.println("-Update numberOfFloors");
                            villa.setNumberOfFloors(Valid.validNumberOfFloors());
                            break;
                        default:
                            break;
                    }
                    return facilityRepository.update(villa);
                }
            }
        } else if (id.contains("SVHO")) {
            System.out.println("1.Update serviceName");
            System.out.println("2.Update area");
            System.out.println("3.Update rentalCost");
            System.out.println("4.Update maxCapacity");
            System.out.println("5.Update rentalType");
            System.out.println("6.Update maintenanceThreshold");
            System.out.println("7.Update roomStandard");
            System.out.println("8.Update numberOfFloors");
            System.out.println("Choose option");
            for (Facility facility : list) {
                if (facility.getServiceCode().equals(id)) {
                    House house = (House) facility;
                    int n = Integer.parseInt(scanner.nextLine());
                    switch (n) {
                        case 1:
                            System.out.println("-Update serviceName");
                            house.setServiceName(Valid.validName());
                            break;
                        case 2:
                            System.out.println("-Update area");
                            house.setArea(Double.parseDouble(scanner.nextLine()));
                            break;
                        case 3:
                            System.out.println("-Update rentalCost");
                            house.setRentalCost(Valid.validRentCost());
                            break;
                        case 4:
                            System.out.println("-Update maxCapacity");
                            house.setMaxCapacity(Valid.validMaxCapacity());
                            break;
                        case 5:
                            System.out.println("-Update rentalType");
                            house.setRentalType(scanner.nextLine());
                            break;
                        case 6:
                            System.out.println("-Update maintenanceThreshold");
                            house.setMaintenanceThreshold(Integer.parseInt(scanner.nextLine()));
                            break;
                        case 7:
                            System.out.println("-Update roomStandard");
                            house.setRoomStandard(scanner.nextLine());
                            break;
                        case 8:
                            System.out.println("-Update numberOfFloors");
                            house.setNumberOfFloors(Valid.validNumberOfFloors());
                            break;
                        default:
                            break;
                    }
                    return facilityRepository.update(house);
                }
            }
        } else if (id.contains("SVRO")) {
            System.out.println("1.Update serviceName");
            System.out.println("2.Update area");
            System.out.println("3.Update rentalCost");
            System.out.println("4.Update maxCapacity");
            System.out.println("5.Update rentalType");
            System.out.println("6.Update maintenanceThreshold");
            System.out.println("7.Update freeServices");
            System.out.println("Choose option");
            for (Facility facility : list) {
                if (facility.getServiceCode().equals(id)) {
                    Room room = (Room) facility;
                    int n = Integer.parseInt(scanner.nextLine());
                    switch (n) {
                        case 1:
                            System.out.println("-Update serviceName");
                            room.setServiceName(Valid.validName());
                            break;
                        case 2:
                            System.out.println("-Update area");
                            room.setArea(Double.parseDouble(scanner.nextLine()));
                            break;
                        case 3:
                            System.out.println("-Update rentalCost");
                            room.setRentalCost(Valid.validRentCost());
                            break;
                        case 4:
                            System.out.println("-Update maxCapacity");
                            room.setMaxCapacity(Valid.validMaxCapacity());
                            break;
                        case 5:
                            System.out.println("-Update rentalType");
                            room.setRentalType(scanner.nextLine());
                            break;
                        case 6:
                            System.out.println("-Update maintenanceThreshold");
                            room.setMaintenanceThreshold(Integer.parseInt(scanner.nextLine()));
                            break;
                        case 7:
                            System.out.println("-Update freeServices");
                            room.setFreeServices(Valid.freeServices());
                            break;
                        default:
                            break;
                    }
                    return facilityRepository.update(room);
                }
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Facility findById(String id) {
        return facilityRepository.findById(id);
    }

    @Override
    public List<Facility> displayListMaintenance() {
        return facilityRepository.displayListMaintenance();
    }

    public void add(Facility facility) {
        facilityRepository.add(facility);
        System.out.println("Added successfully.");
    }

}
