package loanineligible;/* Raj Kumar Boddupally created on 3/12/2021 inside the package - loanineligible */

import java.util.Random;

/*
this class runs condition four
 */

public class LoanInEligibleConditionFour extends LoanInEligibilityCondition implements LoanInEligibility {

    public LoanInEligibleConditionFour(int priority, String ruleName) {
        super(priority, ruleName);
    }

    @Override
    public boolean runIneligibleCondition(Object payLoad, String stringOne, String stringTwo) {
        //Logic goes here to determine if loan is ineligible based on this condition.
        // If Loan is ineligible return true. else false
        System.out.println("*** LoanInEligibleConditionFour running ***");
        return new Random().nextInt(3) % 3 == 0;
    }
}
