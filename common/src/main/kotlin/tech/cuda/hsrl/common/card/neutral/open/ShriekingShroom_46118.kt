package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShriekingShroom_46118 : Card() {
    override val id = 46118
    override val name = "闪光的蘑菇"
    override val description = "在你的回合结束时，随机召唤一个法力值消耗为（1）的随从。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "他曾经参加过《奔跑吧蘑菇》的海选。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e1fb20c1fdbd836fca6ba238a4146c78192213b2522d81e2ab86fbd867adccb1.png"
}
