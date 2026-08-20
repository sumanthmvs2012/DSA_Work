package Day_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingRooms2
{
    public static void main(String[] args)
    {
        CountRooms countRooms = new CountRooms();
        int[] start = {1, 10, 7};
        int[] end = {4, 15, 10};
        //Output: 1
        int result = countRooms.rooms(start,end);
        System.out.println("Result: " + result);
    }
}

class CountRooms
{
    public int rooms(int[] start, int[] end) {
        int n = start.length;

        int room = 1, res = 1;

        for (int i = 0; i < n; i++)
        {
            room = 1;
            for (int j = 0; j < n; j++)
            {
                if (i != j)
                {
                    if (start[i] >= start[j] && end[j] > start[i])
                    {
                        room++;
                    }
                }
            }
            res = Math.max(room, res);
        }
        return res;
    }
}
