package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Source source = new Source(100L);
        System.out.println("MyMapper.INSTANCE.fromSourceToTarget(source).getTargetId() = "
                + MyMapper.INSTANCE.fromSourceToTarget(source).getTargetId());


    }
}