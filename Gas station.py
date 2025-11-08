class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        total_gas = 0
        gas_till_now = 0
        n = len(gas)
        start = 0

        for i in range(n):
            total_gas += gas[i] - cost[i]
            gas_till_now += gas[i] - cost[i]

            if gas_till_now < 0:
                start = i + 1
                gas_till_now = 0
        
        return start if total_gas >= 0 else -1
