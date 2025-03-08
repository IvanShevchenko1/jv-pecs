package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("Bull1","White",10));
        list.add(new Bulldozer("Bull2","Black",10));
        list.add(new Bulldozer("Bull3","Yellow",10));
        return list;
    }
}
