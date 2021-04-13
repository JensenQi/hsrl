package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorruptedSeer_38545 : Card() {
    override val id = 38545
    override val name = "腐化先知"
    override val description = "<b>战吼：</b>对所有非鱼人随从造成2点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "对于先知而言，水晶球长在脑袋上真是太方便了。"
    override val artist = "Ryan Metcalf"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c02b2a7bdd05a7a657283b31115c3959c9da1e8decbaa0fc81481671a1fc5fd.png"
}
