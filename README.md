# Collections
# Hash Set
Hashset is usefull when storing unique collection values.

  - Unique values are stored
  - Execution time of add remove contains is constant
  - Does not guarantee order of its elements
  - Backed by HashMap, implemented using hashtable
  - It is not synchronized that means it is not thread safe

# Linked Hash Set

  - Unique values are stored
  - Execution time of add, remove, size, contains is constant
  - It maintains insertion order of its elements

# TreeSet

  - Unique values are stored
  - Execution time of add remove contains is more compared to hashset
  - Does not allow null values 
  - Backed by TreeMap, implemented using self balancing binary search tree(Red Black Tree)
  - TreeSet maintains sorted order
  - TreeSet does not allow insertion of Heterogeneous elements
  - It is not synchronized that means it is not thread safe
