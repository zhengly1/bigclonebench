public class BigbenchClone{    
    public void or(int op1, int op2, int result) {
        ses[result % ssize].write((short) (ses[op1 % ssize].read() | ses[op2 % ssize].read()));
    }
}