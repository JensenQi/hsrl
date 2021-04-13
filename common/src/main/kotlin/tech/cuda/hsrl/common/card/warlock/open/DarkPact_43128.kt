package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkPact_43128 : Card() {
    override val id = 43128
    override val name = "黑暗契约"
    override val description = "消灭一个友方随从。为你的英雄恢复 4点生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“不用在意附加条款，只要签名就行了。”"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/679c72fa95f953b51202094769a096049a8eb9d9f5eeb7211e6785a651eb6c83.png"
}
