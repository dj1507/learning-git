class Arithmetic{
    
    public void multiple(int a, int b){
        System.out.println("Multiplication of two numbers "+ (a*b));
    }
}

class First_program extends Arithmetic{

    static void add(int a, int b){
        System.out.println("Add two numbers "+ (a+b));
    }
    
    public static void main(String[] args) {
        System.out.println("Testing");
        add(10,20);  
        First_program obj = new First_program();
        obj.multiple(10,20);
    }   

}