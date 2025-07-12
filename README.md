# Most Common Name Finder

This is a simple Java program that finds the most common (frequently occurring) name from a list of names using a `HashMap`.

## 🧠 How it works

1. The method `findMostCommon` accepts a list of names (`List<String>`).
2. It counts how many times each name appears using a `HashMap<String, Integer>`.
3. It then iterates through the map to find the name with the highest frequency.
4. The most common name is returned as a result.

## 🧪 Example

```java
List<String> names = Arrays.asList("Ivan", "Maria", "Ivan", "Georgi", "Ivan", "Maria");
System.out.println("Most common: " + findMostCommon(names));
