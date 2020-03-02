function linearSearch(arr, numToFind) {
  for (var i=0; i<arr.length; i++) {
    if (arr[i] == numToFind) {
      return i;
    }
  } return null;
}

var listToSearch = [0,1,2,8,13,17,19,32,42];
linearSearch(listToSearch, 8); 
linearSearch(listToSearch, 32); 