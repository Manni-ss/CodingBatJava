public class Runner {

    public static void main(String[] args) {


        System.out.println(countTriple("222abyyycdXXX"));


    }


    //Warmup 1
    public boolean icyHot(int temp1, int temp2) {
        if (temp1 > 100 && temp2 < 0) {
            return true;
        }
        if (temp1 < 0 && temp2 > 100) {
            return true;
        }
        return false;

    }

    //Warmup 2
    public static String stringYak(String str) {
        String y = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.substring(i, i + 1).equals("y") && str.substring(i + 2, i + 3).equals("k")) {
                i = i + 2;
            } else {
                y += str.substring(i, i + 1);
            }
        }
        return y;
    }

    //Logic 1
    public String fizzString(String str) {
        String word = "";
        if (str.startsWith("f")) {
            word += "Fizz";
        }
        if (str.endsWith("b")) {
            word += "Buzz";
        }
        if (str.startsWith("f") == false && str.endsWith("b") == false) {
            return str;
        }
        return word;

    }

    //String 1
    public boolean hasBad(String str) {
        if ((str.indexOf("b") == 0 || str.indexOf("b") == 1) && (str.indexOf("a") == 1 || str.indexOf("a") == 2) && (str.indexOf("d") == 2) || str.indexOf("d") == 3) {
            return true;
        } else {
            return false;
        }
    }

    //Array 1
    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    //String 2
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String word = str.substring(i, i + 2);
            if (word.equals("hi")) {
                count++;
            }

        }
        return count;
    }

    //String 3
    public static int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.substring(i, i + 1).equals(str.substring(i + 1, i + 2)) && str.substring(i, i + 1).equals(str.substring(i + 2, i + 3))) {
                count++;
            }
        }
        return count;

    }

    //Logic 2
    public int luckySum(int a, int b, int c) {
        int sum = a + b + c;
        if (b == 13) {
            sum = sum - b - c;
        }
        if (c == 13 && b != 13) {
            sum = sum - c;
        }
        if (a == 13) {
            sum = 0;
        }
        return sum;
    }

    //Array 2
    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] - 1 && nums[i] == nums[i + 2] - 2){
                return true;
            }
        }
        return false;
    }

    //Array 3
    public int countClumps(int[] nums) {
        boolean clump = false;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !clump) {
                clump = true;
                count++;
            } else if (nums[i] != nums[i + 1]) {
                clump = false;
            }
        }
        return count;
    }

}


