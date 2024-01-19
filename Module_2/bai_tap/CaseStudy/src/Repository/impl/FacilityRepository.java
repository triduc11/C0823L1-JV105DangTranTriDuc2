package Repository.impl;

import Model.Facility;
import Model.Villa;
import Repository.IFacilityRepository;

import java.util.*;

public class FacilityRepository implements IFacilityRepository<Facility> {
    private static final String filePath = "D:\\C0823L1-JV105DangTranTriDuc\\C0823L1-JV105DangTranTriDuc2\\Module_2\\bai_tap\\CaseStudy\\src\\Data\\FacilityFile.csv";
    private static Map<Facility, Integer> facilityUsage = new LinkedHashMap<>();

    static {
        facilityUsage.put(new Villa("SVVL-0001", "Villa Fur", 30, 30, 15, "Villa", 2, "VIP", 40, 2), 0);
    }

    @Override
    public List<Facility> displayListMaintenance() {
        List<Facility> facilitiesNeedMaintenance = new ArrayList<>();
        for (Map.Entry<Facility, Integer> entry : facilityUsage.entrySet()) {
            if (entry.getValue() >= 5) {
                facilitiesNeedMaintenance.add(entry.getKey());
            }
        }
        return facilitiesNeedMaintenance;
    }

    public static void increaseUsageCount(Facility facility) {
        Integer usageCount = facilityUsage.get(facility);
        facilityUsage.put(facility, usageCount + 1);
    }

    @Override
    public void add(Facility facility) {
        facilityUsage.put(facility, 0);
    }

    @Override
    public ArrayList<Facility> display() {
        return new ArrayList<>(facilityUsage.keySet());
    }

    @Override
    public Facility update(Facility facility) {
        ArrayList<Facility> list = display();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(facility)) {
                list.set(i, facility);
                break;
            }
        }
        return facility;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Facility findById(String id) {
        ArrayList<Facility> list = display();
        for (Facility facility : list) {
            if (Objects.equals(facility.getServiceCode(), id)) {
                return facility;
            }
        }
        return null;
    }


}



