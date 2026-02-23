package PMIS.Day9;

import java.util.ArrayList;
import java.util.List;

public class IPAddress {
    List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        IPAddress obj = new IPAddress();
        System.out.println( obj.restoreIpAddresses("25525511135" ));
        obj.list.clear();
        System.out.println( obj.restoreIpAddresses("101023" ));
    }

    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        if (n == 0) return list;
        dfs(new StringBuilder(0), s, 4);
        return list;
    }


    private void dfs(StringBuilder p, String up, int sections) {
        int n = up.length();
        if (n == 0 && sections == 0) {
            list.add(p.substring(0, p.length() - 1));
            return;
        }

        if (n > 0 && sections == 0) return;
        if (n == 0 && sections > 0) return;

        StringBuilder sb = new StringBuilder();
        int min = (int) Math.min(up.length(), 3);
        for (int i = 0; i < min; i++) {
            sb.append(up.charAt(i));
            int val = Integer.parseInt(sb.toString());
            // Validate first
            if (sb.length() == 2 && val < 10) continue;
            if (sb.length() == 3 && val < 100) continue;
            if (sb.length() == 3 && val > 255) continue;

            StringBuilder temp = new StringBuilder(p.toString());
            p.append(sb.toString());
            p.append(".");
            dfs(p, up.substring(i + 1, up.length()), sections - 1);

            p = temp;


        }
    }
}
