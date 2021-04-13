package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MedivhsValet_39767 : Card() {
    override val id = 39767
    override val name = "麦迪文的男仆"
    override val description = "<b>战吼：</b> 如果你控制一个<b>奥秘</b>，则造成3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Karazhan
    override val background = "常年伴随在麦迪文左右，就连男仆养的猴子都会七十二种戏法。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf6cd07bc465b340b348bb18cefcb8a14d294ab1fec0224b72489d7bf161fd6d.png"
}
