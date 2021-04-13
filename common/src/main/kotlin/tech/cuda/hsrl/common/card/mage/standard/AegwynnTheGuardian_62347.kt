package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AegwynnTheGuardian_62347 : Card() {
    override val id = 62347
    override val name = "守护者艾格文"
    override val description = "<b>法术伤害+2</b>，<b>亡语：</b>你抽到的下一张随从牌会继承这些能力。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "她是麦迪文的母亲，所以无论你做出什么坏事，她都不会对你感到失望。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/53fc702fca4d15c7f2dfb265238ad9ed0e4bf710434184f7ee010d108dfb656c.png"
}
