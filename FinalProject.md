
<h2>11/23</h2> 

	코드 진행상황
	
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

 		* Frame 
		캐릭터 페이지 프레임: CharacterPage.java(extends JFrame)

		메인 페이지에서 스타트 버튼을 누르면 캐릭터 선택 페이지가 뜬다. 캐릭터 페이지는 다음과 같이 구현했다.
		먼저 컨테이너를 만들고 GridBagLayout을 이용해 패널을 배치한다. 컨테이너는 세 개의 구역으로 나누어 진다.
		첫 번째 구역은 paintComponent를 이용하여 ‘PACMAN FRIENDS’라는 제목을 그린 패널을 갖고 있다.
		두 번째 구역엔 버튼 세 개가 포함된 패널이 들어간다.
		버튼 위에 이미지를 추가해 사용자가 다른 세 종류의 캐릭터 중 하나를 골라 플레이 할 수 있게 한다.
		세 번째 구역엔 캐릭터를 선택하라는 메시지가 담긴 라벨을 담은 패널을 넣는다.


	4. 캐릭터 페이지 버튼 AcitionPerforemd 메소드 완성 X
	5. 게임 종료 후 사용자 정보 입력 받는 기능 구현 X
	6. 랭킹 페이지 구현 및 시작 페이지와 연동 X

	----------------------------------------------------------------------------------	

	* 오픈소스 코드 라이선스 확인 및 라이선스 파일 생성(저작권자 표시)

		사용 라이선스 : 2-clause BSD license (BSD-2-Clause)
		주요특징 및 배포시 의무사항 : 재배포시 저작권 표시, 준수조건 및 보증부인에 대한 고지사항을 소스코드 또는 문서 및 기타자료에 포함시킬 것

		1. Pacman, Board 소스코드 파일 내 원본파일, 원본파일 저작권자 고지, Attribution 고지.<br>
			 ->  포함하는 내용 : 코드 원본 저작자 연도, 이름, 코드 주소 / 사용 라이선스 / 수정자 

		2. Image 출처 관련된 내용은 Readme.md 파일에 명시.
		3. Github repository에 라이선스 파일 생성 
		
		
		
		
		
<h2>11/30</h2> 

	4. 캐릭터 페이지 버튼 AcitionPerforemd 메소드 완성 O
	
		캐릭터 버튼 acctionPerformed() 메소드에는 선택한 캐릭터로 게임이 실행되는 코드가 구현되어 있다. 
		
		<Pacman>클래스에 선택한 캐릭터에 해당하는 인자를 전달해주어 <Board>클래스에서 해당 캐릭터에 대한 loadimage() 메소드가 사용되게 한다. 			
		start()메소드를 이용하여 선택한 캐릭터로 게임을 시작한다. 
		
		Board() 객체 생성 메소드에서 <Pacman>클래스를 통해 받은 캐릭터 인자에 따라 다른 loadimage_y(), loadimage_b(), loadimage_r() 메소드가 사용된다. 
		Loadimage() 메소드는 해당 캐릭터의 이미지를 아이콘화 하여 변수에 저장하는 역할을 한다.
		

	5. 게임 종료 후 사용자 정보 입력 받는 기능 구현 O
		
		게임 종료를 확인하는 메소드인 death()에 목숨이 0이 되었을 때 자바 스윙 패키지 기능을 이용해서 사용자 입력을 받아 변수에 지정하도록 설계하였다. 
		변수에 입력된 사용자 이름과 전역변수로 선언된 점수 변수의 값을 Rank.csv 파일에 점수, 사용자 이름 순으로 입력한다. 
		FileWriter를 이용하며 append 파라미터를 true로 설정해 파일을 이어서 작성하도록 하였다.
		

	6. 랭킹 페이지 구현 및 시작 페이지와 연동 O
		
		랭킹 페이지는 자바 JFrame을 이용해서 구현하였다. 다른 페이지와 디자인을 맞춰 배경색을 검정 색으로 설정하였다. 
		Rank.csv의 파일의 내용을 불러와 조건문을 이용해서 등수를 비교하여 1등 부터 5등까지 출력하도록 한다 
		랭킹페이지는 등수, 이름, 점수를 보여준다. 

		시작 페이지와 연동하여 랭킹을 다 보고 난 후 "Go Back"버튼을 이용해서 다시 메인 페이지로 이동할 수 있도록 하였다. 
		버튼은 JButton을 상속한 클래스를 이용하여 설계하였다.
	
		
		
		
	
