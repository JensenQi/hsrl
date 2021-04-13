package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Kodorider_2598 : Card() {
    override val id = 2598
    override val name = "科多兽骑手"
    override val description = "<b>激励：</b>召唤一个3/5的作战科多兽。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "有人管她叫犀牛骑手，她很不开心。"
    override val artist = "Ben Wootten"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e59299ca51f6a4bb0c4822f2333e28c737f21192407dacf33300023f77962ac.png"
}
