#include<iostream>
//#include<conio.h>
#include<string.h>

using namespace std;


class Friend{
	string number;
	public:
	friend void acceptNumber(Friend &f);
	
	void printLine();
	
	void getSum();
	
	void getTotalDigits();
	
};

void acceptNumber(Friend &f){
	cout<<"\n Enter a number ";
	getline(cin,f.number);
}

void Friend::printLine(){
	for(int i=0;number[i]!='\0';i++){
		cout<<number[i]<<endl;
	}
}

void Friend::getSum(){
	int sum=0;
	for(int i=0;number[i]!='\0';i++){
		sum+=(number[i]-48);
	}
	cout<<"\nSum of digits is "<<sum<<endl; 
}

void Friend::getTotalDigits(){
	int count=0;
	for(int i=0;number[i]!='\0';i++){
		count++;
	}
	cout<<"\nThe total number of digits is "<<count<<endl;
}
		
int main(){
	Friend f;
	acceptNumber(f);
	f.printLine();
	f.getSum();
	f.getTotalDigits();
}
