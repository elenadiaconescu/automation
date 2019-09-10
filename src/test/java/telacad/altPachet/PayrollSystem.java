package telacad.altPachet;

public class PayrollSystem {

    private static PayrollSystem payrollSystem = new PayrollSystem();

    private PayrollSystem(){
    }

    public static PayrollSystem getInstance(){
        return payrollSystem;
    }
}
