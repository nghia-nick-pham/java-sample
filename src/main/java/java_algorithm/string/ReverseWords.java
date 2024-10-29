package java_algorithm.string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseWords {

    private static char space = ' ';
    public static void main(String[] args) {
        String text = "hello java, hello  world";
        ReverseWords reverseWords = new ReverseWords();
        reverseWords.printReverseWords(text);
    }

    public void printReverseWords(String text){
        // TODO: 6/21/2024 : need to change queue(FIFO) into stack(LIFO) 
//        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        printReverseWordsHelper(0, text, new StringBuilder(), stack);
    }

    public void printReverseWordsHelper(int index, String text, StringBuilder currentWord, Stack<String> stack){

        //basecase
        if((index >= text.length())){
            return;
        }

        char currentChar = text.charAt(index);

        if(index == text.length() - 1){
            currentWord.append(currentChar);
            stack.push(currentWord.toString());
            currentWord.delete(0, currentWord.length());
        }else if(space == currentChar){
            stack.push(currentWord.toString());
            currentWord.delete(0, currentWord.length());
        }else {
            currentWord.append(currentChar);
        }
        printReverseWordsHelper(++index, text, currentWord, stack);
        if(space == currentChar || index == text.length() - 1){
            System.out.println(stack.pop());
        }

    }



}
