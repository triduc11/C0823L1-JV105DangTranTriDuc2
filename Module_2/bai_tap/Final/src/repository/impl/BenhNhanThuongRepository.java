package repository.impl;

import model.BenhNhan;
import model.BenhNhanThuong;
import model.BenhNhanVIP;
import repository.IRepository;
import utils.FileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//public class BenhNhanThuongRepository implements IRepository<BenhNhan> {
//    private final String filePath = "D:\\C0823L1-JV105DangTranTriDuc\\C0823L1-JV105DangTranTriDuc2\\Module_2\\bai_tap\\Final\\src\\data\\medical_records.csv";
//
//
//    @Override
//    public void add(BenhNhan benhNhan) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add(benhNhan.getInfor());
//        FileIO.WriteToFile(filePath, stringList, true);
//    }
//
//    @Override
//    public ArrayList<BenhNhan> display() {
//        ArrayList<BenhNhan> benhNhanThuongs = new ArrayList<>();
//        List<String> stringList = FileIO.ReadFromFile(filePath);
//        for (String line : stringList) {
//            String[] fields = line.split(",");
//            int stt = Integer.parseInt(fields[0]);
//            String code = fields[1];
//            if (code.contains("BT")) {
//                String name = fields[2];
//                String startDate = fields[3];
//                String endDate = fields[4];
//                String lyDo = fields[5];
//                double price = Double.parseDouble(fields[6]);
//                BenhNhanThuong benhNhanThuong = new BenhNhanThuong(stt, code, name, startDate, endDate, lyDo, price);
//                benhNhanThuongs.add(benhNhanThuong);
//            }else if (code.contains("VIP")){
//                String name = fields[2];
//                String startDate = fields[3];
//                String endDate = fields[4];
//                String lyDo = fields[5];
//                String date = fields[6];
//                String position=fields[7];
//                BenhNhanVIP benhNhanVIP = new BenhNhanVIP(stt, code, name, startDate, endDate, lyDo, date, position);
//                benhNhanThuongs.add(benhNhanVIP);
//            }
//        }
//        return benhNhanThuongs;
//    }
//
//    @Override
//    public void delete(String code) {
//
//    }
//
//    @Override
//    public BenhNhan findById(String code) {
//        return null;
//    }


//}
