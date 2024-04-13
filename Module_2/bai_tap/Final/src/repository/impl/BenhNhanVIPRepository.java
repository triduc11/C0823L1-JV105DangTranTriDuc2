package repository.impl;

import model.BenhNhan;
import model.BenhNhanVIP;
import repository.IRepository;
import utils.FileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BenhNhanVIPRepository implements IRepository<BenhNhanVIP> {
    private final String filePath = "D:\\C0823L1-JV105DangTranTriDuc\\C0823L1-JV105DangTranTriDuc2\\Module_2\\bai_tap\\Final\\src\\data\\medical_recordsVIP.csv";

    public void convertToFile(ArrayList<BenhNhanVIP> benhNhanVIPS) {
        List<String> stringList = new ArrayList<>();
        for (BenhNhanVIP line : benhNhanVIPS) {
            stringList.add(line.getInfor());
        }
        FileIO.WriteToFile(filePath, stringList, false);
    }
    @Override
    public void add(BenhNhanVIP benhNhanVIP) {
        List<String> stringList = new ArrayList<>();
        stringList.add(benhNhanVIP.getInfor());
        FileIO.WriteToFile(filePath, stringList, true);
    }

    @Override
    public ArrayList<BenhNhanVIP> display() {
        ArrayList<BenhNhanVIP> benhNhanVIPS=new ArrayList<>();
        List<String> stringList =FileIO.ReadFromFile(filePath);
        for(String line: stringList){
            String [] fields=line.split(",");
            int stt = Integer.parseInt(fields[0]);
            String code =fields[1];
            String name = fields[2];
            String startDate = fields[3];
            String endDate = fields[4];
            String lyDo = fields[5];
            String date = fields[6];
            String position=fields[7];
            BenhNhanVIP benhNhanVIP = new BenhNhanVIP(stt, code, name, startDate, endDate, lyDo, date, position);
            benhNhanVIPS.add(benhNhanVIP);
        }
        return benhNhanVIPS;
    }

    @Override
    public void delete(String code) {
    ArrayList<BenhNhanVIP> list=display();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)){
                list.remove(i);
                break;
            }
        }
        convertToFile(list);
    }

    @Override
    public BenhNhanVIP findById(String code) {
        ArrayList<BenhNhanVIP> list=display();
        for (BenhNhanVIP benhNhanVIP:list){
            if (Objects.equals(benhNhanVIP.getCode(),code)){
                return benhNhanVIP;
            }
        }
        return null;
    }




}
