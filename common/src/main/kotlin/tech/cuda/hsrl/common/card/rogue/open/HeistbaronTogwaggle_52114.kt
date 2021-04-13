package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HeistbaronTogwaggle_52114 : Card() {
    override val id = 52114
    override val name = "劫匪之王托瓦格尔"
    override val description = "<b>战吼：</b>如果你控制一个<b>跟班</b>，就可以选择一张宝藏牌。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RiseOfShadows
    override val background = "拉法姆的亲密战友，至少在亮闪闪充足的时候是这样的。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9cc26b752cf7d7ad7f4bb163fac839798d124d0de502431fdf63302a616c95d0.png"
}
