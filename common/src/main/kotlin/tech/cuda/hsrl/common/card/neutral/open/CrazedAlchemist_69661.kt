package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrazedAlchemist_69661 : Card() {
    override val id = 69661
    override val name = "疯狂的炼金师"
    override val description = "<b>战吼：</b> 使一个随从的攻击力和生命值互换。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "“你一定会喜欢我的新配方的！”他总是这么说...特别是当你对你现在的触手数量不满意的时候。"
    override val artist = "Tom Fleming"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6f750a5d422128480627ca45e94d994cb3690299c0fd0d0b58a2f8e33cf3d26e.png"
}
