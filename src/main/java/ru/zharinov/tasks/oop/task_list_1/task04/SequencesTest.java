package ru.zharinov.tasks.oop.task_list_1.task04;

/*
Последовательности A - J заданы в виде нескольких значений следующим образом
A. 2, 4, 6, 8, 10...
B. 1, 3, 5, 7, 9...
C. 1, 4, 9, 16, 25...
D. 1, 8, 27, 64, 125...
E. 1, -1, 1, -1, 1, -1...
F. 1, -2, 3, -4, 5, -6...
G. 1, -4, 9, -16, 25....
H. 1, 0, 2, 0, 3, 0, 4....
I. 1, 2, 6, 24, 120, 720...
J. 1, 1, 2, 3, 5, 8, 13, 21…
Необходимо найти закономерности, по которым эти последовательности
сформированы и реализовать следующий интерфейс, каждый метод которого
принимает число N и выводит в консоль N элементов соответствующей
последовательности. Каждый элемент можно выводить с новой строки
 */
public class SequencesTest {
    public static void main(String[] args) {
        SequencesImpl sequences = new SequencesImpl();
        sequences.a(5);
        System.out.println();
        sequences.b(5);
        System.out.println();
        sequences.c(5);
        System.out.println();
        sequences.d(5);
        System.out.println();
        sequences.e(6);
        System.out.println();
        sequences.f(6);
        System.out.println();
        sequences.g(6);
        System.out.println();
        sequences.h(7);
        System.out.println();
        sequences.i(7);
        System.out.println();
        sequences.j(8);
    }
}
