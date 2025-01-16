// welcome to JS

let array = [2, 7, 11, 15];
let number = 9;

var twoSum = function(nums, target) {
    let obj = {};

    for(let i = 0; i < nums.length; i++){
        let value = nums[i];
        let diff = target - value;
        if(Object.keys(obj).includes(diff.toString())){
            return [obj[diff], i];
        }
        obj[value] = i;
    }

    return null;
};

console.log(twoSum(array, number));
