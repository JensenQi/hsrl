package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CursedBlade_35025 : Card() {
    override val id = 35025
    override val name = "诅咒之刃"
    override val description = "你的英雄受到的所有伤害效果翻倍。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Loe
    override val background = "诅咒之刃很好地诠释了什么叫作“双刃剑”。"
    override val artist = "Craig Mullins"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb8f8cd48c884bc7b2344c9e637cd7ab8b2f2bf59bb2e371961642781d9a46db.png"
}
