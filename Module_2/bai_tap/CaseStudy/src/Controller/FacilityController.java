package Controller;

import Model.Facility;
import Service.impl.FacilityService;

import java.util.ArrayList;

public class FacilityController {
    FacilityService facilityService = new FacilityService();


    public void add(Facility facility) {
        facilityService.add(facility);
    }

    public ArrayList<Facility> displayFacilities() {
        return facilityService.display();
    }

    public Facility findByID(String id) {
        return facilityService.findById(id);
    }

    public String update(String id) {
        Facility facility = facilityService.findById(id);
        if (facility != null) {
            facilityService.update(id);
            return "Update successfully";
        } else {
            return "Facility ServiceCode does not exist";
        }
    }
}
