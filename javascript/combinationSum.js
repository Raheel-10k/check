var combinationSum = function (candidates, target) {
    let res = [];

    function backtrack(start, path, target) {
        if (target === 0) {
            res.push([...path]); //break elements
            return;
        }
        if (target < 0) {
            return;
        }
        for (
            let i = start;
            i < candidates.length && candidates[i] <= target;
            i++
        ) {
            path.push(candidates[i]);
            backtrack(i, path, target - candidates[i]);
            path.pop();
        }
    }

    candidates.sort((a, b) => a - b);
    backtrack(0, [], target);

    return res;
};
