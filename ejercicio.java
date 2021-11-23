public class ejercicio{
    public static void main(String[] args) {
        int[] array=new int[20];

        for (int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*10+1);
        }

        for (int j=0; j<array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}