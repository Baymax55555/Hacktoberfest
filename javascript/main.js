// Welcome to javascript!

// function to find if the number passed is even or odd
function isEven(num) {
  if (num % 2 == 0) {
    return true;
  } else {
    return false;
  }
}

// function to find the factorial of a number
function factorial(num) {
  var result = 1;
  for (var i = 2; i <= num; i++) {
    result *= i;
  }
  return result;
}

// function to find the if the number is prime or not
function isPrime(num) {
  for (var i = 2; i < num; i++) {
    if (num % i == 0) {
      return false;
    }
  }
  return true;
}

// function to find if the number is a perfect square
function isSquare(num) {
  if (Math.sqrt(num) % 1 == 0) {
    return true;
  } else {
    return false;
  }
}

// show output of all functions declared
function showOutput() {
  var num = prompt("Enter a number");
  if (num == "") {
    alert("Please enter a number");
  } else {
    alert("Is " + num + " even? " + isEven(num));
    alert("Factorial of " + num + " is " + factorial(num));
    alert("Is " + num + " prime? " + isPrime(num));
    alert("Is " + num + " a perfect square? " + isSquare(num));
  }
}
