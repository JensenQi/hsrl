package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FallenSunCleric_42777 : Card() {
    override val id = 42777
    override val name = "堕落残阳祭司"
    override val description = "<b>战吼：</b>使一个友方随从获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "破碎残阳祭司堕落后身材也瘦了一圈。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4722711ed0d7723fa04aa0252dd37c27935de2e91c286bd47ee24d32cd61db9f.png"
}
