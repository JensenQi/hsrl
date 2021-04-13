package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Brawl_69640 : Card() {
    override val id = 69640
    override val name = "绝命乱斗"
    override val description = "随机选择一个随从，消灭除了该随从外的所有其他随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "你知道搏击俱乐部的第一守则吗？"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/00a8ed7f0958ee84325f26b1d4db14ab00f74da3f036a2a342e814af8c96d82b.png"
}
