package B1;
import java.util.Scanner;
public class Sach {
    String tacGia;
    String tenSach;
    String nxb;
    boolean tinhTrang;
    Sach() {
        this.tacGia = "";
        this.tenSach = "";
        this.nxb = "";
        this.tinhTrang = false;
    }
    public void NhapTT(){
        System.out.println("Nhap ten tac gia: ");
        this.tacGia = new Scanner(System.in).nextLine();
        System.out.println("Nhap ten sach: ");
        this.tenSach = new Scanner(System.in).nextLine();
        System.out.println("Nhap ten nha xuat ban: ");
        this.nxb = new Scanner(System.in).nextLine();
        System.out.println("Nhap tinh trang sach: ");
        this.tinhTrang = new Scanner(System.in).nextBoolean();
    }
    public void XuatTT(){
        System.out.println("Ten tac gia: " + this.tacGia);
        System.out.println("Ten sach: " + this.tenSach);
        System.out.println("Ten nha xuat ban: " + this.nxb);
        this.KiemTra();
    }
    public void KiemTra(){
        if(this.tinhTrang == true){
            System.out.println("Sach dang duoc muon");
        }
        else{
            System.out.println("Sach chua duoc muon");
        }
    }
}
class Ban_Doc extends Sach {
    String HoTen;
    String DiaChi;

    Ban_Doc() {
        super();
        this.HoTen = "";
        this.DiaChi = "";
    }

    public void NhapTT() {
        super.NhapTT();
        System.out.println("Nhap ho ten: ");
        this.HoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhap dia chi: ");
        this.DiaChi = new Scanner(System.in).nextLine();
    }

    public void XuatTT() {
        super.XuatTT();
        System.out.println("Ho ten: " + this.HoTen);
        System.out.println("Dia chi: " + this.DiaChi);
    }

    public void Muon() {
        super.NhapTT();
    }

    public void Tra() {
        if(this.tinhTrang == false){
            System.out.println("Sach da duoc tra");
        }
        else{
            System.out.println("Sach chua duoc tra");
        }
    }
}
class Demo{
    public static void main(String[] args) {
        Ban_Doc bd = new Ban_Doc();
        bd.NhapTT();
        bd.XuatTT();
        bd.Muon();
        bd.Tra();
    }
}