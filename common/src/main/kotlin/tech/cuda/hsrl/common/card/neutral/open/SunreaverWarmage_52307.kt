package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SunreaverWarmage_52307 : Card() {
    override val id = 52307
    override val name = "夺日者战斗法师"
    override val description = "<b>战吼：</b>如果你的手牌中有法力值消耗大于或等于（5）点的法术牌，则造成4点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "怎么，夺日者还会是冰法不成？"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22e709b8215a0dafb1940891d79c216647ec4522d6b9fc16c38aa1e9eec2d512.png"
}
