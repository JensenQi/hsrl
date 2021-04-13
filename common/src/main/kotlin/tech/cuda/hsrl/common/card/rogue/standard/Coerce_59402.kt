package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Coerce_59402 : Card() {
    override val id = 59402
    override val name = "胁迫"
    override val description = "消灭一个受伤的随从。<b>连击：</b>消灭任意随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“把午饭钱交出来，不然就拿三明治来抵！”"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9d460c3b6222df8f65cec0be6de396c8169e2315fa06ec8cbf33e29271b5a57a.png"
}
