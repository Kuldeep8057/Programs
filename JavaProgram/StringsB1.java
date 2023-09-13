public class StringsB1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        //set of charAt
        sb.setCharAt(0,'S');
        System.out.println(sb);

        sb.insert(0,'P');
        System.out.println(sb);

        sb.insert(3,'N');
        System.out.println(sb);

        sb.delete(3,4);
        System.out.println(sb);

        
    }
    
}
