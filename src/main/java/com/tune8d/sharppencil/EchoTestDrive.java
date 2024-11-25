package com.tune8d.sharppencil;

class Echo{
    int count = 0;

    void hello(){
        System.out.println("helloooo...");
    }
}

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 7){
            e1.hello();
            e1.count++;
            // if 문을 동시에 만족시키면, 그만큼 실행또한 된다
            if(x < 3){
                e2.count = e2.count + 1;
            }
            if(x < 6){
                e2.count = e2.count + e1.count;
            }
            x++;
        }
        System.out.println(e2.count);
    }
}
