Êþº¾   4   demo/Amazon_TC  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ldemo/Amazon_TC; main ([Ljava/lang/String;)V 
Exceptions  java/lang/InterruptedException
    )io/github/bonigarcia/wdm/WebDriverManager   chromedriver -()Lio/github/bonigarcia/wdm/WebDriverManager;
     setup  (org/openqa/selenium/chrome/ChromeOptions
  	   java/lang/String " --remote-allow-origins=*
  $ % & addArguments C([Ljava/lang/String;)Lorg/openqa/selenium/chromium/ChromiumOptions; ( 'org/openqa/selenium/chrome/ChromeDriver
 ' *  + -(Lorg/openqa/selenium/chrome/ChromeOptions;)V
 ' - . / manage )()Lorg/openqa/selenium/WebDriver$Options; 1 3 2 %org/openqa/selenium/WebDriver$Options 4 5 timeouts *()Lorg/openqa/selenium/WebDriver$Timeouts;       	 9 ; : java/util/concurrent/TimeUnit < = SECONDS Ljava/util/concurrent/TimeUnit; ? A @ &org/openqa/selenium/WebDriver$Timeouts B C implicitlyWait J(JLjava/util/concurrent/TimeUnit;)Lorg/openqa/selenium/WebDriver$Timeouts; E https://www.google.com/
 ' G H I get (Ljava/lang/String;)V K q
 M O N org/openqa/selenium/By P Q name ,(Ljava/lang/String;)Lorg/openqa/selenium/By;
 ' S T U findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; W java/lang/CharSequence Y java/lang/StringBuilder [ amazon
 X ]  I	 _ a ` org/openqa/selenium/Keys b c ENTER Lorg/openqa/selenium/Keys;
 X e f g append -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 X i j k toString ()Ljava/lang/String; m o n org/openqa/selenium/WebElement p q sendKeys ([Ljava/lang/CharSequence;)V      ¸
 u w v java/lang/Thread x y sleep (J)V { (//span[@role='text'])[1]
 M } ~ Q xpath	    java/lang/System   out Ljava/io/PrintStream;
    java/io/PrintStream   println (Ljava/lang/Object;)V
 '    close args [Ljava/lang/String; driver )Lorg/openqa/selenium/chrome/ChromeDriver; options *Lorg/openqa/selenium/chrome/ChromeOptions; 	textEmail  Lorg/openqa/selenium/WebElement; 
SourceFile Amazon_TC.java InnerClasses  org/openqa/selenium/WebDriver Options Timeouts !               /     *· ±    
                    	                 ¸ ¶ » Y· M,½ Y!S¶ #W» 'Y,· )L+¶ ,¹ 0  6² 8¹ > W+D¶ F+J¸ L¶ R½ VY» XYZ· \² ^¶ d¶ hS¹ l  r¸ t+z¸ |¶ RN r¸ t² -¶ +¶ ±    
   6           %  :  @  g  m ! w " } $  %  '    *         % d     {    w                1  	 ?  	