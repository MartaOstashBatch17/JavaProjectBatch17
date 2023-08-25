package class5;

public class E8ANDOperator {
    public static void main(String[] args) {

        boolean goodCredit=true;
        boolean stableJOB=false;
        boolean minAge=true;

        if(goodCredit&&stableJOB&&minAge){
            System.out.println("You can have the loan");
        }else{
            System.out.println("You need to fulfill all the requirement");
        }



    }
}
