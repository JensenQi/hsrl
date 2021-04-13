package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostwolfWarlord_496 : Card() {
    override val id = 496
    override val name = "霜狼督军"
    override val description = "<b>战吼：</b>战场上每有一个其他友方随从，便获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "为了争夺奥克兰特山谷的控制权，霜狼氏族和雷矛探险队打得不可开交。任何前来企图进行和平谈判的斡旋者都会被处死。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee30caa6599d8c28aba7e2c96aa722999f236a7a43d24e02990692aec67f9850.png"
}
