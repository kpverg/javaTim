import java.time.Year;

public class MethodsJava {

  public static void main(String[] args) {
    boolean gameOver =true;
    int score = 10000;
    int levelCompleted= 8;
    int bonus=200;

  calcScore(  gameOver, score,levelCompleted, bonus);
  calcScore(true,10000, levelCompleted,100);

  int yearOfBirth=1986;
  int age= calcAge(yearOfBirth);
  System.out.println(age);
    
  }

  public static void calcScore( boolean gameOver,int score,int levelCompleted,int bonus){
      int finalScore= score;

      if (gameOver){
          finalScore+=(levelCompleted*bonus);
          System.out.println(finalScore);
    }
  }

  public static int calcAge(int yearOfBirth)
{
      int currentYear = Year.now().getValue();
      return currentYear - yearOfBirth; 
}  
}
