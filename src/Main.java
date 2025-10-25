public class Main {
    public static void main(String[] args) {

        int[] xarray = { 4, 2, 1, 3, 5 };

        int y = xarray[1] + 1;

        System.out.print(y + ", ");
        xarray[4] = 1;
        System.out.print(xarray[xarray[4]] + ",");
        y--;
        System.out.print(xarray[y]);

    }
}