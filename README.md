# SubstringFinder

Simple commandline tool that returns given text with '*' after each matching to pattern string 

### NOTE
In oder to run this tool you need java jdk to be installed
see https://java.com/ru/download/


### Installing

Download or clone files from repository 
```
>> git clone https://github.com/kucherenk0/StringFinder.git
```
Build source file SubtringFind.java with javac
```
javac SubtringFind.java
```

## Running 

Run SubstringFinder with 
```
java SubstringFinder **Pattern you need to find**
```
Then input the text where you want to find this pattern 

### Running using echo

Aslo you can run it using echo tool

```
>> echo "123 текст 12!" | java SubstringFinder "12"
```
Then you'll recive the result
```
12*3 текст 12*!
```

## Authors

Alexander Kucherenko kucherenko.av@physhtech.edu
