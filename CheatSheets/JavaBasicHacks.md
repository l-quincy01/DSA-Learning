

looping through keys and values in a HashMap


```java


HashMap<(KEY_anyType), (VALUE_anyType)>

for (var entry : map.entrySet()) {
            
             entry.getValue()  ; // the value
            entry.getKey()  ; // the key
        }


```

Chaacter manipulation ticks using Asscii values 

```java

//. Get ASCII value of a character
int ascii = (int) 'a'; // 97

//Convert ASCII to character
char c = (char) 97; // 'a'

//Shift character by n positions and wrap around (Caesar cipher-style)
char shifted = (char) (((c - 'a' + n) % 26) + 'a'); // lowercase
char shiftedUpper = (char) (((c - 'A' + n) % 26) + 'A'); // uppercase


//Check if a character is a letter or digit
Character.isLetter(c);
Character.isDigit(c);


//. Toggle case of a letter
Character.isUpperCase(c);
Character.isLowerCase(c);
Character.isWhitespace(c);
Character.isAlphabetic(c);

//.  Normalize to alphabet index (0 to 25)
int index = c - 'a'; // lowercase
int indexUpper = c - 'A'; // uppercase


//. Convert index (0–25) back to character
char c = (char) ('a' + index);



// Loop through the alphabet
for (char ch = 'a'; ch <= 'z'; ch++) {
    System.out.print(ch + " ");
}


```