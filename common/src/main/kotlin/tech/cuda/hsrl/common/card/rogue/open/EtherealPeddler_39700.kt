package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EtherealPeddler_39700 : Card() {
    override val id = 39700
    override val name = "虚灵商人"
    override val description = "<b>战吼：</b>如果你的手牌中有另一职业的卡牌，则其法力值消耗减少（2）点。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Karazhan
    override val background = "虚灵以热衷收集和买卖各种魔法物品和神器而著称，比那些贪婪的地精靠谱多了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7939fafa12c64f9ab8923cf27dad2bf2c2e9df0c8bf9a9cbda2063ba7b5d546c.png"
}
