//package service.impl;
//
//import model.BenhNhanThuong;
//import repository.impl.BenhNhanThuongRepository;
//import service.IService;
//
//import java.util.ArrayList;
//
//public class BenhNhanThuongService implements IService<BenhNhanThuong> {
//    private final BenhNhanThuongRepository benhNhanThuongRepository = new BenhNhanThuongRepository();
//
//    @Override
//    public void add(BenhNhanThuong benhNhanThuong) {
//        benhNhanThuongRepository.add(benhNhanThuong);
//    }
//
//    @Override
//    public ArrayList<BenhNhanThuong> display() {
//        return benhNhanThuongRepository.display();
//    }
//
//    @Override
//    public void delete(String id) {
//        benhNhanThuongRepository.delete(id);
//    }
//
//    @Override
//    public BenhNhanThuong findById(String id) {
//        return benhNhanThuongRepository.findById(id);
//    }
//}
