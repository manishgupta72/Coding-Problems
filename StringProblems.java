import java.util.Arrays;

public class StringProblems {
    // reverse a string without using extra space and variable
    // public static void reverseString(char[] arr)
    // {
    // String reverse="";

    // for(int i=arr.length-1;i>=0;i--)
    // {
    // reverse=reverse+arr[i];

    // }
    // System.out.println(reverse);
    // }
    public static void reverseString(char[] arr, int start, int end) {

        while (start < end) {
            // XOR for swapping the variable
            arr[start] ^= arr[end];
            arr[end] ^= arr[start];
            arr[start] ^= arr[end];
            start++;
            end--;

        }
        System.out.println(arr);
    }

    public static char[] CheckPalindrome(char str[]) {
        int start = 0, end = str.length - 1;
        while (start < end) {
            str[start] ^= str[end];
            str[end] ^= str[start];
            str[start] ^= str[end];
            start++;
            end--;
        }
        return str;
    }

    public static char NonRepeatingStr(String str) {

        int n = str.length();
        for (int i = 0; i < n; ++i) {
            boolean found = false;
            for (int j = 0; j < n; ++j) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;

                }
            }
            if (found == false) {
                return str.charAt(i);
            }
        }
        return '$';

    }

    public static String frequencyOfStr(String str) {
        int n = str.length(); // Get the length of the input string
        String result = ""; // This will store the final result
        boolean[] visited = new boolean[n]; // Array to track which characters have been processed

        // Loop through each character in the string
        for (int i = 0; i < n; i++) {
            // If the character has already been processed, skip it
             System.out.println(visited[i]);
            if (visited[i]) {
                continue;
            }

            // Start counting occurrences of the current character
            int count = 1; // Initialize count as 1 for the current character
            for (int j = i + 1; j < n; j++) {
                // If a duplicate is found, increment the count
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true; // Mark the duplicate character as visited
                }
                
            }

            // Mark the current character as visited to avoid reprocessing
            visited[i] = true;

            // Append the character and its count to the result
            result += str.charAt(i) + "" + count + " ";
        }

        // Trim the result to remove any trailing spaces and return it
        return result.trim();
    }

    // Check if two Strings are Anagrams of each other
    public static boolean Ananagrams(String str1,String str2)
    {
        char [] arr1=str1.toCharArray();
        char [] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        // reverse a string without using extra space and variable
        String str1 = "geeks";
        String str2 = "gesek";

        // reverseString(str.toCharArray(),0,str.length()-1);
        // String result = new String(CheckPalindrome(str.toCharArray()));
        // System.out.println("String=" + str);
        // System.out.println("result=" + result);
        // if (str.equals(result)) {
        // System.out.println("String is Palindrome");
        // } else {
        // System.out.println("String is not Palindrome");
        // }

        // System.out.println(NonRepeatingStr(str));
        // System.out.println(frequencyOfStr(str));
        System.out.println(Ananagrams(str1,str2));

    }
}
