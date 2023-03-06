# lambda
Lambda is a feature in Java 8 and later versions that enables the use of functional programming


 ## Table of Contents
1. [Lambda](#lambda)
2. [Advantages](#advantages)
3. [Example](#example)

### Lambda
***
Lambda is a feature in Java 8 and later versions that enables the use of functional programming. It allows developers to write code in a more concise and elegant way, and to create functional interfaces and abstract classes more easily. Lambda expressions are anonymous functions, which means they can be passed as arguments or returned from other functions without any name or type declaration. Lambda expressions can be used to replace anonymous classes and make code more concise and readable.
 
### Advantages
***
A list of  benefits of using lambda in the code:
* Allows developers to write code in a more concise and elegant way 
* Enables the use of functional interfaces and abstract classes 
* Lambda expressions are anonymous functions that can be passed as arguments or returned from other functions 
* Replaces anonymous classes and makes code more concise and readable
### example
***
An example of lambda : 
```
private static void expressionBody() {
        TestInterface testInterface1 = str -> {
            String s = str.substring(0, str.length() - 1);
            if (s.length() == str.length()) {
                return true;
            } else
                return false;
        };
        System.out.println(testInterface1.test("Shahian"));
    }
```
>In the above code, the expressionBody() method instantiates a TestInterface and assigns it to the testInterface1 variable.</br>
TestInterface is a functional interface that contains a single abstract method test() which takes a String as input and returns a boolean value.

The lambda expression in the statement provides an implementation of the test() method. It takes the input string and checks if the length of the string after removing the last character is equal to the original string length. If so, it returns true; otherwise, it returns false.

Finally, it prints the value returned by the test() method by passing "Shahian" as the input string.

  <!-- 
  ## Table of Contents
1. [General Info](#general-info)
2. [Technologies](#technologies)
3. [Installation](#installation)
4. [Collaboration](#collaboration)
5. [FAQs](#faqs)
### General Info
***
Write down general information about your project. It is a good idea to always put a project status in the readme file. This is where you can add it. 
### Screenshot
![Image text](https://www.united-internet.de/fileadmin/user_upload/Brands/Downloads/Logo_IONOS_by.jpg)
## Technologies
***
A list of technologies used within the project:
* [Technology name](https://example.com): Version 12.3 
* [Technology name](https://example.com): Version 2.34
* [Library name](https://example.com): Version 1234
## Installation
***
A little intro about the installation. 
```
$ git clone https://example.com
$ cd ../path/to/the/file
$ npm install
$ npm start
```
Side information: To use the application in a special environment use ```lorem ipsum``` to start
## Collaboration
***
Give instructions on how to collaborate with your project.
> Maybe you want to write a quote in this part. 
> Should it encompass several lines?
> This is how you do it.
## FAQs
***
A list of frequently asked questions
1. **This is a question in bold**
Answer to the first question with _italic words_. 
2. __Second question in bold__ 
To answer this question, we use an unordered list:
* First point
* Second Point
* Third point
3. **Third question in bold**
Answer to the third question with *italic words*.
4. **Fourth question in bold**
| Headline 1 in the tablehead | Headline 2 in the tablehead | Headline 3 in the tablehead |
|:--------------|:-------------:|--------------:|
| text-align left | text-align center | text-align right |
 -->
