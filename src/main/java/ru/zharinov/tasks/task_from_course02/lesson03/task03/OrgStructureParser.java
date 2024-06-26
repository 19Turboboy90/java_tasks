package ru.zharinov.tasks.task_from_course02.lesson03.task03;

import java.io.File;
import java.io.IOException;

public interface OrgStructureParser {
    Employee parseStructure(File csvFile) throws IOException;
}
