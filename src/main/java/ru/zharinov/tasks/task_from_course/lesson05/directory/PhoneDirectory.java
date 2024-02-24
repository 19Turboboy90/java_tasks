package ru.zharinov.tasks.task_from_course.lesson05.directory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneDirectory {
    private Map<String, HashSet<String>> directory = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        if (!directory.containsKey(lastName)) {
            directory.put(lastName, new HashSet<>());
        }
        directory.get(lastName).add(phoneNumber);
    }

    public Set<String> getNumberPhone(String lastName) {
        return directory.get(lastName);
    }

    public Set<String> getAllLastname() {
        return directory.keySet();
    }
}
