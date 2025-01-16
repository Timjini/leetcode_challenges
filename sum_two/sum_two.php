<?php


function sumTwo($array, $target){
    $hash = [];

    foreach ($array as $index => $value){
        $diff = $target - $value;
        if(array_key_exists($diff, $hash)){
            return [$hash[$diff],$index];
        }
        $hash[$value] = $index;
    }

    return null;
}
$hash = [];
$array = [2,7,11,15];
$target = 9;
print_r(sumTwo($array, $target));


// print array
// echo implode(', ',$array);

// print int 
//echo var_dump($target);
