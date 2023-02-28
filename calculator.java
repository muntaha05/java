public class calculator
{
   public static void main(String[] args){
       int num1=50;
       int num2=34;
        System.out.println("addition"+(num1+num2));
        System.out.println("subtraction"+(num1-num2));
        System.out.println("multiplication"+(num1*num2));
        System.out.println("division"+((double)num1/num2));
        int div=num1/num2;
        int rem=num1-(num2*div);
        System.out.println("remainder "+rem);
        
        }
        
        }
