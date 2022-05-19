public class Arrays {
    public static void main(String[] args) {
        System.out.println(array(10));
    }
    public static String array(int a){
        String[] array = new String[a];
        String ausgabe="";

            for(int i = 0; i < a; i++){
            int b = i+1;
            array[i] = "Student " + b;
            ausgabe += "array[" + i +"] = " + array[i] + "\n";
        }
        return ausgabe;
    }
}
