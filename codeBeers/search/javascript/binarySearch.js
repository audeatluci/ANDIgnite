function binarySearch(sortedArray, numToFind) {
    var lowIndex = 0;
    var highIndex = sortedArray.length - 1;
    while (lowIndex <= highIndex) {
      var midIndex = Math.floor((lowIndex + highIndex) / 2);
      if (sortedArray[midIndex] == numToFind) {
        return midIndex;
      } else if (sortedArray[midIndex] < numToFind) {
        lowIndex = midIndex + 1;
      } else {
        highIndex = midIndex - 1;
      }
    } return null;
  }
  
  var listToSearch = [ 2, 3, 4, 10, 40 ];
  binarySearch(listToSearch, 10); 