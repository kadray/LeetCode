/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x<0) return false;
    
    let xs=x.toString();
    let arr = xs.split('');

    arr.reverse();
    xs=arr.join('');
    let y = parseInt(xs);

    if(x==y)return true;
    return false;
};