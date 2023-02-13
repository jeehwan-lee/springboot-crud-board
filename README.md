# springboot-crud-board
> 웹 페이지의 기본적인 기능인 CRUD와 로그인, 회원가입 기능을 갖춘 게시판 프로젝트입니다.

## 목차

- [들어가며](#들어가며)

  - [프로젝트 소개](#1-프로젝트-소개)
  
  - [프로젝트 기능](#2-프로젝트-기능)
  
  - [사용기술](#3-사용기술)
  
    - 백엔드
    
    - 프론트엔드
    
  - [실행화면](#4-실행화면)
  
- [구조 및 설계](#구조-및-설계)

  - [DB 설계](#1-db-설계)
  
  - [API 설계](#2-api-설계)
  
- [추후 업데이트](#추후-업데이트)

- [후기](#후기)


## 들어가며
### 1. 프로젝트 소개

이 프로젝트는 CRUD와 로그인, 회원가입 기능을 갖춘 기본적인 게시판을 구현한 프로젝트로 

SpringBoot를 공부하고 실습해보기 위해 시작하였습니다.

프로젝트의 전체 진행과정은 [게시판 만들기](https://jeehwan94.tistory.com/20)를 통해 확인할 수 있습니다.

### 2. 프로젝트 기능

프로젝트의 기능은 다음과 같습니다.

- 게시판 : CRUD 기능, 게시글 상세 정보(제목, 내용, 날짜, 글쓴이, 댓글) 표시, 페이징 처리

- 사용자 : 회원가입 및 로그인, 회원가입 시 유효성 및 중복 검사

- 댓글 : crud 기능, 댓글 상세 정보(날짜, 글쓴이) 표시

### 3. 사용기술

- 프론트엔드
 
  - HTML
  
  - Thymeleaf
  
  - Javascript
  
  - Bootstrap
  
- 백엔드

  - 프레임워크 및 라이브러리
  
    - JAVA 17
    
    - SpringBoot
    
    - Spring Data JPA
    
    - Spring Security
    
    - Spring Boot DevTools
    
    - Lombok
    
    - Spring Web
    
  - 빌드도구
  
    - Maven
    
  - 데이터베이스
  
    - MySQL
  
    
### 4. 실행화면


## 구조 및 설계

### 1. DB 설계

### 2. API 설계

- 게시글 관련 API

|기능|Method|URL|return page|
|---|---|---|---|
|게시글 전체 조회|GET|/|게시글 전체 페이지|
|게시글 전체 조회|GET|/question/list|게시글 전체 페이지|
|게시글 상세|GET|/question/detail/{id}|게시글 상세 페이지|
|게시글 등록 페이지 이동|GET|/question/create|게시글 등록 페이지|
|게시글 등록|POST|/question/create|게시글 전체 페이지|
|게시글 수정 페이지 이동|GET|/question/modify/{id}|게시글 수정 페이지|
|게시글 수정|POST|/question/modify/{id}|게시글 상세 페이지|
|게시글 삭제|GET|/question/delete/{id}|게시글 전체 페이지|


- 회원 관련 API

|기능|Method|URL|return page|
|---|---|---|---|
|회원가입 페이지 이동|GET|/user/signup|회원가입 페이지|
|회원가입|POST|/user/signup|메인 페이지|
|로그인 페이지 이동|GET|/user/login|로그인 페이지|
|로그인|POST|/user/login|메인 페이지|
|로그아웃|POST|/user/logout|메인 페이지|



- 댓글 관련 API

|기능|Method|URL|return page|
|---|---|---|---|
|답변 등록|POST|/answer/create/{id}|게시글 상세 페이지|
|답변 수정 페이지 이동|GET|/answer/modify/{id}|답변 수정 페이지|
|답변 수정|POST|/answer/modify/{id}|게시글 상세 페이지|
|답변 삭제|GET|/answer/delete/{id}|게시글 상세 페이지|


## 추후 업데이트

### 1. Service 수정 필요

UserService, QuestionService 및 AnswerService 의 getUser와 getQuestion, getAnswer 메서드를 통해 

user와 question, answer 을 가져올때 Optional 을 통해서 값을 찾지 못했을 경우 예외처리 필요

예시)

```
package com.crud.service;
...
@Service
public class UserService {

	...
  
	public User getUser(String username) {
		Optional<User> user = userRepository.findByusername(username);
		// user를 못찾을 경우 예외처리 필요
		return user.get();
	}
}

```

### 2. 메인 페이지의 게시글 제목 옆 답변 개수 표시 기능


### 3. 게시글 검색 기능 구현

메인 페이지에서 게시글 리스트를 보여주는것 외에 게시글을 검색할 수 있는 기능 필요


### 4. 회원정보 수정 및 탈퇴 기능 필요

로그인이 되어있을 경우 각 회원들이 접속할 수 있는 회원정보를 수정 및 탈퇴 페이지를 만들고

해당 페이지에서 회원정보 수정 및 탈퇴 기능 구현이 필요


## 후기

프로젝트 소개에서도 이야기한것처럼 이 프로젝트는 SpringBoot를 공부하면서 웹 페이지와 서버의 기본적인 기능인

CRUD와 로그인, 회원가입 기능을 구현해보기 위해 시작한 프로젝트입니다.

이전에 React.js와 node.js 그리고 MongoDB를 사용한 MERN STACT으로 개발해서 간단한 블로그를 만든적이 있는데

이번에는 Spring으로 프로젝트의 전반적인 구성과 사용법을 알아보고 Spring에서 제공하는 다양한 라이브러리를 사용해보는것이 목표였습니다.

Spring Data JPA와 Spring Security는 MERN STACK과는 다르게 라이브러리에서 제공하는 기능이 다양하기 때문에

여러 서적과 인터넷 검색을 통해 기능들을 찾아보았으며, 이번 프로젝트가 끝난후에 따로 공부를 해야할 필요성을 느꼈습니다.

특히 Spring Data JPA는 각각의 객체를 테이블로 매핑시킨다는점이 인상적이었으며, 

Spring Security의 경우 Thymeleaf와 같이 공부를 하면 좋겠다는 생각을 했습니다.

앞으로의 공부방향은 

1. JPA와 Spring Data JPA

2. Thymeleaf 기본 기능

3. Spring Security 

위와 같은 순서로 공부를 하고 다시 한번 SpringBoot를 활용한 게시판 프로젝트를 만들어보려고 합니다.

감사합니다.

