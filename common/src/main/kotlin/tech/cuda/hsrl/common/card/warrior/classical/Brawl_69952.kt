package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Brawl_69952 : Card() {
    override val id = 69952
    override val name = "绝命乱斗"
    override val description = "随机选择一个随从，消灭除了该随从外的所有其他随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "你知道搏击俱乐部的第一守则吗？"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1b70f2e5cc41d4453d85ed9573076a1912c9bd3b611a3409748906c40777011c.png"
}
