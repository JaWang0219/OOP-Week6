import java.util.*;

class Animal{
    String name;
    double height;
    int weight;
    int speed;

    void show(){
        System.out.println("姓名:"+name);
        System.out.println("身高:"+height);
        System.out.println("體重:"+weight);
        System.out.println("速度:"+speed);
    }

    double distance(int x){
        double d = x*speed;
        return d;
    }
    double distance(int x, double y){
        double d = x*y*speed;
        return d;
    }
}

public class A1113317_0324_1 {
    public static void main(String[] argv){

        Scanner sc = new Scanner(System.in);
        Animal[] forzen = new Animal[4];

        for(int i = 0 ; i < 4 ; i++ ){
            forzen[i] = new Animal();
        }

        forzen[0].name = "雪寶";
        forzen[0].height = 1.1 ;
        forzen[0].weight = 52;
        forzen[0].speed = 100 ;

        forzen[1].name = "驢子";
        forzen[1].height = 1.5 ;
        forzen[1].weight = 99 ;
        forzen[1].speed = 200 ;

        forzen[2].name = "安那";
        forzen[2].height = 1.7 ;
        forzen[2].weight = 48 ;
        forzen[2].speed = 120 ;

        forzen[3].name = "愛沙";
        forzen[3].height = 1.7 ;
        forzen[3].weight = 50 ;
        forzen[3].speed = 120;

        for(int i = 0 ; i < 4 ; i++ ){
            forzen[i].show();
        }

        for(int i = 0 ; i < 4 ; i++ ){
            System.out.println("請輸入x時間(分鐘):");
            int x = sc.nextInt();
            System.out.println("請輸入y加速度(若無請輸入0):");
            double y = sc.nextDouble();
            if( y == 0){
                System.out.println(forzen[i].name+"奔跑距離"+forzen[i].distance(x));
            }else{System.out.println(forzen[i].name+"奔跑距離"+forzen[i].distance(x,y));}
        }
    }
}
