class Example {
    int x;

    static def DisplayName(){
            println("Hello Groovy World");
            println("Testing this def in groovy");
    }

    static int sum(int a, int b = 5){
        int c = a+b;
        //println(c);
        return c;
    }

    public int getX(){
        return x;
    }

    public void setX(int pX){
        x = pX;
    }

    static void main(String [] args){
        int a;
        Example ex = new Example();
        DisplayName()
        a = sum(9,1);
        ex.setX(5);
        println(ex.getX());
        println(sum(3));


    }
}
