//package controller;
//
//import model.BenhNhanThuong;
//import service.impl.BenhNhanThuongService;
//
//import java.util.ArrayList;
//
//
//public class BenhNhanThuongController {
//    private final BenhNhanThuongService benhNhanThuongService = new BenhNhanThuongService();
//
//    public ArrayList<BenhNhanThuong> findAll() {
//        return benhNhanThuongService.display();
//    }
//
//    public BenhNhanThuong findByID(String id) {
//        return benhNhanThuongService.findById(id);
//    }
//
//    public void add(BenhNhanThuong benhNhanThuong) {
//        benhNhanThuongService.add(benhNhanThuong);
//    }
//
//    public String delete(String id) {
//        BenhNhanThuong benhNhanThuong = benhNhanThuongService.findById(id);
//        if (benhNhanThuong != null) {
//                benhNhanThuongService.delete(id);
//                return "Delete successfully";
//        } else {
//            return "Code does not exist";
//        }
//    }
//}
