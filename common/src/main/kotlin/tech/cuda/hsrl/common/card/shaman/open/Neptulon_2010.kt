package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Neptulon_2010 : Card() {
    override val id = 2010
    override val name = "耐普图隆"
    override val description = "<b>战吼：</b>随机将四张鱼人牌置入你的手牌，<b>过载：</b>（3）"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Gvg
    override val background = "耐普图隆被称为“猎潮者”。他是四大元素领主之一。他和拉格纳罗斯能够联手为你提供最好的桑拿服务。"
    override val artist = "Ruan Jia"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9035c3ee753c4a6b2b575ccc66ebed7b6199a61a00a8fe679a24ad9c7fadbdfd.png"
}
