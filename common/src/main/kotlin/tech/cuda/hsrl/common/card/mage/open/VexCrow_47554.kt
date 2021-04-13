package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VexCrow_47554 : Card() {
    override val id = 47554
    override val name = "三眼乌鸦"
    override val description = "每当你施放一个法术，随机召唤一个法力值消耗为（2）的 随从。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.TheWitchwood
    override val background = "它能帮你从昏迷中苏醒，还能教你飞。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4b319e02f31cdf53db03a28e827095d9106cd4fef883afeb9002ca430ad1986a.png"
}
