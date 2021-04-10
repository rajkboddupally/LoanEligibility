package loanineligible;

/*
This client class get the instance of LoanEligibility engine and calls runInEligibilityRules method.
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("Running ineligiblity rules for the given loan parameters \n");
        LoanInEligibilityEngine engine = LoanInEligibilityEngine.getInstance();
        System.out.println("\n" + engine.runInEligibilityRules(new Object(), "String1", "String2"));
    }
}
