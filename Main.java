public class Main {
public static void main(String[] args) {
    int[] numbers = {4, 9, 2, 9};
    System.out.println(countAbove(numbers, 5));
    System.out.println(contains(numbers, 9));
    System.out.println(contains(numbers, 7));
    System.out.println(indexOf(numbers, 9));
    System.out.println(lastIndexOf(numbers, 9));
    System.out.println(lastIndexOf(numbers, 7));
    System.out.println(largest(new int[]{4, 9, 2, 7}));
    System.out.println(largest(new int[]{-6, -2, -9}));
    System.out.println(largest(new int[]{7}));
    System.out.println(smallest(new int[]{4, 9, 2, 7}));
    System.out.println(smallest(new int[]{-6, -2, -9}));
    System.out.println(smallest(new int[]{7}));
}

    public static int countAbove(int[] numbers, int limit){
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > limit){
                count ++;    
            }
        }
        return count;
    }

    public static boolean contains(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                return true;
            }
        }
        return false;
    }
    public static int indexOf(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                return i;
            }
        }
    return -1;
    }

    public static int lastIndexOf(int[] numbers, int target){
        int lastIndex = -1;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                lastIndex = i;
            }
        }
    return lastIndex;
    }

    public static int largest(int[] numbers){
    int largest = numbers[0];
    for (int i = 1; i < numbers.length; i++){
        if (numbers[i] > largest){
            largest = numbers[i];
        }
    }
    return largest;
    }
    
    public static int smallest(int[] numbers){
    int smallest = numbers[0];
    for (int i = 1; i < numbers.length; i++){
        if (numbers[i] < smallest){
            smallest = numbers[i];
       }
    }
        return smallest;
    } 
}
