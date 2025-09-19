public class Function_class {
    // void & int
    // No argument with return
    public static int addNumber() {
        return 2+3;
    }
    // Argument with return
    public static int addNumber1(int a,int b) {
        return a+b;
    }
    // No argument with no return
    public static void addNumber2() {
        System.out.println("Hello number..");
    }
    //Argument no return
    public static void addNumber3(int a,int b) {
        System.out.println("Sum of a and b is "+ (a+b));
    }
    public static void main(String[] args) {
        // System.out.println(addNumber());
        int n = addNumber();// 5
        System.out.println("There is value of n is:" + n);

        int m = addNumber1(6, 7);
        System.out.println("There is value of m is:" + m);

        addNumber2();
        addNumber3(3, 4);
    }

}

// function definition
// void sum(){

// }

// int main(){
// // function calling
// sum()
// max()
// }
// Function ek block of code hota hai jo koi specific task perform krta hai
// 1. function call 2. function definition
// if there is round brackets after the name,variable then it will be function


// function - 2 types
// 1. user-defined function 
// 2. pre-defined function eg: main,max,min,pow....etc

// User-Defined :
// 4 types:
// 1. No argument no return types
// 2. No argument with return type
// 3. argument no return type
// 4. argument with return type

//argument and return type:
// Calculator:::::
// 1. addition
// 2. subtract
// 3. multiply
// 4. division

