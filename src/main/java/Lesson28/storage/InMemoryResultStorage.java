package Lesson28.storage;

import Lesson28.Interfaces.Operation;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class InMemoryResultStorage {
    List<Operation> results = new ArrayList<>();

    public void save(Operation operation) {
        this.results.add(operation);
    }
}
