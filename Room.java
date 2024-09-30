package ExamPractice_2019Summer;

public class Room {
    private String name;
    private int capacity;
    private final int DAYS = 5;
    private final int HOURS = 9;
    private int slots[][];

    public Room(String n, int cap) {
        this.name = n;
        this.capacity = cap;
        slots = new int[DAYS][HOURS];
        for (int row = 0; row < DAYS; row++) {
            for (int col = 0; col < HOURS; col++) {
                slots[row][col] = 0;
            }
        }
    }

    public boolean isSlotAvailable(int day, int hour) {
        if (slots[day][hour] == 1) {
            return false;
        } else {
            return true;
        }
    }
    //book the specified slot
    public void book(int day, int hour) {
        if(isSlotAvailable(day,hour)){
            slots[day][hour] = 1;
        }
        else{
            System.out.println("slot already booked");
        }
        // to be completed
    }
    //Output name and capacity
    //Output 2D array contents as a table
    //No labels/headings are required
    public void display() {
        // to be completed
        System.out.println("name :" + name);
        System.out.println("capacity: " + capacity);
        System.out.println("table :");
        for(int rows = 0; rows < DAYS; rows++){
            for(int cols = 0; cols < HOURS; cols++){
                System.out.println(slots[rows][cols] + "");
            }
        }
    }


    public boolean[] noName() {
        boolean values[] = new boolean[DAYS];
        for (int i = 0; i < DAYS; i++) {
            values[i] = false;
        }
        for (int row = 0; row < DAYS; row++) {
            int count = 0;
            for (int col = 0; col < HOURS; col++) {
                if (slots[row][col] == 0)
                    count++;
            }
            if (count == HOURS) {
                values[row] = true;
            }
        }
        return values;
    }
    // counts the total number of booked slots
    public int countBookings() {
        int cnt = 0;
        for (int row = 0; row < DAYS; row++){
            for (int col = 0; col < HOURS; col++){
                if(slots[row][col] == 1){
                    cnt++;
                }
            }
        }
        // to be completed
        return cnt;
    }
    // counts the number of booked slots at the specified hour
    public int countBookingsAtHour(int hour) {
        int count = 0;
        for (int row = 0; row < DAYS; row++) {
            if (slots[row][hour] == 1) {
                count++;
            }
        }
        return count;
    }
}
