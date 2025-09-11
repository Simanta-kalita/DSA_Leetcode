import math

class Solution:
  def findPermutation(self, str1, pattern):
    # TODO: Write your code here
    window_start = 0 
    matched = 0
    freq_map = {}

    for character in pattern:
      if character not in freq_map:
        freq_map[character] = 0
      freq_map[character] += 1

    for window_end in range(len(str1)):
      right_char = str1[window_end]
      if right_char in freq_map:
        freq_map[right_char] -= 1

        if freq_map[right_char] == 0:
          matched += 1

      if (window_end - window_start + 1) > len(pattern):
        left_char = str1[window_start]
        window_start += 1
        if left_char in freq_map:
          if freq_map[left_char] == 0:
            matched -= 1;
          freq_map[left_char] += 1

      if matched == len(freq_map):
          return True;
        
    
    return False
