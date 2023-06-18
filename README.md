# kotlin-lotto

# 1단계 - 문자열 덧셈 계산기

### 요구사항

* 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
* 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
* 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

### Todo

- [x] 문자열을 입력받는다. -> inputView
- [x] ,와:을 가지는 문자열의 경우 구분자가 ,와:로 정해진다. -> Calculator
- [x] ,와:을 가지는 경우 문자열의 합이 계산된다. -> Calculator
- [x] 문자열이 빈값이거나 null인 경우 합은 0이 된다 -> Calculator
- [x] //와 \n 사이에 구분자를 전달하는 경우 해당 구분자를 사용한다. -> Calculator
- [x] 계산기에 숫자 이외에 값 또는 음수를 전달하는 경우 RuntimeException을 발생시킨다. -> Calculator
- [x] 값을 출력한다. -> ResultView

# 2단계 - 로또(자동)

### 요구사항

* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.
* 로또 자동 생성은 shuffled()을 활용한다.
* sorted()를 활용해 정렬 가능하다.
* contains()를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.

### 실행결과
```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```


### Todo

- [x] 구매 금액을 입력한다 -> InputView
- [x] 로또를 구매할 수 있는 장수를 계산한다. -> lottery shop
- [ ] 구매한 로또장수를 출력한다. -> ResultView
- [ ] 자동 로또를 장수에 맞게 생성한다 -> lottery shop, Lotto
- [ ] 자동 생성된 로또의 번호를 출력한다. -> ResultView
- [ ] 지난주 당첨 번호를 입력한다. -> InputView
- [ ] 로또 당첨 결과를 계산한다. -> Bank..?
- [ ] 수익률을 계산한다. -> Bank..?
- [ ] 당첨 통계를 출력한다. -> ResultView