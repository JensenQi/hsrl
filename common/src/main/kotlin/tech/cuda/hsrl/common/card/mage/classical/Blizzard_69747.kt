package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Blizzard_69747 : Card() {
    override val id = 69747
    override val name = "暴风雪"
    override val description = "对所有敌方随从造成 2点伤害，并使其<b>冻结</b>。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "这不只是一张卡牌，更是一张招牌。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/186b40c3681dfc2b4a688e285df10f16868542cb95371538af1dfb09dc660491.png"
}
