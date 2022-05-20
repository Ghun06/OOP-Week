package B2;

public class Test {
    public static void main(String[] args)
    {
        double[] arr =  new double[] {1, 2, 3};
        double[] arr2 =  new double[] {4, 5, 6};
        Vector x = new Vector(arr, arr.length);
        Vector y = new Vector(arr2, arr2.length);
        Vector z = new Vector(arr, arr.length);

        z.cong(x, y, z);
        System.out.println(z.toString());

    }
}
