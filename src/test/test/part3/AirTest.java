package part3;

import org.junit.jupiter.api.BeforeEach;
import part3.abstractClasses.Human;
import part3.abstractClasses.Location;
import part3.entities.Air;
import part3.enums.Smell;
import part3.entities.Tunnel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AirTest {

    private Air air = new Air();

    private Location location;

    private List<Human> visitors;

    @BeforeEach
    public void preparationTunnelLocationAndNoVisitors() {
        this.visitors = new ArrayList<>();
        this.location = new Tunnel(visitors);

        air.setLocation(this.location);
    }

    @Test
    public void setSmellTest() {
        this.air.setSmells(Smell.SOOT);
        assertEquals(this.air.getSmells(), Smell.SOOT);
    }

    @Test
    public void getSmellTest() {
        air.setSmells(Smell.SMOLDER);
        assertEquals(Smell.SMOLDER, air.getSmells());
    }

    @Test
    public void setLocationTest() {
        air.setLocation(location);
        assertEquals(location, air.getLocation());
    }
}
