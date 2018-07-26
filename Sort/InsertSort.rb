def insertSortOne(arr)
  i = 0
  while (i < arr.length-1) && (arr[i+1] < arr[i])
      j = i+1
      while j > 0
        if arr[j-1] > arr[j]
          arr[j-1], arr[j] = arr[j], arr[j-1]
        end
        j -= 1
      end 
    i += 1
  end

  arr
end

def insertSortTwo(arr)
  i = 1
  while i < arr.length
    temp = arr[i]
    j = i-1
    while (j >= 0) && (temp < arr[j])
      # move the one which is bigger than temp forward one index
      arr[j+1] = arr[j]
      j -= 1
    end
    # insert temp to the left of the one which is the leftest one bigger than it
    arr[j+1] = temp
    i += 1
  end

  arr
end

print(insertSortOne([10,5,3,8,2,6,4,7,9,1]))
print(insertSortTwo([10,5,3,8,2,6,4,7,9,1]))