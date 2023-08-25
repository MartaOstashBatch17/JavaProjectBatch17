package review5;

public class TwoDArrayExample {
    public static void main(String[] args) {
        String[][] countries = {
                {"Canada","Usa"}, //[0]
                {"Ecuador","Brazil","Chile","Argentina"},    //[1]
                {"Romania","france","Italy"}};   //[2]

        System.out.println(countries.length);//how many 1d array are in your2 d array


        for (String [] countryArray:countries) { //outer loop iterates over 1d arrays
            for (String c:countryArray) {
                System.out.println(c);
            }
        }
    }
}
