class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range(len(board)):
            seen = [False]*10
            for j in range(len(board)):
                if board[i][j] == ".":
                    continue
                num = int(board[i][j])
                if seen[num]:
                    return False
                seen[num] = True
        for i in range(len(board)):
            seen = [False]*10
            for j in range(len(board)):
                if board[j][i] == ".":
                    continue
                num = int(board[j][i])
                if seen[num]:
                    return False
                seen[num] = True
        for i in range(len(board)):
            seen = [False]*10
            for j in range(len(board)):
                boxI = (i//3)*3+j//3
                boxJ = (3*i)%9+j%3
                if board[boxI][boxJ] == ".":
                    continue
                num = int(board[boxI][boxJ])
                if seen[num]:
                    return False
                seen[num] = True
        return True 