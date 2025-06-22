<?php
$arr1=array(5,9,3,7);
$arr2=array(2,8,1,6);
$merged=array_merge($arr1,$arr2);
rsort($merged);
echo"Sorted merged array in descending order:";
foreach($merged as $element){
 echo $element." ";
}
?>
