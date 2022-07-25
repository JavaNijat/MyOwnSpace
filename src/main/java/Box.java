import java.util.Arrays;

public class Box {

    int a, b, c;

    public Box(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean compare(Box box){
        this.rotate();
        box.rotate();
        return this.a < box.a && this.b < box.b && this.c < box.c;
    }


    public void rotate(){
        int[] params = new int[]{this.a, this.b, this.c};
        Arrays.sort(params);
        this.a = params[0];
        this.b = params[1];
        this.c = params[2];
    }

}

