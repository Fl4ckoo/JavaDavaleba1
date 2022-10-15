public class davaleba1 {


    private int a;
    private int b;
    private int c;

    davaleba1(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }


    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }

    public int getC(){
        return this.c;
    }


    public void disc(){
        int disc = this.b^2 - 4*this.a*this.c;

        System.out.println(a + "*x^2+" + b + "*2+" + c + "= 0");
        System.out.println("დისკრიმინატი ტოლია: "  + disc);

        if(disc > 0){
            System.out.println("დისკრიმინანტი დადებითია , რაც იმას ნიშნავს , რომ ფუნქციას 2 ამონახსნი აქვს!");
        }else if(disc == 0){
            System.out.println("დისკრიმინანტი 0 ის ტოლია, რაც იმას ნიშნავს , რომ ფუნქციას 1 ამონახსნი აქვს!");
        }else{
            System.out.println("დისკრიმინანტი უარყოფითია, რაც იმას ნიშნავს, რომ ფუნქციას ამონახსნი არ აქვს!");
        }
    }



}




