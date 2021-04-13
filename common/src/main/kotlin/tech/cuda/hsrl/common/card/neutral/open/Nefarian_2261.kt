package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nefarian_2261 : Card() {
    override val id = 2261
    override val name = "奈法利安"
    override val description = "<b>战吼：</b>随机将两张<i>（你对手职业的）</i>法术牌置入你的手牌。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "据说他父亲的眼泪所凝结成的晶体具有提高法术命中的功效。"
    override val artist = "Ruan Jia"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f74c26d4cfff20bd58872f264862803bddeb67af97bdb99e5398501a9bdf9e38.png"
}
