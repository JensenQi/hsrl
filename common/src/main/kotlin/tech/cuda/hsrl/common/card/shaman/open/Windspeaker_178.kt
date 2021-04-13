package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Windspeaker_178 : Card() {
    override val id = 178
    override val name = "风语者"
    override val description = "<b>战吼：</b>使一个友方随从获得<b>风怒</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy1635
    override val background = "患有口臭的风语者...还有什么比这更糟糕的吗？"
    override val artist = "Vance Kovacs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f0425e998e268244bd794caf3a14a424dd04df7d1ce11561a93baf732dd5949f.png"
}
