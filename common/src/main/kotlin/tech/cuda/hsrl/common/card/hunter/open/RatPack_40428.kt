package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RatPack_40428 : Card() {
    override val id = 40428
    override val name = "瘟疫鼠群"
    override val description = "<b>亡语：</b>召唤若干个1/1的老鼠，数量等同于该随从的攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Msog
    override val background = "四害之首，曾给加基森的卫生安全带来极大的威胁。"
    override val artist = "Ozhill Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f33ccc5c7bc450412299d29b0bdb9c301de779baf2f52542f78730e82c3f6596.png"
}
