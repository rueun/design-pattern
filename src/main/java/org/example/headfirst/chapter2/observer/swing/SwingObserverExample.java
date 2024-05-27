package org.example.headfirst.chapter2.observer.swing;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    // 버튼이 subject, 리서너가 observer
    // subject 에 observer 를 추가하는 방법은 addListener() 메소드를 호출하는 것
    public void go() {
        frame = new JFrame();
        JButton button = new JButton("할까? 말까?");
        button.addActionListener(event -> System.out.println("하지 마! 아마 후회할 걸?"));
        button.addActionListener(event -> System.out.println("그냥 해! 후회는 없을 거야!"));
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
