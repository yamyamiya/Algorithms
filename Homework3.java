import java.util.Stack;

public class Homework3 {
    public static void main(String[] args) throws Exception {
    hanoi(3, 'A', 'C', 'B');
        System.out.println();


    int n = 3;
    char source = 'A';
    char target = 'C';
    char auxiliary = 'B';

    // итеративный
    Stack<HanoiMove> moves = new Stack<>();
        moves.push(new HanoiMove(n, source, target, auxiliary));
        while (!moves.empty()){
        HanoiMove move = moves.pop();

        if(move.n==1){
            System.out.println(move.source+""+move.target);
        } else{
            moves.push(new HanoiMove(move.n-1, move.auxiliary,move.target, move.source));
            moves.push(new HanoiMove(1, move.source,move.target, move.auxiliary));
            moves.push(new HanoiMove(move.n-1, move.source,move.auxiliary, move.target));


        }
    }
}


    static class HanoiMove {
         int n;
         char source;
         char target;
         char auxiliary;

         public HanoiMove(int n, char source, char target, char auxiliary) {
             this.n = n;
             this.source = source;
             this.target = target;
             this.auxiliary = auxiliary;
         }
     }

     //рекурсивный
    public static void hanoi(int n, char A, char C, char B) throws Exception {
        if (n <= 0) throw new Exception("the number should be positive");
        if (n == 1) System.out.println(A + " " + C);
        else {
            hanoi(n - 1, A, B, C);
            System.out.println(A + "" + C);
            hanoi(n - 1, B, C, A);
        }
    }

}

