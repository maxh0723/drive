#!/bin/bash

case "$1" in
	clean)
		rm -rf *.class
		echo "Project cleaned"
		;;
	build)
		for i in `ls -1 *.java`
		do
			javac -cp .:lib/BreezySwing.jar $i
		done
		if [ $? == 0 ]; then
  			 echo "Compilation complete."
		fi
		;;
	run)
		java -cp .:lib/BreezySwing.jar GUI
		;;
	*)
		$0 build
		;;
esac

