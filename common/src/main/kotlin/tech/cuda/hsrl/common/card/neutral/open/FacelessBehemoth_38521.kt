package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FacelessBehemoth_38521 : Card() {
    override val id = 38521
    override val name = "无面巨兽"
    override val description = ""
    override var cost: Int? = 10
    override var health: Int? = 10
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "无面巨兽打哈欠时犹如黑洞般吞噬周围的一切。所以当你看到它伸懒腰时，就赶紧跑吧！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/852f348f1f8a2d3ea6c0783d98c99fc3d75d59160960abc7f1b1217a7417e76a.png"
}
