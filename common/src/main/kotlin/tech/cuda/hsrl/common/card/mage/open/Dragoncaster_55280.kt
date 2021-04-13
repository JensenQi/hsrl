package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Dragoncaster_55280 : Card() {
    override val id = 55280
    override val name = "乘龙法师"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，在本回合中你所施放的下一个法术的法力值消耗为（0）点。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.DescentOfDragons
    override val background = "金卡加了很多特效上去，魔法duang的一下，很亮，很柔，玩家一定会骂我，根本没有这样的魔法。"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3305f0be711c43a12fbc27cf0153fdffec490ad56d4b720f4fde3aa31f998de.png"
}
