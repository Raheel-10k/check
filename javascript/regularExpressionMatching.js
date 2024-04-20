/**
 * @param {string} s
 * @param {string} p
 * @return {boolean}
 */
var isMatch = function (s, p) {
    let dp = new Array(p.length + 1).fill(false);
    dp[0] = true;

    for (let j = 2; j <= p.length; j += 2) {
        dp[j] = dp[j - 2] && p[j - 1] === "*";
    }

    for (let i = 1; i <= s.length; i++) {
        let prev = dp[0];
        dp[0] = false;

        for (let j = 1; j <= p.length; j++) {
            let temp = dp[j];
            if (p[j - 1] === "*") {
                dp[j] =
                    dp[j - 2] ||
                    (dp[j] && (s[i - 1] === p[j - 2] || p[j - 2] === "."));
            } else {
                dp[j] = prev && (s[i - 1] === p[j - 1] || p[j - 1] === ".");
            }
            prev = temp;
        }
    }

    return dp[p.length];
};
