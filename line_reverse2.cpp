
//CODE TO REVERSE THE SENTENCE LIKE "HELLO INDIA"->"INDIA HELLO".

#include<iostream>
#include<cstring> 
using namespace std; 
string wordReverse(string sentence) 
{ 
	int i = sentence.length() - 1; 
	int start, end = i + 1; 
	string result = ""; 
	while(i >= 0) 
	{ 
		if(sentence[i] == ' ') 
		{ 
			start = i + 1; 
			while(start != end) 
				result += sentence[start++]; 
			result += ' '; 
			end = i; 
		} 
		i--; 
	} 
	start = 0; 
	while(start != end) 
		result += sentence[start++]; 
	return result; 
} 
int main() 
{ 
	string sentence="hello india";
	cout << wordReverse(sentence); 
	return 0; 
} 



