package repository;

import model.BenhAn;
import model.Factory;
import utils.FileIo;

import java.util.ArrayList;

public class Repository implements IRepository {
    private String path;

    public Repository(String path) {
        this.path = path;
    }

    @Override
    public void add(BenhAn benhAn) {
        FileIo file = new FileIo(path);
        ArrayList<BenhAn> list = getAll();
        System.out.println(get(benhAn.getId()) != null);

        if (get(benhAn.getId()) == null) {
            System.out.println(benhAn.toCsv());
            file.writeLine(benhAn.toCsv(), true);
        }
    }

    @Override
    public void delete(String id) {
        FileIo file = new FileIo(path);
        ArrayList<BenhAn> list = getAll();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
            }
        }
        ArrayList<String> arrCsv = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            arrCsv.add(list.get(i).toCsv());
        }
        file.writeList(arrCsv, false);
    }

    @Override
    public void update(BenhAn benhAn) {
        ArrayList<BenhAn> list = getAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(benhAn.getId())) {
                list.set(i, benhAn);
            }
        }
    }

    @Override
    public BenhAn get(String id) {
        ArrayList<BenhAn> list = getAll();
        for (BenhAn benhAn : list) {
            if (benhAn.getId().equals(id)) {
                return benhAn;
            }
        }
        return null;
    }

    @Override
    public ArrayList<BenhAn> getAll() {
        FileIo file = new FileIo(path);
        ArrayList<BenhAn> list = new ArrayList<>();
        ArrayList<String> arrCsv = file.readList();
        for (int i = 0; i < arrCsv.size(); i++) {
            String[] data = arrCsv.get(i).split(",");
            list.add(new Factory().create(data[0], data));

        }
        return list;
    }
}
