package com.algorithm.beginner;

public class beginnerProblem9 {

    public static void main(String[] args) {
        System.out.println(solution(90));
    }

    //각에서 0도 초과 90도 미만은 예각,
    // 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
    // 각 angle이 매개변수로 주어질 때
    // 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
    public static int solution(int angle){

        int answer =0;

        if(angle>0&&angle<90){
            return 1;
        }else if(angle>90 && angle<180){
            return 3;
        }else if(angle == 180){
            return 4;
        }else{
            return 2;
        }


    }

}
