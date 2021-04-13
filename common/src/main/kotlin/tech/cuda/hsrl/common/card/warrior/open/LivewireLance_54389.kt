package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LivewireLance_54389 : Card() {
    override val id = 54389
    override val name = "电缆长枪"
    override val description = "在你的英雄攻击后，将一张<b>跟班</b>牌置入你的 手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "这柄长枪很重，但其实是电池组占据了大部分重量。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/672172e4601c4a8b4cb5c173abad97a5f65b2d1910d6b55567a35795cf65f5e4.png"
}
