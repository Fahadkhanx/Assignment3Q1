public class Assignment3Q1 {
    public static void main(String args[]) {
        char somechar = 'a';
        System.out.println("char is: " + somechar);
        switch (somechar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(somechar + " is a vowel.");
                break;
            default:
                System.out.println(somechar + " is a consonant.");
        }
    }
}