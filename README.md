# collection_framework_and_map

            ** collection_framework_and_map **

            
1. What is the Collection framework in Java?
Ans: The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.
Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

2. What is the difference between ArrayList and LinkedList?
 Ans :Java ArrayList is a part of the Java collections framework and it is a class of java.util package. It provides us with dynamic arrays in Java. Though, it may be slower than standard 
 arrays but can be helpful in programs where lots of manipulation in the array is needed. This class is found in java.util package. The main advantage of ArrayList in Java is, that if we 
 declare an array then we need to mention the size, but in ArrayList, it is not needed to mention the size of ArrayList. If you want to mention the size then you can do it.

Linked List is a part of the Collection framework present in java.util package. This class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. 

3.What is the difference between Iterator and ListIterator?
 Ans : An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
  It is called an "iterator" because "iterating" is the technical term for looping.
  To use an Iterator, you must import it from the java.util package.
 
 ListIterator is one of the four java cursors. It is a java iterator that is used to traverse all types of lists including ArrayList, Vector, LinkedList, Stack, etc.
 It is available since Java 1.2. It extends the iterator interface.

 4. What is the difference between Iterator and Enumeration?
  Ans : An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
  It is called an "iterator" because "iterating" is the technical term for looping.
  To use an Iterator, you must import it from the java.util package.

  Enum, introduced in Java 5, is a special data type that consists of a set of pre-defined named values separated by commas. 
  These named values are also known as elements or enumerators or enum instances. Since the values in the enum type are constant, 
  you should always represent them in UPPERCASE letters

5. What is the difference between List and Set?
 Ans :  The main difference between List and Set is that Set is unordered and contains different elements, whereas the list is ordered and can contain the same elements in it.
    Let's discuss in detail.

6. What is the difference between HashSet and TreeSet?
 Ans : HashSet is a generic class of the Java collection framework. It extends AbstractSet and implements the Set interface.
  It creates a collection that uses a hash table for storage. The hash table stores the information by using the hashing mechanism.
  Hashing uses the informational content to determine a unique value which is known as hash code. It is used as the index in which data is stored that is associated with the key.
 The transformation of the key into hash code performed automatically. The benefit of hashing is that it allows the execution time of add, contain, remove, and size operation to remain 
 constant even for large sets. Its time complexity for the operation search, insert, and delete is O(1).

TreeSet is a class of Java collection framework that extends AbstractSet and implements the Set, NavigableSet, and SortedSet interface. 
It creates a collection that uses a tree for storage.TreeSet is a generic class of the Java collection framework. It implements the Set interface. 
It uses TreeMap internally to store the TreeSet elements. By default, it sorts the elements in natural order (ascending order). The order of sorting depends on the Comparator that we have parsed. If no Comparator is parsed, it sorts the elements in the natural order.
Its performance is slow in comparison to HashSet because TreeSet sorts the elements after each insertion and deletion operation.
It uses two methods comaperTo() or compare() to compare the elements. It is to be noted that the implementation of TreeSet is not synchronized. 
It means that it is not thread-safe. The implementation must be synchronized externally if multiple threads accessing a TreeSet concurrently and a thread try to modify the TreeSet.
It does not allow to store null elements. It throws NullPointerException if we try to insert a null element. It requires more memory than TreeSet because it also maintains the comparator to sort the elements.
Its time complexity for the operation search, insert, and delete is O(log n) which is much higher than HashSet. It uses a self-balancing BST (Red-Black Tree) to implement the TreeSet.

7. What is the difference between Array and ArrayList?
 Ans : Normally, an array is a collection of similar type of elements which has contiguous memory location.
 Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location.
 It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.
 Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.

Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime.
So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.
The ArrayList in Java can have the duplicate elements also. It implements the List interface so we can use all the methods of the List interface here.
The ArrayList maintains the insertion order internally.
It inherits the AbstractList class and implements List interface.

8. What is a Map in Java?
 Ans : A Map in Java is an object that maps keys to values and is designed for faster lookups. Data is stored in key-value pairs and every key is unique.
 Each key maps to a value hence the name map. These key-value pairs are called map entries.

9. What age the commonly used implementations of Map in Java?
 Ans : The most common implementation of a map is the HashMap class. HashMap uses a hash table to store elements, so it can be very efficient for lookup operations.

10. What is the diffegence between HashMap and TgeeMap?
 Ans : HashMap allows storing at most one null key and many null values. However, TreeMap doesn't allow a null key but may contain many null values.
  If we're using a TreeMap with a user-defined Comparator, then it depends on the implementation of the compare() method how null values get handled.

11. How do you check if a key exists in a Map in Java?
Ans : containsKey() method is used to check whether a particular key is being mapped into the HashMap or not.
    It takes the key element as a parameter and returns True if that element is mapped in the map.
