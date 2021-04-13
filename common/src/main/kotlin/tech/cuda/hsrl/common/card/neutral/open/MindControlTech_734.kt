package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MindControlTech_734 : Card() {
    override val id = 734
    override val name = "精神控制技师"
    override val description = "<b>战吼：</b>如果你的对手拥有4个或者更多随从，随机获得其中一个的控制权。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "精神控制技术正在日益改善，但这并不能说明什么。"
    override val artist = "Leo Che"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e75d4fe06c2de6ca726fc60c024a3f2c629b23210af29853723e475157b1069a.png"
}
