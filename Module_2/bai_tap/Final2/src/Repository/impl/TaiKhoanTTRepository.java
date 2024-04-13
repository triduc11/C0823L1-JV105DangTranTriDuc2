package Repository.impl;

import Model.TaiKhoanTK;
import Model.TaiKhoanTT;
import Repository.IRepository;
import Utils.FileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaiKhoanTTRepository implements IRepository<TaiKhoanTT> {
    private final String filePath = "D:\\C0823L1-JV105DangTranTriDuc\\C0823L1-JV105DangTranTriDuc2\\Module_2\\bai_tap\\Final2\\src\\Data\\bank_accounts1.csv";

    public void convertToFile(ArrayList<TaiKhoanTT> taiKhoanTTS) {
        List<String> stringList = new ArrayList<>();
        for (TaiKhoanTT line : taiKhoanTTS) {
            stringList.add(line.getInfor());
        }
        FileIO.WriteToFile(filePath, stringList, false);
    }

    @Override
    public void add(TaiKhoanTT taiKhoanTT) {
        List<String> stringList = new ArrayList<>();
        stringList.add(taiKhoanTT.getInfor());
        FileIO.WriteToFile(filePath, stringList, true);
    }

    @Override
    public ArrayList<TaiKhoanTT> display() {
        ArrayList<TaiKhoanTT> taiKhoanTTS = new ArrayList<>();
        List<String> stringList = FileIO.ReadFromFile(filePath);
        for (String line : stringList) {
            String[] fields = line.split(",");
            String id = fields[0];
            String code = fields[1];
            String name = fields[2];
            String date = fields[3];
            int soThe = Integer.parseInt(fields[4]);
            int tienTK = Integer.parseInt(fields[5]);
            TaiKhoanTT taiKhoanTT = new TaiKhoanTT(id, code, name, date, soThe, tienTK);
            taiKhoanTTS.add(taiKhoanTT);
        }
        return taiKhoanTTS;
    }

    @Override
    public TaiKhoanTT update(TaiKhoanTT entity) {
        return null;
    }

    @Override
    public void delete(String id) {
        ArrayList<TaiKhoanTT> list = display();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(id)) {
                list.remove(i);
                break;
            }
        }
        convertToFile(list);
    }

    @Override
    public TaiKhoanTT findById(String id) {
        ArrayList<TaiKhoanTT> list = display();
        for (TaiKhoanTT taiKhoanTT : list) {
            if (Objects.equals(taiKhoanTT.getCode(), id)) {
                return taiKhoanTT;
            }
        }
        return null;
    }
    public List<TaiKhoanTT> searchName(String name) {
        List<TaiKhoanTT> taiKhoanTTList = display();
        List<TaiKhoanTT> searchList = new ArrayList<>();
        for (TaiKhoanTT taiKhoanTT : taiKhoanTTList) {
            if (taiKhoanTT.getName().contains(name)) {
                searchList.add(taiKhoanTT);
            }
        }
        return searchList;
    }
}
