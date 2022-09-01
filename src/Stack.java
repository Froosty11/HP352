public class Stack {
    int[] list;
    int pointer;
    public Stack(int length){
        this.list = new int[length];
        this.pointer = 0;

    }
    public int pop(){
        if(!(pointer-1 < 0))
        return this.list[pointer--];

        return 0;
    }
    public boolean push(int i){
        if(pointer < list.length) {
            this.list[++pointer] = i;
            return true;
        }
        return false;


    }
}

