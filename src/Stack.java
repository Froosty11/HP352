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
        if(pointer <= list.length) {
           if(pointer == list.length-1){
                int[] newList = new int[list.length*2];
                int j = 0;
                for (int nmr :
                        list) {
                    newList[j] = nmr;
                    j++;
                }
                this.list = newList;
            }
            this.list[++pointer] = i;
            return true;
        }
        return false;


    }
}

