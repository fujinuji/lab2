package ubb.scs.map.ir.lab2.factories;

import ubb.scs.map.ir.lab2.containers.Container;
import ubb.scs.map.ir.lab2.utils.Strategy;

public interface Factory {
    Container createContainer(Strategy strategy);
}
