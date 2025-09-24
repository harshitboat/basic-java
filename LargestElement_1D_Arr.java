public class LargestElement_1D_Arr {
    public static void main(String[]args){
        int []arr ={1,35,67,895,76,654,45};
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
          if(arr[i]>largest){
            largest = arr[i];
          }  

        }
           System.out.print("this is the largest element in the array: "+largest);
    }
    
}
