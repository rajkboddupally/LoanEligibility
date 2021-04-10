package loanineligible;/* Raj Kumar Boddupally created on 3/13/2021 inside the package - loanineligible */

import java.util.Objects;

/*
This class implements Comparable to provide condition execution order for priority queue
 */
public class LoanInEligibilityCondition implements Comparable<LoanInEligibilityCondition> {

    private final int priority;
    private final String ruleName;

    public LoanInEligibilityCondition(int priority, String ruleName) {
        this.priority = priority;
        this.ruleName = ruleName;
    }

    public int getPriority() {
        return priority;
    }

    public String getRuleName() {
        return ruleName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanInEligibilityCondition that = (LoanInEligibilityCondition) o;
        return priority == that.priority && ruleName.equals(that.ruleName);
    }

    public int hashCode() {
        return Objects.hash(priority, ruleName);
    }

    @Override
    public int compareTo(LoanInEligibilityCondition o) {
        return this.getPriority() - o.getPriority();
    }
}
