11/23 

* 코드 진행상황
	1. 메인 페이지(시작 페이지) 구현 및 연동 O 

		* JButton

		시작 버튼: StartButton.java (extends JButton)
		구성: startButton.PNG

		나가기 버튼: ExitButton.java (extends JButton)
		구성: exitbutton.PNG

		순위 버튼: RankButton.java (extends JButton)
		구성: rankbutton.PNG

		* JPanel

		모든 버튼을 담는 패널: AllButton.java (extends JPanel)
		구성:StartButton, ExitButton , RankButton

		* JFrame
		메인 페이지 프레임 : MainPage.java (extends JFrame)
		구성: AllButton , mainpage.PNG

		시작 버튼과 나가기 버튼, 순위 버튼을 JButton 으로 만들어서
		각각의 이미지를 찾아서 버튼에 입혔다.
		버튼들을 패널에 담고
		메인 페이지 프레임에 메인 페이지 이미지와 패널을 넣어서
		메인 페이지를 만들었다. 


	3. 캐릭터 페이지 구현 O 
	4. 캐릭터 페이지 버튼 AcitionPerforemd 메소드 완성 X
	5. 게임 종료 후 사용자 정보 입력 받는 기능 구현 X
	6. 랭킹 페이지 구현 및 시작 페이지와 연동 X

	
* 오픈소스 코드 라이선스 확인 및 라이선스 파일 생성(저작권자 표시)

	사용 라이선스 : 2-clause BSD license (BSD-2-Clause)
	주요특징 및 배포시 의무사항 : 재배포시 저작권 표시, 준수조건 및 보증부인에 대한 고지사항을 소스코드 또는 문서 및 기타자료에 포함시킬 것

	1. Pacman, Board 소스코드 파일 내 원본파일, 원본파일 저작권자 고지, Attribution 고지.<br>
		 ->  포함하는 내용 : 코드 원본 저작자 연도, 이름, 코드 주소 / 사용 라이선스 / 수정자 
		 
	2. Image 출처 관련된 내용은 Readme.md 파일에 명시.
	3. Github repository에 라이선스 파일 생성 
