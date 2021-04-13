package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientMage_70036 : Card() {
    override val id = 70036
    override val name = "年迈的法师"
    override val description = "<b>战吼：</b>使相邻的随从获得<b>法术伤害+1</b>。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "有时候他会很健忘，甚至迷迷糊糊地走进别人的游戏中去。"
    override val artist = "Howard Lyon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4f10f732f03f4ae5fbb9cfed0b4e7bc089a0f0db9624587c45ea64c6a3ffb171.png"
}
