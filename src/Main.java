public class Main {
    public static void main(String[] args) {
        // int i = 0;
        //int n = 5;

        /*First level: С использованием цикла while yаписать метод, печатающий куб числа от 0 до данного чисда n.
Пример: на входе n=3  на выходе 0,1,8,27*/
        //while (i <= n) {
        //  System.out.println("Number is:" + i + " and cube of " + i + "is:" + (i * i * i));
        //i++;
        countCube(2, 0, "hallo");
        System.out.println("_____________");
        countCube(7, 1, "Ok");
        System.out.println( countSum(1,5));
        int a= countSum(1, 5);
        System.out.println( "  "+a);
    }

    public static void countCube(int n, int i, String abc) {
        // int i = 0;
        // int n = 5;

        /*First level: С использованием цикла while yаписать метод, печатающий куб числа от 0 до данного чисда n.
Пример: на входе n=3  на выходе 0,1,8,27*/
        while (i <= n) {
            System.out.println("Number is:" + i + " and cube of " + i + " is: " + (i * i * i));
            i++;
        }
        System.out.println(abc);
    }

    public static int countSum(int begin, int end) {
        int sum = 0;
        while (begin <= end) {
            sum += 1;
            begin += 1;
            //sum+=begin++; тоже самое
        }
        return sum;

    }

    //возвращает в систему результ. int

}




