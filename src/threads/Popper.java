/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

/**
 *
 * @author student
 */
public class Popper extends Thread implements Runnable{
    private MyStack stack;
    private int id;

    public Popper (int id, MyStack stack) {
        this.stack = stack;
        this.id = id;
    }

    @Override
    public void run() {
        while(stack.getTop() >= 0) {
            stack.pop();
            System.out.println("Popper " + id + " current size of stack " + (stack.getTop() + 1));
        }
    }
}
