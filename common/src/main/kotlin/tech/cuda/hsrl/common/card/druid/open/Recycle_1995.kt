package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Recycle_1995 : Card() {
    override val id = 1995
    override val name = "回收"
    override val description = "将一个敌方随从洗入你对手的 牌库。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Gvg
    override val background = "请为环保事业尽一份力，把塑料垃圾放在一个垃圾箱内，把敌方随从的尸体放在另一个垃圾箱内。"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/04ff1498960898fd85924037ea8e9c1b765f071bb8101be2576c26d8478f0c6e.png"
}
