package Repository.impl;

import Model.TaiKhoanTK;
import Repository.IRepository;
import Utils.FileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaiKhoanTKRepository implements IRepository<TaiKhoanTK> {
    private final String filePath = "D:\\C0823L1-JV105DangTranTriDuc\\C0823L1-JV105DangTranTriDuc2\\Module_2\\bai_tap\\Final2\\src\\Data\\bank_accounts.csv";

    public void convertToFile(ArrayList<TaiKhoanTK> taiKhoanTKS) {
        List<String> stringList = new ArrayList<>();
        for (TaiKhoanTK line : taiKhoanTKS) {
            stringList.add(line.getInfor());
        }
        FileIO.WriteToFile(filePath, stringList, false);
    }

    @Override
    public void add(TaiKhoanTK taiKhoanTK) {
        List<String> stringList = new ArrayList<>();
        stringList.add(taiKhoanTK.getInfor());
        FileIO.WriteToFile(filePath, stringList, true);
    }

    @Override
    public ArrayList<TaiKhoanTK> display() {
        ArrayList<TaiKhoanTK> taiKhoanTKS = new ArrayList<>();
        List<String> stringList = FileIO.ReadFromFile(filePath);
        for (String line : stringList) {
            String[] fields = line.split(",");
            String id = fields[0];
            String code = fields[1];
            String name = fields[2];
            String date = fields[3];
            int tien = Integer.parseInt(fields[4]);
            String dateTK = fields[5];
            String laiSuat = fields[6];
            String kiHan = fields[7];
            TaiKhoanTK taiKhoanTK = new TaiKhoanTK(id, code, name, date, tien, dateTK, laiSuat, kiHan);
            taiKhoanTKS.add(taiKhoanTK);
        }
        return taiKhoanTKS;
    }

    @Override
    public TaiKhoanTK update(TaiKhoanTK entity) {
        return null;
    }

    @Override
    public void delete(String id) {
        ArrayList<TaiKhoanTK> list = display();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(id)) {
                list.remove(i);
                break;
            }
        }
        convertToFile(list);
    }

    @Override
    public TaiKhoanTK findById(String id) {
        ArrayList<TaiKhoanTK> list = display();
        for (TaiKhoanTK taiKhoanTK : list) {
            if (Objects.equals(taiKhoanTK.getCode(), id)) {
                return taiKhoanTK;
            }
        }
        return null;
    }

    public List<TaiKhoanTK> searchName(String name) {
        List<TaiKhoanTK> taiKhoanTKList = display();
        List<TaiKhoanTK> searchList = new ArrayList<>();
        for (TaiKhoanTK taiKhoanTK : taiKhoanTKList) {
            if (taiKhoanTK.getName().contains(name)) {
                searchList.add(taiKhoanTK);
            }
        }
        return searchList;
    }
}
