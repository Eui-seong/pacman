
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
		버튼들을 패널에 담고<img width="994" alt="Screenshot 2022-12-06 at 5 22 33 PM" src="https://user-images.githubusercontent.com/98208662/205858425-09654a78-9aba-4c05-8edd-3ba3ddda4826.png">

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
		
		+ 추가적으로 사용자 입력 페이지를 다른 페이지들의 디자인과 유사하게 변경하였다. 
		

	6. 랭킹 페이지 구현 및 시작 페이지와 연동 O
		
		랭킹 페이지는 자바 JFrame을 이용해서 구현하였다. 다른 페이지와 디자인을 맞춰 배경색을 검정 색으로 설정하였다. 
		Rank.csv의 파일의 내용을 불러와 조건문을 이용해서 등수를 비교하여 1등 부터 5등까지 출력하도록 한다 
		랭킹페이지는 등수, 이름, 점수를 보여준다. 

		시작 페이지와 연동하여 랭킹을 다 보고 난 후 "Go Back"버튼을 이용해서 다시 메인 페이지로 이동할 수 있도록 하였다. 
		버튼은 JButton을 상속한 클래스를 이용하여 설계하였다.
	
		
		
		

<h2>결과물</h2>
<h3>1. 메인 페이지(시작 페이지) 구현 및 연동</h3>
StartButton, ExitButton, RankButton 이것들을 담은 AllButton을 MainPage에 배치시켰다.<br>
메인페이지는 이미지를 이용해 백그라운드를 설정하였고, 다른 요소들은 모두 자바 Swing 패키지의 기능을 사용해 만들었다.<br>
각 버튼 기능에 맞게 StartButton을 누르면 캐릭터 선택페이지로 넘어가게 하였고, ExitButton을 누르면 시스템이 종료되도록 하였다.<br> 
RankButton은 Rank 페이지로 연결되도록 설계하였다.
<p>
<div>
	<img height = "250" width="330" alt="Screenshot 2022-12-06 at 5 20 56 PM" src="https://user-images.githubusercontent.com/98208662/205858087-cdc0b6c2-424d-47e4-93fb-6f9dd8842dd1.png">
	<img height = "250" width="330" alt="Screenshot 2022-12-06 at 5 28 47 PM" src="https://user-images.githubusercontent.com/98208662/205859758-5ff3980b-976b-4af0-8d18-a97b1a19b2f4.png">
	<img height = "250" width="330" alt="Screenshot 2022-12-06 at 5 23 24 PM" src="https://user-images.githubusercontent.com/98208662/205858610-d17dc9f5-6cdc-438c-a19d-a9c6dd7acc37.png">
</div>
<hr>

<h3>2. 캐릭터 선택 페이지 구현 및 연동</h3>
캐릭터 선택 페이지는 아래 사진과 같이 3가지의 캐릭터를 선택할 수 있도록 만들었다.<br> 
각 캐릭터 칸은 JButton을 이용해서 만들었으며, 버튼이 눌렸을 때 해당 이미지에 맞는 이미지 객체를 생성한다.<br>
이미지는 기존에 오픈소스를 통해 가져온 팩맨 이미지에서 색을 변경하고 눈 모양을 추가해 변경하였다.<br>
캐릭터 선택 페이지는 게임이 실행되는 페이지와 연동이 되어 있어, 캐릭터가 선택됨과 동시에 게임이 실행되도록 설계하였다.<br>
다음은 캐릭터 선택 페이지 클래스, 이미지 객체가 생성되는 코드, 실제 실행한 결과에 대한 이미지이다.<br> 
<p>
<div>
	<img height = "280" width="330" alt="Screenshot 2022-12-06 at 5 47 31 PM" src="https://user-images.githubusercontent.com/98208662/205864066-2312b370-6ff6-4cff-ba9f-692d586dfe7a.png">
	<img height = "280" width="330" alt="Screenshot 2022-12-06 at 5 48 09 PM" src="https://user-images.githubusercontent.com/98208662/205864108-b97130d7-0537-4c2e-8e5d-f746cd3fd755.png">
	<img height = "280" width="330" alt="Screenshot 2022-12-06 at 5 48 20 PM" src="https://user-images.githubusercontent.com/98208662/205864124-c25503b7-0726-44c4-b14b-82d45a84cb97.png">
</div>
<hr>

<h3>3. 랭킹 페이지, 사용자 입력창 구현 및 연동</h3>
랭킹 페이지는 다른 페이지와 마찬가지로 자바 Swing 패키지의 기능을 이용해 만들었다.<br> 
게임 실행 페이지 클래스 내에 목숨을 나타내는 필드 변수의 값을 확인하고 0이 되었을 때 게임이 종료되었다고 판단한 뒤, 사용자의 닉네임을 입력받는다.<br> 
사용자의 닉네임과 게임의 점수는 "rank.csv"라는 파일에 점수,이름 순으로 입력된다.<br> 
랭킹 페이지가 실행될 때 이 "rank.csv" 파일을 읽어온다. 이 때 "setGetTop5"라는 이름의 메소드를 이용해 GetTop5 2차원 배열에 5명의 데이터가 저장된다.<br> 
이 때 각 줄의 데이터와 점수를 비교하여 정렬된 형태로 변수에 값이 저장된다.<br>
점수 기준 내림차순으로 정렬된 배열의 값을 랭킹 페이지에 출력 되도록 설계하였다.<br> 
랭킹 페이지에는 "GoBack" 버튼을 만들어 랭킹 조회가 끝나면 다시 메인 페이지(시작 페이지)로 돌아갈 수 있도록 하였다.<br> 
다음은 랭킹 페이지, 사용자 입력창, rank.csv파일에 대한 이미지이다.<br>
<p>
<div>
<img height = "300" width="330" alt="Screenshot 2022-12-06 at 6 10 15 PM" src="https://user-images.githubusercontent.com/98208662/205868947-a839ec82-eb18-4a88-abb4-8ed0aaea9f0b.png">
<img height = "300" width="330" alt="Screenshot 2022-12-06 at 6 10 32 PM" src="https://user-images.githubusercontent.com/98208662/205868970-f789c598-9569-4acc-9abe-916997e612ca.png">
<img height = "300" width="330" alt="Screenshot 2022-12-06 at 6 10 45 PM" src="https://user-images.githubusercontent.com/98208662/205868980-f1ad4d02-5cf2-440f-8020-1813a4b319e0.png">
</div>
<hr>

