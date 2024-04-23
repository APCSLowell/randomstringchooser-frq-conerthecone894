import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  ArrayList<String> words = new ArrayList<String>();
  
  public RandomStringChooser(String[] s){
    String[] placeholder = s;
    
    for(int i = 0; i < placeholder.length; i++){
      words.add(placeholder[i]);
    }
  }

  public String getNext(){
    if(words.size() == 0){
      return "NONE";
    }
    
    int index = (int)(Math.random()*words.size());
    String temp = words.get(index);
    words.remove(index);

    return temp;
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
