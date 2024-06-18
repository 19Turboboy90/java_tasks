package ru.zharinov.tasks.basic_exercises.task_list_5.task_95;

public class SequencesImpl implements Sequences {
    @Override
    public void a(int n) {
        for (int i = 2, j = 0; j < n; i += 2, j++) {
            System.out.print(i + ", ");
        }
    }

    @Override
    public void b(int n) {
        for (int i = 1, j = 0; j < n; i += 2, j++) {
            System.out.print(i + ", ");
        }
    }

    @Override
    public void c(int n) {
        for (int i = 1, j = 0, k = 3; j < n; i += k, j++, k += 2) {
            System.out.print(i + ", ");
        }
    }

    @Override
    public void d(int n) {
        for (int i = 1, j = 0; j < n; i++, j++) {
            System.out.print((int) Math.pow(i, 3) + ", ");
        }
    }

    @Override
    public void e(int n) {
        for (int i = 1, k = -1, j = 0; j < n; j++) {
            if (j % 2 == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print(k + ", ");
            }
        }
    }

    @Override
    public void f(int n) {
        for (int i = 1, k = -1, j = 0; j < n; j++, i++, k--) {
            if (j % 2 == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print(k + ", ");
            }
        }
    }

    @Override
    public void g(int n) {
        for (int i = 1, j = 0, k = -1; j < n; j++, i++, k--) {
            if (j % 2 == 0) {
                System.out.print((int) Math.pow(i, 2) + ", ");
            } else {
                System.out.print((int) -Math.pow(k, 2) + ", ");
            }
        }
    }

    @Override
    public void h(int n) {
        for (int i = 1, j = 0, k = 0; j < n; j++) {
            if (j % 2 == 0) {
                System.out.print(i + ", ");
                i++;
            } else {
                System.out.print(k + ", ");
            }
        }
    }

    @Override
    public void i(int n) {
        for (int i = 1, j = 2; j <= n + 1; i *= j, j++) {
            System.out.print(i + ", ");
        }
    }

    @Override
    public void j(int n) {
        for (int i = 1, k = 0, j = 0; j < n; j++) {
            System.out.print(i + ", ");
            int tmp = i + k;
            k = i;
            i = tmp;
        }
    }
}
