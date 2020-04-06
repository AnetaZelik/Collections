
COLLECTIONS
Collections.sort(liczby); sorts the collection ascending by default Collections.reverse(liczby);
reverses the order ustalona kolejność, listy, sety, mapy

LISTS
ToCheck gdy najważniejszy jest czas dostępu do danych, a ToReview, gdy wiemy, że często będą wykonywane operacje usuwania, 
dodawania itp elementów gdzieś w środku struktury, a sprawą podrzędną są operacje wyszukiwania i szybkości dostępu do elementów listy.

add(Object) - dodaje element do listy
remove(Object) - usuwa pierwsze wystąpienie podanego obiektu z listy
remove(int) - usuwa z listy element o wskazanym indeksie
size() - odpowiednik własności length w przypadku tablic - zwraca rozmiar listy
get(int) - pozwala odczytać element o wskazanym indeksie

LINKED LIST
każdy element takiej listy musi posiadać powiązanie do elementu kolejnego i przechowywać informację o przechowywanym obiekcie.
Ostatni element acyklicznej jednokierunkowej listy wskazuje na wartość null, która zwana jest głową.
Elementy poprzedzające głowę to tzw. ogon; aby lista była dwukierunkowa każdy element musiałby przechowywać dodatkową referencję do obiektu poprzedniego. 
W przypadku listy cyklicznej element ostatni wskazywałby nie na wartość null, a na jej pierwszy element. 

SETS
 nie ma duplikatów, nie ma ustalonej kolejności

        Set<Integer> mojSet = new HashSet<>();
        System.out.print(mojSet);
// Iterator iterator = mojSet.iterator(); // while (iterator.hasNext()){ System.out.println(iterator.next()); }

// for(Integer element : mojSet){System.out.println(element); }

MAPS
(słowniki) nie ma ustalonej kolejności, pary klucz wartość; dodawanie nowych elementów: put i putAll, 
możemy iterować po zbiorze kluczy (keySet), zbiorze wartości (values) oraz po zbiorze par klucza i wartości (entrySet). 
Map is an interface for data structures that take (key, value) pairs and map keys to their associated values (both the key and the value must be Objects and not primitives). The implementation is done by implementing classes such as HashMap or LinkedHashMap.

containsKey(Object key): Returns true if the map contains a mapping for key; returns false if there is no such mapping. get(Object key): Returns the value to which the key is mapped; returns null if there is no such mapping. put(K key, V value): Adds the (Key, Value) mapping to the Map; if the key is already in the map, the value is overwritten.

public boolean checkIfNameExists(Float key){ return książka.containsKey(key);// sprawdza, czy dana wartość jest już w mapie }

// Create a Map of String Keys to String Values, implemented by the HashMap class Map<String,String> myMap = new HashMap<String,String>(); myMap.put("Hi", "Bye"); // Adds ("Hi","Bye") mapping to myMap System.out.println(myMap.get("Hi")); // Print the Value mapped to from "Hi" myMap.put("Hi", "Bye!"); // Replaces "Bye" mapping from "Hi" with "Bye!"
