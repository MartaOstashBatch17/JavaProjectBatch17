package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.brand="Phone";
        iphone.price=1000;
        iphone.size=4;
        iphone.makeCalls();
        iphone.takeAPic();
        iphone.sendTextMessages();

        Phone pixel=new Phone();
        pixel.brand="Pixel";
        pixel.price=50;
        pixel.size=5;
        pixel.makeCalls();

        Phone samsung=new Phone();
        samsung.brand="Samsung";
        samsung.price=850;
        samsung.size=7;
        samsung.makeCalls();
        samsung.takeAPic();
    }
}
