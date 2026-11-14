class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        // 1. 분자와 분모 계산
        int numerator = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;

        // 2. 최대공약수 구하기
        int a = numerator;
        int b = denominator;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // 3. 약분하기
        int gcd = a;

        numerator = numerator / gcd;
        denominator = denominator / gcd;

        // 4. 배열에 결과 저장
        int[] answer = {numerator, denominator};

        return answer;
    }
}