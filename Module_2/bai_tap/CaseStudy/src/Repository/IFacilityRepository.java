package Repository;

import java.util.List;

public interface IFacilityRepository<T> extends IRepository<T> {
    List<T> displayListMaintenance();
}
