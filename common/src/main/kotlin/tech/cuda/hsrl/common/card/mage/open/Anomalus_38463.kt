package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Anomalus_38463 : Card() {
    override val id = 38463
    override val name = "阿诺玛鲁斯"
    override val description = "<b>亡语：</b>对所有随从造成8点伤害。"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Wotog
    override val background = "阿诺玛鲁斯是由混乱的奥术能量所组成的，所以消灭它存在相当大的风险。"
    override val artist = "Kan Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c31d323f45b4b7c66af80b03baea852c0063e7adf13bafbd32708001d1e51d12.png"
}
