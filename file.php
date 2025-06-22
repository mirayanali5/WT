<?php
// Input file path
$inputFile = 'input.txt';
// Output file path
$outputFile = 'output.txt';
// Check if the input file exists
if (file_exists($inputFile)) {
 // Read the data from the input file
 $data = file_get_contents($inputFile);
 // Check if the data was read successfully
 if ($data !== false) {
 // Write the data to the output file
 $writeSuccess = file_put_contents($outputFile, $data);
 if ($writeSuccess !== false) {
 echo "Data successfully written to $outputFile\n";
 } else {
 echo "Failed to write data to $outputFile\n";
 }
 } else {
 echo "Failed to read data from $inputFile\n";
 }
} else {
 echo "$inputFile does not exist\n";
}
?>