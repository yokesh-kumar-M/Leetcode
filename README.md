# Leetcode Solutions (Java)

[![Java](https://img.shields.io/badge/Java-8-007396?logo=openjdk)](https://www.oracle.com/java/)
[![Problems](https://img.shields.io/badge/Solved-48%2B-success)](#problems)
[![Style](https://img.shields.io/badge/SonarLint-clean-brightgreen)](#code-style)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

Java solutions to LeetCode problems, organised by category. Each file is **self-contained** — single class, single `main` method — so you can compile and run any solution in isolation.

> **Why another LeetCode-solutions repo?** Two reasons. First, every solution is written in **production style**: private constructors on utility classes (suppresses SonarLint `S1118`), `Logger` instead of `System.out.println` (suppresses `S106`), explicit imports. If you're prepping for senior-engineer interviews where code-style is part of the scoring, this is the cleaner reference. Second, files are flat and grouped by technique in the index below — easy to navigate by problem number or by topic.

## Run

```sh
javac TwoSum.java
java TwoSum
```

Java 8 (`javac 1.8.0_431`) is enough for everything in here.

## Code style

- Each problem is one `.java` file, one top-level class. The class name matches the file name.
- Utility classes have a `private` constructor (no implicit `public` one) to satisfy `java:S1118`.
- Output uses `java.util.logging.Logger` rather than `System.out.println` to satisfy `java:S106`.
- Inputs/outputs in `main()` are hardcoded examples — easy to swap when debugging a specific test case.
- No external dependencies. Java standard library only.

## Problems

### Array
| # | Problem | File |
|---|---------|------|
| 1 | Two Sum | [TwoSum.java](TwoSum.java) |
| 41 | First Missing Positive | [FirstMissingPositive.java](FirstMissingPositive.java) |
| 53 | Maximum Subarray | [MaximumSubarray.java](MaximumSubarray.java) |
| 66 | Plus One | [PlusOne.java](PlusOne.java) |
| 88 | Merge Sorted Array | [MergeSortedArray.java](MergeSortedArray.java) |
| 121 | Best Time to Buy and Sell Stock | [BestTimeToBuySellStock.java](BestTimeToBuySellStock.java) |
| 268 | Missing Number | [MissingNumber.java](MissingNumber.java) |
| 287 | Find the Duplicate Number | [FindDuplicate.java](FindDuplicate.java) |
| 442 | Find All Duplicates in an Array | [FindAllDuplicates.java](FindAllDuplicates.java) |
| 448 | Find All Numbers Disappeared in an Array | [DisappearedNumbers.java](DisappearedNumbers.java) |
| 645 | Set Mismatch | [SetMismatch.java](SetMismatch.java) |
| 977 | Squares of a Sorted Array | [SortedSquares.java](SortedSquares.java) |
| 1131 | Maximum of Absolute Value Expression | [MaxAbsValue.java](MaxAbsValue.java) |
| 1295 | Find Numbers with Even Number of Digits | [FindNumbersWithEvenDigits.java](FindNumbersWithEvenDigits.java) |
| 1480 | Running Sum of 1d Array | [RunningSum.java](RunningSum.java) |
| 1486 | XOR Operation in an Array | [XorOperation.java](XorOperation.java) |
| 1524 | Number of Sub-arrays With Odd Sum | [SubarraysWithOddSum.java](SubarraysWithOddSum.java) |
| 1672 | Richest Customer Wealth | [RichestCustomerWealth.java](RichestCustomerWealth.java) |
| 1726 | Tuple with Same Product | [TuplesWithSameProduct.java](TuplesWithSameProduct.java) |
| 1800 | Maximum Ascending Subarray Sum | [MaxAscArray.java](MaxAscArray.java) |
| 2364 | Count Number of Bad Pairs | [CountBadPairs.java](CountBadPairs.java) |
| 2535 | Difference Between Element Sum and Digit Sum | [DigitElement.java](DigitElement.java) |
| 2894 | Divisible and Non-divisible Sums Difference | [DivisibleSum.java](DivisibleSum.java) |
| 3151 | Special Array I | [SpecialArray.java](SpecialArray.java) |
| 3232 | Find if Digit Game Can Be Won | [DigitGame.java](DigitGame.java) |

### Binary Search
| # | Problem | File |
|---|---------|------|
| 33 | Search in Rotated Sorted Array | [SearchInRotatedArray.java](SearchInRotatedArray.java) |
| 34 | Find First and Last Position | [FindFirstAndLastPosition.java](FindFirstAndLastPosition.java) |
| 69 | Sqrt(x) | [SquareRoot.java](SquareRoot.java) |
| 162 | Find Peak Element | [PeakElement.java](PeakElement.java) |
| 410 | Split Array Largest Sum | [SplitArray.java](SplitArray.java) |
| 704 | Binary Search | [BinarySearch.java](BinarySearch.java) |
| 744 | Find Smallest Letter Greater Than Target | [SmallestLetterGreaterThanTarget.java](SmallestLetterGreaterThanTarget.java) |
| 852 | Peak Index in a Mountain Array | [PeakIndexInMountainArray.java](PeakIndexInMountainArray.java) |

### String
| # | Problem | File |
|---|---------|------|
| 14 | Longest Common Prefix | [LongestCommonPrefix.java](LongestCommonPrefix.java) |
| 125 | Valid Palindrome | [ValidPalindrome.java](ValidPalindrome.java) |
| 387 | First Unique Character in a String | [FirstUniqueCharacter.java](FirstUniqueCharacter.java) |
| 647 | Palindromic Substrings | [PalindromicSubstring.java](PalindromicSubstring.java) |
| 709 | To Lower Case | [ToLowerCase.java](ToLowerCase.java) |
| 1790 | One String Swap Equal | [OneStringSwapEqual.java](OneStringSwapEqual.java) |
| 2108 | First Palindromic String in the Array | [FirstPalindromeInArray.java](FirstPalindromeInArray.java) |

### Linked List
| # | Problem | File |
|---|---------|------|
| 141 | Linked List Cycle | [CycleLinkedList.java](CycleLinkedList.java) |
| 876 | Middle of the Linked List | [MiddleOfLinkedList.java](MiddleOfLinkedList.java) |

### Math
| # | Problem | File |
|---|---------|------|
| 202 | Happy Number | [HappyNumber.java](HappyNumber.java) |
| 258 | Add Digits | [AddDigits.java](AddDigits.java) |
| 657 | Robot Return to Origin | [RobotReturn.java](RobotReturn.java) |
| 1780 | Check if Number is a Sum of Powers of Three | [CheckPowersOfThree.java](CheckPowersOfThree.java) |
| 2652 | Sum Multiples | [SumMultiples.java](SumMultiples.java) |
| 3024 | Type of Triangle | [TypeOfTriangle.java](TypeOfTriangle.java) |

---

## Contributing

Pull requests welcome. If you're adding a solution:

1. Use the existing file layout (one class, private constructor if utility, `Logger` for output).
2. Add an entry to the right table above (alphabetised by problem number within its category).
3. Compile + run locally before pushing — `javac YourFile.java && java YourFile`.

## Related projects

- [Portfolio](https://github.com/yokesh-kumar-M/Portfolio) — Iron Man HUD personal site.
- [SprayMaster](https://github.com/yokesh-kumar-M/SprayMaster) — Python network login auditor.
- [PIIcasso](https://github.com/yokesh-kumar-M/Piicasso) — PII intelligence platform.

## License

[MIT](LICENSE) for the solutions. Problem statements are © LeetCode Inc. — see the `ATTRIBUTION NOTICE` in `LICENSE`.
