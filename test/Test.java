import loanineligible.LoanInEligibilityEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class Test {
    static LoanInEligibilityEngine engine;

    @BeforeAll
    static void setUp() {
        engine = LoanInEligibilityEngine.getInstance();
    }

    @org.junit.jupiter.api.Test
    void nullParameterCheck() {
        Assertions.assertThrows(NullPointerException.class, () -> engine.runInEligibilityRules(null, null, "Hello"));
    }

}
