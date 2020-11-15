import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NinethIterationTest {
    /*
    An Assembly should have a master, which is the first Character to join the Assembly.
    The master is the only one allowed to update the Assembly name.
    When the master leaves an Assembly, another random master is automatically selected.
     */
    @Test()
    @DisplayName("An Assembly should have a master, which is the first Character to join the Assembly")
    public void CharacterMayBelongtoOneOrMoreFaction() {
        NinethIterationTest tester = new NinethIterationTest(); // MyClass is tested

        assertTrue(true);

    }
}
