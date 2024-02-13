/**
 * @param {string[]} words
 * @return {string}
 */
var firstPalindrome = function(words) {
    for(let x in words){
        console.log(words[x]);
        if(words[x]==words[x].split('').reverse().join('')) return words[x];
    }
    return "";
};