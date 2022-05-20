package B1;
import java.lang.Math;;
public class ComplexNumber {
    protected double a;
    protected double b;

    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        if(a == 0)
            return (Double.toString(b) +"i");
        else if(b == 0)
            return (Double.toString(a));
        else
            return (Double.toString(a) + " + " + Double.toString(b) + "i");
    }
    public double Module(){
        return Math.sqrt(a * a + b * b);
    }
    public boolean soSanh(ComplexNumber x){
        if(a == x.a && b == x.b)
            return true;
        else
            return false;
    }
    public String Cong(ComplexNumber x){
        System.out.println("Cong 2 so phuc: ");
        return (Double.toString(a + x.a) + " + " + Double.toString(b + x.b) + "i");
    }
    public String Tru(ComplexNumber x){
        System.out.println("Tru 2 so phuc: ");
        return (Double.toString(a - x.a) + " + " + Double.toString(b - x.b) + "i");
    }
    public String Nhan(ComplexNumber x){
        System.out.println("Nhan 2 so phuc: ");
        return (Double.toString(a*x.a - b*x.b) + " + " + Double.toString(a*x.b + b*x.a) + "i");
    }
    public String Chia(ComplexNumber x){
        System.out.println("Chia 2 so phuc: ");
        return (Double.toString((a*x.a + b*x.b)/(x.a*x.a + x.b*x.b)) + " + " + Double.toString((x.a*b - x.b*a)/(x.a*x.a + x.b*x.b)) + "i");
    }
    public String nhanSoThuc(double c){
        System.out.println("Nhan so phuc voi so thuc: ");
        return (Double.toString(a*c) + " + " + Double.toString(b*c) + "i");
    }
    public String lienHop(){
        System.out.println("Lien hop: ");
        return (Double.toString(a) + " - " + Double.toString(b) + "i");
    }
    public static void main(String args[]){
        ComplexNumber nb1 = new ComplexNumber(1,2);
        ComplexNumber nb2 = new ComplexNumber(3, 4);
        System.out.println("So phuc thu nhat: ");
        System.out.println(nb1.toString());
        System.out.println("So phuc thu hai: ");
        System.out.println(nb2.toString());
        System.out.println(nb1.soSanh(nb2));
        System.out.println(nb1.Cong(nb2));
        System.out.println(nb1.Nhan(nb2));
        System.out.println(nb1.Chia(nb2));
        System.out.println(nb1.nhanSoThuc(2));
        System.out.println(nb1.lienHop());
    }
}
