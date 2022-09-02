public class main {
    public static void main(String[] args) {

        //String input = "36 6 /"; // division test
        //0 2 0 4 2 2 0 2 9
        long[] listOfNumbers = new long[101];
        long minimum = 1000000000;
        for(int i = 0; i < 100; i++) {
            String input = "10 0 2 ? 2 1 ? 0 2 ? 4 1 ? 2 2 ? 2 1 ? 0 2 ? 2 1 ? 9 2 ? + + + + + + + + 10 % -";

            String words[] = input.split("\\s+");
            Item[] list = new Item[words.length];
            int amount = 0;
            for (String word : words) {
                switch (word) {
                    case "*":
                        list[amount++] = new Item(Item.ItemType.MUL, 0);
                        break;
                    case "+":
                        list[amount++] = new Item(Item.ItemType.ADD, 0);
                        break;
                    case "%":
                        list[amount++] = new Item(Item.ItemType.MOD, 0);
                        break;
                    case "-":
                        list[amount++] = new Item(Item.ItemType.SUB, 0);
                        break;
                    case "/":
                        list[amount++] = new Item(Item.ItemType.DIV, 0);
                        break;
                    case "?":
                        list[amount++] = new Item(Item.ItemType.WML, 0);
                        break;

                    default:
                        int number = Integer.parseInt(word);
                        list[amount++] = new Item(Item.ItemType.VALUE, number);


                }
            }
            Calculator calc = new Calculator(list);
            long t0 = System.nanoTime();
            calc.stack.push(10);


            System.out.println(calc.run());
            long t_total = System.nanoTime() - t0;
            listOfNumbers[i] = t_total;
            if(t_total < minimum){
                minimum = t_total;
            }

        }
        long sum = 0;
        for (long l :
                listOfNumbers) {
            sum += l;
        }
            System.out.println(" Average time spent :" + sum / 100);
            System.out.println(" Minimum time spent : " + minimum);


        }
    }

