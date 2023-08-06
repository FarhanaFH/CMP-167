# method: a block of code to specifically execute one task, it helps to promote reusing of code, Once created it can be called anywhere in the code

##Syntax of method definition:
	accessModifier staticOrNot dataTypeofReturnValue nameofMethod { parameterList } ExceptionList
	{
		Body
	}
	
-	**accessModifier**: public, private, protected, default or package
-	**staticOrNot**: The static elements will belong to the class and not to the instance. Static elements such as methods and variables will be able to access without creating objects.
-	**dataTypeofReturnValue**: If it doesn't anything it will be set as void
-	**nameofMethod**: it should starts with letters, _, $
-	**parameterList**: Declaration of variables that will be used to execute the tasks, these or parameters are assigned a value at the moment the method called
-	**ExceptionList** Set Exception classes that will be triggered will be triggered when an unexpected error occurs. (optional) 
-	**body**: Surrounded by curly braces, contains set of statements to executes a task. (required)



## Example:

	public static int sum(int a,int b; //Declaration of a method, abstract method, because no body has been defined
	
	public static int product(int x, int y)// method Definition, Concrete method, because a body has been defined
	{
		return x*y;
	}
	
	public static int sumAll (int n, int m)
	{
		int sum = 0;
		for{int i =n; i<=m; i++}
	}	
		sum += n;
		}
		return sum;
	}
	
	public static void main (string {} args ) // main method 
	{
	
	
	}
	private static void greet(){
		System.out.printLn("Hello");
		}
		
# method Signature: nameOfMethod(dataTypes of parameters)

# Method Call
##Syntax:
	nameofMethod(ArgumentList);
	
_ **ArgumentList**: values that will be assigned to the parameterList

## Semantics:
-	Hold a space in memory and give it as name the method call
-	Search for a method definition that matches the method signature of the method call
-	If a match is found, assign the argument 
if there is a return statement, evaluate the expression and replace the method call with the resultant value, end the method call, free the space in memory
-		if not return statement, end method call
-	if a match is not found, an error will occur, resulting in either not compiling 

## example:
	greet();
	int total = sumAll(10, 20);
	int p	   = product (3,5):
	int total2= sumAll ("4", 5);//Error, no match found
	
#Return Statement

##Syntax:
	return expression;
## Semantics:
-	Evaluate the expression
-	Replace the method call with the resultant value 
-	find the method call

