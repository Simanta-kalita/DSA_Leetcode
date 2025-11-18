def cutRod(price):
  n = len(price)
  dp = [0] * (n + 1)

  for length in range(1, n + 1):
    best = 0
    for l in range(1, length + 1):
      best = max(best,price[l - 1] + dp[n - l])
    dp[l] = best

  return dp[n]
