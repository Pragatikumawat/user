package a1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

 class Abcd {

	public static void main(String[] args) {
		for(String str : decode("1123"))
		{
			System.out.println(str);
		}
	}

	public static Set <String> decode(String in)
	{
		char curChar = 'a';
		Map <Integer, Character> numberToChar = new HashMap<>();
		for(int i = 1; i <= 26; i++)
		{
			numberToChar.put(i, curChar);
			curChar++;
		}
		return decodeHelper(numberToChar, in, 0, new ArrayList<Character>());
	}

	private static Set<String> decodeHelper(Map <Integer, Character> numberToChar, 
			String in, int charAt,
			ArrayList<Character> arrayList) {
		Set <String> result = new HashSet<>();
		if(charAt >= in.length())
		{
			String str = "";
			for(char c : arrayList)
			{
				str += c;
			}
			result.add(str);
			return result;
		}
		else
		{
			int charCode = Integer.valueOf(in.charAt(charAt) + "");
			char curChar = numberToChar.get(charCode);
			arrayList.add(curChar);
			result.addAll(decodeHelper(numberToChar, in, charAt+1, arrayList));
			arrayList.remove(arrayList.size()-1);
			if(in.length() > charAt+1)
			{
				charCode = Integer.valueOf(in.substring(charAt, charAt+2));
				if(charCode <= 26)
				{
					curChar = numberToChar.get(charCode);
					arrayList.add(curChar);
					result.addAll(decodeHelper(numberToChar, in, charAt+2, arrayList));								
					arrayList.remove(arrayList.size()-1);
				}
			}
		}
		return result;
	}
	
}