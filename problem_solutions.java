public class problem_solutions {
    public void sumOfArrayElements(){
        System.out.println("Problem 1: Sum of Array Elements");
        int[] array = {1,3,5,7,9,2,4,6,8,10};
        int arrayLength = array.length;
        //System.out.println("Array length " + arrayLength);
        int sumOfTheArray = 0;
        for(int i = 0;i<arrayLength;i++){
            sumOfTheArray = sumOfTheArray + array[i];
        }
        System.out.println("Sum of Array Elements = " + sumOfTheArray);
        System.out.println();
    }
    public void largestElementOfTheArray(){
        System.out.println("Problem 2: Largest Element in Array");
        int[] array = {2,4,6,8,10,1,3,5,7,9};
        int arrayLength = array.length;
        System.out.println("Array length " + arrayLength);
        int largestElement = array[0];
        for(int i = 1;i<arrayLength;i++){
            if(array[i]>largestElement){
                largestElement=array[i];
            }
        }
        System.out.println("Largest element of the Array = " + largestElement);
        System.out.println();
    }
    public void checkEvenOrOdd(){
        System.out.println("Problem 3: Even or Odd Numbers");
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int arrayLength = array.length;
        int countEven = 0;
        int countOdd = 0;
        System.out.println("Array length " + arrayLength);
        for(int i = 0;i<arrayLength;i++){
            if(array[i]%2==0){
                System.out.println(array[i] + " = Even");
                countEven = countEven + 1;
            }
            else{
                System.out.println(array[i] + " = Odd");
                countOdd = countOdd + 1;
            }
        }
        System.out.println("Number of Even elements in the Array = " + countEven);
        System.out.println("Number of Odd elements in the Array = " + countOdd);
        System.out.println();
    }
    public void reverseTheElementsOfArray(){
        System.out.println("Problem 4: Reverse an Array");
        int[] array = {1,3,5,7,9,2,4,6,8,10};
        int arrayLength = array.length;
        //System.out.println("Array length " + arrayLength);
        System.out.println("Reversed Array = ");
        for(int i = arrayLength-1;i>=0;i--){
            System.out.printf(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    public void factorialCalculation(){
        System.out.println("Problem 5: Factorial Calculation");

        System.out.println();
    }
    public void palindromeCheck(){
        System.out.println("Problem 6: Palindrome Check");
        char[] charArray = {'a', 'b', 'c', 'd', 'd', 'b', 'c', 'a'};
        System.out.print(charArray);
        int charArrayLength = charArray.length;
        boolean isPalindrome = isPalindrome(charArray, charArrayLength);
        if(isPalindrome==true){
            System.out.println(" is a Palindrome");
        }
        else{
            System.out.println(" is not a Palindrome");
        }
        char[] charArray2 = {'a', 'b', 'c', 'd', 'c', 'b', 'a'};
        System.out.print(charArray2);
        int charArrayLength2 = charArray2.length;
        boolean isPalindrome2 = isPalindrome(charArray2, charArrayLength2);
        if(isPalindrome2==true){
            System.out.println(" is a Palindrome");
        }
        else{
            System.out.println(" is not a Palindrome");
        }
        System.out.println();
    }
    public boolean isPalindrome(char[] charArray, int charArrayLength){
        boolean isPalindrome = true;
        for(int i=0,j=charArrayLength-1;i<charArrayLength/2;i++,j--){
            if(charArray[i]!=charArray[j]){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
    public void primeNumberCheck(){
        System.out.println("Problem 7: Prime Number Check");
        int number = 101;
        boolean isPrime = true;
        if(number<2){
            System.out.println(number + " is not a Prime");
        }
        else if(number==2){
            System.out.println(number + " is a Prime");
        }
        else{
            for(int i=2;i<number/2;i++){
                if(number%2==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println(number + " is  a Prime");
            }
            else{
                System.out.println(number + " is not a Prime");
            }
        }
        System.out.println();
    }
    public void fibonacciSeries(){
        System.out.println("Problem 8: Fibonacci Series");

        System.out.println();
    }
    public boolean linearSearch(int search){
        System.out.println("Problem 9: Linear Search");
        int[] array = {1,3,5,7,9,2,4,6,8,10};
        int arrayLength = array.length;
        System.out.println("Find: " + search);
        boolean found = false;
        for (int i=0;i<arrayLength;i++){
            if(search==array[i]){
                found=true;
                break;
            }
        }
        return found;
    }
    public void binarySearch(){
        System.out.println("Problem 10: Binary Search");
        int[] array = {1,2,3,5,6,7,8,10};
        int arrayLength = array.length;
        boolean isFound = doBinarySearch(array, arrayLength, 1);
        if(isFound==true){
            System.out.println("1 Found");
        }
        else {
            System.out.println("1 not Found");
        }
        isFound = doBinarySearch(array, arrayLength, 13);
        if(isFound==true){
            System.out.println("13 Found");
        }
        else {
            System.out.println("13 not Found");
        }
        System.out.println();
    }
    private boolean doBinarySearch(int[] array, int arrayLength, int number){
        boolean found=false;
        int low=0;
        int high=arrayLength-1;
        while (low<=high){
            int mid=(low+high)/2;
            int midValue = array[mid];
            if(number<midValue){
                high=mid-1;
            }
            else if(number>midValue){
                low=mid+1;
            }
            else if(number==midValue){
                low=mid+1;    high=mid-1;   //doesn't make any sense. (Chokher shanti e boro shanti -_-)
                found = true;
            }
        }
        return found;
    }
    public boolean duplicateElements(){
        System.out.println("Problem 11: Duplicate Elements");
        int[] array = {1,2,3,5,4,6,7,9,2,4,10};
        int arrayLength = array.length;
        boolean duplicateFound= false;
        for (int i=0;i<arrayLength-1;i++){
            for (int j=i+1; j<arrayLength; j++){
                if(array[i]==array[j]){
                    duplicateFound = true;
                    break;
                }
            }
        }
        return duplicateFound;
    }
    public void countVowelsAndConsonants(){
        System.out.println("Problem 12: Count Vowels and Consonants");
        String string = "AmarBangladesh";
        string.toLowerCase();
        int numberVowel = 0;
        int numberConsonent = 0;
        int StringLength = string.length();
        for (int i=0;i<StringLength;i++){
            if (string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u'){
                numberVowel = numberVowel + 1;
            }
            else {
               numberConsonent = numberConsonent + 1;
            }
        }
        System.out.println("Number of Vowels: " + numberVowel);
        System.out.println("Number of Consonent: " + numberConsonent);
        System.out.println();
    }
    public void multiplicationTable(){
        System.out.println("Problem 13: Multiplication Table");
        int mul = 6;
        System.out.println("Multiplication of " + mul);
        for (int i=1;i<=10;i++){
            int multiply = mul*i;
            System.out.println(mul + " * " + i + " = " + multiply);
        }
        System.out.println();
    }
    public int[][] matrixAddition(){
        System.out.println("Problem 14: Matrix Addition");
        int [][] array2D1 = new int[3][3];
        array2D1[0][0] = 1;
        array2D1[0][1] = 2;
        array2D1[0][2] = 3;
        array2D1[1][0] = 2;
        array2D1[1][1] = 3;
        array2D1[1][2] = 1;
        array2D1[2][0] = 3;
        array2D1[2][1] = 1;
        array2D1[2][2] = 2;
        int [][] array2D2 = new int[3][3];
        array2D2[0][0] = 3;
        array2D2[0][1] = 2;
        array2D2[0][2] = 1;
        array2D2[1][0] = 2;
        array2D2[1][1] = 1;
        array2D2[1][2] = 3;
        array2D2[2][0] = 1;
        array2D2[2][1] = 3;
        array2D2[2][2] = 2;
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                array2D2[i][j] = array2D1[i][j] + array2D2[i][j];
            }
        }
        return array2D2;
    }
    public void calculateAverage(){
        System.out.println("Problem 15: Calculate Average");
        int[] array = {1,2,3,5,4,6,7,9,2,4,10};
        int arrayLength = array.length;
        int sum = 0;
        for(int i=0;i<arrayLength;i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of the Array: " + sum);
        System.out.println("length of the Array: " + arrayLength);
        double average = sum/arrayLength;
        System.out.println("Average of the Array: " + average);
        System.out.println();
    }
    public void leapYearCheck(){
        System.out.println("Problem 16: Leap Year Check");
        int year = 1900;
        if(year%4==0 && year%100!=0 || year%400==0){
                    System.out.println(year + " is a Leap year");
                }
        else{
                    System.out.println(year + " is not a Leap year");
        }
        System.out.println();
    }
    public void patternPrinting(){
        System.out.println("Problem 17: Pattern Printing");
        int base = 5;
        for(int i=1;i<=base;i++){
            int space = base-i;
            int brick = ((base-space-1)*2) + 1;
            while (space!=0){
                System.out.print(" ");
                space--;
            }
            while (brick!=0){
                System.out.print(1);
                brick--;
            }
            System.out.println();
        }
        System.out.println();
    }
    public void stringReversal(){
        System.out.println("Problem 18: String Reversal");
        String name = "AlbertLabstein";
        int nameLength = name.length();
        for(int j=nameLength-1; j>=0; j--){
            System.out.print(name.charAt(j));
        }
        System.out.println();
        System.out.println();
    }
    public void armstrongNumber(){
        System.out.println("Problem 19: Armstrong Number");
        int number = 9800817;
        int n2=number;
        int digit=0;
        while(n2!=0){
            n2/=10;
            digit++;
        }
        //System.out.println(number);
        //System.out.println(digit);
        //System.out.println();
        n2=number;
        int sum=0;
        while(n2!=0){
            int n=n2%10;
            sum+=calculatePowerValue(n,digit);
            n2/=10;
        }
//        System.out.println();
//        System.out.println(sum);
        if(number==sum){
            System.out.println(number + " is a Armstrong Number");
        }
        else{
            System.out.println(number + " is not a Armstrong Number");
        }
        System.out.println();
    }
    public int calculatePowerValue(int number, int power){
        int result=1;
//        System.out.println(number);
        for(int i=1;i<=power;i++){
            result*=number;
//            System.out.println(result);
        }
//        System.out.println();
//        System.out.println(number + " " + result);
        return result;
    }
    public void findMinimumAndMaximum(){
        System.out.println("Problem 20: Find Minimum and Maximum");
        int[] array = {1,2,3,5,4,1,9,6,2,4,7,9,8,10};
        int arrayLength = array.length;
        for(int i=0;i<arrayLength-1;i++){
            for(int j=i+1;j<arrayLength;j++){
                int temp=0;
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Maximum value of the Array: " + array[arrayLength-1]);
        System.out.println("Minimum value of the Array: " + array[0]);
        System.out.println();
    }
    public void calculateSimpleInterest(){
        System.out.println("Problem 21: Calculate the simple interest for given principal, rate of interest, and time");
        double principalInvestment = 50000;
        double rateOfInterest = 6.0;
        int investedYear = 3;
        double simpleInterest = (principalInvestment*rateOfInterest*investedYear)/100.0;
        System.out.println("Principal Invest: " + principalInvestment);
        System.out.println("Interest Rate: " + rateOfInterest);
        System.out.println("Invested for Year: " + investedYear);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println();
    }
    public void temperaturesConversion(){
        System.out.println("Problem 22: Write a program to convert temperatures from Celsius to Fahrenheit and vice versa");
        System.out.println("Celcius to Farenheit:");
        double cel = 45.5;
        double celToFar = (cel * (9.0/5.0)) + 32.0;
        System.out.println(cel + " degree Celcius = " + celToFar + " degree Farenheit");

        System.out.println("Farenheit to Celcius:");
        double far = 96.5;
        double farToCel = (far - 32) * (5.0/9.0);
        System.out.println(far + " degree Farenheit = " + farToCel + " degree Celcius");
        System.out.println();
    }
    public void checkInputType(){
        System.out.println("Problem 23: Write a program that checks whether the input character is an uppercase letter, lowercase letter, a digit, or a special 24. character");

        System.out.println();
    }
    public void secondLargestNumberOfArray(){
        System.out.println("Problem 24: Write a program to find the second largest number in a given array");
        int[] array = {1,2,3,5,4,1,9,6,2,4,7,9,8,10};
        int arrayLength = array.length;
        for(int i=0;i<arrayLength-1;i++){
            for(int j=i+1;j<arrayLength;j++){
                int temp=0;
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second Largest value of the Array: " + array[arrayLength-1-1]);
        System.out.println();
    }
    public void sumOfAllNumbersInString(){
        System.out.println("Problem 25: Given a string containing both letters and numbers, find the sum of all the numbers in the string");

        System.out.println();
    }
}
