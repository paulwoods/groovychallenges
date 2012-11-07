
Groovy Challenges
=================

Paul Woods
source code: https://github.com/paulwoods/groovychallenges

A presentation for the DFW2GUG user group on 11/7/2012 http://www.dfw2gug.org/

Summary
-------
This is a series of small programming challenges, designed to help new Groovy programmers improve thier use of the language.

Challenges 
----------

### helloworld
A small test to see that your system is configured for groovy.


### arguments - handle command line arguments
write a script that will display "Hello" plut the first command line argument.
and display a error message if no argument, or too many arguments.


### openfile - open a file and display its contents
open a file and display its contents.
the filename specified by the command line argument.

* try reading the entire file at once and displaying it.
* try reading the file line-by-line and displaying the content.
* handle the file not found


### multiply - open a file, process it, and output the results too screen
given a file of csv integers, for each row, multiply the integers and print the results.

* handle blank lines
* handle a varying number of integers per line
* handle invalid data (a field that is not a number)


### dsl1 - run a script file from within a script

create a dsl file that has "println hello world"
create a file that loads and executes the script
* use groovy.lang.GroovyShell

### dsl2 - run a script file from within a script, with binding

create a dsl file that has "println hello ${name}"
create a file that
* first argument is the dsl script file
* second argument is the name
* use groovy.lang.GroovyShell


### dsl3 - run a script file from within a script, with 2-way binding

*
* create a dsl that performs the Pythagorean theorem function, returning the value x
* c^2 = a^2 + b^2
* create a data file that has 2 csv integers, for the two sized of the triangle.
* write a driver that reads the data file, and runs the dsl, and print the results
* 
