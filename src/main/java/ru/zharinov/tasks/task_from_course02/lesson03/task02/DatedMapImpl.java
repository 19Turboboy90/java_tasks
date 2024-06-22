package ru.zharinov.tasks.task_from_course02.lesson03.task02;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DatedMapImpl implements DatedMap {
    private final Map<String, String> valueMap;
    private final Map<String, Date> dateMap;

    public DatedMapImpl() {
        valueMap = new HashMap<>();
        dateMap = new HashMap<>();
    }

    @Override
    public void put(String key, String value) {
        valueMap.put(key, value);
        dateMap.put(key, new Date());
    }

    @Override
    public String get(String key) {
        return valueMap.getOrDefault(key, null);
    }

    @Override
    public boolean containsKey(String key) {
        return valueMap.containsKey(key);
    }

    @Override
    public void remove(String key) {
        valueMap.remove(key);
        dateMap.remove(key);
    }

    @Override
    public Set<String> keySet() {
        return valueMap.keySet();
    }

    @Override
    public Date getKeyLastInsertionDate(String key) {
        return dateMap.getOrDefault(key, null);
    }
}
