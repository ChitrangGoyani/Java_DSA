public class StringsSkip {
    public static void main(String args[]) {
        //bccdah
        String unprocessed = "bccappleappdah";
        String processed = "";
        printWithout(processed,unprocessed);
        System.out.println(printWithoutAnother(unprocessed));
        System.out.println(skipApple(unprocessed));
        System.out.println(skipAppNotApple(unprocessed));
    }

    static void printWithout(String processed, String unprocessed){
        //base condition
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char check = unprocessed.charAt(0);
        if(check == 'a'){
            printWithout(processed,unprocessed.substring(1));
        }
        else{
            printWithout(processed+check,unprocessed.substring(1));
        }
    }

    static String printWithoutAnother(String unprocessed){
        //base condition
        if(unprocessed.isEmpty()){
            return "";
        }

        char check = unprocessed.charAt(0);
        if(check == 'a'){
            return "" + printWithoutAnother(unprocessed.substring(1));
        }
        else{
            return check + printWithoutAnother(unprocessed.substring(1));
        }
    }

    static String skipApple(String unprocessed){
        //base condition
        if(unprocessed.isEmpty()){
            return "";
        }

        if(unprocessed.startsWith("apple")){
            return skipApple(unprocessed.substring(5));
        }
        else{
            return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }

    static String skipAppNotApple(String unprocessed){
        //base condition
        if(unprocessed.isEmpty()){
            return "";
        }

        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return skipAppNotApple(unprocessed.substring(3));
        }
        else{
            return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));
        }
    }
}