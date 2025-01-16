def sum_two(array, target)
    hash = {}

    array.each_with_index do |n, i|
        diff = target - n
        if hash.keys.include?(diff)
            return [hash[diff], i]
        end
      hash[n] = i
    end
    nil
end

array = [2,11,7,15]
target = 9

puts sum_two(array, target)
