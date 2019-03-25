** Java Utils - utility methods and classes for popular needs **

Use this class if you need to do some operations on Java objects, collections, or if you need to generate objects etc.

* Uses Models Projector(https://github.com/glaures/modelprojector)

* Apache Commonts (https://commons.apache.org/)

* jUnit (https://junit.org/)

---

## Install

Install from source from Bitbucket. This library will be also added to Maven Central soon.

---

## Overview

Library contains some methods to

1. Handle **collections** of elements
2. **Print and stringify** object of any kind.
3. Some object utils e.g. POJO < - > DTO converter.
4. Some additional methods, e.g. **Object Coalesce**, wrapper for **CompletionException**, **array element exists checker** and more


---

## Usage

Code has been splitted for some subclasses as below.

		// example objects (* see classes below):
		
	    Game gameA = null;
        User userA = null;
        Game gameB = new Game("Game 1", "game1", "category 1");
        Game gameC = new Game("Game 2", "game2", "category 2");
        Game gameD = new Game("Game 3", "game3", "category 1");
        Game gameE = new Game("Game 4", "game4", "category 3");
		
		
1. CollectionUtils - methods usefult for handling collections

	a) CollectionUtils::collGroupper<T extends EntityTag, S> Map<S, Set<T>> collGroupper(Collection<T> collection,Collector<? super T, ?, Map<S,Set<T>>> collector)
.

		// group collection of objects by object's method value / by property
		
        Map<String, Set<Game>> grouppedByCategory = CollectionUtils.collGroupper(
                gamesCollection,
                Game::getCategory
        );
	
		// [ result ]
        // {category 3=[Game{name='Game 4', gameTag='game4', category='category 3'}],
        // category 2=[Game{name='Game 2', gameTag='game2', category='category 2'}],
        // category 1=[Game{name='Game 1', gameTag='game1', category='category 1'},
        // Game{name='Game 3', gameTag='game3', category='category 1'}]}
		
	a) <T extends EntityTag, S, R> Map<S, Set<R>> collGroupperFlatter(Collection<T> collection, Function<T,S> objMethodKey, Function<T,R> objMethodValue)
.

		// group collection of objects by object's method value / by property and flat to object value / property
		
        Map<String, Set<String>> gameNameByCategory = CollectionUtils.collGroupperFlatter(
                gamesCollection,
                Game::getCategory,
                Game::getName
        );
		
		// [ result ] {category 3=[Game 4], category 2=[Game 2], category 1=[Game 1, Game 3]}
		
		
2. Now click **Check out in SourceTree**. You may need to create a SourceTree account or log in.
3. When you see the **Clone New** dialog in SourceTree, update the destination path and name if you�d like to and then click **Clone**.
4. Open the directory you just created to see your repository�s files.