<h3>4. 추가 기능 </h3>
게임이 종료된 후에도 계속해서 게임이 지속될 수 있도록하였다.<br> 
기존에 "S" 키를 눌러 게임을 다시 진행할 수 있던 방식에 'M'을 눌러 메인 페이지로 돌아갈 수 있는 기능을 추가하였다.<br>
게임이 종료되고 사용자 입력을 받으면 "Press s to start or m to main page" 라는 안내 메세지가 표시된다.<br>
KeyAdapter를 상속받은 클래스에서 키의 입력을 검사 받는다 조건문을 이용해 게임 진행중일 때, 게임이 진행중이지 않을 때를 나누었다.<br> 
게임 진행중이 아니라면 키의 입력을 검사하여 "S" 혹은 "s"라면 게임이 다시 시작되도록, "M" 혹은 "m"이라면 메인 페이지로 이동할 수 있도록 설계하였다.<br>
다음은 이와 관련된 기능을 보여주는 이미지다.<br>
<p>
<div>
<img height = "350" width="350" alt="Screenshot 2022-12-06 at 6 16 15 PM" src="https://user-images.githubusercontent.com/98208662/205871001-0c845350-428a-468e-b834-65e8de01c45c.png">
<img height = "350" width="350" alt="Screenshot 2022-12-06 at 6 16 38 PM" src="https://user-images.githubusercontent.com/98208662/205871018-23ebe196-05ef-4964-8a20-48b98eb8ff06.png">
</div>
<hr>

<h3>5. 라이선스 처리</h3>
오픈소스(Github)에서 가져온 코드의 라이선스는 BSD 2-Clause "Simplified" License 임을 확인하였다.<br>
따라서 해당 라이선스의 의무사항들을 확인하였고, 해당 의무사항에 따라서 Github pacman repository 내에 License 파일을 생성하였다.<br>
License 파일은 저작권, 라이선스 사본, 준수조건 및 보증부인에 관한 내용을 포함한다.<br>
코드의 경우 SPDX 방식을 이용해 라이선스를 명시하였다.<br>
타인의 코드를 가져온 경우 원작자의 코드 링크와 수정자를 명시하였고, 우리가 직접 작성한 클래스 혹은 코드는 라이선스와 저작권자만 명시 하였다.<br>
이미지 저작권과 관련된 경우 pacman repository 내의 Readme.md 파일에 출저(링크)를 명시 하였다.<br>
다음은 라이선스 의무사항 확인 페이지, github 내 license 페이지, 코드 내 라이선스 명시에 관한 이미지이다.<br>
<p>
<div>
<img height = "280" width="330" alt="KakaoTalk_Photo_2022-12-06-18-27-41 004" src="https://user-images.githubusercontent.com/98208662/205872706-5edbb0cf-785c-4799-ae75-4aeece997df2.png">
<img height = "280" width="330" alt="KakaoTalk_Photo_2022-12-06-18-27-40 001" src="https://user-images.githubusercontent.com/98208662/205872735-c72f3994-d369-4895-894c-5895699f7889.png">
<img height = "280" width="330" alt="KakaoTalk_Photo_2022-12-06-18-27-41 005" src="https://user-images.githubusercontent.com/98208662/205872787-fff48664-a77a-479c-b50e-a06a9d85ac8d.png">
</div>
<hr>
    
<h3>6. 협업 방식</h3>
프로젝트 주제가 자바 Gui를 이용한 pacman 게임 구현이였기에 JetBrain 사의 Intellij 통합 개발 환경을 사용하였다.<br>
Intellij 내에 편리한 버전관리 기능(Git) 과 Github 연동 기능이 있어서 해당 기능들을 최대한 이용해서 사용하였다.<br>
또한 Github repository 내의 Discussions 탭의 공지, 투표와 같은 기능을 이용하여 의견을 주고받으며 진행 하였다.<br>
다음은 Intellij 내의 Git, Github 사용 관련 이미지와 Github repository Discussions 탭 사용과 관련된 이미지이다.
<p>
<div>
<img width="989" alt="Screenshot 2022-12-06 at 6 36 32 PM" src="https://user-images.githubusercontent.com/98208662/205874622-56fd2aef-b8cd-4968-84c1-6af107c0e429.png">
<img width="1448" alt="Screenshot 2022-12-06 at 6 36 58 PM" src="https://user-images.githubusercontent.com/98208662/205874694-b165f0ed-d872-440c-9f5d-19fedbb67ecc.png">
</div>

