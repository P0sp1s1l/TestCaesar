public class Start {

    public static void main (String[] args) {
        String input = ("zdar");
        char[] retype = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            retype[i] = input.charAt(i);
        }
        System.out.println(input);
        System.out.println(" ..");
        Test.encryption(retype);


    }
}
