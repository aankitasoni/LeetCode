class Solution {
    public String validIPAddress(String s) {
        String ip6 = "(([a-fA-F_0-9]{1,4}:){7})([a-fA-F_0-9]{1,4})";
        String ip4 = "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
            
        if(s.matches(ip6))
            return "IPv6";
        else if(s.matches(ip4))
            return "IPv4";
        else
            return "Neither";
    }
}
