����   = U  &LibraryManagement/LibraryUserInterface  java/lang/Object scanner Ljava/util/Scanner; <init> ()V Code
      java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     LineNumberTable LocalVariableTable this (LLibraryManagement/LibraryUserInterface; getUserChoice ()I	    ! " out Ljava/io/PrintStream; $ 
Choose an operation:
 & ( ' java/io/PrintStream ) * println (Ljava/lang/String;)V , 1: Add book . 2: Remove book 0 3: Get book details 2 4: Display all books 4 5: Check library size 6 6: Check if library is empty 8 7: Exit
  : ;  nextInt 	getBookId > Enter book ID: 
 & @ A * print getBookTitle ()Ljava/lang/String; E Enter book title: 
  G H C nextLine getBookAuthor K Enter book author:  getIndex N Enter index:  closeScanner
  Q R  close 
SourceFile LibraryUserInterface.java !                	   E     *� 
*� Y� � � �             	  
                 	   �     H� #� %� +� %� -� %� /� %� 1� %� 3� %� 5� %� 7� %*� � 9�       & 	             (  0  8  @         H      <   	   >     � =� ?*� � 9�       
                    B C  	   J     � D� ?*� � FW*� � F�                !              I C  	   >     � J� ?*� � F�       
    %  &              L   	   >     � M� ?*� � 9�       
    *  +              O   	   6     *� � P�       
    /  0              S    T