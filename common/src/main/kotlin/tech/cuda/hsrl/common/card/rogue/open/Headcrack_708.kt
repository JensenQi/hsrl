package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Headcrack_708 : Card() {
    override val id = 708
    override val name = "裂颅之击"
    override val description = "对敌方英雄造成 2点伤害；<b>连击：</b>在下个回合将其移回你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "就算其他方法都不管用，直接往头上狠狠来一下总是会有效的。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d145a17a055d5316f41fd185c89fdc38a11889bfac1a791d1ae9eda3b6131ef1.png"
}
