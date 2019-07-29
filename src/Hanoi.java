public class Hanoi {
    public void move(int disc, int from, int to, int tmp){
        if(disc <= 1){
            System.out.println(disc+"번 째 원판 : "+from+" -> "+to);
        }else{
            move(disc - 1, from, tmp, to);
            System.out.println(disc+"번 째 원판 : "+from+" -> "+to);
            move(disc - 1, tmp, to, from);
        }
    }
}
