package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;
/**
 * Your implementation of MachineService.
 */

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends T> type) {
        MachineProducer<T> producer = (MachineProducer<T>) getProducer(type);
        return producer.get();
    }

    @Override
    public void fill(List<? super T> machines,T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            if (machine != null) {
                machine.doWork();
            }
        }
    }

    private MachineProducer<? extends Machine> getProducer(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducer();
        } else if (type == Truck.class) {
            return new TruckProducer();
        } else if (type == Excavator.class) {
            return new ExcavatorProducer();
        } else {
            // Повертаємо анонімний MachineProducer, який повертає порожній список
            return () -> List.of();
        }
    }
}
