words = ['A', 'E', 'I', 'O', 'U']

def dfs(elements, cur):
    global words
    if len(cur) > 5:
        return
    if cur not in elements:
        elements.append(cur)
    for i in range(5):
        dfs(elements, cur + words[i])
    
def solution(word):
    answer = 0
    elements = []
    for i in range(5):
        dfs(elements, words[i])
    
    for i in range(len(elements)):
        if elements[i] == word:
            answer = i + 1
            break
            
    return answer