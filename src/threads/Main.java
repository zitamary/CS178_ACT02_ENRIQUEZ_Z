/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class Main {

    public static void main(String[] args) {
        MyStack stack = new MyStack(20);
        List<Thread> threads = new ArrayList<Thread>();

        for (int i = 1; i <= 2; i++) {
            Runnable task = new Pusher(i, stack);
            Thread worker = new Thread(task);
            worker.setName(String.valueOf(i));
            worker.start();
            threads.add(worker);
        }

        Runnable task = new Popper(1, stack);
        Thread worker = new Thread(task);
        worker.setName(String.valueOf(1));
        worker.start();
        threads.add(worker);
    }
}
