#include<iostream>
#include<cstring> 
using namespace std; 
string wordReverse(string str) 
{ 
	int i = str.length() - 1; 
	int start, end = i + 1; 
	string result = ""; 
	while(i >= 0) 
	{ 
		if(str[i] == ' ') 
		{ 
			start = i + 1; 
			while(start != end) 
				result += str[start++]; 
			result += ' '; 
			end = i; 
		} 
		i--; 
	} 
	start = 0; 
	while(start != end) 
		result += str[start++]; 
	return result; 
} 
int main() 
{ 
	string str="hello india";
	cout << wordReverse(str); 
	return 0; 
} 



