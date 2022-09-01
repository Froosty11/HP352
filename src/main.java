public class main {
    public static void main(String[] args) {
        Item[] list = {new Item(Item.ItemType.VALUE, 3), new Item(Item.ItemType.VALUE,4), new Item(Item.ItemType.ADD, 0),new Item(Item.ItemType.VALUE,2),new Item(Item.ItemType.VALUE,4),new Item(Item.ItemType.ADD,0),new Item(Item.ItemType.MUL,0)};


        Calculator calc = new Calculator(list);
        System.out.println(calc.run());

    }
}
