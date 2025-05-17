package doituong;

public class Sinhvien {

    String Hovaten;
    String MaSV;

    public Sinhvien(String ht, String ma){
        Hovaten = ht;
        MaSV = ma;
    }
    public static void hienthisinhvien(){

        Sinhvien sv = new Sinhvien("Vu Ky", "8399393939");

        System.out.println("Hien thi sinh vien ten "+sv.Hovaten +"co ma sv" +sv.MaSV);
    }
}
