package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RustswornCultist_56824 : Card() {
    override val id = 56824
    override val name = "锈誓信徒"
    override val description = "<b>战吼：</b>使你的其他随从获得“<b>亡语：</b>召唤一个1/1的恶魔。”"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "锈儿，是你吗锈儿？"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eaf4ecf7814c6cc5e728fc028ce913b4f0a6aed16c99562dba77d4b0bf6db260.png"
}
