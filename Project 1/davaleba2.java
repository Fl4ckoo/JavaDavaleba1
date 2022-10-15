public class davaleba2 {

 // **************** // დავალება 2 არის აქ // ******* //


    public static void main(String[] args){


        String [] masivi = {"portoxali", "atami", "msxali"};


        for (int i = 0; i < masivi.length; i++) {
            System.out.println(masivi[i] + " - ასოების რაოდენობა:" + masivi[i].length());

        }


        if(masivi[0].length() < masivi[1].length() && masivi[0].length() < masivi[2].length()){
            System.out.println("masivi[0] ყველაზე პატარაა!!");
        }else if(masivi[1].length() < masivi[2].length() && masivi[1].length() < masivi[0].length()){
            System.out.println("masivi[1] ყველაზე პატარაა!!");
        } else if (masivi[0].length() == masivi[1].length() || masivi[0].length() == masivi[2].length() || masivi[1].length() == masivi[2].length()) {
            System.out.println("2 ელემენტია ყველაზე პატარაა!!");
        } else{
            System.out.println("masivi[2] ყველაზე პატარაა!!");
        }





    }
}
