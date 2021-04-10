package loanineligible;/* Raj Kumar Boddupally created on 3/13/2021 inside the package - loanineligible */

import java.util.PriorityQueue;
import java.util.Queue;

/*
This class is exposed to the clients.
Priority queue stores all the rules with a given priority. Initialized with capacity of 10
When client calls - runInEligibilityRules method, rules are executed one by one.
If any of the condition or rule pass, then it will return a reason to the client.
If all of the conditions fails, then it will return a success reason(Loan approved) to the client
 */
public class LoanInEligibilityEngine {

    private static final LoanInEligibilityEngine _instance = new LoanInEligibilityEngine();
    private static final Queue<LoanInEligibility> queue = new PriorityQueue<>(10);


    static {
        queue.add(new LoanInEligibleConditionTwo(1, "ConditionTwo"));
        queue.add(new LoanInEligibleConditionOne(4, "ConditionOne"));
        queue.add(new LoanInEligibleConditionThree(3, "ConditionThree"));
        queue.add(new LoanInEligibleConditionFour(2, "ConditionFour"));
        queue.add(new LoanInEligibleConditionFive(1, "ConditionFive"));
        queue.add(new LoanInEligibleConditionSix(5, "ConditionSix"));
    }

    public String runInEligibilityRules(Object dummyObject, String string1, String string2) {

        if (dummyObject == null || string1 == null || string2 == null)
            throw new NullPointerException("Input arguments cannot be null");

        String reason = "Loan approved. No exceptions or Ineligibility conditions";
        while (!queue.isEmpty()) {
            LoanInEligibility rule = queue.poll();
            if (rule.runIneligibleCondition(dummyObject, string1, string2)) {
                reason = "Loan is not eligible for the " + rule.getRuleName();
                return reason;
            }
        }
        return reason;
    }

    public static LoanInEligibilityEngine getInstance() {
        return _instance;
    }
}
