package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientMage_915 : Card() {
    override val id = 915
    override val name = "年迈的法师"
    override val description = "<b>战吼：</b>使相邻的随从获得<b>法术伤害+1</b>。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "有时候他会很健忘，甚至迷迷糊糊地走进别人的游戏中去。"
    override val artist = "Howard Lyon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a9c966c2c5c2475c1761916789ae955c7b5027452f2f1c05082d294a396f3815.png"
}
