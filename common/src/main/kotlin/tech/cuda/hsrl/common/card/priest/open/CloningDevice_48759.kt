package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CloningDevice_48759 : Card() {
    override val id = 48759
    override val name = "克隆装置"
    override val description = "从你对手的牌库中<b>发现</b>一张随从牌的复制。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.BoomsdayProject
    override val background = "这下泽里克不用再跟自己抢遥控器了。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7838dca42a37731571a1d93ba40841854984d58361ef3e6a44ed95b941043d87.png"
}
