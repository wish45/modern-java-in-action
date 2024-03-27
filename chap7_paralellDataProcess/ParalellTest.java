package chap7_paralellDataProcess;

import java.util.stream.Stream;

public class ParalellTest {
    public static void main(String[] args) {
        ParalellTest asd = new ParalellTest();
        System.out.println(asd.sequentialSum(100));
    }

    //무한 스트림 생성 후 제한을 둬서 계산
    public long sequentialSum(long n){
        return Stream.iterate(1L, i->i+1)       //무한 자연수 스트림 생성
                .limit(n)                            //n개 이하로 제한
                .reduce(0L,Long::sum);        //모든 숫자를 더하는 스트림 리듀싱 연산
    }

    //전통적인 방식
    public long iterativeSum(long n){
        long result = 0;
        for(long i = 1L; i<=n; i++){
            result += i;
        }
        return result;
    }
}
