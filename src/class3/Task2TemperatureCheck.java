package class3;

public class Task2TemperatureCheck {
    public static void main(String[] args) {
        double tem=35.2;
        if (tem<32){
            System.out.println("Water will freeze with " +tem);
        }else{
            System.out.println("Water will NOT freeze with temperature "+tem);
        }
    }
}
