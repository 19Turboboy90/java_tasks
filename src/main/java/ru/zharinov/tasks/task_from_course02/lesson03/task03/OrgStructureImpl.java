package ru.zharinov.tasks.task_from_course02.lesson03.task03;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class OrgStructureImpl implements OrgStructureParser {
    @Override
    public Employee parseStructure(File csvFile) throws IOException {
        Map<Long, Employee> mapEmployee = new HashMap<>();
        try (Scanner scanner = new Scanner(csvFile)) {
            while (scanner.hasNextLine()) {
                Employee employee = new Employee();
                String date = scanner.nextLine();
                var split = date.split(";");
                employee.setId(Long.parseLong(split[0]));
                employee.setBossId(split[1].equals("") ? null : Long.parseLong(split[1]));
                employee.setName(split[2]);
                employee.setPosition(split[3]);
                mapEmployee.put(employee.getId(), employee);
            }
        }
        redactor(mapEmployee);
        Employee boss = null;
        for (Employee employee : mapEmployee.values()) {
            if (employee.getBossId() == null) {
                boss = employee;
            }
        }
        return boss;
    }

    private void redactor(Map<Long, Employee> map) {
        for (Long id : map.keySet()) {
            Employee employee = map.get(id);
            if (employee.getBossId() != null) {
                Employee boss = map.get(employee.getBossId());
                employee.setBoss(boss);
                boss.getSubordinate().add(employee);
            }
        }
    }
}
