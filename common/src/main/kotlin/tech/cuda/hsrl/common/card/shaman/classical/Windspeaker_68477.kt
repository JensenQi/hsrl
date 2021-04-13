package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Windspeaker_68477 : Card() {
    override val id = 68477
    override val name = "风语者"
    override val description = "<b>战吼：</b>使一个友方随从获得<b>风怒</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "患有口臭的风语者...还有什么比这更糟糕的吗？"
    override val artist = "Vance Kovacs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/78c63ac10eb6386e4db040c9bd90cc1ce0d851bdb89c06a8e5d6cb93934a3ce3.png"
}
