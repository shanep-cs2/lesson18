# lesson18 - Using a linked list

## Overview

In this lab we are going to write a small app that will use a
[LinkedList](https://docs.oracle.com/javase/10/docs/api/java/util/LinkedList.html) from the Java API.

## Objectives

- Work with the Linked List collection from the Java API
- Explore iterators and how different collections implement that interface

## Task 1 - Implement a Class

In the starter code you will find a file named **Item.java**. Your task is to implement the class so
it can represent an item on a purchase order. The class must have two fields to represent the item
name and quantity that are declared as private have have appropriate **getters and setters**. You
also need a **static** method that can parse a list of items from an Iterator and place them into
a Linked List.

```java
private String name;
private String qty;
/**
 * Takes an iterator and constructs Item objects from each call to next().
 * @param items The items to parse
 * @return A List of constructed items.
 */
public static LinkedList<Item> parseItems(Iterator<String> items);
```

At this point you don't need to write the internals of parseItems, just return null for now. We
will return to parseItems once we have completed our unit tests.

## Task 2 - Write Unit tests

Now that we have our class all stubbed out lets write some unit tests. We want to make sure that if
we pass in an iterator with a list of items we get that same list out. This brings up an interesting
point that we may have forgotten about when we stubbed out our class in Task 1. How do we ensure two
items are equal? Well, in java we need to override the [equals
methods](https://docs.oracle.com/javase/10/docs/api/java/lang/Object.html#equals(java.lang.Object))!! 

## Task 3 - Complete Items class

Now that we have some unit tests all written that are hopefully failing we need to complete the Item
class. The getters and setters should be pretty straight forward (and you may have already written
them). The `parseItems` method should read items from the iterator until `items.hasNext()` returns
false. The parseItems needs to create a new item for each line read. The iterator will return 
items from a text file that is defined in the file **test_data.txt**

```txt
steel 4lbs
bolts 23lbs
aluminium 2units
```

## Task 4 - Complete App.java

In the file **App.java** you will find some `TODO` comments that you will need to complete. Note
that the [scanner](https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html) implements
the Iterator interface! So we can now just pass a scanner to the **parseItems** method that only
takes an Iterator! That is really cool and is a good example of polymorphism in action!

**Hint:** You will need to override the toString() method in the Items class!
