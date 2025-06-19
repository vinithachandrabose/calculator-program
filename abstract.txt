abstract class Insurance {
    String name;

    Insurance(String name) {
        this.name = name;
    }

    abstract double calculatereturns(double salary);
    abstract double calculatePremium(double salary);
}

class LifeInsurance extends Insurance {

    LifeInsurance(String name) {
        super(name);
    }
    double calculatePremium(double sal) {
        return sal * 0.05;
    }
    double calculatereturns(double sal) {
        return sal * 0.02;
    }

    void display(double sal) {
        System.out.println("Agent: " + name);
        System.out.println("Premium on salary " + sal + " : " + calculatePremium(sal));
        System.out.println("Returns on salary " + sal + " : " + calculatereturns(sal));
    }
}
public class Lic {
    public static void main(String[] args) {
        LifeInsurance agent = new LifeInsurance("Abi");
        agent.display(50000);
    }
}
