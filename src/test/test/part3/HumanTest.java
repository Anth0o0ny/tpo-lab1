package part3;

import part3.abstractClasses.Human;
import part3.entities.HumanEntity;
import part3.enums.Gender;
import part3.enums.HumanCondition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HumanTest {

    private Human human = new HumanEntity("Зафод", Gender.MALE);

    @Test
    public void illuminateTest() {
        assertTrue(human.illuminate());
    }

    @Test
    public void changeInnerConditionTest() {
        human.changeInnerCondition(HumanCondition.FEAR);

        assertEquals(human.getInnerCondition(), HumanCondition.FEAR);
    }

    @Test
    public void changeOutterConditionTest() {
        human.changeOuterCondition(HumanCondition.BRAVE);

        assertEquals(human.getOuterCondition(), HumanCondition.BRAVE);
    }
}
