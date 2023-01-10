package com.rickjinny.leetcode_multithread;

/**
 * Thread.yield()：使当前线程从执行状态(运行状态) 变为 可执行状态(就绪状态)。CPU会从众多的可执行态里选择。
 * 也就是说，当前也就是刚刚的那个线程还是有可能会被再次执行到的，并不是说一定会执行其他线程而该线程在下一次中
 * 不会执行到了。
 */
public class T1115_print_foobar_alternately_Thread_yield {

    private int n;

    // foo可以执行
    volatile boolean fooExec = true;

    public T1115_print_foobar_alternately_Thread_yield(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) {
        for (int i = 0; i < n; i++) {
            if (fooExec) {
                printFoo.run();
                fooExec = false;
                i++;
            } else {
                Thread.yield();
            }
        }
    }

    public void bar(Runnable printBar) {
        for (int i = 0; i < n; i++) {
            if (!fooExec) {
                printBar.run();
                fooExec = true;
                i++;
            } else {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        T1115_print_foobar_alternately_Semaphore foobar = new T1115_print_foobar_alternately_Semaphore(2);

        Runnable runnable1 = () -> {
            try {
                foobar.foo(() -> System.out.print("foo"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable2 = () -> {
            try {
                foobar.bar(() -> System.out.print("bar"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }

}
