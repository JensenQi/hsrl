package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BazaarMugger_54314 : Card() {
    override val id = 54314
    override val name = "集市恶痞"
    override val description = "<b>突袭</b> <b>战吼：</b>随机将一张另一职业的随从牌置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "金牌恶痞，特惠抢劫。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/57e1a7badfb7de34a2f1d6b4061df850fcde1b55b8ae90849defe90192486c13.png"
}
