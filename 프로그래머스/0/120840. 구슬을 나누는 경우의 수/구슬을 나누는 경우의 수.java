import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) { 
        BigInteger mol = BigInteger.ONE;
        BigInteger denom = BigInteger.ONE;
        
        for (int i = 0; i < share; i++) {
            mol = mol.multiply(BigInteger.valueOf(balls - i));
        }
        for (int j = 1; j <= share; j++) {
            denom = denom.multiply(BigInteger.valueOf(j));
        }
        return mol.divide(denom).intValue();
    }
}