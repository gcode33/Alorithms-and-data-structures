package ExamPractice_2019Summer;

public class TestRoom {
    public static void main(String[] args) {
        Room room = new Room("klans", 35);

        // Book some slots
        room.book(0, 2);
        room.book(1, 4);
        room.book(2, 6);
        room.book(3, 6);

        // Display room details and timetable
        room.display();

        // Count total bookings
        System.out.println("Total bookings: " + room.countBookings());

        // Count bookings at a specific hour
        System.out.println("Bookings at 2pm: " + room.countBookingsAtHour(6));

        // Check for days with no bookings
        boolean[] noBookings = room.noName();
        System.out.println("Days with no bookings:");
        for (int i = 0; i < noBookings.length; i++) {
            if (noBookings[i]) {
                System.out.println("Day " + (i + 1));
            }
        }
    }
}
