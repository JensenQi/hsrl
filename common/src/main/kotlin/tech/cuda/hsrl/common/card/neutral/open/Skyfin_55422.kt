package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Skyfin_55422 : Card() {
    override val id = 55422
    override val name = "飞天鱼人"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，随机召唤两个鱼人。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“你是想当鱼人还是巨龙？” “我都行。”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a65bcf2d40df440631d006582915dc4b84bc55b2dc8bdda41e761596eab5caa.png"
}
