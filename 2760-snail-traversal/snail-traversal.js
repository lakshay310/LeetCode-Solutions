/**
 * @param {number} rowsCount
 * @param {number} colsCount
 * @return {Array<Array<number>>}
 */
Array.prototype.snail = function(rowsCount, colsCount) {
    if (this.length !== rowsCount * colsCount) {
        return [];
    }

    const res = Array.from({ length: rowsCount }, () => Array(colsCount));
    let r = 0, c = 0, goingDown = true;

    for (let i = 0; i < this.length; i++) {
        res[r][c] = this[i];
        if (goingDown) {
            if (r + 1 < rowsCount) {
                r++;
            } else {
                c++;
                goingDown = false;
            }
        } else {
            if (r - 1 >= 0) {
                r--;
            } else {
                c++;
                goingDown = true;
            }
        }
    }

    return res;
};

/**
 * const arr = [1,2,3,4];
 * arr.snail(1,4); // [[1,2,3,4]]
 */