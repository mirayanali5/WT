<?php
// Input string
$inputString = "Hello, this is a sample string for PHP string manipulation.";
// a. Find the length of a string
$length = strlen($inputString);
echo "Length of the string: " . $length . "\n";
// b. Count the number of words in a string
$wordCount = str_word_count($inputString);
echo "Number of words in the string: " . $wordCount . "\n";
// c. Reverse a string
$reversedString = strrev($inputString);
echo "Reversed string: " . $reversedString . "\n";
// d. Search for a specific string
$searchString = "sample";
$position = strpos($inputString, $searchString);
if ($position !== false) {
 echo "The string '$searchString' was found at position: " . $position . "\n";
} else {
 echo "The string '$searchString' was not found.\n";
}
?>