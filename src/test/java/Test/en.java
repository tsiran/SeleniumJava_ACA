package Test;


class EnumExample1 {
    public enum Season {WINTER(0), SPRING(1), SUMMER(2), FALL(10);
            private int value;
            private Season(int value){
                    this.value=value;
            }
            }


    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
                System.out.println(s.value);
        }
        System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is: " + Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());
    }
}