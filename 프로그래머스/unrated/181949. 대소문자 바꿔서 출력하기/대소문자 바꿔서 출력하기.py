str = input()

def solution(STRING):
    a = len(str)  ##len => 문자열의 길이 반환
    answer = ''
    for i in range(a): ##a만큼 i를 반복
        if str[i].isupper() == True:   ## upper() => 대문자로 바꿈, lower() => 소문자로 바꿈
            answer += str[i].lower()   ##isupper(), islower() => 대문자인지 소문자인지 확인(T,F)

        else:
            answer += str[i].upper()
    return answer

print(solution(str))
            
