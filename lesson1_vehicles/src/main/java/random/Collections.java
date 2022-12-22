package random;

import java.util.*;

public class Collections {
    // map
    Map<Integer, String> students = new HashMap<>();

    // queue
    Queue<Double> numQueue = new PriorityQueue<>();

    // set
    Set<Integer> set = new HashSet<>();

    // ArrayList
    ArrayList<Integer> arrList = new ArrayList<>();

    // LinkedList
    LinkedList<Integer> ll = new LinkedList<>();

    public void doSomething() {
        System.out.println("_____________________________________");

        // map
        this.students.put(1, "John Doe");
        this.students.put(2, "Mindia Shantadze");
        this.students.put(3, "Random Guy");
        // __________________________________________

        // queue
        this.numQueue.add(5.0);
        this.numQueue.add(10.0);
        this.numQueue.add(15.0);
        this.numQueue.add(1.5);
        Double[] dividedByTwo = this.numQueue.stream().map((num) -> {
            return num/2;
        }).toArray(Double[]::new);

        numQueue.stream()
                .map((item) -> item * 2)
                .forEach((num) -> {
                    System.out.println(num + " ");
                });

        for (double i: dividedByTwo) {
            System.out.println(i + " ");
        }
        // __________________________________________

        // set
        this.set.add(15);
        this.set.add(15);
        this.set.add(50);
        this.set.add(20);
        int sum = this.set.stream().reduce(0, (num, acc) -> acc + num);
        System.out.println(sum);
        // __________________________________________

        // Array List
        this.arrList.add(15);
        this.arrList.add(50);
        this.arrList.add(600);
        // __________________________________________

        // Linked List
        this.ll.add(15);
        this.ll.add(100);
        this.ll.add(3);

        this.ll.stream().map((num) -> {
            return "number " + num;
        }).forEach((item) -> {
            System.out.println(item + " ");
        });
        int result1 = this.ll.stream().reduce(0, (item, acc) -> acc + item);
        System.out.println(result1);

        int doubledSum = this.ll.stream().map((item) -> item * 2).reduce(0, (doubledItem, acc) -> doubledItem + acc);
        System.out.println(doubledSum);

        System.out.println("_____________________________________");
        // __________________________________________
    }
}
