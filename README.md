# lesson18 - The List and Iterator interface

## Overview

In this lab we are going to write a small app that will demonstrate how different collections all
use an [Iterator](https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html) and how
we can pass around a[ List
interface](https://docs.oracle.com/javase/10/docs/api/java/util/List.html).

## Important Links

- [Lab Overview](https://youtu.be/uBTK5m1vzlo)
- [Class Coding standards](https://shanep-cs2.github.io/docs/coding-standards.html)
- [Cloning and Submitting](https://shanep-cs2.github.io/docs/github.html)

## Objectives

- Work with the Iterators from the Java API
- Use the List interface
- Write a method that takes an Iterator as an argument
- Write your own equals and hash code method

## Task 1 - Implement MyItem

In the starter code you will find a file named **MyItem.java** that can represent an item on a
purchase order. Your task is to complete the implementation of this class.  The **MyItem** class
must implement the Item interface and must override the following methods:

- public boolean equals(Object obj)
- public int hashCode()
- public String toString() 

Developing your own hashcode algorithm is a bit out of scope for this assignment so we will give 
it to you to use directly. This is a simple hash code that uses the properties of the class to
generate a hashcode. 

```java
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((qty == null) ? 0 : qty.hashCode());
        return result;
    }
```

MyItem includes a static method that you will need to implement. The `parsItems` method (shown
below) takes an iterator that will return a string every time you call `next()`.

```java
    /**
     * Takes an iterator and constructs Item objects from each call to next().
     * 
     * @param items The stings that need to be parsed into Items
     * @return A List of constructed items.
     */
    public static List<Item> parseItems(Iterator<String> items) {
        return null;
    }
```

You will need to reference
[Iterator<E>](https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html) interface for
details on how to work with an iterator. The two functions that you will be using are the
`hasNext()` and `next()` methods. Each call to `next()` will return a string in the format shown
below. You will need to split the string on the space character and create a new item with the
resulting data.

For example, given the string `steel 4lbs` you would create a new MyItem object with the name
property set to **steel** and the qty property set to **4lbs**.

```txt
steel 4lbs
bolts 23lbs
aluminum 2units
```

## Task 2 - Write Unit tests

Now that we have our class all completed out lets write some unit tests to make sure everything
works correctly!


## Task 3 - Manual testing

In the file **App.java** you will find completed code that you can use to manually test your
implementation. Note that the
[scanner](https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html) implements the Iterator
interface! So we can now just pass a scanner to the **parseItems** method that only takes an
Iterator! That is really cool and is a good example of polymorphism in action!

## Task 4 - Complete the Retrospective

Once you have completed all the tasks open the file **Retrospective.md** and complete each section
with a TODO comment. 

## Task 5 - Add, Commit, Push your code

Once you are finished you need to make sure that you have pushed all your code to GitHub for
grading!