package part3.entities;

import part3.abstractClasses.Human;
import part3.abstractClasses.Location;
import part3.interfaces.HumanInterface;

import java.util.List;


import part3.abstractClasses.Location;

public class Tunnel extends Location {

    public Tunnel(List<Human> visitors) {
        setVisitors(visitors);
    }
}

