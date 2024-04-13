package model;

public class Factory {

    public static BenhAn create(String[] data) {
        return null;
    }
    public static BenhAn create(String type, String[] data) {
        BenhAn newBenhAn;
        switch (type) {
            case "thuong" :
                BenhAnThuong benhAnThuong = new BenhAnThuong();
                benhAnThuong.setNo(data[1]);
                benhAnThuong.setId(data[2]);
                benhAnThuong.setName(data[3]);
                benhAnThuong.setInDate(data[4]);
                benhAnThuong.setOutDate(data[5]);
                benhAnThuong.setReason(data[6]);
                benhAnThuong.setCost(Double.parseDouble(data[7]));
                newBenhAn = benhAnThuong;
                break;
            case  "vip" :
                BenhAnVip benhAnVip = new BenhAnVip();
                benhAnVip.setNo(data[1]);
                benhAnVip.setId(data[2]);
                benhAnVip.setName(data[3]);
                benhAnVip.setInDate(data[4]);
                benhAnVip.setOutDate(data[5]);
                benhAnVip.setReason(data[6]);
                benhAnVip.setVipType(data[7]);
                benhAnVip.setVipTime(data[8]);
                newBenhAn =  benhAnVip;
                break;
            default:
                newBenhAn = null;
        }
        return newBenhAn;
    }
}
