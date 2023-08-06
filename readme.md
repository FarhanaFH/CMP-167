# Decision Branching 
## if statement 
	if ( condition1 )(
	    statement1 
    } 
## condition :  Any expression that can only evaluate to true or false
## Example
	true
	false
	
## comparison operators 
	inequality
	>		  greater than 
	<		  less than
	>=		  greater than or equals to 
	<= 		  less than or equals to
	equality 
	==		  equals to 
	!=		  not equals to
## Example: m = 5, n = 6
	m > n	 false
	m < n 	 true
	m == n   false
	
## logicals Operators
	&&		and
	||		or 
	!		not
	
## Example:
	{(m > n) || (m < n)}		true
	{(m > n) && (m < n)}		false
	!(m > n)					true
	
	
## Bitwise Operators
	&		and 
	|		or 
	^		exclusive or 
	
	decimal 	binary
	0				  0
	1 				  1
	2 				 10
	3 				 11
	4				 100
	5 				 101
	6 				 110
	7 				 111
	8				 1000 
	
	
	10 & 11 =10
	10 | 11 =11
	10 ^ 11 =01
	
	
## else if (condition): precedes the if, and it cannot stand by itself 
## else:  precedes if statement and it cannot stand by itself 

	if (condition1){
	    statement1
	}  
	else{
		statements2
	}
	else{
		statements3		 
	} 