package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LordJaraxxus_69925 : Card() {
    override val id = 69925
    override val name = "加拉克苏斯大王"
    override val description = "<b>战吼：</b>消灭你的英雄，并用加拉克苏斯大王替换之。"
    override var cost: Int? = 9
    override var health: Int? = 15
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "“渺小的侏儒！你的傲慢会招致灭亡！”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c79620f0d77811395adae3fd3ea96abc21cbbb6b3ff208dde9c377559e03cb1.png"
}
