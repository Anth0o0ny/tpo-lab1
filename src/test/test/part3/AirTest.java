package part3;

import part3.abstractClasses.Human;
import part3.abstractClasses.Location;
import part3.entities.Air;
import part3.enums.Smell;
import part3.entities.Tunnel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AirTest {

    private Air air = new Air();

    private Location location;

    private List<Human> visitors;

    @Before
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

}
