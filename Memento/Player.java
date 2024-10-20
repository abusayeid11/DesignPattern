package Memento;

public class Player {
    private int score;

    void setScore(int score){
        this.score = score;
        System.out.println("player score set to "+ score);
    }

    public int getScore() {
        System.out.println("Player score is " + score);
        return score;        
    }

    public Memento save(){
        return new Memento(score);
    }

    public void restore(Memento memento){
         this.score = memento.getScore();
         System.out.println("Score restored to " + score);
    }

    public static class Memento {
    
          private final int score;

          public Memento(int score){
            this.score = score;
          }

          public int getScore() {
              return score;
          }
    }
}
