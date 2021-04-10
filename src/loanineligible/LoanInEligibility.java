package loanineligible;/* Raj Kumar Boddupally created on 3/12/2021 inside the package - test */

public interface LoanInEligibility {

    boolean runIneligibleCondition(Object payLoad, String stringOne, String stringTwo);

    public String getRuleName();
}
