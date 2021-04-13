package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SkeramCultist_39118 : Card() {
    override val id = 39118
    override val name = "斯克拉姆狂热者"
    override val description = "<b>战吼：</b> 使你的克苏恩 获得+2/+2<i>（无论它在哪里）。</i>"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "每一位加入教派的新人，都必须接受克苏恩的一整套职前培训（洗脑）课程。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/80db3730bc06fcf53da8f4e9770fa207ce90402c772c9ca4a671ce4faf6c4cbf.png"
}
