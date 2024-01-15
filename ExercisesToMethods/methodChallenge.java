package ExercisesToMethods;
public class methodChallenge {
    public static void main(String[] args) {
        String onoma ="K.p.verg";
        int score= 000;

        displayHighScorePosition(onoma, calculateHighScorePosition(score));
    }

    public static void displayHighScorePosition( String PlayerName, int Position){
        System.out.println( PlayerName + " managed to get on position "+ Position + "on the high Score list");
    }
    public static int calculateHighScorePosition(int score){
        int position =4;
        if (score>= 1000) {
            position =1;
        }else if( score>= 500){
            position =2;
        
        }else if (score>=100){
            position =3;
        }
        return  position ;
        
 
    }   
}
