// source: leetcode
// Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// 주어진 배열에서 두 수의 합이 Target 조합을 찾아라(중복 사용 금지)
// Strat: node Q1.js

const input1 = [2, 7, 11, 15]
const target1 = 9

const input2 = [3, 2, 4]
const target2 = 6

const input3 = [3, 3]
const target3 = 6

const solution = (input, target) => {
  let result = []
  for (let i = 0; i < input.length; i += 1) {
    const startNumber = input[i]
    for (j = i + 1; j < input.length; j += 1) {
      if (startNumber + input[j] === target) {
        result = [i, j]
        break
      }
    }
  }
  console.log(`[${result.join(',')}]`)
}

solution(input1, target1)
solution(input2, target2)
solution(input3, target3)