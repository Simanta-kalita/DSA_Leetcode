class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m = len(matrix)
        n = len(matrix[0])

        first_row_zero = any(matrix[0][j] == 0 for j in range(n))
        first_column_zero = any(matrix[i][0] == 0 for i in range(m))

        for i in range(1,m):
            for j in range(1,n):
                if matrix[i][j] == 0:
                    matrix[0][j] = 0
                    matrix[i][0] = 0

        for i in range(1,m):
            for j in range(1,n):
                if matrix[0][j] == 0 or matrix[i][0] == 0:
                    matrix[i][j] = 0

        if first_row_zero:
            for i in range(0, n):
                matrix[0][i] = 0

        if first_column_zero:
            for j in range(0, m):
                matrix[j][0] = 0

        return matrix
