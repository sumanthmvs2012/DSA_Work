package Day3_DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Encode_Decode_Strings
{
    public static void main(String[] args)
    {
        String[] originalarray = {"Hello", "World", "java"};

        Encode_Decode_Strings eds = new Encode_Decode_Strings();

        //Encode
        String encode_result = eds.encode(originalarray);
        System.out.println("Result for Encode:- " + encode_result);

        //Decode
        ArrayList<String> als = new ArrayList<>();
        als = eds.decode(encode_result);
        System.out.println("Result for Decode:- " + als);

    }

    public String encode(String arr[])
    {
        // write your logic to encode the strings
        // The encode() function converts the array into a single string by storing each word as length + "/:" + string.
        //For the given input, "Hello" becomes "5/:Hello", "World" becomes "5/:World". These are concatenated to form "5/:Hello5/:World", which is transmitted.

        int len = arr.length;
        String taging = "/:";
        String encoded_string= "";

        for(int i=0;i<arr.length;i++)
        {
            String new_len;
            encoded_string = encoded_string + arr[i].length() + taging + arr[i];
        }
      //  System.out.println("Encoding:- " + encoded_string);
        return encoded_string;
    }

    public ArrayList<String> decode(String s)
    {
        ArrayList<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            // Find "/:"
            int separatorIndex = s.indexOf("/:", i);

            // Get length
            int length = Integer.parseInt(s.substring(i, separatorIndex));

            // Actual string starts after "/:"
            int start = separatorIndex + 2;

            // Extract word
            String word = s.substring(start, start + length);

            result.add(word);

            // Move pointer
            i = start + length;
        }
        return result;
    }

}
