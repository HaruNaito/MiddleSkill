import java.util.Arrays;
import java.util.Collections;

public class test1 {
        public static void main(String[] args) {
                //改行
        	
                System.out.println("問１");
                //問１のメソッドを呼び出して出力してください（引数５と１０）
                add(5,10 );
                }
               public static void add(int num1, int num2) {
                System.out.println(num1 + num2);
               

                //改行
               System.out.println("問２");
       		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）          	        
            	        String sentence = "しんぶんし";
            	        if(isPalindrome(sentence)) {
            	            System.out.println("true");
            	        } else {
            	            System.out.println("false");
            	       }
            	   }
            	 
            	    public static boolean isPalindrome(String sentence) {
            	        int minIdx = 0;
            	        int maxIdx = sentence.length() - 1;
            	 
            	        while(minIdx < maxIdx) {
            	           if(sentence.charAt(minIdx++) != sentence.charAt(maxIdx--)) {
            	               return false;
            	          }
            	        }
            	        return true;
            	    
       		//改行
            	       
            	      System.out.println("問３");
            			//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
            			Integer [] i = {5,3,1,9,4,8};
            	                 
            	               Arrays.sort(i, Collections.reverseOrder());
            	              
            	              System.out.println(Arrays.asList(i));
            	       
            	  }
             //参考　https://www.sejuku.net/blog/14155

            	       // System.out.println("問４");
            			//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
            			//int [] k = {5,3,1,9,4,8};
            		}

            	    

              //zzhttps://www.techiedelight.com/ja/find-minimum-maximum-element-array-java/
              
        //問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
        
        //問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
        
        //問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
        
        //問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
        
