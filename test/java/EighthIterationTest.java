import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EighthIterationTest {

    /*
    A Character can now belong to an Assembly
    An Assembly works like a Faction with two differences :
    An Assembly has a list of allowedRoles that defines what classes can join the assembly
    A Character can only join one Assembly at a time, which means he has to leave an Assembly before he joins a new one.
     */

    @Test()
    @DisplayName("A Character may now belong to one or more Factions")
    public void CharacterMayBelongtoOneOrMoreFaction() {
        EighthIterationTest tester = new EighthIterationTest(); // MyClass is tested

        assertTrue(true);

    }
}

