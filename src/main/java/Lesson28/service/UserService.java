package Lesson28.service;

import Lesson28.model.User;
import Lesson28.storage.InMemoryUserStorage;

import java.util.Optional;

public class UserService {

    private final InMemoryUserStorage inMemoryUserStorage = new InMemoryUserStorage();

    public void registration(User user) {

        //encrypt password
        inMemoryUserStorage.save(user);
    }

    public Optional<User> login(String username, String password) {
        Optional<User> byUsername = inMemoryUserStorage.findByUsername(username);
        if (byUsername.isPresent()) {
            User user = byUsername.get();
            if (user.getPassword().equals(password)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
