package Service;

import Model.Facility;

import java.util.List;

public interface IFacilityService<T> extends IService<T> {

    List<T> displayListMaintenance();
}

