/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    const romans = new Map([
        ['I', 1],
        ['V', 5],
        ['X', 10],
        ['L', 50],
        ['C', 100],
        ['D', 500],
        ['M', 1000]]);
    let arr = s.split('');
    let result=0;
    for(let i = arr.length-1;i>=0;i--){
        if(romans.get(arr[i])<romans.get(arr[i+1])){
            result-=romans.get(arr[i]);
        }else{
        result+=romans.get(arr[i]);
        }
    }
    return result;
};