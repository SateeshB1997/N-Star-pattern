import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); 
        sc.close();

        System.out.println("* ".repeat(input).trim());
        System.out.println("*\n".repeat(input).trim());
    }
}