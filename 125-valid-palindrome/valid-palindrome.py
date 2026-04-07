class Solution(object):
    def isPalindrome(self,s):
        new_str=""
        for ch in s:
            if ch.isalnum():
                new_str+=ch
        return new_str.lower()==new_str[::-1].lower()


