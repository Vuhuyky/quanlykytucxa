package doituong;

public class PhongKT {

    //bien mieu ta phong trong ktx

    int sophong;
    String tenphong;
    int soluongSV;
    boolean cosan = false;
    String maPhong;

    //phuong thuc hoat dong ngay

    public boolean coSanHayKhong(String mp){

        if(cosan){
            return true;
        }
        return false;

    }
    
}
