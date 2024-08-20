@echo off
setlocal
for /f "tokens=2 delims=:." %%x in ('chcp') do set _codepage=%%x
chcp 65001>nul
cd C:\Users\jxavi\Desktop\Maicra\MaicraMods\mods\Tin ores\1.21.1 neo\Tin Ores and Crafts\run
"C:\Program Files\Java\jdk-21\bin\java.exe" "@C:\Users\jxavi\Desktop\Maicra\MaicraMods\mods\Tin ores\1.21.1 neo\Tin Ores and Crafts\build\moddev\serverRunClasspath.txt" "@C:\Users\jxavi\Desktop\Maicra\MaicraMods\mods\Tin ores\1.21.1 neo\Tin Ores and Crafts\build\moddev\serverRunVmArgs.txt" "-Dfml.modFolders=tin_ores_and_crafts%%%%C:\Users\jxavi\Desktop\Maicra\MaicraMods\mods\Tin ores\1.21.1 neo\Tin Ores and Crafts\build\classes\java\main;tin_ores_and_crafts%%%%C:\Users\jxavi\Desktop\Maicra\MaicraMods\mods\Tin ores\1.21.1 neo\Tin Ores and Crafts\build\resources\main" net.neoforged.devlaunch.Main "@C:\Users\jxavi\Desktop\Maicra\MaicraMods\mods\Tin ores\1.21.1 neo\Tin Ores and Crafts\build\moddev\serverRunProgramArgs.txt"
if not ERRORLEVEL 0 (  echo Minecraft failed with exit code %ERRORLEVEL%  pause)
chcp %_codepage%>nul
endlocal