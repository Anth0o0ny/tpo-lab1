package part3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import part3.abstractClasses.Human;
import part3.abstractClasses.Location;
import part3.entities.HumanEntity;
import part3.entities.Tunnel;
import part3.enums.Gender;
import part3.enums.HumanCondition;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanConditionTest {

    private Human human;
    private Location tunnel;

    @BeforeEach
    public void setUp() {
        human = new HumanEntity("Зафод", Gender.MALE);
        tunnel = new Tunnel(Collections.singletonList(human));
    }

    @Test
    public void testHumanConditionInTunnelWithFlashlightOn() {
        human.setCurrentLocation(tunnel);
        human.getFlashlight().switchOn();
        ((HumanEntity) human).updateConditionBasedOnLocationAndFlashlight();

        assertEquals(HumanCondition.NERVOUS, human.getInnerCondition());
    }

    @Test
    public void testHumanConditionInTunnelWithFlashlightOff() {
        human.setCurrentLocation(tunnel);
        human.getFlashlight().switchOff();
        ((HumanEntity) human).updateConditionBasedOnLocationAndFlashlight();

        assertEquals(HumanCondition.FEAR, human.getInnerCondition());
    }

    @Test
    public void testHumanConditionOutsideTunnel() {
        human.setCurrentLocation(null);
        ((HumanEntity) human).updateConditionBasedOnLocationAndFlashlight();

        assertEquals(HumanCondition.BRAVE, human.getInnerCondition());
    }
}
