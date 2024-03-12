package ru.zharinov.tasks.task_from_course.lesson10;
/*
Создайте таблицу студенты (students): id, имя, серия паспорта, номер паспорта;
● Создайте таблицу Предметы (subjects): id, название предмета;
● Создайте таблицу Успеваемость (progress): id, студент, предмет, оценка;
● Оценка может находиться в пределах от 2 до 5;
1 Вывести список студентов, сдавших определенный предмет, на оценку выше 3;
2 При удалении студента из таблицы, вся его успеваемость тоже должна быть удалена;
3 Посчитать средний бал по определенному предмету;
4 Посчитать средний балл по определенному студенту;
5 Пара серия-номер пасорта должны быть уникальны в таблице Студенты;
6 Найти три предмета, которые сдали наибольшее количество студентов;

 */
public class Main {
/*
create schema students;

create table students (
    id serial primary key,
    student_name text not null,
    serial_passport int not null,
    number_passport int not null
);


create table subjects (
    id serial primary key,
    subjects_name text not null
);

create table progres (
    id serial primary key,
    student_id int,
    subject_id int,
    foreign key (student_id) references students (id) on delete cascade,
    foreign key (subject_id) references subjects (id) on delete cascade,
    score int check (score >=2 and score <= 5)
);

insert into students (student_name, serial_passport, number_passport)
values ('Ваня', 111, 111111),
        ('Сергей', 222, 222222),
        ('Антон', 333, 333333),
        ('Василий', 444, 444444);

insert into subjects (subjects_name)
values ('Mатематика'),
        ('Русский язык'),
        ('Литература'),
        ('ОБЖ');

insert into progres (student_id,subject_id , score)
values (1, 1, 4),
       (2, 3, 2),
       (3, 2, 4),
       (4, 4, 5),
       (1, 2, 2),
       (2, 1, 3),
       (3, 2, 3),
       (4, 4, 4),
       (1, 4, 5);
*/

/*
1.
select stu.id,
       stu.student_name,
       sub.subjects_name,
       pro.score
from students stu
left join progress pro on stu.id = pro.student_id
left join subjects sub on sub.id = pro.subject_id
where pro.score > 3
and sub.subjects_name = 'ОБЖ';

3.
select avg(pro.score)
from progress pro
join subjects sub on sub.id = pro.subject_id
where subjects_name = 'ОБЖ';

4.
select avg(pro.score)
from students stu
join progress pro on stu.id = pro.student_id
where stu.student_name = 'Ваня';

5.
select sub.subjects_name
from subjects sub
join progress pro on pro.subject_id = sub.id
group by sub.subjects_name
limit 2;
*/
}
