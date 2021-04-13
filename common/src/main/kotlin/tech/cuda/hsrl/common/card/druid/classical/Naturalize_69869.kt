package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Naturalize_69869 : Card() {
    override val id = 69869
    override val name = "自然平衡"
    override val description = "消灭一个随从，你的对手抽两张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "又一位战死沙场的将士。"
    override val artist = "Leo Che"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/877b1e0575eeef53f40ceb932cacff5384844f99aed79bbe75b72ea8bbfc1fa4.png"
}
