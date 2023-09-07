import java.util.Arrays;

public class MeetingRooms {
    public static void main(String[] args) {
        MeetingRooms solution = new MeetingRooms();
        int[][] canAttendMeetingings = { { 7, 10 }, { 2, 4 } };
        boolean canAttend = solution.CanAttend(canAttendMeetingings);
        System.out.println(canAttend);
    }

    public boolean CanAttend(int[][] canAtt) {
        Arrays.sort(canAtt, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < canAtt.length; i++) {
            if (canAtt[i][0] < canAtt[i - 1][1]) {
                return false;
            }
        }
        return true;
    }

}
