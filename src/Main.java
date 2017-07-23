public class Main {

    public static void main(String[] args) {
        int[] test = {3,2,4};
        int target = 6;
        int[] answer = TwoSum.twoSum(test,target);
        System.out.print("[");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if(i+1 != answer.length)
                System.out.print(",");
        }

        System.out.print("]");
    }
}
