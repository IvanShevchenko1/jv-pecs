package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Truck1","White",10));
        list.add(new Truck("Truck2","White",10));
        list.add(new Truck("Truck3","White",10));
        return list;
    }
}
