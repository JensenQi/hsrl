package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FirePlumeHarbinger_41107 : Card() {
    override val id = 41107
    override val name = "火羽先锋"
    override val description = "<b>战吼：</b>使你手牌中所有元素牌的法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Ungoro
    override val background = "擅长召唤元素，更擅长烤棉花糖。"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8f1d6440bdd4953abf6ba98b42a618884cdab64675e7addaa69c56176f13b5f0.png"
}
