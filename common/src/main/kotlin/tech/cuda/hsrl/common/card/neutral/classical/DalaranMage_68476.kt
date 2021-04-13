package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DalaranMage_68476 : Card() {
    override val id = 68476
    override val name = "达拉然法师"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "你肯定没见过达拉然战士。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d6adb1584bc6a268aa1f05ab98ef68a16d4d410ad63d7803edb5f3a9d552e5a3.png"
}
