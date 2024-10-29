package java_recursive;

public class Work1 {

    static String generateName(String name, int index){
        int lenI = String.valueOf(index).length();
        if(lenI > name.length()){
            System.exit(0);
        }
//		The name replaced the last characters by index.
        String targetName =   name.substring(0, name.length() - lenI).concat(String.valueOf(index));
        //check existing on T_PARA
        if(index - 101 < 0){
            return generateName(targetName, ++index);
        }else {
            return targetName;
        }
    }

    public static void main(String[] args) {

        int index = 1;
        String sampleName = "fooBar";
        System.out.println(generateName(sampleName,index));
    }
}
