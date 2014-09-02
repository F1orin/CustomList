package main.java.ua.com.florin;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by florin on 19.07.2014.
 */
public class Runner {

    public static void main(String[] args) {
/*        List<String> stringList = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            stringList.add("test " + i);
        }
        System.out.println(stringList);

        stringList.subList(0, 5).clear();
        System.out.println(stringList);*/

        Thred1 thred1 = new Thred1();

        Thred2 thred2 = new Thred2();
        thred2.initReference(thred1);
        thred2.start();
        thred1.start();
    }


    static class Thred2 extends Thread implements KeyListener {

        private Thred1 thread;

        @Override
        public void run() {
            try {
                currentThread().sleep(5000);
                thread.setS("new");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void keyTyped(KeyEvent e) {
        }

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                thread.setS("from listener");
            }
        }

        public void keyReleased(KeyEvent e) {
        }

        public void initReference(Thred1 thread) {
            this.thread = thread;
        }
    }

    static class Thred1 extends Thread {
        String s = "old";

        public void run() {
            while (true) {
                System.out.println(s);
                try {
                    currentThread().sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }

        public void setS(String s) {
            this.s = s;
        }
    }
}
