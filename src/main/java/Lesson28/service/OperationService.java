package Lesson28.service;

import Lesson28.Interfaces.Operation;
import Lesson28.storage.InMemoryResultStorage;

public class OperationService {
    InMemoryResultStorage resultStorage = new InMemoryResultStorage();

    public double process(Operation operation) {
        operation.execute();
        resultStorage.save(operation);
        return operation.getResult();
    }
}
