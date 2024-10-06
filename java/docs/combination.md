# Combination
코딩테스트 준비를 하면서 조합의 방식이 이용되는 것이 많다고 생각해서 정리하게 되었습니다.
- 목차
  1. combination 의미와 공식
  2. 조합 방법 수만 구하는 경우
  3. 조합의 내부 전부를 확인하는 경우

## Combination(조합)
집합에서 선택 순서는 상관 없이 뽑는 수</br>
`nCr`: n개의 서로 다른 아이템에서 r개를 뽑는 경우의 수 (뽑기만 하므로 순서는 상관 없다.)
### 공식 
- `nCr = n! / r!(n-r)!`
- `nCr = n-1Cr-1 + n-1Cr`
  - 아이스 하키 공식이라고 알려져 있는 방식
  - 1개를 미리 뽑아 놓고 나머지인 n-1개에서 r-1개를 뽑고 + 1개를 제외한 것에서 r개를 뽑는 방식
  - 위 2개를 더한 것이 nCr이 된다. 
### 예시
`1, 2, 3 ,4`에서 2개를 뽑으면 `4C2`가 된다.</br>
공식을 이용해서 뽑는 방법의 수만 구하면 `4C2 = 4!/2!(4-2!) = 6`으로 6가지가 나온다.</br>

뽑는 경우의 수는 아래와 같아진다.
```text
1 2
1 3
1 4
2 3
2 4
3 4
```

## 조합 방법 수만 구하는 경우
- `nCr = n! / r!(n-r)!` 으로 팩토리얼을 이용하는 방법
```java
public int combi(int n, int k){
    return fact(n) / fact(k) * fact(n-k);
}

public int fact(int n){
    int res = 1;
    for(int i = n; i >= 1; i--)
        res *= i;
    return res;
}
```
- `nCr = n! / r!(n-r)!` 으로 팩토리얼을 재귀적으로 이용하는 방법
```java
public int combi(int n, int k){
  return fact(n) / fact(k) * fact(n-k);
}

public int fact(int n){
  if(n == 0 || n == 1)
      return 1;
  return n * fact(n-1);
}
```
- `nCr = n! / r!(n-r)!` 으로 dp를 이용한 방법
```java
private static int[] dp = new int[충분한수];
public int combi(int n, int k){
  int[] dp = new int[n+1];
  dp[0] = dp[1] = 1;
  for(int i = 2; i <= n; i++){
      dp[i] = dp[i-1] * i;
  }
  return dp[n] / dp[k] * dp[n-k];
}
```

- `nCr = n-1Cr-1 + n-1Cr`인 하키 공식 이용한 재귀적인 방법
```java
public int combi(int n, int k){
    if(n == k || k == 0)
        return 1;
    return combi((n-1), (k-1)) + combi(n-1, k);
}
```
### 관련 문제
[프로그래머스 L0 구슬을 나누는 경우의 수](https://school.programmers.co.kr/learn/courses/30/lessons/120840)</br>
정말 조합 결과로 나오는 수 자체를 구하는 것이라서 그대로 코드를 이용할 수 있습니다.

## 조합의 내부를 전부 확인하는 경우
이 자체가 문제로 나오지는 않지만, 이 방식을 이용하는 방법이 코딩테스트에서 꽤 나온다고 생각했습니다.</br>
`{1, 2, 3, 4, 5}`와 같이 n개의 1차원 배열에서 r개를 접근하는 것을 해보고자 합니다.

### 재귀를 사용하는 경우 
```java
public List<int[]> combis(int[] origin, int r){
  List<int[]> lst = new ArrayList<>();
  combiHelper(origin, new int[r], 0, 0, r, lst);
  return lst;
}

// start: origin에서  start하는 값, depth로 현재의 깊이와 res의 index 사용
private int[] combiHelper(int[] origin, int[] res, int start, int depth, int r, List<int[]> lst){
  if(depth == r){ // r개를 뽑고 나면 멈춘다.
    lst.add(res.clone());
    return;
  }
  for(int i = start; i < origin.length; i++){ 
    res[depth] = origin[i]; //  r개를 뽑는 res의 현재 위치인 depth에 origin의 start를 넣는다.
    combiHelper(origin, res, i + 1, depth + 1, r); // 재귀
  }
}
```

### 관련 문제
- 

## 참고자료
- https://corporatefinanceinstitute.com/resources/data-science/combination/
- https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
- https://www.tutorialspoint.com/permutation-and-combination-in-java
- https://www.javatpoint.com/permutation-and-combination-in-java