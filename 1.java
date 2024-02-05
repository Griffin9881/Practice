public class Main
        public static void main(String[] args) {
            String a = "11";
            String b = "1";
            int aValue = Integer.parseInt(a, 2);
            int bValue = Integer.parseInt(b, 2);
            int sum = aValue + bValue;
            String output = String.toBinaryString(sum);
            System.out.println(output);
    }

}