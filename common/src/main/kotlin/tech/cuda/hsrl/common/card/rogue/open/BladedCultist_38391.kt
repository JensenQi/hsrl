package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BladedCultist_38391 : Card() {
    override val id = 38391
    override val name = "执刃教徒"
    override val description = "<b>连击：</b>获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Wotog
    override val background = "别以为普通教徒没什么战斗力，尝尝我手中的利刃吧！"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/51ddde68483086af07add36837455115845753c77cb09402ceaeaca76ffcfb59.png"
}
