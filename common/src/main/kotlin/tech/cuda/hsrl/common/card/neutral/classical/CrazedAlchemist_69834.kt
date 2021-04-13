package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrazedAlchemist_69834 : Card() {
    override val id = 69834
    override val name = "疯狂的炼金师"
    override val description = "<b>战吼：</b> 使一个随从的攻击力和生命值互换。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“你一定会喜欢我的新配方的！”他总是这么说...特别是当你对你现在的触手数量不满意的时候。"
    override val artist = "Tom Fleming"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b0dd3fb2d78b6b2f54accdeee63eceef3bc16166ac99655316337b02e6a71215.png"
}
