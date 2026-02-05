package TrainigChetu.LogicalProgram_02;

public class _03IncDecOpretor {
    static void main() {
        int x=5;
        // x++  +  ++x  + x--
        System.out.println("X++ ==> "+(x++));  // 5  Then increments x-> 6
        System.out.println("++X ==>" +(++x));   // First increment → x = 7 , Then print value 7
        System.out.println("X-- ==>"+(x--));   // Uses value → 7  Then decrement → x = 6

       // So Now x value is -> 6 =>    x=6

        System.out.println("( x++  +  ++x  + x-- ) Values are :"+(x++  +  ++x  + x--)); // 6 + 8 + 8=> 22
    }
}
