
# Kotlin for android developers

A new modern programming language which works with JVM environments

Kotlin is strongly typed language- Meaning all variable have a type inferred or specified. 

Two variable type are var and val - var for changeable data and val for constants.

**Syntax:** 

- Is similar to java and swift
- function definition: fun <Name> : <return value>
- Control statement is similar to java (Except for when condition)

**Null Safety**

Compiler ensures no nullpointer exception. We can create a nullable variable with the **?** question mark symbol like **name?.length()** . If you want your code should return a not null result you can use double exclaimation symbol **!!** . for example **name!!.length()**

When we use **val** type we have to assign a value. 

**Lambdas**

- are function literals (anything inside curly braces).

- allows function to be passed as arguments

  - Example: {textview.settext("Clicked")}

     

**Kotlin Advantage**

- Concise: less code

  **Kotlin**: view.setOnclickListener({v->clickMethod(v)})

  **Java**: view.setOnclickListener(new View.OnClickListener(){

  ​		@Override

  ​		public void onClick(View v){

  ​		     clickMethod(v);

  ​		}

  ​	})

- Safe: Null safety ensures no NPE's 

**Why Kotlin?**

- Can be run anywhere java can
- Provides null pointer safety
- Provides lambdas for function references
- offers latest techniques in programming

**Let's get started working with kotlin and android**







