class Solution(object):
    def customSortString(self, order, s):
        """
        :type order: str
        :type s: str
        :rtype: str
        """
        result=""
        for letter in order:
            if letter in s:
                for i in range(s.count(letter)):
                    result+=letter 
                    s=s.replace(letter, "")
        result+=s
        return result