run-dist:
	@chcp 65001 > nul
	@.\gradlew.bat clean install
	@.\build\install\app\bin\app.bat
