/**
 * @param {number} rowsCount
 * @param {number} colsCount
 * @return {Array<Array<number>>}
 */
Array.prototype.snail = function(rowsCount, colsCount) {
    if(rowsCount * colsCount !== this.length){
        return []
    }

    const result = []
    for(let i = 0; i < rowsCount; i++){
        result.push([])
    }

    for(let i = 0; i < this.length; i++){
        const col = Math.floor(i / rowsCount)
        const pos = i % rowsCount

        let row

        if(col % 2 === 0){
            row = pos
        } else {
            row = rowsCount - 1 - pos
        }
      result[row].push(this[i])

  
    }

    return result
}

/**
 * const arr = [1,2,3,4];
 * arr.snail(1,4); // [[1,2,3,4]]
 */