package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BreathOfTheInfinite_54898 : Card() {
    override val id = 54898
    override val name = "永恒吐息"
    override val description = "对所有随从造成 2点伤害。如果你的手牌中有龙牌，则只对敌方随从造成伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "又名“循环换气法”。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5560b7a7ec919dfb7b5bc40c5a196e78a053a4ec71f3b51438421013fa1b1ff9.png"
}
