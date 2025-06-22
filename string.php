<?php
$inputString = "Hello, this is a sample string for PHP string manipulation.";
$length = strlen($inputString);
echo "Length of the string: " . $length . "\n";
$wordCount = str_word_count($inputString);
echo "Number of words in the string: " . $wordCount . "\n";
$reversedString = strrev($inputString);
echo "Reversed string: " . $reversedString . "\n";
$searchString = "sample";
$position = strpos($inputString, $searchString);
if ($position !== false) {
 echo "The string '$searchString' was found at position: " . $position . "\n";
} else {
 echo "The string '$searchString' was not found.\n";
}
?>
