package com.example.submissionandroidpemula.data

import com.example.submissionandroidpemula.R

object GamesData {
    private val gameName = arrayOf(
        "Baldur's Gate II: Shadows of AMN",
        "Bioshock",
        "F1 Challenge '99-'02",
        "Grand Theft Auto V",
        "Half Life",
        "Half Life 2",
        "Portal 2",
        "SID MEIER'S Civilization IV",
        "The Elder Scrolls V: Skyrim",
        "The Orange Box",
        "World Soccer Winning Eleven 7 International"
    )

    private val image = intArrayOf(
        R.drawable.baldur_gate_ii,
        R.drawable.bioshock,
        R.drawable.f1,
        R.drawable.gta_v,
        R.drawable.half_life,
        R.drawable.half_life_2,
        R.drawable.portal_2,
        R.drawable.sid_meier,
        R.drawable.skyrim,
        R.drawable.the_orange_box,
        R.drawable.winning_eleven
    )

    private val genre = arrayOf(
        "RPG",
        "Action",
        "Racing",
        "Adventure",
        "Action",
        "Action",
        "Action",
        "Strategy",
        "RPG",
        "Action",
        "Sport"
    )

    private val releaseDate = arrayOf(
        "2000",
        "2007",
        "2003",
        "2015",
        "1998",
        "2004",
        "2011",
        "2005",
        "2011",
        "2007",
        "2004"
    )

