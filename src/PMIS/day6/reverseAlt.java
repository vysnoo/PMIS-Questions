package PMIS.day6;

public class reverseAlt {
    public static String reverseAlt(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i += 2 * k) {

            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseAlt("abcdefgh", 2)); // bacdfegh
        System.out.println(reverseAlt("abcdefgh", 3)); // cbadefhg
    }

}
