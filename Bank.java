class SBIBank {
    public void getdetails(double rateOfInterest){
        System.out.println("SBI BANK");
        System.out.println("SBI the rate of interest "+rateOfInterest+"%");
        System.out.println("--------------------------------------");
    }
}
class BOIBank{
    public void getdetails(double rateOfInterest){
        System.out.println("BOI BANK");
        System.out.println("SBI the rate of interest "+rateOfInterest+"%");
        System.out.println("--------------------------------------");

    }
}
class ICICIBank{
    public void getdetails(double rateOfInterest){
        System.out.println("ICICI BANK");
        System.out.println("SBI the rate of interest "+rateOfInterest+"%");
        System.out.println("--------------------------------------");
    }
}
public class Bank{
    public static void main(String[] args) {
        SBIBank sb=new SBIBank();
        BOIBank bo=new BOIBank();
        ICICIBank ic=new ICICIBank();
        sb.getdetails(2.0);
        bo.getdetails(3.0);
        ic.getdetails(4.0);

    }
}

