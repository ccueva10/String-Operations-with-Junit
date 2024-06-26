# Test Plan for StringUtils Class

## Test Objectives
The main objectives of testing the StringUtils class are:
1. To ensure that the string manipulation methods (`concatenate`, `reverse`, `toUpperCase`, `trim`) work correctly for different input parameters.
2. To verify the correctness of the class under various scenarios, including edge cases and corner cases.

## Test Scenarios and Test Data

### Test Scenarios

1. **Concatenate Strings**
    - Scenario: Concatenate two strings
    - Test Data: "Hello", "World"
  
2. **Reverse String**
    - Scenario: Reverse a string
    - Test Data: "Hello"
  
3. **Convert to Uppercase**
    - Scenario: Convert a string to uppercase
    - Test Data: "hello"
  
4. **Trim String**
    - Scenario: Trim whitespace from a string
    - Test Data: "  Hello  "

### Test Data

- str1 = "Hello"
- str2 = "World"

## Test Execution

![Screenshot 2024-04-18 at 9 10 52 PM](https://github.com/ccueva10/String-Operations-with-Junit/assets/151315853/bb114db3-df18-4efa-a1f5-9012d72c698b)


### JUnit Test Execution

1. Open the project in an IDE that supports JUnit (like IntelliJ IDEA or Eclipse).
2. Navigate to the `StringUtilsTest` class.
3. Run the test methods individually or execute all test methods together.

### Test Results

After executing the test cases, the expected results are:

- `testConcatenate`: "HelloWorld"
- `testReverse`: "olleH"
- `testToUpperCase`: "HELLO"
- `testTrim`: "Hello"

![Screenshot 2024-04-18 at 9 11 19 PM](https://github.com/ccueva10/String-Operations-with-Junit/assets/151315853/da98cf39-2aaa-4eed-9907-f9a1787b087a)


## Test Report

### Test Coverage

All the test scenarios are covered by the provided test cases. However, to further enhance the coverage, additional test cases could be added for edge cases like empty strings, strings with special characters, and null strings.

### Test Execution Results

All test cases passed successfully, ensuring the correctness of the string manipulation methods for the given input parameters.

### Quality Assessment

The `StringUtils` class appears to behave as expected under the given input conditions. However, further testing might be necessary to ensure complete robustness and reliability.

## Issues Encountered

No issues were encountered during the testing of the StringUtils class.

## Recommendations

1. **Refactor Test Cases**: The test cases could be refactored to improve code readability and maintainability.
2. **Enhance Test Coverage**: Add additional parameterized test cases to cover edge cases and corner scenarios.
