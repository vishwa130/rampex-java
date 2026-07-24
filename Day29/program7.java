package Day30;
import java.util.*;
public class Program7 {
   

 static class Meeting {
    int start, end, pos;

    Meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

static class Main {
    public static void main(String[] args) {

        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        ArrayList<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < start.length; i++) {
            meetings.add(new Meeting(start[i], end[i], i + 1));
        }

        Collections.sort(meetings, (a, b) -> a.end - b.end);

        int count = 1;
        int lastEnd = meetings.get(0).end;

        System.out.print("Meetings Selected: " + meetings.get(0).pos + " ");

        for (int i = 1; i < meetings.size(); i++) {
            if (meetings.get(i).start >= lastEnd) {
                System.out.print(meetings.get(i).pos + " ");
                lastEnd = meetings.get(i).end;
                count++;
            }
        }

        System.out.println("\nMaximum Meetings = " + count);
    }
}
    
}