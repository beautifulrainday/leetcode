package leetcode.simple;

/**
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * <p>
 * 示例 1：
 * <p>
 * 输入：address = "1.1.1.1"
 * 输出："1[.]1[.]1[.]1"
 */
public class DefangIPaddr {

    public static String defangIPaddr(String address) {
        if (address.contains(".")) {
            return address.replace(".", "[.]");
        }
        return address;
    }

    public static void main(String[] args) {
        String s = defangIPaddr("1.1.1.1");
        System.out.println(s);
    }
}
