public class shiftArr{
  public static void main(String[] args){
    int[] myArr = new int[]{1, 2, 3, 4, 5};
    int n = 1;
    //n determines the number of times array elements should shift.
    System.out.println("The initial array: ");
    for(int i = 0; i < myArr.length; i++){
      System.out.print(myArr[i]+ " ");
    }
    for(int m = 0; m < n; m++){
      int k, lastElement;
      lastElement = myArr[myArr.length - 1];
      for(k = myArr.length - 1; k > 0; k--){
        myArr[k] = myArr[k - 1];
      }
      myArr[0] = lastElement;
    }
    System.out.println();
    System.out.println("After one right shift: ");
    for(int u = 0; u < myArr.length; u++){
      System.out.print(myArr[u]+ " ");
    }
  }
}
