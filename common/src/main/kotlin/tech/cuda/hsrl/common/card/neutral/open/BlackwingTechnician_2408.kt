package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlackwingTechnician_2408 : Card() {
    override val id = 2408
    override val name = "黑翼技师"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "黑翼技师不仅承担所有黑翼之巢的机械维护工作，还会为成为会员的龙进行推拿和按摩。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e5650b23f85fc119d95c8104e79f40a93638a98acf86f19030e0f5aa78b08bb2.png"
}
