package Tricky_Questions;



public class Scnd_large_num_inArray {
    public static void main(String[] args) {
        int[] elements={10,20,25,16,17,21,11,9,15};
        SecondLarge(elements);
        Secondsmall(elements);
    }
    public static void SecondLarge(int[] elements) {
        int FirstMax;
        int SecondMax;
        if (elements[0] > elements[1]){
            FirstMax = elements[0];
        SecondMax = elements[1];

    }
        else{
            FirstMax=elements[1];
            SecondMax=elements[0];
        }
        for (int i = 2; i <elements.length ; i++) {
            if(elements[i]>FirstMax){
                SecondMax=FirstMax;
                FirstMax=elements[i];

            }
            else if(elements[i]<FirstMax && elements[i]>SecondMax){
                SecondMax=elements[i];

            }

        }
        System.out.println("second largest number:"+SecondMax);

}
    public static void Secondsmall(int[] elements) {
        int FirstMin;
        int SecondMin;
        if (elements[0] < elements[1]){
            FirstMin = elements[0];
            SecondMin = elements[1];

        }
        else{
            FirstMin=elements[1];
            SecondMin=elements[0];
        }
        for (int i = 2; i <elements.length ; i++) {
            if(elements[i]<FirstMin){
                SecondMin=FirstMin;
                FirstMin=elements[i];

            }
            else if(elements[i]>FirstMin && elements[i]<SecondMin){
                SecondMin=elements[i];

            }

        }
        System.out.println("second smallest number:"+SecondMin);

    }




}