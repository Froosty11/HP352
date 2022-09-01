public class Item {
    public enum ItemType {
        ADD, // addition key
        SUB, // subtraction key
        MUL, // multiplication key
        DIV, // division key
        VALUE //a value
    }
    public Item (ItemType type, int value){
        this.type = type;
        this.value = value;

    }
    private ItemType type;
    private int value = 0;
    public ItemType getType(){
        return type;
    }
    public int getValue(){
        return value;
    }
}
