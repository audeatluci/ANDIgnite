function sum(array, n) {
  if (n === array.length) {
      return 0;
  } else {
      return array[n] + sum(array, n + 1);
  }
}

console.log(sum([1, 2, 3, 4, 5, 6],0))