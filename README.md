# Java Generics

Два небольших примера обобщённых типов (generics) в Java.

- **`generics.storage`** — обобщённое хранилище `StorageGeneric<E>` на массиве
  с интерфейсом `IStorage<E>`: добавление, удаление, поиск, сортировка
  и обмен двух элементов местами для любого ссылочного типа.
- **`generics.fruits`** — коробки с фруктами `Box<E extends Fruit>`: в одну коробку
  кладутся фрукты только одного вида, коробки можно сравнивать по весу
  (в том числе разных видов) и пересыпать фрукты из одной коробки в другую
  того же вида.

## Запуск

Требуется JDK 11+.

```bash
javac -encoding UTF-8 -d out $(find src -name '*.java')
java -cp out generics.fruits.Main
java -cp out generics.storage.Main
```
