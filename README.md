# Java Generics

Two small examples of generic types in Java.

- **`generics.storage`**: a generic array-based storage `StorageGeneric<E>`
  with the `IStorage<E>` interface: adding, removing, searching, sorting
  and swapping two elements for any reference type.
- **`generics.fruits`**: fruit boxes `Box<E extends Fruit>`: a box can hold
  only one kind of fruit, boxes can be compared by weight
  (including boxes of different kinds), and fruits can be moved from one box to another
  box of the same kind.

## Run

Requires JDK 11+.

```bash
javac -encoding UTF-8 -d out $(find src -name '*.java')
java -cp out generics.fruits.Main
java -cp out generics.storage.Main
```
