# 🍸 ShakeNMatch - Alchomist

#### 안녕하세요. Alchomist 백엔드 팀입니다. 의욕 넘치게 진행됐던 개발 진행과정에서의 경험을 공유합니다. 
#### `온라인 칵테일 바`에 개인 냉장고를 곁들인 우리만의 'Bar' `ShakeNMatch`에 들러 주세요.

[Alchomist의 ShakeNMatch 전체 노션](https://www.notion.so/backend-devcourse/15-ShakeNMatch-928321ccc30f45aa828a57c1a6ac0671)

[Alchomist의 프론트 팀 Repository 구경하기](https://github.com/prgrms-web-devcourse/Team_Alchomist_ShakeNMatch_FE)

​	<br>

## 👨‍👦‍👦 팀원 소개

|                            나상원                            |                            박상순                            |                            오재욱                            |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
| ![[15조/백]나상원의 프로필 사진](https://ca.slack-edge.com/T02MP8VA5B7-U02MYNFUYLB-1418423d898f-512) | ![[15조/백엔드]박상순의 프로필 사진](https://ca.slack-edge.com/T02MP8VA5B7-U02MYP30HV1-96a6f7964b83-512) | ![[1기-P]오재욱의 프로필 사진](https://ca.slack-edge.com/T0222P65KHN-U029F6GF7JN-a19ae63656cb-512) |
|                            개발자                            |                            개발자                            |                            개발자                            |

<br>

## 📜 프로젝트 선정 배경

- 코로나19 팬데믹 이후 개인의 활동 반경은 급격하게 줄고, '사회적 거리두기'를 통해 외출을 자제하는 분위기가 사회 전반에 확대되면서 `혼술(혼자서 술을 마시는)` 문화가 대중화됩니다.
- 이후에 `홈텐딩(집 + 바텐딩)`에 대한 수요가 높아지면서 `온라인 칵테일 바 ShakeNMatch`를 개발하게 되었습니다.

<br>

## 🍹 프로젝트 소개

- 주제

  - 온라인 칵테일 바에 개인 냉장고를 곁들인 웹 서비스 프로그램 `ShakeNMatch`

- 배포 주소(현재 

  - [https://shakenmatch.vercel.app](https://shakenmatch.vercel.app/)

- 맞춤별 추천 시스템 

  - 날씨, 기분, 색상, 음악, MBTI에 따른 테마 별 칵테일을 추천해 줍니다.
  - 보유한 재료에 따라 알맞은 칵테일을 추천해 줍니다.
  - 만약 재료가 부족하다면 재료를 구매할 수 있도록 합니다.

- 기대 효과

  - 칵테일 정보에 접근하기 위해 투자해야 하는 수고로움을 덜어 주고, 

    맞춤 별 추천 시스템으로 칵테일에 대한 진입 장벽을 낮추고자 합니다

- 기능

  - 회원과 비회원 간 이용 서비스 차별화
    - 회원은 🧔, 비회원은 👨‍🦳
  - 사용자
    - OAuth를 통해 회원 인증 관리 (🧔)

  - 칵테일 
    - 원하는 칵테일만 빠르게 조회 가능하게 칵테일 즐겨찾기 기능 (🧔)
    - 특정 칵테일 클릭 시, 칵테일 상세 정보와 칵테일 주조를 위한 재료 목록 조회 (🧔, 👨‍🦳)
    - 칵테일 재료 구매 중개 기능 (🧔, 👨‍🦳)

  - 테마 
    - 테마별 칵테일 추천 가능 MBTI, WEATHER, MOOD 등등 (🧔, 👨‍🦳)
  - 술장고(술+냉장고) 기능 
    - 회원이 현재 가지고 있는 재료로 주조할 수 있는 칵테일 추천 기능 (🧔)
  - 리뷰 
    - 칵테일에 대한 리뷰 작성 가능하고, 리뷰 사진 업로드 시 S3 버킷/DB에 자동 저장 (🧔)

<BR>

## 💻 기술 스택

- 개발 환경
  - IDE: IntelliJ
  - 개발언어: Java 16
  - 프레임워크: SpringBoot 2.5.6
  - 영속성 프레임워크: JPA
  - 빌드도구: Maven
  - 데이터베이스: MySQL
  - 서버 및 CI/CD: Github Action, AWS EC2, S3, Docker
- 협업 관리
  - 이슈 관리: Jira
  - 문서화: Notion
  - 커뮤니케이션: Slack, Gather Town

![img](https://lh5.googleusercontent.com/uM-f6XtwsMBoCFzKEmIsll0fCEE9qlLN0tDHk314VoLnffVewCkRqGaJjiPqnRDQF9RH2DuD64V4yfo7I-JVWvHz4yyX59gIie7UBq7_tJVQhoG0SDP9sm2hEL-Rz2ufh38SFCOl8ysa)

![img](https://lh3.googleusercontent.com/mxm22pnzuF-4d78-TtuN_daIVxVfpCq4624URpsMZ6oyDLVay9ER35oCaspbnE9fOYfwhOkwHvria4RLjzv85aOD5O5WH4h1jJuG3ajRMl7DdwYbCNb7LiSsMcHjjanNftOG53shlEOa)

<BR>

## 🌎 API 설계

- [ShakeNMatch 의 API 명세서](https://www.notion.so/backend-devcourse/API-16d7cecd36174088b5ca4f19c739b6ba)

<BR>

## 🎁 프로젝트 패키지

![img](https://lh4.googleusercontent.com/bal0xcRFp7Dn7yglDYfMOIxhe67esOJuTMy-uy-HaLHJrvhXB8j9KEl0bwXuqKQathlHmSw0XooM2XwkB2kmQrJ0SeTOg4Mr40xLiF1JSrm5wuBudBtVMZgAd4YwavNSETZPM5aPBV58)

<BR>

## 🗂 DB 설계

![img](https://lh3.googleusercontent.com/fddyk2SbuqDQQxMCW6jOoFHSNfgmYFI27tWKjXFhJrVOjsRwuEU6cRVc514oRdgKRVP2Zp02B-fZPIQ-kEaj63R-ucHDZLUdJmgvxwiaTnbBmuIbUGCyfRLQgF0HPVkrJYXdkETtiwGl)
