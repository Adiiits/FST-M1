package activities;

public class Activity2 {

    public static void main(String[] args) {
        int total = 0;
        int[] arr = {10, 77, 10, 54, -11, 10};
      for(int i = arr.length-1;i>=0;i--){
            if(arr[i]==10) {
                total=total+arr[i];
            }

        }
      if(total==30){
          System.out.println("exactly 30");
      }else
          System.out.println("not 30");
    }
}
