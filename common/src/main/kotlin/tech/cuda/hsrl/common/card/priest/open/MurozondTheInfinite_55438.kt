package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurozondTheInfinite_55438 : Card() {
    override val id = 55438
    override val name = "永恒巨龙姆诺兹多"
    override val description = "<b>战吼：</b>使用你的对手上个回合使用的所有卡牌。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“好吧，我很欣慰，你知道我在这回合要做什么。”"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/12025280879887b5722520733c339d233a9635663efdc2c79c904b5559921780.png"
}
