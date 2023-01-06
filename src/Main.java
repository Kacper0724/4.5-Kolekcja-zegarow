import java.time.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clock clock1 = new Clock(1, 22, 10, 23);
        Clock clock2 = new Clock(2, 13, 35, 45);
        Clock clock3 = new Clock(3, 12, 39, 14);
        Clock clock4 = new Clock(4, 16, 40, 56);
        Clock clock5 = new Clock(5, 23, 15, 43);
        Clock clock6 = new Clock(6, 20, 13, 24);

        List<Clock> ClockList = new LinkedList<>();
        ClockList.add(clock1);
        ClockList.add(clock2);
        ClockList.add(clock3);
        ClockList.add(clock4);
        ClockList.add(clock5);
        ClockList.add(clock6);

        for (int i = 0; i < ClockList.size(); i++) {
            System.out.println("Clock number: " + (i+1) + ", time on this clock: " + ClockList.get(i).addMinute());
        }

        //-----Zadanie dodatkowe-----

        int number = 0;
        boolean isDivisibleBy4 = number % 4 == 0;

        for (int i = 0; i <= 100; i++) {
            number++;
            isDivisibleBy4 = number % 4 == 0;
            if (isDivisibleBy4 == true) {
                System.out.println("Number: " + number + ", is divisible by 4");
            }
        }
    }
}

class Clock{
    Integer ClockNumber;
    LocalTime time;

    public Clock(int ClockNumber, int hour, int minute, int seconds) {
        this.ClockNumber = ClockNumber;
        this.time = LocalTime.of(hour,minute,seconds);
    }

    public LocalTime addMinute() {
        return time.plusMinutes(1);
    }

    public String toString() {
        return "Clock number: " + ClockNumber + ", time: " + time;
    }
}