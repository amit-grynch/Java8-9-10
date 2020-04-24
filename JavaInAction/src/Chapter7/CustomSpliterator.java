package Chapter7;

public class CustomSpliterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String sentence="Amit  Kumar ";
      int countWords=countWordsIteratively(sentence);
      System.out.println(countWords);
	}
	public static int countWordsIteratively(String sentance) {
		  int counter=0;
		  char[] charArray=sentance.toCharArray();
		  for(char c:charArray) {
			  if(Character.isWhitespace(c)) {
				  continue;
			  }else {
				  counter++;
			  }
		  }
		  return counter;
	}
}

