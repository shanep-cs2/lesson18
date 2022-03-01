# lesson18 - Using a linked list

## Overview

In this lab we are going to write a small app that will use a
[LinkedList](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) from the Java API.

## Task 1 - Implement a Class

In the starter code you will find a file named ListItem.java. Your task is to implement the class so
it can represent an item on a shopping list. The class must have two fields to represent the item
name and quantity as follows:

```java
private String name;
private String qty;
```

## Task 2 - Parse Items

Your ListItem class will need to contain a `public static` method named `parseItems` that will
take a scanner and parse a list of items from a Scanner. The `parseItems` method must be defined as
follows:

```java
public static LinkedList<ListItem> parseItems(Scanner in);
```

The `parseItems` method  should read items from input (ending with -1), adding each item to a 
LinkedList that is returned when the end of input is reached.

### Example input/output

Input: 

```
milk 2gl
bread 1lb
eggs 12
waffles 3
cereal 2 boxes
-1
```

Output:

```
milk 2gl
bread 1lb
eggs 12
waffles 3
cereal 2 boxes
```

## Task 3 - Write Unit tests

Write a set of unit tests for your ListItem class

## Task 4 - Complete App.java

In the file **App.java** you will find some `TODO` comments that you will need to complete. 
