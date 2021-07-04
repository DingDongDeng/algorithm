# 설명
알고리즘 사이트들의 문제 풀며, 다른 참여자들간의 피드백

## 프로젝트 스펙
 * java 11
 * Gradle 기반 멀티모듈 프로젝트
 * gradle 6.8.3
 * JUnit 5.7.2
 * lombok
 
 
## 참여하기
 * 참여자는 master 브렌치 베이스의 {참여자명} 브렌치를 생성
 * 풀고자 하는 알고리즘 문제는 새 브렌치를 생성   
 user/{참여자명}-{서비스명}-{문제번호}
 * 작성 후, user/{참여자명} 브렌치에 MR
 * 다른 참여자들은 해당 MR에 댓글을 통해 피드백을 남길 수 있음
 * MR은 매주 일요일까지 생성
 * 다른 사람의 MR 피드백은 매주 수요일까지 작성
 * 자신의 MR은 매주 수요일 merge(다른 참여자가 approve 해줘야 MR 가능)
 
>ex)
>   
> ````
>  
> //레포지토리 clone
> git clone https://github.com/DingDongDeng/algorithm.git
> 
> //참여자 브렌치 생성
> git checkout master   
> git checkout -b user/홍길동
> 
> //풀고자 하는 문제 브렌치 생성
> git checkout -b user/홍길동-leetcode-001
> 
> //코드 푸시
> git push
> 
> //MR 생성하기 (일요일까지)
> https://github.com/DingDongDeng/algorithm로 이동
> 내가 작업한 user/홍길동-leetcode-001 브렌를 선택
> user/홍길동 브렌치로 MR를 생성 
> 
> //MR merge하기 (수요일까지)
> 다른 사람들의 피드백을 확인 후 merge
> 
> ## 브렌치 룰
> master : 관리자만 접근 가능
> user/참여자 : MR로만 머지 가능
> ````