    private val detail = arrayOf(
        "An epic continuation of the story that began in \"Baldur's Gate,\" this RPG is set along the southern portion of the Sword Coast, a detailed and rich area of the Forgotten Realms called Amn. It features 300 spells and 130-plus monster types compared to only 130 spells and 60 monster types in Baldur's Gate. [Interplay]",
        "Going beyond \"run and gun corridors,\" \"monster-closet AIs\" and static worlds, BioShock creates a living, unique and unpredictable FPS experience. After your plane crashes into icy uncharted waters, you discover a rusted bathysphere and descend into Rapture, a city hidden beneath the sea. Constructed as an idealistic society for a hand picked group of scientists, artists and industrialists, the idealism is no more. Now the city is littered with corpses, wildly powerful guardians roam the corridors as little girls loot the dead, and genetically mutated citizens ambush you at every turn. Take control of your world by hacking mechanical devices, commandeering security turrets and crafting unique items critical to your very survival. Upgrade your weapons with ionic gels, explosives and toxins to customize them to the enemy and environment. Genetically modify your body through dozens of Plasmid Stations scattered throughout the city, empowering you with fantastic and often grotesque abilities. Explore a living world powered by Ecological A.I., where the inhabitants have interesting and consequential relationships with one another that impact your gameplay experience. Experience truly next generation graphics that vividly illustrate the forlorn art deco city, highlighted by the most detailed and realistic water effects ever developed in a video game. Make meaningful choices and mature decisions, ultimately culminating in the grand question: do you exploit the innocent survivors of Rapture...or save them? [2K Games]",
        "Cutting-edge technology brings you the most accurate representation of Formula One to date. High-resolution car models include details right down to the very last shut line. Circuits include real life structures, helicopters, airplanes, panoramic skies, animated grid girls, motion captured pit crews, and even bumps in the track surface as they exist in reality. The glossy team-themed user interface puts you in the game and tracks your performance as a real life driver competing against the likes of world champion drives such as Damon Hill, Jacques Villeneuve, Mika Hakkinen, and Michael Schumacher. [Electronic Arts]",
        "Los Santos: a sprawling sun-soaked metropolis full of self-help gurus, starlets and fading celebrities, once the envy of the Western world, now struggling to stay alive in a time of economic uncertainty and cheap reality TV. Amidst the turmoil, three very unique criminals plot their own chances of survival and success: Franklin, a street hustler looking for tangible opportunities and serious money; Michael, a professional ex-con whose retirement is less rosy than he figured it would be; and Trevor, a violent dude driven by the opportunity for a cheap high and his next big score. With options at a premium, the crew risks it all in a myriad of daring and dangerous heists that could set them up for life.",
        "Half-Life combines great storytelling in the tradition of Stephen King with intense action and advanced technology to create a frighteningly realistic world where players need to think smart to survive. Half-Life has won more than 50 Game of the Year awards from publications around the world, and was named 'Best PC Game Ever' in PC Gamer's November 1999 issue. [Sierra]",
        "[Metacritic's 2004 PC Game of the Year] By taking the suspense, challenge and visceral charge of the original, and adding startling new realism and responsiveness, Half-Life 2 opens the door to a world where the player's presence affects everything around him, from the physical environment to the behaviors -- even the emotions -- of both friends and enemies. The player again picks up the crowbar of research scientist Gordon Freeman, who finds himself on an alien-infested Earth being picked to the bone, its resources depleted, its populace dwindling. Freeman is thrust into the unenviable role of rescuing the world from the wrong he unleashed back at Black Mesa. And a lot of people -- people he cares about -- are counting on him.",
        "Valve is working on a full-length sequel to its award-winning, mind-bending puzzle action game for the Xbox 360 and PC.",
        "Faster-Paced Fun - Gameplay has been streamlined for a tighter, faster, and more compelling experience.Greater Accessibility and Ease of Play - An easy-to-use interface will be immediately familiar to RTS and action game players, and newcomers to the series will be able to jump in and play. Tech Tree - Flexible Tech tree allows players more strategic choices for developing their civilizations along unique paths. More Civs, Units, and Improvements to enhance and grow your empire. Multiplayer -LAN, Internet, PBEM, and Persistent Turn-Based Server (PTBS) offer players all-new strategies and ways to play when competing or cooperating with live opponents. Team Play - Whether playing multiplayer or single player, team play offers a new way of setting locked alliances that result in shared wonder effects, visibility, unit trading, and shared territory that delivers a plethora of new strategic and tactical options. Civ IV comes to life! - Beautiful 3D world with dozens of fully animated units (including culturally unique units), and totally customizable armies. Cities and wonders will appear on the map. Wonder movies are back! [2K Games]",
        "The next chapter in the Elder Scrolls saga arrives from the Bethesda Game Studios. Skyrim reimagines the open-world fantasy epic, bringing to life a complete virtual world open for you to explore any way you choose. Play any type of character you can imagine, and do whatever you want; the legendary freedom of choice, storytelling, and adventure of The Elder Scrolls is realized like never before. Skyrim's new game engine brings to life a complete virtual world with rolling clouds, rugged mountains, bustling cities, lush fields, and ancient dungeons. Choose from hundreds of weapons, spells, and abilities. The new character system allows you to play any way you want and define yourself through your actions. Battle ancient dragons like you've never seen. As Dragonborn, learn their secrets and harness their power for yourself.",
        "Games included in The Orange Box compilation: The original Half-Life 2 - The player again picks up the crowbar of research scientist Gordon Freeman, who finds himself on an alien-infested Earth being picked to the bone, its resources depleted, its populace dwindling. Freeman is thrust into the unenviable role of rescuing the world from the wrong he unleashed back at Black Mesa. And a lot of people - people he cares about - are counting on him. Half-Life 2: Episode One - The player reprises his role of Dr. Freeman, who must immediately face the repercussions of his actions in City 17 and the Citadel. Freeman reconnects with Alyx Vance and her robot, Dog, as they continue their support of the resistance's battle against the Combine forces. Half-Life 2: Episode Two -- the second installment in Valve's episodic trilogy advances the award-winning story, leading the player to new locations outside of City 17. Portal - a pioneering type of single player action game that rewrites the rules for how players approach and manipulate their environment – much like how Half-Life 2's Gravity Gun reinvented the way gamers interact with objects in the game. Team Fortress 2 - an all-new version of the legendary title that spawned team based multiplayer action games. The game's daring new art style features the most advanced graphics of any Source-based game released to date. [Valve Software]",
        "Winning Eleven 7 International features 100 teams, 21 stadiums, new player models and key additions to the Master League. Winning Eleven 7 also utilizes a custom designed engine that allows for great flexibility and customization. Upon entering a match, players will find incredibly masterful gameplay, beautifully rendered stadiums and picture-perfect player models. While on the field, players will experience true-to-life gameplay, with carefully tuned A.I., realistic pace and balance. [Konami]"
    )

    val listData: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameName.indices) {
                val game = Game()
                game.gameName = gameName[position]
                game.image = image[position]
                game.genre = genre[position]
                game.detail = detail[position]
                game.releaseDate = releaseDate[position]
                list.add(game)
            }
            return list
        }
}