class Solution:
  def solveKnapsack(self, profits, weights, capacity):
    # TODO: Write your code here
    n = len(profits)
    if capacity <= 0 or n == 0 or len(weights) != n:
      return 0

    dp = [[0 for x in range(capacity + 1)] for y in range(n) ]

#  make 0 for capacity 0
    for i in range(n):
      dp[i][0] = 0

# make 1st profit for single weight
    for cap in range(capacity + 1):
      if weights[0] <= cap:
        dp[0][cap] = profits[0]

# calculation of rest of the rows
    for i in range(1, n):
      for j in range(1, capacity + 1):
        profit1, profit2 = 0, 0
        if weights[i] <= j:
          profit1 = profits[i] + dp[i-1][j - weights[i]]
          profit2 = dp[i-1][j]
          dp[i][j] = max(profit1, profit2)
        else:
          dp[i][j] = dp[i-1][j]

    return dp[n-1][capacity]
