package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DirtyRat_41567 : Card() {
    override val id = 41567
    override val name = "卑劣的脏鼠"
    override val description = "<b>嘲讽，战吼：</b>使你的对手随机从手牌中召唤一个随从。"
    override var cost: Int? = 2
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "脏鼠以前并不脏，直到他丢掉了肥皂。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f7a937c36852a5e363888d4d02949c16ccab1199dd915b5813409501733ec3a4.png"
}
