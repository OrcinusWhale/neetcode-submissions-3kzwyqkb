class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rowsSeen = defaultdict(lambda: [False]*10)
        columnsSeen = defaultdict(lambda: [False]*10)
        boxesSeen = defaultdict(lambda: [False]*10)
        for i in range(9):
            for j in range(9):
                if board[i][j] == ".":
                    continue
                num = int(board[i][j])
                box = (i//3, j//3)
                if rowsSeen[i][num] or columnsSeen[j][num] or boxesSeen[box][num]:
                    return False
                rowsSeen[i][num] = True
                columnsSeen[j][num] = True
                boxesSeen[(i//3, j//3)][num] = True
        return True