public class MyClass1 {
    int Square = 10;
    public int calculation(){
    return  Square*Square;
    } 

    public static void main(String[ ] args){
        MyClass1 obj = new MyClass1();
        int result = obj.calculation();
        System.out.println("Square of 10 is :"+ result);
    }
}
