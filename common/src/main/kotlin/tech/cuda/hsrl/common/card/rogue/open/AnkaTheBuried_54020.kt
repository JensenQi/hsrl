package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnkaTheBuried_54020 : Card() {
    override val id = 54020
    override val name = "被埋葬的安卡"
    override val description = "<b>战吼：</b>使你手牌中所有具有<b>亡语</b>的随从牌变为1/1，且法力值消耗为（1）点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“你看着有点眼熟。你参加过我的第一次葬礼吗？”"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6de6a9ad183233dcf544ed919fe2508ba52a1bee15ab0759e7473fd760cf94ed.png"
}
