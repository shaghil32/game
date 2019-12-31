package com.psych.game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.psych.game.model.Question;

public class Utils {

	public static List<Pair<String,String>> readQAFile(String fileName) throws FileNotFoundException{
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		String question, answer;
		List<Pair<String,String>> question_answer = new ArrayList<>();
		try {
		
			do {
			question=br.readLine();
			answer=br.readLine();
			if(question==null || answer==null || question.length()>Constants.MAX_QUESTION_LENGTH || answer.length()>Constants.MAX_ANSWER_LENGTH) {
				System.out.println(question);
				System.out.println(answer);
				continue;
			}
			question_answer.add(new Pair<>(question,answer));
			
			}while(question!=null & answer!=null);
		}catch(IOException ignore) {			
		}
		return question_answer; 
	}
}
