package  com.company;
public class Currency {
    double Euro;
    double Dollar;
    double Zloty;

    public Currency(double euro, double dollar, double zloty) {
        Euro = euro;
        Dollar = dollar;
        Zloty = zloty;
    }

    void TreadEuroZloty(){
        double z;
        z = (100*Euro)*Zloty;
        System.out.println(z);


    double TreadEuroZloty(){
        double e;
        e = (100*Euro)*Zloty;
        System.out.println(e);

    }
}

