public class HW4 {
    public static void main(String[] args) {

        /*
        1.Write a Java program to test if the first and the last element of an array of
        integers are same. The length of the array must be greater than or equal to 2
         */

//        int [] numbers = {4,2,3,4,5,6,7,8,9,4};
//        if (numbers[0]==numbers[numbers.length-1]){
//            System.out.println("the same");
//        }else {
//            System.out.println("not same");
//        }

        /*
        2.Write a Java program to find the k largest elements in a given array.
        Elements in the array can be in any order.
         */

//        int [] nums = {1,4,17,7,25,3,100};
//        int k = 3;
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        for (int i= nums.length-1;i>=nums.length-k;i--){
//
//            System.out.println(nums[i]);
//        }

        /*
        3.Write a Java program to find the numbers
         greater than the average of the numbers of a given array.
         */
//        int nums[]={1, 4, 17, 7, 25, 3, 100};
//        int sum = 0;
//        for (int i = 0 ; i< nums.length; i++){
//            sum+=nums[i];
//        }
//        int avg=sum/nums.length;
//        System.out.print("The average of the said array is:"+avg+" The numbers in the said array that are greater than the average are:");
//        for (int i = 0; i<nums.length;i++){
//            if (nums[i]>avg){
//                System.out.print(" ");
//                System.out.print(nums[i]);
//            }
//        }

        /*
        4.Write a Java program to get the larger value between first
         and last element of an array of integers.

         */

//        int [] numms = {50, 30, 40};
//        if (numms[0]>numms[numms.length-1]){
//            System.out.println("Larger value between first and last element:"+numms[0]);
//        }else{
//            System.out.println("Larger value between first and last element:"+numms[numms.length-1]);
//        }

        /*
        5.Write a Java program to swap the first and last elements of an
         array and create a new array.
         */

//        int [] nummms = {20, 30, 40};
//        int n1=nummms[0];
//        int n2 =nummms[nummms.length-1];
//        int [] numNew = new int[nummms.length];
//        for (int i = 0 ; i<nummms.length;i++){
//            numNew[i]=nummms[i];
//        }
//        numNew[0]=n2;
//        numNew[nummms.length-1]=n1;
//        System.out.println(Arrays.toString(numNew));

//        // author solution Q5

//        int n=nummms[0];
//        nummms[0]=nummms[nummms.length-1];
//        nummms[nummms.length-1]=n;
//        System.out.println(Arrays.toString(nummms));

        /*
        6.Write a Java program to find all of the longest word in a given dictionary.

         */

//        String [] words = {"cat", "dog", "red", "is", "am"};
//        int length = 0;
//        for (String word : words ){
//            if (word.length()>length){
//                length = word.length();
//            }
//        }
//        System.out.println("result :");
//        for (int i = 0 ; i< words.length;i++){
//
//            if (words[i].length()==length){
//                System.out.println(words[i]);
//            }
//        }

        /*
        7-Write a menu driven Java program with following option:
         */

//        int numOfOp = 0;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter szie Of Array :");
//        int sizeOfArray = scan.nextInt();
//        String[] elements = new String[sizeOfArray];
//        while (true) {
//            System.out.println("" +
//                    "1-Accept elements of an array\n" +
//                    "2-Display elements of an array\n" +
//                    "3-Search the element within array\n" +
//                    "4-Sort the array\n" +
//                    "5-To Stop");
//            numOfOp = scan.nextInt();
//            System.out.println("_________________");
//            if (numOfOp == 1) {
//                System.out.println("Enter element:");
//                for (int i = 0; i < elements.length; i++) {
//                    System.out.println(i);
//                    elements[i] = scan.next();
//                }
//            }
//            if (numOfOp == 2) {
//                for (String element : elements) {
//                    System.out.println(element);
//                }
//
//            }
//            if (numOfOp == 3) {
//                System.out.println("Enter element you want serch");
//                String serch = scan.next();
//                boolean found = false;
//                for (String element : elements) {
//                    if (element.equals(serch)) {
//                        System.out.println("Found " + element);
//                        found = true;
//                        break;
//                    }
//
//                }
//                if (!found){
//                    System.out.println("not found"+serch);
//                }
//            }
//        if (numOfOp == 4) {
//            Arrays.sort(elements);
//            System.out.println(Arrays.toString(elements));
//
//        }
//        if (numOfOp == 5) {
//            break;
//        }
//    }

        /*
        8. Write a program thats displays the number of occurrences of an element in the array.
         *///not completion
//       int [] numbersO = {1,1,1,3,3,5};
//        int counter = 0;
//        for (int i = 0; i < numbersO.length; i++) {
//
//            for (int j = 0;j<numbersO.length; j++){
//
//                if (numbersO[i]==numbersO[j]){
//                    counter++;
//                    //System.out.println(numbersO[i]+"times"+counter);
//                }
//            }
//            System.out.println(numbersO[i]+"times"+counter);
//
//        }

        /*
        9. Write a program that places the odd elements of an array before the even elements.
         *///not completion
//        int [] collecionNumber = {2,3,40,1,5,9,4,10,7};
//        int [] afterOp = new int[collecionNumber.length];
//        for (int i =0 ; i< collecionNumber.length;i++){
//            for (int j = 0; j < collecionNumber.length; j++) {
//                if (collecionNumber[i]%2!=0){
//                    afterOp[i]=collecionNumber[j];
//                }
//            }
//
//        }
//        System.out.println(Arrays.toString(afterOp));




        /*
        10. Write a program that test the equality of two arrays.
         */
//        ArrayList ar1 = new ArrayList<>();
//        ar1.add(2);
//        ar1.add(3);
//        ar1.add(6);
//        ar1.add(6);
//        ar1.add(4);
//        ArrayList ar2 = new ArrayList<>();
//        ar2.add(2);
//        ar2.add(3);
//        ar2.add(6);
//        ar2.add(6);
//        ar2.add(4);
//        System.out.println(ar1.equals(ar2));


}
}