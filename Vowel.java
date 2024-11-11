public class Vowel {
    public static void main(String[] args) {
        String s = "java";
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'i' || a[i] == 'o' || a[i] == 'a' || a[i] == 'e' || a[i] == 'u') { 
                System.out.println("vowel : " + a[i]);
            } else if (a[i] == ' ') {

            } else {
                System.out.println("consoant : " + a[i]);
            }
        }
    }
}
