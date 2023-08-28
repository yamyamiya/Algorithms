package lesson12;

public class Homework11 {
        public static void main(String[] args) {
            int[] array = {10,20,30,40};
            int number = 19;
            String elevatorLetter = Character.toString((char) (65+elevator(array,number)));
            System.out.println("We have to send the elevator "+elevatorLetter+" to the passenger");

        }
        public static int elevator(int[] arr,int num){
            int minDistance = Integer.MAX_VALUE;
            int index = -1;
            for (int i=0;i<arr.length;i++){
                if (Math.abs(arr[i]-num)<minDistance){
                    minDistance = Math.abs(arr[i]-num);
                    index = i;
                }
            }
            return index;
        }
}
