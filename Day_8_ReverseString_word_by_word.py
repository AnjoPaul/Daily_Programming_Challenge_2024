'''
Problem : Reverse a String Word by Word
You are given a string s that consists of multiple words separated by spaces. 
Your task is to reverse the order of the words in the string. Words are defined as sequences of 
non-space characters. The output string should not contain leading or trailing spaces, and 
multiple spaces between words should be reduced to a single space.

'''
def reverseWords(s):

    words = s.split()
    # Reverse the list of words
    words.reverse()
    # Join the words with a single space
    return ' '.join(words)

s = "the sky is blue"
result = reverseWords(s)
print(result)