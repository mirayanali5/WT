<?php
function isPrime($num) {
 if ($num <= 1) {
 return false;
 }
 for ($i = 2; $i <= sqrt($num); $i++) {
 if ($num % $i == 0) {
 return false;
 }
 }
 return true;
}
echo "Prime numbers between 1 and 50 are: ";
for ($i = 1; $i <= 50; $i++) {
 if (isPrime($i)) {
 echo $i . " ";
 }
}
?>