public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
        fizzBuzz2();
    }
    static void  fizzBuzz(){
        for(int i = 1; i < 101; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("Fizz Buzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    //Not quite true to the implementation because of the white space after Fizz
    static void  fizzBuzz2(){
        for(int i = 1; i < 101; i++){
            
            if(i%3==0){
                System.out.print("Fizz ");
            }
            
            if(i%5==0){
                System.out.print("Buzz");
            }
            
            if(i%5!=0 && i%3!=0){
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
