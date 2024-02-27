class Node:
    def __init__(self, key):
        self.key = key
        self.values = []

    def extend(self, value):
        self.values.extend(value)
    def pop(self):
        return self.values.pop(0)


key = input()
cipher = input() # 암호문
n = len(key)
m = len(cipher)
sorted_key = sorted(key)
nodes = []
for sk in sorted_key:
    nodes.append(Node(sk))
# cipher의 m/n개씩 끊어서 각 노드에 추가
i = 0
for node in nodes:
    node.extend(list(cipher[i*m//n:(i+1)*m//n]))
    i += 1

new_nodes = []
for i in range(n):
    for node in nodes:
        if node.key == key[i]:
            new_nodes.append(node)
            del nodes[nodes.index(node)]
            break

decoded = ''
for i in range(m):
    decoded += new_nodes[i%n].pop()
print(decoded)