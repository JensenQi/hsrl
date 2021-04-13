package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KirinTorTricaster_52638 : Card() {
    override val id = 52638
    override val name = "肯瑞托三修法师"
    override val description = "<b>法术伤害+3</b> 你的法术牌法力值消耗增加（1）点。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RiseOfShadows
    override val background = "数字全都对上了！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/319ffbe4a7f1060d1fa076b28acb74e19f86f97e3bf6a00e8e65d771999d22ac.png"
}
