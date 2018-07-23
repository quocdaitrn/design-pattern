package vn.self.training.designpattern.structural.facade;

public class CPU {
    public void freeze() {
        System.out.println("CPU.freeze");
    }

    public void jump(long position) {
        System.out.println("CPU.jump: position = [" + position + "]");
    }

    public void excute() {
        System.out.println("CPU.excute");
    }
}
