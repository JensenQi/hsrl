package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GangUp_2304 : Card() {
    override val id = 2304
    override val name = "夜幕奇袭"
    override val description = "选择一个随从。将该随从的三张复制洗入你的牌库。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Brm
    override val background = "如果你想要拜访月溪镇，最好别太张扬。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b2fcbfaaa3c9d35bc24e1be65f6330260adcff895b3fc364f365124e34713e7.png"
}
